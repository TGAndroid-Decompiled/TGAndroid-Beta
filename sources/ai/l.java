package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class l implements Runnable {
    public final int f1312a;
    public final boolean[] f1313b;
    public final ki.r1 f1314c;

    public l(boolean[] zArr, ki.r1 r1Var, int i7) {
        this.f1312a = i7;
        this.f1313b = zArr;
        this.f1314c = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f1312a) {
            case 0:
                boolean[] zArr = this.f1313b;
                ki.r1 r1Var = this.f1314c;
                t[] tVarArr = DictationAsr.f42579a;
                if (!zArr[0]) {
                    r1Var.a(null, null, true);
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f1313b;
                ki.r1 r1Var2 = this.f1314c;
                t[] tVarArr2 = DictationAsr.f42579a;
                if (!zArr2[0]) {
                    r1Var2.a(null, null, true);
                    return;
                }
                return;
        }
    }
}
