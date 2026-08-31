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
    public final Spatializer f6031a;
    public final boolean f6032b;
    public Handler f6033c;
    public j d;

    public k(Spatializer spatializer) {
        boolean z4;
        this.f6031a = spatializer;
        if (spatializer.getImmersiveAudioLevel() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f6032b = z4;
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
        return this.f6031a.canBeSpatialized((AudioAttributes) dVar.a().f16615b, channelMask.build());
    }

    public final void b(p pVar, Looper looper) {
        if (this.d == null && this.f6033c == null) {
            this.d = new j(pVar);
            Handler handler = new Handler(looper);
            this.f6033c = handler;
            this.f6031a.addOnSpatializerStateChangedListener(new c2.f(handler, 0), this.d);
        }
    }

    public final boolean c() {
        return this.f6031a.isAvailable();
    }

    public final boolean d() {
        return this.f6031a.isEnabled();
    }

    public final void e() {
        j jVar = this.d;
        if (jVar != null && this.f6033c != null) {
            this.f6031a.removeOnSpatializerStateChangedListener(jVar);
            Handler handler = this.f6033c;
            int i10 = d0.f7237a;
            handler.removeCallbacksAndMessages(null);
            this.f6033c = null;
            this.d = null;
        }
    }
}
