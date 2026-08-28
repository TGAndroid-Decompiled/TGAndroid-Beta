package b5;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import d5.f0;
import h3.t0;
public final class m {
    public final Spatializer f1468a;
    public final boolean f1469b;
    public Handler f1470c;
    public l d;

    public m(Spatializer spatializer) {
        boolean z10;
        this.f1468a = spatializer;
        if (spatializer.getImmersiveAudioLevel() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1469b = z10;
    }

    public static m f(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new m(audioManager.getSpatializer());
    }

    public final boolean a(t0 t0Var, j3.e eVar) {
        String str = t0Var.B;
        int i9 = t0Var.O;
        if ("audio/eac3-joc".equals(str) && i9 == 16) {
            i9 = 12;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(f0.m(i9));
        int i10 = t0Var.P;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        return this.f1468a.canBeSpatialized((AudioAttributes) eVar.a().f281b, channelMask.build());
    }

    public final void b(r rVar, Looper looper) {
        if (this.d == null && this.f1470c == null) {
            this.d = new l(rVar);
            Handler handler = new Handler(looper);
            this.f1470c = handler;
            this.f1468a.addOnSpatializerStateChangedListener(new c2.f(handler, 0), this.d);
        }
    }

    public final boolean c() {
        return this.f1468a.isAvailable();
    }

    public final boolean d() {
        return this.f1468a.isEnabled();
    }

    public final void e() {
        l lVar = this.d;
        if (lVar != null && this.f1470c != null) {
            this.f1468a.removeOnSpatializerStateChangedListener(lVar);
            Handler handler = this.f1470c;
            int i9 = f0.f4349a;
            handler.removeCallbacksAndMessages(null);
            this.f1470c = null;
            this.d = null;
        }
    }
}
