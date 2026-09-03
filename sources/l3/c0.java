package l3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
public abstract class c0 {
    public static void a(v vVar, Object obj) {
        f0 f0Var;
        AudioDeviceInfo a2 = k3.e.a(obj);
        k0 k0Var = (k0) vVar;
        if (a2 == null) {
            f0Var = null;
        } else {
            k0Var.getClass();
            f0Var = new f0(a2);
        }
        k0Var.Z = f0Var;
        AudioTrack audioTrack = k0Var.v;
        if (audioTrack != null) {
            d0.a(audioTrack, f0Var);
        }
    }
}
