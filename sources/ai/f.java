package ai;

import org.telegram.ui.Components.h21;
import org.telegram.ui.Dictation.DictationAsr;
public final class f implements Runnable {
    public final int f1185a;
    public final boolean[] f1186b;
    public final h21 f1187c;

    public f(boolean[] zArr, h21 h21Var, int i7) {
        this.f1185a = i7;
        this.f1186b = zArr;
        this.f1187c = h21Var;
    }

    @Override
    public final void run() {
        switch (this.f1185a) {
            case 0:
                boolean[] zArr = this.f1186b;
                h21 h21Var = this.f1187c;
                p[] pVarArr = DictationAsr.f43033a;
                if (!zArr[0]) {
                    h21Var.a(null, null, true);
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f1186b;
                h21 h21Var2 = this.f1187c;
                p[] pVarArr2 = DictationAsr.f43033a;
                if (!zArr2[0]) {
                    h21Var2.a(null, null, true);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f1186b;
                h21 h21Var3 = this.f1187c;
                p[] pVarArr3 = DictationAsr.f43033a;
                if (!zArr3[0]) {
                    h21Var3.a(null, null, true);
                    return;
                }
                return;
        }
    }
}
