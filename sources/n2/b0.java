package n2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import li.j3;
public final class b0 {
    public final AudioTrack f20133a;
    public final gf.g f20134b;
    public final Handler f20135c;
    public a0 d;

    public b0(AudioTrack audioTrack, gf.g gVar) {
        this.f20133a = audioTrack;
        this.f20134b = gVar;
        Handler q10 = h2.m0.q(null);
        this.f20135c = q10;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() {
            @Override
            public final void onRoutingChanged(AudioRouting audioRouting) {
                b0 b0Var = b0.this;
                if (b0Var.d == null) {
                    return;
                }
                h2.a.e().execute(new j3(11, b0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q10);
    }

    public static void a(b0 b0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            b0Var.f20135c.post(new j3(12, b0Var, routedDevice));
        }
    }

    public static void b(b0 b0Var) {
        AudioTrack audioTrack = b0Var.f20133a;
        a0 a0Var = b0Var.d;
        a0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(a0Var);
        b0Var.d = null;
    }
}
