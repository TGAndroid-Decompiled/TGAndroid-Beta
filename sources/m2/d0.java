package m2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
public final class d0 {
    public final AudioTrack f18842a;
    public final hi.d f18843b;
    public final Handler f18844c;
    public c0 d;

    public d0(AudioTrack audioTrack, hi.d dVar) {
        this.f18842a = audioTrack;
        this.f18843b = dVar;
        Handler q10 = g2.n0.q(null);
        this.f18844c = q10;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() {
            @Override
            public final void onRoutingChanged(AudioRouting audioRouting) {
                d0 d0Var = d0.this;
                if (d0Var.d == null) {
                    return;
                }
                g2.a.e().execute(new s(1, d0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q10);
    }

    public static void a(d0 d0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            d0Var.f18844c.post(new s(2, d0Var, routedDevice));
        }
    }

    public static void b(d0 d0Var) {
        AudioTrack audioTrack = d0Var.f18842a;
        c0 c0Var = d0Var.d;
        c0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(c0Var);
        d0Var.d = null;
    }
}
