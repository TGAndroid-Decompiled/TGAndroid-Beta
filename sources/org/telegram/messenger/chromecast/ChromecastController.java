package org.telegram.messenger.chromecast;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaLoadOptions;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.CastStateListener;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import java.io.File;
import java.util.Objects;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.CastSync;
import org.telegram.ui.PhotoViewer;

public class ChromecastController implements SessionManagerListener {
    private static volatile ChromecastController Instance;
    private final SessionManager sessionManager;
    private final ChromecastControllerState state;

    public static class RemoteMediaClientHandler extends RemoteMediaClient.Callback {
        private int attempt;
        public final RemoteMediaClient client;
        private int index;
        private int lastIdleReason;
        private int lastMediaErrorCode;
        public final SessionManager manager;
        private ChromecastMediaVariations media;
        public final CastSession session;

        public RemoteMediaClientHandler(CastSession castSession, SessionManager sessionManager, RemoteMediaClient remoteMediaClient) {
            this.session = castSession;
            this.manager = sessionManager;
            this.client = remoteMediaClient;
        }

        private void loadImpl() {
            this.lastMediaErrorCode = -1;
            if (this.media == null) {
                this.media = null;
                return;
            }
            String host = ChromecastFileServer.getHost();
            ChromecastMedia variation = this.index < this.media.getVariationsCount() ? this.media.getVariation(this.index) : ChromecastFileServer.ASSET_FALLBACK_FILE;
            this.client.load(variation.buildMediaInfo(host, "?index=" + this.index + "&attempt=" + this.attempt), new MediaLoadOptions.Builder().setAutoplay(true).build());
        }

        private void loadNext(boolean z) {
            if (!z) {
                int i = this.attempt + 1;
                this.attempt = i;
                if (i > 3) {
                    this.attempt = 0;
                }
                Log.e("CAST_CLIENT", "next attempt " + this.lastMediaErrorCode + " " + this.index + " " + this.attempt);
                loadImpl();
            }
            this.index++;
            Log.e("CAST_CLIENT", "next attempt " + this.lastMediaErrorCode + " " + this.index + " " + this.attempt);
            loadImpl();
        }

        public void close() {
            this.manager.endCurrentSession(true);
        }

        public void load(ChromecastMediaVariations chromecastMediaVariations) {
            this.media = chromecastMediaVariations;
            this.index = 0;
            this.attempt = 0;
            loadImpl();
        }

        @Override
        public void onAdBreakStatusUpdated() {
            Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.session.getSessionId());
        }

        @Override
        public void onMediaError(MediaError mediaError) {
            Log.d("CAST_CLIENT", "onMediaError " + this.session.getSessionId() + " " + mediaError.getDetailedErrorCode() + " " + mediaError.getRequestId());
            Integer detailedErrorCode = mediaError.getDetailedErrorCode();
            this.lastMediaErrorCode = detailedErrorCode != null ? detailedErrorCode.intValue() : -1;
        }

        @Override
        public void onMetadataUpdated() {
            Log.d("CAST_CLIENT", "onMetadataUpdated " + this.session.getSessionId());
        }

