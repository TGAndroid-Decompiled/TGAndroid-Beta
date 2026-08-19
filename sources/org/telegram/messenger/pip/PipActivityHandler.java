package org.telegram.messenger.pip;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.util.Log;
import android.view.Choreographer;
import androidx.core.math.MathUtils;
import com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.pip.activity.IPipActivity;
import org.telegram.messenger.pip.activity.IPipActivityActionListener;
import org.telegram.messenger.pip.activity.IPipActivityAnimationListener;
import org.telegram.messenger.pip.activity.IPipActivityHandler;
import org.telegram.messenger.pip.activity.IPipActivityListener;
import org.telegram.messenger.pip.utils.PipActions;
import org.telegram.messenger.pip.utils.PipDuration;
import org.telegram.messenger.pip.utils.PipUtils;

class PipActivityHandler implements IPipActivityHandler {
    private final Activity activity;
    private boolean hasFrameListener;
    private boolean isActivityStarted;
    private boolean isInPictureInPictureModeInternal;
    private boolean isInPictureInPictureStash;
    private PictureInPictureParams pictureInPictureParams;
    private final ArrayList listeners = new ArrayList();
    private final ArrayList animationListeners = new ArrayList();
    private final HashMap actionListeners = new HashMap();
    private float lastProgress = -1.0f;
    private final PipDuration durationEnter = new PipDuration("enter");
    private final PipDuration durationLeave = new PipDuration("leave");
    private final Choreographer choreographer = Choreographer.getInstance();
    private final Choreographer.FrameCallback callback = new Choreographer.FrameCallback() {
        @Override
        public final void doFrame(long j) {
            this.f$0.onFrameInternal(j);
        }
    };
    private final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (PipActions.isPipIntent(intent)) {
                PipActivityHandler.this.dispatchAction(PipActions.getSourceId(intent), PipActions.getActionId(intent));
            }
        }
    };

    PipActivityHandler(Activity activity) {
        this.activity = activity;
    }

    void addPipListener(IPipActivityListener iPipActivityListener) {
        this.listeners.add(iPipActivityListener);
    }

    void removePipListener(IPipActivityListener iPipActivityListener) {
        this.listeners.remove(iPipActivityListener);
    }

    void addAnimationListener(IPipActivityAnimationListener iPipActivityAnimationListener) {
        this.animationListeners.add(iPipActivityAnimationListener);
    }

    void removeAnimationListener(IPipActivityAnimationListener iPipActivityAnimationListener) {
        this.animationListeners.remove(iPipActivityAnimationListener);
    }

    void addActionListener(String str, IPipActivityActionListener iPipActivityActionListener) {
        ArrayList arrayList = (ArrayList) this.actionListeners.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.actionListeners.put(str, arrayList);
        }
        arrayList.add(iPipActivityActionListener);
    }

    void removeActionListener(String str, IPipActivityActionListener iPipActivityActionListener) {
        ArrayList arrayList = (ArrayList) this.actionListeners.get(str);
        if (arrayList == null) {
            return;
        }
        arrayList.remove(iPipActivityActionListener);
        if (arrayList.isEmpty()) {
            this.actionListeners.remove(str);
        }
    }

    @Override
    public void onPictureInPictureRequested() {
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureRequested");
        manualEnterPictureInPictureModeInternal();
    }

    @Override
    public void onUserLeaveHint() {
        Log.i("PIP_DEBUG", "[Activity] onUserLeaveHint");
        manualEnterPictureInPictureModeInternal();
    }

    @Override
    public void onStart() {
        Log.i("PIP_DEBUG", "[Activity] onStart");
        this.isActivityStarted = true;
        IntentFilter intentFilter = new IntentFilter("PIP_CUSTOM_EVENT");
        if (Build.VERSION.SDK_INT >= 33) {
            this.activity.registerReceiver(this.broadcastReceiver, intentFilter, 4);
        } else {
            this.activity.registerReceiver(this.broadcastReceiver, intentFilter);
        }
    }

    @Override
    public void onResume() {
        Log.i("PIP_DEBUG", "[Activity] onResume");
        if (this.isInPictureInPictureModeInternal) {
            dispatchCompleteExitPip(false);
        }
    }

    @Override
    public void onPause() {
        Log.i("PIP_DEBUG", "[Activity] onPause");
        if (AndroidUtilities.isInPictureInPictureMode(this.activity) && hasContentForPictureInPictureMode() && PipUtils.useAutoEnterInPictureInPictureMode()) {
            dispatchStartEnterPip();
        }
    }

    @Override
    public void onStop() {
        Log.i("PIP_DEBUG", "[Activity] onStop");
        this.isActivityStarted = false;
        if (this.isInPictureInPictureModeInternal) {
            dispatchStartExitPip(true);
        }
        this.activity.unregisterReceiver(this.broadcastReceiver);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureModeChanged " + z);
        if (this.isInPictureInPictureModeInternal) {
            if (z) {
                dispatchCompleteEnterPip();
            } else if (this.isActivityStarted) {
                dispatchStartExitPip(false);
            } else {
                dispatchCompleteExitPip(true);
            }
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        Log.i("PIP_DEBUG", "[Activity] onConfigurationChanged");
    }

    @Override
    public void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        Log.i("PIP_DEBUG", "[Activity] setPictureInPictureParams");
        this.pictureInPictureParams = pictureInPictureParams;
    }

    @Override
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            if (i >= 35) {
                Log.i("PIP_DEBUG", "[Activity] onPictureInPictureUiStateChanged " + pictureInPictureUiState.isStashed() + " " + pictureInPictureUiState.isTransitioningToPip());
                if (pictureInPictureUiState.isTransitioningToPip() && hasContentForPictureInPictureMode()) {
                    dispatchStartEnterPip();
                }
            } else {
                Log.i("PIP_DEBUG", "[Activity] onPictureInPictureUiStateChanged " + pictureInPictureUiState.isStashed());
            }
            boolean zIsStashed = pictureInPictureUiState.isStashed();
            if (this.isInPictureInPictureStash != zIsStashed) {
                this.isInPictureInPictureStash = zIsStashed;
                if (zIsStashed) {
                    dispatchStashStartPip();
                } else {
                    dispatchStashEndPip();
                }
            }
        }
    }

    private boolean hasContentForPictureInPictureMode() {
        ComponentCallbacks2 componentCallbacks2 = this.activity;
        if (componentCallbacks2 instanceof IPipActivity) {
            return ((IPipActivity) componentCallbacks2).getPipController().hasContentForPictureInPictureMode();
        }
        return false;
    }

    private void manualEnterPictureInPictureModeInternal() {
        if (this.isInPictureInPictureModeInternal || PipUtils.useAutoEnterInPictureInPictureMode() || Build.VERSION.SDK_INT < 26 || this.pictureInPictureParams == null || !hasContentForPictureInPictureMode()) {
            return;
        }
        dispatchStartEnterPip();
        this.activity.enterPictureInPictureMode(this.pictureInPictureParams);
    }

    private void dispatchStartEnterPip() {
        this.isInPictureInPictureModeInternal = true;
        int i = 0;
        this.isInPictureInPictureStash = false;
        ArrayList arrayList = this.listeners;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((IPipActivityListener) obj).onStartEnterToPip();
        }
        dispatchEnterAnimationStart();
    }

    private void dispatchCompleteEnterPip() {
        dispatchEnterAnimationEnd();
        ArrayList arrayList = this.listeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((IPipActivityListener) obj).onCompleteEnterToPip();
        }
    }

    private void dispatchStashStartPip() {
        ArrayList arrayList = this.listeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((IPipActivityListener) obj).onPipStashStart();
        }
    }

    private void dispatchStashEndPip() {
        ArrayList arrayList = this.listeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((IPipActivityListener) obj).onPipStashEnd();
        }
    }

    private void dispatchStartExitPip(boolean z) {
        ArrayList arrayList = this.listeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((IPipActivityListener) obj).onStartExitFromPip(z);
        }
        dispatchLeaveAnimationStart();
    }

    private void dispatchCompleteExitPip(boolean z) {
        dispatchLeaveAnimationEnd();
        int i = 0;
        this.isInPictureInPictureModeInternal = false;
        ArrayList arrayList = this.listeners;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((IPipActivityListener) obj).onCompleteExitFromPip(z);
        }
    }

    private void dispatchEnterAnimationStart() {
        long jEstimated = this.durationEnter.estimated();
        ArrayList arrayList = this.animationListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((IPipActivityAnimationListener) obj).onEnterAnimationStart(jEstimated);
        }
        dispatchTransitionAnimationProgress(0.0f);
        this.durationEnter.start();
        subscribeToFrameUpdates();
    }

    private void dispatchEnterAnimationEnd() {
        dispatchTransitionAnimationProgress(1.0f);
        long jEnd = this.durationEnter.end();
        ArrayList arrayList = this.animationListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((IPipActivityAnimationListener) obj).onEnterAnimationEnd(jEnd);
        }
        unsubscribeFromFrameUpdates();
    }

    private void dispatchLeaveAnimationStart() {
        long jEstimated = this.durationLeave.estimated();
        ArrayList arrayList = this.animationListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((IPipActivityAnimationListener) obj).onLeaveAnimationStart(jEstimated);
        }
        dispatchTransitionAnimationProgress(1.0f);
        this.durationLeave.start();
        subscribeToFrameUpdates();
    }

    private void dispatchLeaveAnimationEnd() {
        dispatchTransitionAnimationProgress(0.0f);
        long jEnd = this.durationLeave.end();
        ArrayList arrayList = this.animationListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((IPipActivityAnimationListener) obj).onLeaveAnimationEnd(jEnd);
        }
        unsubscribeFromFrameUpdates();
    }

    private void dispatchTransitionAnimationProgress(float f) {
        if (f == this.lastProgress) {
            return;
        }
        this.lastProgress = f;
        ArrayList arrayList = this.animationListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((IPipActivityAnimationListener) obj).onTransitionAnimationProgress(f);
        }
    }

    public void dispatchAction(String str, int i) {
        ArrayList arrayList = (ArrayList) this.actionListeners.get(str);
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ExoPlayerImpl$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
            throw null;
        }
    }

    private void subscribeToFrameUpdates() {
        if (this.hasFrameListener) {
            return;
        }
        this.hasFrameListener = true;
        this.choreographer.postFrameCallback(this.callback);
    }

    private void unsubscribeFromFrameUpdates() {
        if (this.hasFrameListener) {
            this.hasFrameListener = false;
            this.choreographer.removeFrameCallback(this.callback);
        }
    }

    public void onFrameInternal(long j) {
        if (this.hasFrameListener) {
            ArrayList arrayList = this.animationListeners;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((IPipActivityAnimationListener) obj).onTransitionAnimationFrame();
            }
            if (this.durationEnter.isStarted()) {
                dispatchTransitionAnimationProgress(MathUtils.clamp(this.durationEnter.progress() / 0.95f, 0.0f, 1.0f));
            } else if (this.durationLeave.isStarted()) {
                dispatchTransitionAnimationProgress(MathUtils.clamp(1.0f - (this.durationLeave.progress() / 0.95f), 0.0f, 1.0f));
            }
            this.choreographer.postFrameCallback(this.callback);
        }
    }
}
