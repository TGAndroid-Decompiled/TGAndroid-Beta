package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import bi.h8;
public final class z {
    public final AudioTrack f12242a;
    public final h8 f12243b;
    public y f12244c = new AudioRouting.OnRoutingChangedListener() {
        @Override
        public final void onRoutingChanged(AudioRouting audioRouting) {
            z.a(z.this, audioRouting);
        }
    };

    public z(AudioTrack audioTrack, h8 h8Var) {
        this.f12242a = audioTrack;
        this.f12243b = h8Var;
        audioTrack.addOnRoutingChangedListener(this.f12244c, new Handler(Looper.myLooper()));
    }

    public static void a(z zVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (zVar.f12244c != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
            zVar.f12243b.c(routedDevice);
        }
    }

    public final void b() {
        y yVar = this.f12244c;
        yVar.getClass();
        this.f12242a.removeOnRoutingChangedListener(yVar);
        this.f12244c = null;
    }
}
