package l3;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
public abstract class e0 {
    public static void a(AudioTrack audioTrack, k3.k kVar) {
        LogSessionId logSessionId;
        k3.j jVar = kVar.f9735a;
        jVar.getClass();
        LogSessionId logSessionId2 = jVar.f9734a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!logSessionId2.equals(logSessionId)) {
            audioTrack.setLogSessionId(logSessionId2);
        }
    }
}
