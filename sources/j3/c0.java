package j3;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
public abstract class c0 {
    public static void a(AudioTrack audioTrack, i3.l lVar) {
        LogSessionId logSessionId;
        i3.k kVar = lVar.f10922a;
        kVar.getClass();
        LogSessionId logSessionId2 = kVar.f10921a;
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (!logSessionId2.equals(logSessionId)) {
            audioTrack.setLogSessionId(logSessionId2);
        }
    }
}
