package org.telegram.messenger.pip;

import android.app.Activity;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.ViewGroup;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.pip.activity.IPipActivityActionListener;
import org.telegram.messenger.pip.activity.IPipActivityAnimationListener;
import org.telegram.messenger.pip.activity.IPipActivityHandler;
import org.telegram.messenger.pip.activity.IPipActivityListener;
import org.telegram.messenger.pip.utils.PipUtils;

public class PipActivityController {
    public final Activity activity;
    private final PipActivityHandler handler;
    private PipSource maxPrioritySource;
    private MediaSessionCompat mediaSession;
    MediaSessionConnector mediaSessionConnector;
    private PipActivityContentLayout pipContentView;
    private final HashMap sources = new HashMap();

    public PipActivityController(Activity activity) {
        this.activity = activity;
        PipActivityHandler pipActivityHandler = new PipActivityHandler(activity);
        this.handler = pipActivityHandler;
        pipActivityHandler.addPipListener(new IPipActivityListener() {
            @Override
            public void onStartEnterToPip() {
                Log.d("PIP_DEBUG", "onStartEnterToPip");
            }

            @Override
            public void onCompleteEnterToPip() {
                Log.d("PIP_DEBUG", "onCompleteEnterToPip");
            }

            @Override
            public void onStartExitFromPip(boolean z) {
                Log.d("PIP_DEBUG", "onStartExitFromPip: byActivityStop=" + z);
            }

            @Override
            public void onCompleteExitFromPip(boolean z) {
                Log.d("PIP_DEBUG", "onCompleteExitFromPip: byActivityStop=" + z);
            }
        });
        pipActivityHandler.addAnimationListener(new IPipActivityAnimationListener() {
            @Override
            public void onEnterAnimationStart(long j) {
                Log.d("PIP_DEBUG", "onEnterAnimationStart: estimatedDuration=" + j);
            }

            @Override
            public void onEnterAnimationEnd(long j) {
                Log.d("PIP_DEBUG", "onEnterAnimationEnd: duration=" + j);
            }

            @Override
            public void onLeaveAnimationStart(long j) {
                Log.d("PIP_DEBUG", "onLeaveAnimationStart: estimatedDuration=" + j);
            }

            @Override
            public void onLeaveAnimationEnd(long j) {
                Log.d("PIP_DEBUG", "onLeaveAnimationEnd: duration=" + j);
            }

            @Override
            public void onTransitionAnimationFrame() {
                Log.d("PIP_DEBUG", "onTransitionAnimationFrame");
            }

            @Override
            public void onTransitionAnimationProgress(float f) {
                Log.d("PIP_DEBUG", "onTransitionAnimationProgress: estimatedProgress=" + f);
            }
        });
    }

    public IPipActivityHandler getHandler() {
        return this.handler;
    }

    public ViewGroup getPipContentView() {
        if (this.pipContentView == null) {
            this.pipContentView = new PipActivityContentLayout(this.activity);
        }
        return this.pipContentView;
    }

    private void updateSources() {
        PipSource pipSource = this.maxPrioritySource;
        PipSource pipSource2 = null;
        for (PipSource pipSource3 : this.sources.values()) {
            if (pipSource3.isAvailable() || pipSource3.state2.isAttachedToPip()) {
                if (pipSource2 == null || pipSource3.priority > pipSource2.priority) {
                    pipSource2 = pipSource3;
                }
            }
        }
        if (pipSource != pipSource2) {
            this.maxPrioritySource = pipSource2;
            onMaxPrioritySourceChanged(pipSource, pipSource2);
        }
    }

    private void onMaxPrioritySourceChanged(PipSource pipSource, PipSource pipSource2) {
        StringBuilder sb = new StringBuilder();
        sb.append("onMaxPrioritySourceChanged ");
        sb.append(pipSource2 != null ? pipSource2.tag : null);
        Log.i("PIP_DEBUG", sb.toString());
        PipUtils.applyPictureInPictureParams(this.activity, pipSource2);
        if ((pipSource != null && pipSource.needMediaSession) != (pipSource2 != null && pipSource2.needMediaSession)) {
            MediaSessionConnector mediaSessionConnector = this.mediaSessionConnector;
            if (mediaSessionConnector != null) {
                mediaSessionConnector.setPlayer(null);
                this.mediaSessionConnector = null;
            }
            MediaSessionCompat mediaSessionCompat = this.mediaSession;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setActive(false);
                this.mediaSession.release();
                this.mediaSession = null;
            }
            if (pipSource2 != null) {
                MediaSessionCompat mediaSessionCompat2 = new MediaSessionCompat(this.activity, "pip-media-session");
                this.mediaSession = mediaSessionCompat2;
                mediaSessionCompat2.setQueue(null);
                this.mediaSession.setActive(true);
                this.mediaSessionConnector = new MediaSessionConnector(this.mediaSession);
            }
        }
        if (pipSource != null) {
            pipSource.state2.onLoseMaxPriority();
        }
        if (pipSource2 != null) {
            MediaSessionConnector mediaSessionConnector2 = this.mediaSessionConnector;
            if (mediaSessionConnector2 != null) {
                mediaSessionConnector2.setPlayer(pipSource2.player);
            }
            this.pipContentView.bringToFront();
            pipSource2.state2.onReceiveMaxPriority();
        } else if (pipSource != null && AndroidUtilities.isInPictureInPictureMode(this.activity)) {
            this.activity.moveTaskToBack(false);
        }
        this.pipContentView.invalidate();
    }

    void dispatchSourceRegister(PipSource pipSource) {
        this.sources.put(pipSource.tag, pipSource);
        updateSources();
    }

    void dispatchSourceUnregister(PipSource pipSource) {
        if (this.sources.remove(pipSource.tag) != null) {
            updateSources();
        }
    }

    void dispatchSourceAvailabilityChanged(PipSource pipSource) {
        updateSources();
        this.pipContentView.invalidate();
    }

    void dispatchSourceParamsChanged(PipSource pipSource) {
        if (this.maxPrioritySource == pipSource) {
            PipUtils.applyPictureInPictureParams(this.activity, pipSource);
            MediaSessionConnector mediaSessionConnector = this.mediaSessionConnector;
            if (mediaSessionConnector != null) {
                mediaSessionConnector.setPlayer(pipSource.player);
            }
        }
        this.pipContentView.invalidate();
    }

    public boolean hasContentForPictureInPictureMode() {
        return this.maxPrioritySource != null;
    }

    public void addPipListener(IPipActivityListener iPipActivityListener) {
        this.handler.addPipListener(iPipActivityListener);
    }

    public void removePipListener(IPipActivityListener iPipActivityListener) {
        this.handler.removePipListener(iPipActivityListener);
    }

    public void addAnimationListener(IPipActivityAnimationListener iPipActivityAnimationListener) {
        this.handler.addAnimationListener(iPipActivityAnimationListener);
    }

    public void removeAnimationListener(IPipActivityAnimationListener iPipActivityAnimationListener) {
        this.handler.removeAnimationListener(iPipActivityAnimationListener);
    }

    public void addActionListener(String str, IPipActivityActionListener iPipActivityActionListener) {
        this.handler.addActionListener(str, iPipActivityActionListener);
    }

    public void removeActionListener(String str, IPipActivityActionListener iPipActivityActionListener) {
        this.handler.removeActionListener(str, iPipActivityActionListener);
    }
}
