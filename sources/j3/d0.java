package j3;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

public abstract class d0 {
    public static void a(AudioTrack audioTrack, i3.k kVar) {
        i3.j jVar = kVar.f10562a;
        jVar.getClass();
        LogSessionId logSessionId = jVar.f10561a;
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionId);
    }
}
