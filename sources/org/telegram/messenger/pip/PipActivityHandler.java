package org.telegram.messenger.pip;

import android.app.PictureInPictureParams;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Choreographer;
import androidx.activity.ComponentDialog$$ExternalSyntheticLambda1;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.mediarouter.app.MediaRouteChooserDialog;
import androidx.profileinstaller.DeviceProfileWriter;
import com.android.billingclient.api.zzca;
import com.google.android.exoplayer2.StreamVolumeManager;
import com.google.android.exoplayer2.util.NetworkTypeObserver$Api31$DisplayInfoCallback;
import com.google.android.exoplayer2.util.Util;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.SyncTask;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.pip.activity.IPipActivityAnimationListener;
import org.telegram.messenger.pip.activity.IPipActivityListener;
import org.telegram.messenger.pip.source.PipSourceHandlerState2;
import org.telegram.messenger.pip.utils.PipDuration;
import org.telegram.ui.Components.Bulletin$2$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.LaunchActivity;

public final class PipActivityHandler {
    public final LaunchActivity activity;
    public final AnonymousClass1 broadcastReceiver;
    public final PipActivityHandler$$ExternalSyntheticLambda3 callback;
    public boolean hasFrameListener;
    public boolean isActivityStarted;
    public boolean isInPictureInPictureModeInternal;
    public boolean isInPictureInPictureStash;
    public PictureInPictureParams pictureInPictureParams;
    public final ArrayList listeners = new ArrayList();
    public final ArrayList animationListeners = new ArrayList();
    public final HashMap actionListeners = new HashMap();
    public float lastProgress = -1.0f;
    public final PipDuration durationEnter = new PipDuration("enter");
    public final PipDuration durationLeave = new PipDuration("leave");
    public final Choreographer choreographer = Choreographer.getInstance();

    public final class AnonymousClass1 extends BroadcastReceiver {
        public final int $r8$classId;
        public Object this$0;

        public AnonymousClass1() {
            this.$r8$classId = 7;
        }

