package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
public final class g40 {
    public final AudioTrack a;
    public final ri6 b;
    public final Handler c;
    public e40 d;

    public g40(AudioTrack audioTrack, ri6 ri6Var) {
        this.a = audioTrack;
        this.b = ri6Var;
        Handler q = gcc.q(null);
        this.c = q;
        ?? r0 = new AudioRouting.OnRoutingChangedListener() {
            @Override
            public final void onRoutingChanged(final AudioRouting audioRouting) {
                final g40 g40Var = g40.this;
                if (g40Var.d == null) {
                    return;
                }
                rd0.a().execute(new Runnable() {
                    @Override
                    public final void run() {
                        g40.this.a(audioRouting);
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
            this.c.post(new a30(this, routedDevice, (byte) 3));
        }
    }

    public final void b() {
        e40 e40Var = this.d;
        e40Var.getClass();
        this.a.removeOnRoutingChangedListener(e40Var);
        this.d = null;
    }
}
