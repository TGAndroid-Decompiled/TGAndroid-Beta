package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import ci.e7;
public final class a0 {
    public final AudioTrack f14370a;
    public final e7 f14371b;
    public z f14372c = new AudioRouting.OnRoutingChangedListener() {
        @Override
        public final void onRoutingChanged(AudioRouting audioRouting) {
            a0.a(a0.this, audioRouting);
        }
    };

    public a0(AudioTrack audioTrack, e7 e7Var) {
        this.f14370a = audioTrack;
        this.f14371b = e7Var;
        audioTrack.addOnRoutingChangedListener(this.f14372c, new Handler(Looper.myLooper()));
    }

    public static void a(a0 a0Var, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (a0Var.f14372c != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
            a0Var.f14371b.c(routedDevice);
        }
    }

    public final void b() {
        z zVar = this.f14372c;
        zVar.getClass();
        this.f14370a.removeOnRoutingChangedListener(zVar);
        this.f14372c = null;
    }
}
