package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import ci.e7;
public final class z {
    public final AudioTrack f13384a;
    public final e7 f13385b;
    public y f13386c = new AudioRouting.OnRoutingChangedListener() {
        @Override
        public final void onRoutingChanged(AudioRouting audioRouting) {
            z.a(z.this, audioRouting);
        }
    };

    public z(AudioTrack audioTrack, e7 e7Var) {
        this.f13384a = audioTrack;
        this.f13385b = e7Var;
        audioTrack.addOnRoutingChangedListener(this.f13386c, new Handler(Looper.myLooper()));
    }

    public static void a(z zVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (zVar.f13386c != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
            zVar.f13385b.c(routedDevice);
        }
    }

    public final void b() {
        y yVar = this.f13386c;
        yVar.getClass();
        this.f13384a.removeOnRoutingChangedListener(yVar);
        this.f13386c = null;
    }
}
