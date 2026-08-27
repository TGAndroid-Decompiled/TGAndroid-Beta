package b5;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import d5.g0;
import h3.t0;

public final class l {

    public final Spatializer f1953a;

    public final boolean f1954b;

    public Handler f1955c;
    public k d;

    public l(Spatializer spatializer) {
        this.f1953a = spatializer;
        this.f1954b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static l f(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new l(audioManager.getSpatializer());
    }

    public final boolean a(t0 t0Var, j3.e eVar) {
        String str = t0Var.B;
        int i10 = t0Var.O;
        if ("audio/eac3-joc".equals(str) && i10 == 16) {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(g0.m(i10));
        int i11 = t0Var.P;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return this.f1953a.canBeSpatialized((AudioAttributes) eVar.a().f181b, channelMask.build());
    }

    public final void b(q qVar, Looper looper) {
        if (this.d == null && this.f1955c == null) {
            this.d = new k(qVar);
            Handler handler = new Handler(looper);
            this.f1955c = handler;
            this.f1953a.addOnSpatializerStateChangedListener(new c2.f(handler, 0), this.d);
        }
    }

    public final boolean c() {
        return this.f1953a.isAvailable();
    }

    public final boolean d() {
        return this.f1953a.isEnabled();
    }

    public final void e() {
        k kVar = this.d;
        if (kVar == null || this.f1955c == null) {
            return;
        }
        this.f1953a.removeOnSpatializerStateChangedListener(kVar);
        Handler handler = this.f1955c;
        int i10 = g0.f4795a;
        handler.removeCallbacksAndMessages(null);
        this.f1955c = null;
        this.d = null;
    }
}
