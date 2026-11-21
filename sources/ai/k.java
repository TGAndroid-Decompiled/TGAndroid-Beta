package ai;

import android.util.Log;
import java.util.HashMap;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Dictation.DictationAsr;
public final class k implements Runnable {
    public final int f1259a = 1;
    public final float[] f1260b;
    public final android.support.v4.media.session.a0 f1261c;
    public final h21 d;
    public final boolean[] f1262e;

    public k(float[] fArr, android.support.v4.media.session.a0 a0Var, h21 h21Var, boolean[] zArr) {
        this.f1260b = fArr;
        this.f1261c = a0Var;
        this.d = h21Var;
        this.f1262e = zArr;
    }

    @Override
    public final void run() {
        switch (this.f1259a) {
            case 0:
                final boolean[] zArr = this.f1262e;
                final android.support.v4.media.session.a0 a0Var = this.f1261c;
                final h21 h21Var = this.d;
                final float[] fArr = this.f1260b;
                t[] tVarArr = DictationAsr.f43064a;
                if (!zArr[0]) {
                    DictationAsr.f0((t) a0Var.f1717b, new u() {
                        @Override
                        public final void a(boolean z10) {
                            boolean[] zArr2 = zArr;
                            android.support.v4.media.session.a0 a0Var2 = a0Var;
                            h21 h21Var2 = h21Var;
                            float[] fArr2 = fArr;
                            t[] tVarArr2 = DictationAsr.f43064a;
                            if (zArr2[0]) {
                                return;
                            }
                            if (!z10) {
                                t tVar = (t) a0Var2.f1717b;
                                if (tVar != null && tVar.f1512f == 0 && !DictationAsr.y(tVar) && !l1.b()) {
                                    HashMap hashMap = j21.S;
                                    Integer num = h21Var2.f35766a;
                                    hashMap.remove(num);
                                    j21.R.remove(num);
                                    j21.n(h21Var2.f35767b);
                                    return;
                                }
                                h21Var2.a(null, null, true);
                                return;
                            }
                            new Thread(new k(fArr2, a0Var2, h21Var2, zArr2), "DictationAsrFile").start();
                        }
                    });
                    return;
                }
                return;
            default:
                float[] fArr2 = this.f1260b;
                android.support.v4.media.session.a0 a0Var2 = this.f1261c;
                h21 h21Var2 = this.d;
                boolean[] zArr2 = this.f1262e;
                try {
                    DictationAsr.b0(fArr2, a0Var2, h21Var2, zArr2);
                    return;
                } catch (Throwable th2) {
                    Log.e("Dictation", "tinyasr: transcription failed", th2);
                    org.telegram.messenger.g0.g3(new j(zArr2, h21Var2, 1));
                    return;
                }
        }
    }

    public k(boolean[] zArr, android.support.v4.media.session.a0 a0Var, h21 h21Var, float[] fArr) {
        this.f1262e = zArr;
        this.f1261c = a0Var;
        this.d = h21Var;
        this.f1260b = fArr;
    }
}
