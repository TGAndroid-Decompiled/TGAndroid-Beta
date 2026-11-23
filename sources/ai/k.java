package ai;

import android.util.Log;
import java.util.HashMap;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Dictation.DictationAsr;
public final class k implements Runnable {
    public final int f1255a = 1;
    public final float[] f1256b;
    public final android.support.v4.media.session.a0 f1257c;
    public final h21 d;
    public final boolean[] f1258e;

    public k(float[] fArr, android.support.v4.media.session.a0 a0Var, h21 h21Var, boolean[] zArr) {
        this.f1256b = fArr;
        this.f1257c = a0Var;
        this.d = h21Var;
        this.f1258e = zArr;
    }

    @Override
    public final void run() {
        boolean z10;
        String str;
        switch (this.f1255a) {
            case 0:
                final boolean[] zArr = this.f1258e;
                final android.support.v4.media.session.a0 a0Var = this.f1257c;
                final h21 h21Var = this.d;
                final float[] fArr = this.f1256b;
                t[] tVarArr = DictationAsr.f43068a;
                int i7 = 0;
                if (!zArr[0]) {
                    if (a0Var == null) {
                        gj gjVar = h21Var.f35760b;
                        org.telegram.ui.Cells.m1 m1Var = h21Var.f35761c;
                        Integer valueOf = Integer.valueOf(j21.r(gjVar));
                        int i10 = gjVar.K1;
                        if (j21.j(gjVar)) {
                            j21.n(gjVar);
                            return;
                        }
                        j21.T.add(valueOf);
                        j21.R.remove(valueOf);
                        j21.S.remove(valueOf);
                        HashMap hashMap = j21.P;
                        if (hashMap != null) {
                            hashMap.remove(valueOf);
                        }
                        if (!k10.i(i10).q() && !j21.e(gjVar)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (org.telegram.messenger.s2.f26730a) {
                            StringBuilder sb2 = new StringBuilder("local transcription of msg_id=");
                            sb2.append(gjVar.e1());
                            sb2.append(": unknown language, ");
                            if (z10) {
                                str = "asking the server";
                            } else {
                                str = "needs premium";
                            }
                            p5.c.s(str, sb2);
                        }
                        if (z10) {
                            j21.z(gjVar, true, m1Var);
                            return;
                        }
                        ls.f(i10).k(115, gjVar);
                        ls.f(i10).k(119, new Object[0]);
                        if (m1Var != null) {
                            if (np.u1(i10).f25983v4 > 0) {
                                i7 = 3;
                            }
                            m1Var.h0(i7);
                            return;
                        }
                        return;
                    }
                    DictationAsr.f0((t) a0Var.f1724b, new u() {
                        @Override
                        public final void a(boolean z11) {
                            boolean[] zArr2 = zArr;
                            android.support.v4.media.session.a0 a0Var2 = a0Var;
                            h21 h21Var2 = h21Var;
                            float[] fArr2 = fArr;
                            t[] tVarArr2 = DictationAsr.f43068a;
                            if (zArr2[0]) {
                                return;
                            }
                            if (!z11) {
                                t tVar = (t) a0Var2.f1724b;
                                if (tVar != null && tVar.f1520f == 0 && !DictationAsr.y(tVar) && !m1.b()) {
                                    HashMap hashMap2 = j21.S;
                                    Integer num = h21Var2.f35759a;
                                    hashMap2.remove(num);
                                    j21.R.remove(num);
                                    j21.o(h21Var2.f35760b);
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
                float[] fArr2 = this.f1256b;
                android.support.v4.media.session.a0 a0Var2 = this.f1257c;
                h21 h21Var2 = this.d;
                boolean[] zArr2 = this.f1258e;
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
        this.f1258e = zArr;
        this.f1257c = a0Var;
        this.d = h21Var;
        this.f1256b = fArr;
    }
}
