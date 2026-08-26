package org.telegram.messenger.chromecast;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.zzat;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.internal.mlkit_language_id_common.zzig;

public final class ChromecastController$RemoteMediaClientHandler extends RemoteMediaClient.Callback {
    public int attempt;
    public final RemoteMediaClient client;
    public int index;
    public int lastIdleReason;
    public int lastMediaErrorCode;
    public final SessionManager manager;
    public ChromecastMediaVariations media;
    public final CastSession session;

    public ChromecastController$RemoteMediaClientHandler(CastSession castSession, SessionManager sessionManager, RemoteMediaClient remoteMediaClient) {
        this.session = castSession;
        this.manager = sessionManager;
        this.client = remoteMediaClient;
    }

    public final void loadImpl() {
        ChromecastMedia chromecastMedia;
        this.lastMediaErrorCode = -1;
        if (this.media == null) {
            this.media = null;
            return;
        }
        String host = ChromecastFileServer.getHost();
        if (this.index < this.media.variations.size()) {
            chromecastMedia = (ChromecastMedia) this.media.variations.get(this.index);
        } else {
            chromecastMedia = ChromecastFileServer.ASSET_FALLBACK_FILE;
        }
        String str = "?index=" + this.index + "&attempt=" + this.attempt;
        chromecastMedia.getClass();
        MediaInfo mediaInfo = new MediaInfo(zzig.m("http://", host, chromecastMedia.externalPath) + str, 1, chromecastMedia.mimeType, chromecastMedia.mediaMetadata, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        RemoteMediaClient remoteMediaClient = this.client;
        Boolean bool = Boolean.TRUE;
        if (Double.compare(1.0d, 2.0d) > 0 || Double.compare(1.0d, 0.5d) < 0) {
            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
        }
        MediaLoadRequestData mediaLoadRequestData = new MediaLoadRequestData(mediaInfo, null, bool, -1L, 1.0d, null, null, null, null, null, null, 0L);
        zzah.checkMainThread("Must be called from the main thread.");
        if (remoteMediaClient.zzy()) {
            RemoteMediaClient.zzz(new zzat(remoteMediaClient, mediaLoadRequestData, 1));
        } else {
            RemoteMediaClient.zzf();
        }
    }

    public final void loadNext(boolean z) {
        if (z) {
            this.index++;
        } else {
            int i = this.attempt + 1;
            this.attempt = i;
            if (i > 3) {
                this.attempt = 0;
                this.index++;
            }
        }
        Log.e("CAST_CLIENT", "next attempt " + this.lastMediaErrorCode + " " + this.index + " " + this.attempt);
        loadImpl();
    }

    @Override
    public final void onAdBreakStatusUpdated() {
        Log.d("CAST_CLIENT", "onAdBreakStatusUpdated " + this.session.getSessionId());
    }

    @Override
    public final void onMediaError(MediaError mediaError) {
        StringBuilder sb = new StringBuilder("onMediaError ");
        sb.append(this.session.getSessionId());
        sb.append(" ");
        Integer num = mediaError.zzd;
        sb.append(num);
        sb.append(" ");
        sb.append(mediaError.zzc);
        Log.d("CAST_CLIENT", sb.toString());
        this.lastMediaErrorCode = num != null ? num.intValue() : -1;
    }

    @Override
    public final void onMetadataUpdated() {
        Log.d("CAST_CLIENT", "onMetadataUpdated " + this.session.getSessionId());
    }

    @Override
    public final void onPreloadStatusUpdated() {
        Log.d("CAST_CLIENT", "onPreloadStatusUpdated " + this.session.getSessionId());
    }

    @Override
    public final void onQueueStatusUpdated() {
        Log.d("CAST_CLIENT", "onQueueStatusUpdated " + this.session.getSessionId());
    }

    @Override
    public final void onSendingRemoteMediaRequest() {
        Log.d("CAST_CLIENT", "onSendingRemoteMediaRequest " + this.session.getSessionId());
    }

    @Override
    public final void onStatusUpdated() {
        Log.d("CAST_CLIENT", "onStatusUpdated " + this.session.getSessionId());
        int idleReason = this.client.getIdleReason();
        if (idleReason != this.lastIdleReason) {
            Log.d("CAST_CLIENT", "idleReason " + idleReason);
            this.lastIdleReason = idleReason;
            if (idleReason == 2) {
                this.manager.endCurrentSession(true);
                return;
            }
            if (idleReason == 4) {
                int i = this.lastMediaErrorCode;
                if (i == 104) {
                    loadNext(true);
                } else if (i == 102) {
                    loadNext(false);
                }
            }
        }
    }
}
