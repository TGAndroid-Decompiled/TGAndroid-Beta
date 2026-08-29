package d5;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import f5.d0;
import j3.t0;
public final class k {
    public final Spatializer f5342a;
    public final boolean f5343b;
    public Handler f5344c;
    public j d;

    public k(Spatializer spatializer) {
        boolean z10;
        this.f5342a = spatializer;
        if (spatializer.getImmersiveAudioLevel() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5343b = z10;
    }

    public static k f(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new k(audioManager.getSpatializer());
    }

    public final boolean a(t0 t0Var, l3.e eVar) {
        String str = t0Var.B;
        int i10 = t0Var.O;
        if ("audio/eac3-joc".equals(str) && i10 == 16) {
            i10 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(d0.m(i10));
        int i11 = t0Var.P;
        if (i11 != -1) {
            channelMask.setSampleRate(i11);
        }
        return this.f5342a.canBeSpatialized((AudioAttributes) eVar.a().f7981b, channelMask.build());
    }

    public final void b(p pVar, Looper looper) {
        if (this.d == null && this.f5344c == null) {
            this.d = new j(pVar);
            Handler handler = new Handler(looper);
            this.f5344c = handler;
            this.f5342a.addOnSpatializerStateChangedListener(new c2.f(handler, 0), this.d);
        }
    }

    public final boolean c() {
        return this.f5342a.isAvailable();
    }

    public final boolean d() {
        return this.f5342a.isEnabled();
    }

    public final void e() {
        j jVar = this.d;
        if (jVar != null && this.f5344c != null) {
            this.f5342a.removeOnSpatializerStateChangedListener(jVar);
            Handler handler = this.f5344c;
            int i10 = d0.f6579a;
            handler.removeCallbacksAndMessages(null);
            this.f5344c = null;
            this.d = null;
        }
    }
}
