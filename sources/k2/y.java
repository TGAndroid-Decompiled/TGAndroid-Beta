package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import di.g7;
public final class y {
    public final AudioTrack f14689a;
    public final g7 f14690b;
    public x f14691c = new AudioRouting.OnRoutingChangedListener() {
        @Override
        public final void onRoutingChanged(AudioRouting audioRouting) {
            y.a(y.this, audioRouting);
        }
    };

    public y(AudioTrack audioTrack, g7 g7Var) {
        this.f14689a = audioTrack;
        this.f14690b = g7Var;
        audioTrack.addOnRoutingChangedListener(this.f14691c, new Handler(Looper.myLooper()));
    }

    public static void a(y yVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (yVar.f14691c != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
            yVar.f14690b.c(routedDevice);
        }
    }

    public final void b() {
        x xVar = this.f14691c;
        xVar.getClass();
        this.f14689a.removeOnRoutingChangedListener(xVar);
        this.f14691c = null;
    }
}
