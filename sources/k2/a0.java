package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import ci.g7;
public final class a0 {
    public final AudioTrack f13227a;
    public final g7 f13228b;
    public z f13229c = new AudioRouting.OnRoutingChangedListener() {
        @Override
        public final void onRoutingChanged(AudioRouting audioRouting) {
            a0.a(a0.this, audioRouting);
        }
    };

    public a0(AudioTrack audioTrack, g7 g7Var) {
        this.f13227a = audioTrack;
        this.f13228b = g7Var;
        audioTrack.addOnRoutingChangedListener(this.f13229c, new Handler(Looper.myLooper()));
    }

    public static void a(a0 a0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (a0Var.f13229c != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
            a0Var.f13228b.c(routedDevice);
        }
    }

    public final void b() {
        z zVar = this.f13229c;
        zVar.getClass();
        this.f13227a.removeOnRoutingChangedListener(zVar);
        this.f13229c = null;
    }
}
