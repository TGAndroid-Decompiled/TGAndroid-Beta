package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import hi.u2;
public final class f0 {
    public final AudioTrack f16160a;
    public final jg.s0 f16161b;
    public final Handler f16162c;
    public d0 d;

    public f0(AudioTrack audioTrack, jg.s0 s0Var) {
        this.f16160a = audioTrack;
        this.f16161b = s0Var;
        Handler q5 = e2.n0.q(null);
        this.f16162c = q5;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() {
            @Override
            public final void onRoutingChanged(AudioRouting audioRouting) {
                f0 f0Var = f0.this;
                if (f0Var.d == null) {
                    return;
                }
                e2.a.e().execute(new u2(29, f0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q5);
    }

    public static void a(f0 f0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            f0Var.f16162c.post(new e0(0, f0Var, routedDevice));
        }
    }

    public static void b(f0 f0Var) {
        AudioTrack audioTrack = f0Var.f16160a;
        d0 d0Var = f0Var.d;
        d0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(d0Var);
        f0Var.d = null;
    }
}
