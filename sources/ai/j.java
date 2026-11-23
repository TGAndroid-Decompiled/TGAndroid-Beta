package ai;

import org.telegram.ui.Components.h21;
import org.telegram.ui.Dictation.DictationAsr;
public final class j implements Runnable {
    public final int f1245a;
    public final boolean[] f1246b;
    public final h21 f1247c;

    public j(boolean[] zArr, h21 h21Var, int i7) {
        this.f1245a = i7;
        this.f1246b = zArr;
        this.f1247c = h21Var;
    }

    @Override
    public final void run() {
        switch (this.f1245a) {
            case 0:
                boolean[] zArr = this.f1246b;
                h21 h21Var = this.f1247c;
                t[] tVarArr = DictationAsr.f43067a;
                if (!zArr[0]) {
                    h21Var.a(null, null, true);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f1246b;
                h21 h21Var2 = this.f1247c;
                t[] tVarArr2 = DictationAsr.f43067a;
                if (!zArr2[0]) {
                    h21Var2.a(null, null, true);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f1246b;
                h21 h21Var3 = this.f1247c;
                t[] tVarArr3 = DictationAsr.f43067a;
                if (!zArr3[0]) {
                    h21Var3.a(null, null, true);
                    return;
                }
                return;
        }
    }
}
