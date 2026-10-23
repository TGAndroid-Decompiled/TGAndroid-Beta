package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
public final class e0 {
    public final AudioTrack f14723a;
    public final a6.i f14724b;
    public final Handler f14725c;
    public d0 d;

    public e0(AudioTrack audioTrack, a6.i iVar) {
        this.f14723a = audioTrack;
        this.f14724b = iVar;
        Handler q6 = e2.m0.q(null);
        this.f14725c = q6;
        ?? r02 = new AudioRouting.OnRoutingChangedListener() {
            @Override
            public final void onRoutingChanged(AudioRouting audioRouting) {
                e0 e0Var = e0.this;
                if (e0Var.d == null) {
                    return;
                }
                e2.a.e().execute(new hi.t(17, e0Var, audioRouting));
            }
        };
        this.d = r02;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r02, q6);
    }

    public static void a(e0 e0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            e0Var.f14725c.post(new hi.t(18, e0Var, routedDevice));
        }
    }

    public static void b(e0 e0Var) {
        AudioTrack audioTrack = e0Var.f14723a;
        d0 d0Var = e0Var.d;
        d0Var.getClass();
        audioTrack.removeOnRoutingChangedListener(d0Var);
        e0Var.d = null;
    }
}
