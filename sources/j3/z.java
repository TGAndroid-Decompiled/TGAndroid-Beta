package j3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
public abstract class z {
    public static void a(s sVar, Object obj) {
        d0 d0Var;
        AudioDeviceInfo d = i3.i.d(obj);
        i0 i0Var = (i0) sVar;
        if (d == null) {
            d0Var = null;
        } else {
            i0Var.getClass();
            d0Var = new d0(d);
        }
        i0Var.Y = d0Var;
        AudioTrack audioTrack = i0Var.f13277u;
        if (audioTrack != null) {
            b0.a(audioTrack, d0Var);
        }
    }
}
