package ai;

import android.util.Log;
import org.telegram.ui.Dictation.DictationAsr;
public final class k implements Runnable {
    public final int f1258a = 1;
    public final float[] f1259b;
    public final android.support.v4.media.session.a0 f1260c;
    public final ii.h d;
    public final boolean[] f1261e;

    public k(float[] fArr, android.support.v4.media.session.a0 a0Var, ii.h hVar, boolean[] zArr) {
        this.f1259b = fArr;
        this.f1260c = a0Var;
        this.d = hVar;
        this.f1261e = zArr;
    }

    @Override
    public final void run() {
        switch (this.f1258a) {
            case 0:
                final boolean[] zArr = this.f1261e;
                final android.support.v4.media.session.a0 a0Var = this.f1260c;
                final ii.h hVar = this.d;
                final float[] fArr = this.f1259b;
                t[] tVarArr = DictationAsr.f43023a;
                if (!zArr[0]) {
                    DictationAsr.Y((t) a0Var.f1705b, new u() {
                        @Override
                        public final void a(boolean z10) {
                            boolean[] zArr2 = zArr;
                            ii.h hVar2 = hVar;
                            float[] fArr2 = fArr;
                            android.support.v4.media.session.a0 a0Var2 = a0Var;
                            t[] tVarArr2 = DictationAsr.f43023a;
                            if (zArr2[0]) {
                                return;
                            }
                            if (!z10) {
                                hVar2.a(null, null, true);
                            } else {
                                new Thread(new k(fArr2, a0Var2, hVar2, zArr2), "DictationAsrFile").start();
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                float[] fArr2 = this.f1259b;
                android.support.v4.media.session.a0 a0Var2 = this.f1260c;
                ii.h hVar2 = this.d;
                boolean[] zArr2 = this.f1261e;
                try {
                    DictationAsr.V(fArr2, a0Var2, hVar2, zArr2);
                    return;
                } catch (Throwable th2) {
                    Log.e("Dictation", "tinyasr: transcription failed", th2);
                    org.telegram.messenger.g0.g3(new i(zArr2, hVar2, 2));
                    return;
                }
        }
    }

    public k(boolean[] zArr, android.support.v4.media.session.a0 a0Var, ii.h hVar, float[] fArr) {
        this.f1261e = zArr;
        this.f1260c = a0Var;
        this.d = hVar;
        this.f1259b = fArr;
    }
}
