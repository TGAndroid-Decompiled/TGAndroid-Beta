package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
public final class d0 {
    public final AudioTrack f14662a;
    public final a6.i f14663b;
    public final Handler f14664c;
    public c0 d;

    public d0(AudioTrack audioTrack, a6.i iVar) {
        this.f14662a = audioTrack;
        this.f14663b = iVar;
        Handler q6 = e2.m0.q(null);
        this.f14664c = q6;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() {
            @Override
            public final void onRoutingChanged(AudioRouting audioRouting) {
                d0 d0Var = d0.this;
                if (d0Var.d == null) {
                    return;
                }
                e2.a.e().execute(new hi.t(17, d0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q6);
    }

    public static void a(d0 d0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            d0Var.f14664c.post(new hi.t(18, d0Var, routedDevice));
        }
    }

    public static void b(d0 d0Var) {
        AudioTrack audioTrack = d0Var.f14662a;
        c0 c0Var = d0Var.d;
        c0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(c0Var);
        d0Var.d = null;
    }
}
