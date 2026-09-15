package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import ci.g7;
public final class a0 {
    public final AudioTrack f13223a;
    public final g7 f13224b;
    public z f13225c = new AudioRouting.OnRoutingChangedListener() {
        @Override
        public final void onRoutingChanged(AudioRouting audioRouting) {
            a0.a(a0.this, audioRouting);
        }
    };

    public a0(AudioTrack audioTrack, g7 g7Var) {
        this.f13223a = audioTrack;
        this.f13224b = g7Var;
        audioTrack.addOnRoutingChangedListener(this.f13225c, new Handler(Looper.myLooper()));
    }

    public static void a(a0 a0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (a0Var.f13225c != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
            a0Var.f13224b.c(routedDevice);
        }
    }

    public final void b() {
        z zVar = this.f13225c;
        zVar.getClass();
        this.f13223a.removeOnRoutingChangedListener(zVar);
        this.f13225c = null;
    }
}
