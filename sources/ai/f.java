package ai;

import org.telegram.ui.Components.g21;
import org.telegram.ui.Dictation.DictationAsr;
public final class f implements Runnable {
    public final int f1185a;
    public final boolean[] f1186b;
    public final g21 f1187c;

    public f(boolean[] zArr, g21 g21Var, int i7) {
        this.f1185a = i7;
        this.f1186b = zArr;
        this.f1187c = g21Var;
    }

    @Override
    public final void run() {
        switch (this.f1185a) {
            case 0:
                boolean[] zArr = this.f1186b;
                g21 g21Var = this.f1187c;
                q[] qVarArr = DictationAsr.f43143a;
                if (!zArr[0]) {
                    g21Var.a(null, null, true);
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.f1186b;
                g21 g21Var2 = this.f1187c;
                q[] qVarArr2 = DictationAsr.f43143a;
                if (!zArr2[0]) {
                    g21Var2.a(null, null, true);
                    return;
                }
                return;
        }
    }
}
