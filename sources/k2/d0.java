package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import ji.h5;
import ji.v2;
public final class d0 {
    public final AudioTrack f13869a;
    public final h5 f13870b;
    public final Handler f13871c;
    public c0 d;

    public d0(AudioTrack audioTrack, h5 h5Var) {
        this.f13869a = audioTrack;
        this.f13870b = h5Var;
        Handler q6 = e2.m0.q(null);
        this.f13871c = q6;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() {
            @Override
            public final void onRoutingChanged(AudioRouting audioRouting) {
                d0 d0Var = d0.this;
                if (d0Var.d == null) {
                    return;
                }
                e2.a.e().execute(new v2(7, d0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q6);
    }

    public static void a(d0 d0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            d0Var.f13871c.post(new v2(8, d0Var, routedDevice));
        }
    }

    public static void b(d0 d0Var) {
        AudioTrack audioTrack = d0Var.f13869a;
        c0 c0Var = d0Var.d;
        c0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(c0Var);
        d0Var.d = null;
    }
}
