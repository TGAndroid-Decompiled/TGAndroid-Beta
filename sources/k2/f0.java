package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
public final class f0 {
    public final AudioTrack f10647a;
    public final m0 f10648b;
    public final Handler f10649c;
    public e0 d;

    public f0(AudioTrack audioTrack, m0 m0Var) {
        this.f10647a = audioTrack;
        this.f10648b = m0Var;
        Handler q6 = e2.l0.q(null);
        this.f10649c = q6;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() {
            @Override
            public final void onRoutingChanged(AudioRouting audioRouting) {
                f0 f0Var = f0.this;
                if (f0Var.d == null) {
                    return;
                }
                e2.a.e().execute(new u(2, f0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q6);
    }

    public static void a(f0 f0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            f0Var.f10649c.post(new u(3, f0Var, routedDevice));
        }
    }

    public static void b(f0 f0Var) {
        AudioTrack audioTrack = f0Var.f10647a;
        e0 e0Var = f0Var.d;
        e0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(e0Var);
        f0Var.d = null;
    }
}
