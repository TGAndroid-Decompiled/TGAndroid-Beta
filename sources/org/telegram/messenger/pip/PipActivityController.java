package org.telegram.messenger.pip;

import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.pip.source.PipSourceHandlerState2;
import org.telegram.messenger.pip.utils.PipUtils;
import org.telegram.ui.LaunchActivity;

public final class PipActivityController {
    public final LaunchActivity activity;
    public final PipActivityHandler handler;
    public PipSource maxPrioritySource;
    public MediaSessionCompat mediaSession;
    public MediaSessionConnector mediaSessionConnector;
    public PipActivityContentLayout pipContentView;
    public final HashMap sources = new HashMap();

    public PipActivityController(LaunchActivity launchActivity) {
        this.activity = launchActivity;
        this.handler = new PipActivityHandler(launchActivity);
    }

    public final void updateSources() {
        PipSource pipSource = this.maxPrioritySource;
        PipSource pipSource2 = null;
        for (PipSource pipSource3 : this.sources.values()) {
            if (pipSource3.isAvailable || pipSource3.state2.state != 0) {
                if (pipSource2 == null || pipSource3.priority > pipSource2.priority) {
                    pipSource2 = pipSource3;
                }
            }
        }
        if (pipSource != pipSource2) {
            this.maxPrioritySource = pipSource2;
            StringBuilder sb = new StringBuilder("onMaxPrioritySourceChanged ");
            sb.append(pipSource2 != null ? pipSource2.tag : null);
            Log.i("PIP_DEBUG", sb.toString());
            LaunchActivity launchActivity = this.activity;
            PipUtils.applyPictureInPictureParams(launchActivity, pipSource2);
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
                    MediaSessionCompat mediaSessionCompat2 = new MediaSessionCompat(launchActivity, "pip-media-session", null, null);
                    this.mediaSession = mediaSessionCompat2;
                    mediaSessionCompat2.setQueue(null);
                    this.mediaSession.setActive(true);
                    this.mediaSessionConnector = new MediaSessionConnector(this.mediaSession);
                }
            }
            if (pipSource != null) {
                PipSourceHandlerState2 pipSourceHandlerState2 = pipSource.state2;
                pipSourceHandlerState2.shouldBeAttached = false;
                pipSourceHandlerState2.performPreDetach1();
                PipSource pipSource4 = pipSourceHandlerState2.source;
                pipSource4.controller.handler.listeners.remove(pipSourceHandlerState2);
                PipActivityController pipActivityController = pipSource4.controller;
                pipActivityController.handler.animationListeners.remove(pipSourceHandlerState2);
                PipActivityHandler pipActivityHandler = pipActivityController.handler;
                HashMap map = pipActivityHandler.actionListeners;
                String str = pipSource4.tag;
                ArrayList arrayList = (ArrayList) map.get(str);
                if (arrayList != null) {
                    arrayList.remove((Object) null);
                    if (arrayList.isEmpty()) {
                        pipActivityHandler.actionListeners.remove(str);
                    }
                }
            }
            if (pipSource2 != null) {
                MediaSessionConnector mediaSessionConnector2 = this.mediaSessionConnector;
                if (mediaSessionConnector2 != null) {
                    mediaSessionConnector2.setPlayer(pipSource2.player);
                }
                this.pipContentView.bringToFront();
                PipSourceHandlerState2 pipSourceHandlerState3 = pipSource2.state2;
                pipSourceHandlerState3.source.controller.handler.listeners.add(pipSourceHandlerState3);
                PipSource pipSource5 = pipSourceHandlerState3.source;
                pipSource5.controller.handler.animationListeners.add(pipSourceHandlerState3);
                PipActivityHandler pipActivityHandler2 = pipSource5.controller.handler;
                HashMap map2 = pipActivityHandler2.actionListeners;
                String str2 = pipSource5.tag;
                ArrayList arrayList2 = (ArrayList) map2.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    pipActivityHandler2.actionListeners.put(str2, arrayList2);
                }
                arrayList2.add(null);
            } else if (pipSource != null && AndroidUtilities.isInPictureInPictureMode(launchActivity)) {
                launchActivity.moveTaskToBack(false);
            }
            this.pipContentView.invalidate();
        }
    }
}