        @Override
        public void onPreloadStatusUpdated() {
            Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.session.getSessionId());
        }

        @Override
        public void onQueueStatusUpdated() {
            Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.session.getSessionId());
        }

        @Override
        public void onSendingRemoteMediaRequest() {
            Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.session.getSessionId());
        }

        @Override
        public void onStatusUpdated() {
            boolean z;
            Log.d("CAST_CLIENT", "onStatusUpdated " + this.session.getSessionId());
            int idleReason = this.client.getIdleReason();
            if (idleReason != this.lastIdleReason) {
                Log.d("CAST_CLIENT", "idleReason " + idleReason);
                this.lastIdleReason = idleReason;
                if (idleReason == 2) {
                    close();
                    return;
                }
                if (idleReason == 4) {
                    int i = this.lastMediaErrorCode;
                    if (i == 104) {
                        z = true;
                    } else if (i != 102) {
                        return;
                    } else {
                        z = false;
                    }
                    loadNext(z);
                }
            }
        }

        public void register() {
            this.client.registerCallback(this);
        }

        public void unregister() {
            this.client.unregisterCallback(this);
        }
    }

    private ChromecastController() {
        CastContext sharedInstance = CastContext.getSharedInstance(ApplicationLoader.applicationContext);
        sharedInstance.addCastStateListener(new CastStateListener() {
            @Override
            public final void onCastStateChanged(int i) {
                ChromecastController.lambda$new$0(i);
            }
        });
        this.state = new ChromecastControllerState();
        SessionManager sessionManager = sharedInstance.getSessionManager();
        this.sessionManager = sessionManager;
        sessionManager.addSessionManagerListener(this, CastSession.class);
        tryInitClient(sessionManager.getCurrentCastSession());
    }

    public static boolean eq(ChromecastMedia chromecastMedia, ChromecastMedia chromecastMedia2) {
        if (chromecastMedia == null && chromecastMedia2 == null) {
            return true;
        }
        return chromecastMedia != null && chromecastMedia2 != null && Objects.equals(chromecastMedia.mimeType, chromecastMedia2.mimeType) && Objects.equals(chromecastMedia.mediaMetadata, chromecastMedia2.mediaMetadata) && Objects.equals(chromecastMedia.internalUri, chromecastMedia2.internalUri) && Objects.equals(chromecastMedia.externalPath, chromecastMedia2.externalPath) && chromecastMedia.width == chromecastMedia2.width && chromecastMedia.height == chromecastMedia2.height;
    }

    public static boolean eq(ChromecastMediaVariations chromecastMediaVariations, ChromecastMediaVariations chromecastMediaVariations2) {
        if (chromecastMediaVariations == null && chromecastMediaVariations2 == null) {
            return true;
        }
        if (chromecastMediaVariations == null || chromecastMediaVariations2 == null || chromecastMediaVariations.getVariationsCount() != chromecastMediaVariations2.getVariationsCount()) {
            return false;
        }
        for (int i = 0; i < chromecastMediaVariations.getVariationsCount(); i++) {
            if (!eq(chromecastMediaVariations.getVariation(i), chromecastMediaVariations2.getVariation(i))) {
                return false;
            }
        }
        return true;
    }

    public static ChromecastController getInstance() {
        ChromecastController chromecastController = Instance;
        if (chromecastController == null) {
            synchronized (ChromecastController.class) {
                try {
                    chromecastController = Instance;
                    if (chromecastController == null) {
                        chromecastController = new ChromecastController();
                        Instance = chromecastController;
                    }
                } finally {
                }
            }
        }
        return chromecastController;
    }

    public static void lambda$new$0(int i) {
        Log.d("CAST_STATE", "onCastStateChanged " + i);
    }

    private void tryInitClient(CastSession castSession) {
        if (castSession == null) {
            return;
        }
        RemoteMediaClient remoteMediaClient = castSession.getRemoteMediaClient();
        String sessionId = castSession.getSessionId();
        if (TextUtils.isEmpty(sessionId) || remoteMediaClient == null) {
            return;
        }
        RemoteMediaClientHandler client = this.state.getClient();
        if (client == null || !TextUtils.equals(client.session.getSessionId(), sessionId)) {
            this.state.setClient(new RemoteMediaClientHandler(castSession, this.sessionManager, remoteMediaClient));
            CastDevice castDevice = castSession.getCastDevice();
            PhotoViewer.getInstance().showChromecastBulletin(ChromecastFileServer.getHost(), castDevice != null ? castDevice.getFriendlyName() : null);
        }
    }

    @Override
    public void onSessionEnded(CastSession castSession, int i) {
        Log.d("CAST_SESSION", "onSessionEnded " + castSession.getSessionId() + " " + i);
        this.state.setClient(null);
    }

    @Override
    public void onSessionEnding(CastSession castSession) {
        Log.d("CAST_SESSION", "onSessionEnding " + castSession.getSessionId());
    }

    @Override
    public void onSessionResumeFailed(CastSession castSession, int i) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + castSession.getSessionId() + " " + i);
    }

    @Override
    public void onSessionResumed(CastSession castSession, boolean z) {
        Log.d("CAST_SESSION", "onSessionResumed " + castSession.getSessionId() + " " + z);
    }

    @Override
    public void onSessionResuming(CastSession castSession, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + castSession.getSessionId() + " " + str);
    }

    @Override
    public void onSessionStartFailed(CastSession castSession, int i) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + castSession.getSessionId() + " " + i);
    }

    @Override
    public void onSessionStarted(CastSession castSession, String str) {
        Log.d("CAST_SESSION", "onSessionStarted " + castSession.getSessionId() + " " + str);
        tryInitClient(castSession);
    }

    @Override
    public void onSessionStarting(CastSession castSession) {
        Log.d("CAST_SESSION", "onSessionStarting " + castSession.getSessionId());
        tryInitClient(castSession);
    }

    @Override
    public void onSessionSuspended(CastSession castSession, int i) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + castSession.getSessionId() + " " + i);
    }

    public String setCover(File file) {
        return this.state.setCoverFile(file);
    }

    public void setCurrentMediaAndCastIfNeeded(ChromecastMediaVariations chromecastMediaVariations) {
        Log.d("CAST_CONTROLLER", "set current media");
        ChromecastMediaVariations media = this.state.getMedia();
        if (CastSync.isActive() && eq(media, chromecastMediaVariations)) {
            return;
        }
        this.state.setMedia(chromecastMediaVariations);
    }
}
