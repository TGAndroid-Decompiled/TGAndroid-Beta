package k2;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import ci.e7;
public final class y {
    public final AudioTrack f14577a;
    public final e7 f14578b;
    public x f14579c = new AudioRouting.OnRoutingChangedListener() {
        @Override
        public final void onRoutingChanged(AudioRouting audioRouting) {
            y.a(y.this, audioRouting);
        }
    };

    public y(AudioTrack audioTrack, e7 e7Var) {
        this.f14577a = audioTrack;
        this.f14578b = e7Var;
        audioTrack.addOnRoutingChangedListener(this.f14579c, new Handler(Looper.myLooper()));
    }

    public static void a(y yVar, AudioRouting audioRouting) {
        AudioDeviceInfo routedDevice;
        if (yVar.f14579c != null && (routedDevice = audioRouting.getRoutedDevice()) != null) {
            yVar.f14578b.c(routedDevice);
        }
    }

    public final void b() {
        x xVar = this.f14579c;
        xVar.getClass();
        this.f14577a.removeOnRoutingChangedListener(xVar);
        this.f14579c = null;
    }
}
