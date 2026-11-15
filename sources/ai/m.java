package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class m implements Runnable {
    public final int f1352a = 1;
    public final float[] f1353b;
    public final android.support.v4.media.session.a0 f1354c;
    public final ki.r1 d;
    public final boolean[] f1355e;

    public m(float[] fArr, android.support.v4.media.session.a0 a0Var, ki.r1 r1Var, boolean[] zArr) {
        this.f1353b = fArr;
        this.f1354c = a0Var;
        this.d = r1Var;
        this.f1355e = zArr;
    }

    @Override
    public final void run() {
        switch (this.f1352a) {
            case 0:
                final boolean[] zArr = this.f1355e;
                final android.support.v4.media.session.a0 a0Var = this.f1354c;
                final ki.r1 r1Var = this.d;
                final float[] fArr = this.f1353b;
                s[] sVarArr = DictationAsr.f42579a;
                if (!zArr[0]) {
                    DictationAsr.V((s) a0Var.f1706b, new t() {
                        @Override
                        public final void a(boolean z10) {
                            boolean[] zArr2 = zArr;
                            ki.r1 r1Var2 = r1Var;
                            float[] fArr2 = fArr;
                            android.support.v4.media.session.a0 a0Var2 = a0Var;
                            s[] sVarArr2 = DictationAsr.f42579a;
                            if (zArr2[0]) {
                                return;
                            }
                            if (!z10) {
                                r1Var2.a(null, null, true);
                            } else {
                                new Thread(new m(fArr2, a0Var2, r1Var2, zArr2), "DictationAsrFile").start();
                            }
                        }
                    });
                    return;
                }
                return;
            default:
                DictationAsr.a(this.f1353b, this.f1354c, this.d, this.f1355e);
                return;
        }
    }

    public m(boolean[] zArr, android.support.v4.media.session.a0 a0Var, ki.r1 r1Var, float[] fArr) {
        this.f1355e = zArr;
        this.f1354c = a0Var;
        this.d = r1Var;
        this.f1353b = fArr;
    }
}
