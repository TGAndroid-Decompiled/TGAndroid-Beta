package f5;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import h5.d0;
import j3.n0;
public final class k {
    public final Spatializer f5920a;
    public final boolean f5921b;
    public Handler f5922c;
    public j d;

    public k(Spatializer spatializer) {
        boolean z4;
        this.f5920a = spatializer;
        if (spatializer.getImmersiveAudioLevel() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f5921b = z4;
    }

    public static k f(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new k(audioManager.getSpatializer());
    }

    public final boolean a(n0 n0Var, l3.d dVar) {
        String str = n0Var.C;
        int i10 = n0Var.P;
        if ("audio/eac3-joc".equals(str) && i10 == 16) {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(d0.n(i10));
        int i11 = n0Var.Q;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return this.f5920a.canBeSpatialized((AudioAttributes) dVar.a().f9336b, channelMask.build());
    }

    public final void b(p pVar, Looper looper) {
        if (this.d == null && this.f5922c == null) {
            this.d = new j(pVar);
            Handler handler = new Handler(looper);
            this.f5922c = handler;
            this.f5920a.addOnSpatializerStateChangedListener(new c2.f(handler, 0), this.d);
        }
    }

    public final boolean c() {
        return this.f5920a.isAvailable();
    }

    public final boolean d() {
        return this.f5920a.isEnabled();
    }

    public final void e() {
        j jVar = this.d;
        if (jVar != null && this.f5922c != null) {
            this.f5920a.removeOnSpatializerStateChangedListener(jVar);
            Handler handler = this.f5922c;
            int i10 = d0.f6924a;
            handler.removeCallbacksAndMessages(null);
            this.f5922c = null;
            this.d = null;
        }
    }
}
