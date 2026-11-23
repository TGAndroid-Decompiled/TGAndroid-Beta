package n2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
public final class d0 {
    public final AudioTrack f21173a;
    public final hi.u0 f21174b;
    public final Handler f21175c;
    public b0 d;

    public d0(AudioTrack audioTrack, hi.u0 u0Var) {
        this.f21173a = audioTrack;
        this.f21174b = u0Var;
        Handler q10 = h2.l0.q(null);
        this.f21175c = q10;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() {
            @Override
            public final void onRoutingChanged(AudioRouting audioRouting) {
                d0 d0Var = d0.this;
                if (d0Var.d == null) {
                    return;
                }
                h2.a.e().execute(new ji.f(29, d0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q10);
    }

    public static void a(d0 d0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            d0Var.f21175c.post(new c0(0, d0Var, routedDevice));
        }
    }

    public static void b(d0 d0Var) {
        AudioTrack audioTrack = d0Var.f21173a;
        b0 b0Var = d0Var.d;
        b0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(b0Var);
        d0Var.d = null;
    }
}
