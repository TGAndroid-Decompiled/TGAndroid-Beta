package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import ci.e7;
public final class z {
    public final AudioTrack f13399a;
    public final e7 f13400b;
    public y f13401c = new AudioRouting.OnRoutingChangedListener() {
        @Override
        public final void onRoutingChanged(AudioRouting audioRouting) {
            z.a(z.this, audioRouting);
        }
    };

    public z(AudioTrack audioTrack, e7 e7Var) {
        this.f13399a = audioTrack;
        this.f13400b = e7Var;
        audioTrack.addOnRoutingChangedListener(this.f13401c, new Handler(Looper.myLooper()));
    }

    public static void a(z zVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (zVar.f13401c != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
            zVar.f13400b.c(routedDevice);
        }
    }

    public final void b() {
        y yVar = this.f13401c;
        yVar.getClass();
        this.f13399a.removeOnRoutingChangedListener(yVar);
        this.f13401c = null;
    }
}
