package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class m implements Runnable {
    public final int f1345a = 1;
    public final float[] f1346b;
    public final android.support.v4.media.session.a0 f1347c;
    public final ki.r1 d;
    public final boolean[] f1348e;

    public m(float[] fArr, android.support.v4.media.session.a0 a0Var, ki.r1 r1Var, boolean[] zArr) {
        this.f1346b = fArr;
        this.f1347c = a0Var;
        this.d = r1Var;
        this.f1348e = zArr;
    }

    @Override
    public final void run() {
        switch (this.f1345a) {
            case 0:
                final boolean[] zArr = this.f1348e;
                final android.support.v4.media.session.a0 a0Var = this.f1347c;
                final ki.r1 r1Var = this.d;
                final float[] fArr = this.f1346b;
                t[] tVarArr = DictationAsr.f42579a;
                if (!zArr[0]) {
                    DictationAsr.V((t) a0Var.f1713b, new u() {
                        @Override
                        public final void a(boolean z10) {
                            boolean[] zArr2 = zArr;
                            ki.r1 r1Var2 = r1Var;
                            float[] fArr2 = fArr;
                            android.support.v4.media.session.a0 a0Var2 = a0Var;
                            t[] tVarArr2 = DictationAsr.f42579a;
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
                DictationAsr.b(this.f1346b, this.f1347c, this.d, this.f1348e);
                return;
        }
    }

    public m(boolean[] zArr, android.support.v4.media.session.a0 a0Var, ki.r1 r1Var, float[] fArr) {
        this.f1348e = zArr;
        this.f1347c = a0Var;
        this.d = r1Var;
        this.f1346b = fArr;
    }
}
