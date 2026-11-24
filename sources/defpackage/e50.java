package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
public final class e50 {
    public final AudioTrack a;
    public final ni6 b;
    public final Handler c;
    public c50 d;

    public e50(AudioTrack audioTrack, ni6 ni6Var) {
        this.a = audioTrack;
        this.b = ni6Var;
        Handler q = hac.q(null);
        this.c = q;
        ?? r0 = new AudioRouting.OnRoutingChangedListener() {
            @Override
            public final void onRoutingChanged(final AudioRouting audioRouting) {
                final e50 e50Var = e50.this;
                if (e50Var.d == null) {
                    return;
                }
                pe0.a().execute(new Runnable() {
                    @Override
                    public final void run() {
                        e50.this.a(audioRouting);
                    }
                });
            }
        };
        this.d = r0;
        audioTrack.addOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) r0, q);
    }

    public final void a(AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.c.post(new x30(this, routedDevice, (byte) 4));
        }
    }

    public final void b() {
        c50 c50Var = this.d;
        c50Var.getClass();
        this.a.removeOnRoutingChangedListener(c50Var);
        this.d = null;
    }
}
