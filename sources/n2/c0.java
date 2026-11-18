package n2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import hi.u5;
public final class c0 {
    public final AudioTrack f21073a;
    public final u5 f21074b;
    public final Handler f21075c;
    public b0 d;

    public c0(AudioTrack audioTrack, u5 u5Var) {
        this.f21073a = audioTrack;
        this.f21074b = u5Var;
        Handler q10 = h2.l0.q(null);
        this.f21075c = q10;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() {
            @Override
            public final void onRoutingChanged(AudioRouting audioRouting) {
                c0 c0Var = c0.this;
                if (c0Var.d == null) {
                    return;
                }
                h2.a.e().execute(new kg.h0(25, c0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q10);
    }

    public static void a(c0 c0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            c0Var.f21075c.post(new kg.h0(26, c0Var, routedDevice));
        }
    }

    public static void b(c0 c0Var) {
        AudioTrack audioTrack = c0Var.f21073a;
        b0 b0Var = c0Var.d;
        b0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(b0Var);
        c0Var.d = null;
    }
}
