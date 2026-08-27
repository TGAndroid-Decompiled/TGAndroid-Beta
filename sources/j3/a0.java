package j3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

public abstract class a0 {
    public static void a(t tVar, Object obj) {
        e0 e0Var;
        AudioDeviceInfo audioDeviceInfoD = ia.l.d(obj);
        j0 j0Var = (j0) tVar;
        if (audioDeviceInfoD == null) {
            e0Var = null;
        } else {
            j0Var.getClass();
            e0Var = new e0(audioDeviceInfoD);
        }
        j0Var.Y = e0Var;
        AudioTrack audioTrack = j0Var.f12375u;
        if (audioTrack != null) {
            c0.a(audioTrack, e0Var);
        }
    }
}
