package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import ci.e7;
public final class z {
    public final AudioTrack f13386a;
    public final e7 f13387b;
    public y f13388c = new AudioRouting.OnRoutingChangedListener() {
        @Override
        public final void onRoutingChanged(AudioRouting audioRouting) {
            z.a(z.this, audioRouting);
        }
    };

    public z(AudioTrack audioTrack, e7 e7Var) {
        this.f13386a = audioTrack;
        this.f13387b = e7Var;
        audioTrack.addOnRoutingChangedListener(this.f13388c, new Handler(Looper.myLooper()));
    }

    public static void a(z zVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (zVar.f13388c != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
            zVar.f13387b.c(routedDevice);
        }
    }

    public final void b() {
        y yVar = this.f13388c;
        yVar.getClass();
        this.f13386a.removeOnRoutingChangedListener(yVar);
        this.f13388c = null;
    }
}
