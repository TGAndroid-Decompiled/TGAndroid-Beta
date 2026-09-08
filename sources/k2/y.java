package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import di.g7;
public final class y {
    public final AudioTrack f14715a;
    public final g7 f14716b;
    public x f14717c = new AudioRouting.OnRoutingChangedListener() {
        @Override
        public final void onRoutingChanged(AudioRouting audioRouting) {
            y.a(y.this, audioRouting);
        }
    };

    public y(AudioTrack audioTrack, g7 g7Var) {
        this.f14715a = audioTrack;
        this.f14716b = g7Var;
        audioTrack.addOnRoutingChangedListener(this.f14717c, new Handler(Looper.myLooper()));
    }

    public static void a(y yVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (yVar.f14717c != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
            yVar.f14716b.c(routedDevice);
        }
    }

    public final void b() {
        x xVar = this.f14717c;
        xVar.getClass();
        this.f14715a.removeOnRoutingChangedListener(xVar);
        this.f14717c = null;
    }
}
