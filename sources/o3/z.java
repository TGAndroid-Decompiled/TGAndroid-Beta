package o3;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;
public abstract class z {
    public static boolean a(MediaDrm mediaDrm, String str) {
        return mediaDrm.requiresSecureDecoder(str);
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, k3.k kVar) {
        LogSessionId logSessionId;
        k3.j jVar = kVar.f9716a;
        jVar.getClass();
        LogSessionId logSessionId2 = jVar.f9715a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!logSessionId2.equals(logSessionId)) {
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(logSessionId2);
        }
    }
}
