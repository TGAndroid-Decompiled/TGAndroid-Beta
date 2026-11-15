package ai;

import org.telegram.ui.Dictation.DictationAsr;
public final class l implements Runnable {
    public final int f1337a;
    public final boolean[] f1338b;
    public final ki.r1 f1339c;

    public l(boolean[] zArr, ki.r1 r1Var, int i7) {
        this.f1337a = i7;
        this.f1338b = zArr;
        this.f1339c = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f1337a) {
            case 0:
                boolean[] zArr = this.f1338b;
                ki.r1 r1Var = this.f1339c;
                s[] sVarArr = DictationAsr.f42579a;
                if (!zArr[0]) {
                    r1Var.a(null, null, true);
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f1338b;
                ki.r1 r1Var2 = this.f1339c;
                s[] sVarArr2 = DictationAsr.f42579a;
                if (!zArr2[0]) {
                    r1Var2.a(null, null, true);
                    return;
                }
                return;
        }
    }
}
