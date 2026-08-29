package l3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
public abstract class a0 {
    public static void a(t tVar, Object obj) {
        e0 e0Var;
        AudioDeviceInfo a2 = k3.d.a(obj);
        k0 k0Var = (k0) tVar;
        if (a2 == null) {
            e0Var = null;
        } else {
            k0Var.getClass();
            e0Var = new e0(a2);
        }
        k0Var.Y = e0Var;
        AudioTrack audioTrack = k0Var.f14137u;
        if (audioTrack != null) {
            c0.a(audioTrack, e0Var);
        }
    }
}