        @Override
        public final void onReceive(Context context, Intent intent) {
            switch (this.$r8$classId) {
                case 0:
                    if ("PIP_CUSTOM_EVENT".equals(intent.getAction())) {
                        String stringExtra = intent.getStringExtra("source_id");
                        intent.getIntExtra("action_id", -1);
                        ArrayList arrayList = (ArrayList) ((PipActivityHandler) this.this$0).actionListeners.get(stringExtra);
                        if (arrayList == null) {
                            return;
                        }
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            it.next().getClass();
                            throw new ClassCastException();
                        }
                        return;
                    }
                    return;
                case 1:
                    ((BaseMenuWrapper) this.this$0).onChange();
                    return;
                case 2:
                    try {
                        ((IntentSender) this.this$0).sendIntent(context, 0, null, null, null);
                        return;
                    } catch (IntentSender.SendIntentException unused) {
                        return;
                    }
                case 3:
                    if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        ((MediaRouteChooserDialog) this.this$0).dismiss();
                        return;
                    }
                    return;
                case 4:
                    ((DeviceProfileWriter) this.this$0).scanPackages();
                    return;
                case 5:
                    StreamVolumeManager streamVolumeManager = (StreamVolumeManager) this.this$0;
                    streamVolumeManager.eventHandler.post(new ComponentDialog$$ExternalSyntheticLambda1(streamVolumeManager, 15));
                    return;
                case 6:
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    int i = 0;
                    if (connectivityManager != null) {
                        try {
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                                i = 1;
                            } else {
                                int type = activeNetworkInfo.getType();
                                if (type == 0) {
                                    switch (activeNetworkInfo.getSubtype()) {
                                        case 1:
                                        case 2:
                                            i = 3;
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 14:
                                        case 15:
                                        case 17:
                                            i = 4;
                                            break;
                                        case 13:
                                            i = 5;
                                            break;
                                        case 16:
                                        case 19:
                                        default:
                                            i = 6;
                                            break;
                                        case 18:
                                            i = 2;
                                            break;
                                        case 20:
                                            if (Util.SDK_INT >= 29) {
                                                i = 9;
                                            }
                                            break;
                                    }
                                } else if (type == 1) {
                                    i = 2;
                                } else if (type == 9) {
                                    i = 7;
                                } else if (type == 4 || type == 5) {
                                    switch (activeNetworkInfo.getSubtype()) {
                                        case 1:
                                        case 2:
                                            i = 3;
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                        case 11:
                                        case 12:
                                        case 14:
                                        case 15:
                                        case 17:
                                            i = 4;
                                            break;
                                        case 13:
                                            i = 5;
                                            break;
                                        case 16:
                                        case 19:
                                        default:
                                            i = 6;
                                            break;
                                        case 18:
                                            i = 2;
                                            break;
                                        case 20:
                                            if (Util.SDK_INT >= 29) {
                                                i = 9;
                                            }
                                            break;
                                    }
                                } else if (type != 6) {
                                    i = 8;
                                } else {
                                    i = 5;
                                }
                            }
                        } catch (SecurityException unused2) {
                        }
                    }
                    int i2 = Util.SDK_INT;
                    zzca zzcaVar = (zzca) this.this$0;
                    if (i2 < 31 || i != 5) {
                        zzca.access$200(zzcaVar, i);
                        return;
                    }
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        NetworkTypeObserver$Api31$DisplayInfoCallback networkTypeObserver$Api31$DisplayInfoCallback = new NetworkTypeObserver$Api31$DisplayInfoCallback(zzcaVar);
                        telephonyManager.registerTelephonyCallback(context.getMainExecutor(), networkTypeObserver$Api31$DisplayInfoCallback);
                        telephonyManager.unregisterTelephonyCallback(networkTypeObserver$Api31$DisplayInfoCallback);
                        return;
                    } catch (RuntimeException unused3) {
                        zzca.access$200(zzcaVar, 5);
                        return;
                    }
                case 7:
                    SyncTask syncTask = (SyncTask) this.this$0;
                    if (syncTask != null && syncTask.isDeviceConnected()) {
                        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                            Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                        }
                        SyncTask syncTask2 = (SyncTask) this.this$0;
                        ((FirebaseMessaging) syncTask2.firebaseMessaging).getClass();
                        FirebaseMessaging.enqueueTaskWithDelaySeconds(0L, syncTask2);
                        ((FirebaseMessaging) ((SyncTask) this.this$0).firebaseMessaging).context.unregisterReceiver(this);
                        this.this$0 = null;
                        return;
                    }
                    return;
                default:
                    Bulletin$2$$ExternalSyntheticLambda1 bulletin$2$$ExternalSyntheticLambda1 = new Bulletin$2$$ExternalSyntheticLambda1(this, 14);
                    if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                        ((ChatAttachAlertDocumentLayout) this.this$0).listView.postDelayed(bulletin$2$$ExternalSyntheticLambda1, 1000L);
                        return;
                    } else {
                        bulletin$2$$ExternalSyntheticLambda1.run();
                        return;
                    }
            }
        }

        public void registerReceiver() {
            if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            ((FirebaseMessaging) ((SyncTask) this.this$0).firebaseMessaging).context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }

    public PipActivityHandler(LaunchActivity launchActivity) {
        int i = 0;
        this.callback = new PipActivityHandler$$ExternalSyntheticLambda3(this, i);
        this.broadcastReceiver = new AnonymousClass1(this, i);
        this.activity = launchActivity;
    }

    public final void dispatchCompleteExitPip() {
        dispatchTransitionAnimationProgress(0.0f);
        this.durationLeave.end();
        ArrayList arrayList = this.animationListeners;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((IPipActivityAnimationListener) obj).getClass();
        }
        if (this.hasFrameListener) {
            this.hasFrameListener = false;
            this.choreographer.removeFrameCallback(this.callback);
        }
        this.isInPictureInPictureModeInternal = false;
        ArrayList arrayList2 = this.listeners;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((IPipActivityListener) obj2).onCompleteExitFromPip();
        }
    }

    public final void dispatchStartEnterPip() {
        this.isInPictureInPictureModeInternal = true;
        int i = 0;
        this.isInPictureInPictureStash = false;
        ArrayList arrayList = this.listeners;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((IPipActivityListener) obj).onStartEnterToPip();
        }
        PipDuration pipDuration = this.durationEnter;
        long j = pipDuration.estimated;
        ArrayList arrayList2 = this.animationListeners;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((IPipActivityAnimationListener) obj2).getClass();
        }
        dispatchTransitionAnimationProgress(0.0f);
        pipDuration.start = SystemClock.uptimeMillis();
        if (this.hasFrameListener) {
            return;
        }
        this.hasFrameListener = true;
        this.choreographer.postFrameCallback(this.callback);
    }

    public final void dispatchStartExitPip() {
        ArrayList arrayList = this.listeners;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((IPipActivityListener) obj).onStartExitFromPip();
        }
        PipDuration pipDuration = this.durationLeave;
        long j = pipDuration.estimated;
        ArrayList arrayList2 = this.animationListeners;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((IPipActivityAnimationListener) obj2).getClass();
        }
        dispatchTransitionAnimationProgress(1.0f);
        pipDuration.start = SystemClock.uptimeMillis();
        if (this.hasFrameListener) {
            return;
        }
        this.hasFrameListener = true;
        this.choreographer.postFrameCallback(this.callback);
    }

    public final void dispatchTransitionAnimationProgress(float f) {
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
            PipSourceHandlerState2 pipSourceHandlerState2 = (PipSourceHandlerState2) ((IPipActivityAnimationListener) obj);
            pipSourceHandlerState2.lastProgress = f;
            PipSourceContentView pipSourceContentView = pipSourceHandlerState2.pictureInPictureWrapperView;
            if (pipSourceContentView != null) {
                pipSourceContentView.invalidate();
            }
        }
    }

    public final boolean hasContentForPictureInPictureMode() {
        LaunchActivity launchActivity = this.activity;
        return (launchActivity != null) && ((PipSource) launchActivity.pipActivityController.mTmpDisplayFrame) != null;
    }

    public final void manualEnterPictureInPictureModeInternal() {
        int i;
        if (!this.isInPictureInPictureModeInternal && (i = Build.VERSION.SDK_INT) < 31 && i >= 26 && this.pictureInPictureParams != null && hasContentForPictureInPictureMode()) {
            dispatchStartEnterPip();
            this.activity.enterPictureInPictureMode(this.pictureInPictureParams);
        }
    }
}
