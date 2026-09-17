package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import ci.g7;
public final class a0 {
    public final AudioTrack f13226a;
    public final g7 f13227b;
    public z f13228c = new AudioRouting.OnRoutingChangedListener() {
        @Override
        public final void onRoutingChanged(AudioRouting audioRouting) {
            a0.a(a0.this, audioRouting);
        }
    };

    public a0(AudioTrack audioTrack, g7 g7Var) {
        this.f13226a = audioTrack;
        this.f13227b = g7Var;
        audioTrack.addOnRoutingChangedListener(this.f13228c, new Handler(Looper.myLooper()));
    }

    public static void a(a0 a0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (a0Var.f13228c != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
            a0Var.f13227b.c(routedDevice);
        }
    }

    public final void b() {
        z zVar = this.f13228c;
        zVar.getClass();
        this.f13226a.removeOnRoutingChangedListener(zVar);
        this.f13228c = null;
    }
}
