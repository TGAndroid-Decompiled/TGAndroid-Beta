package ai;

import hi.j7;
import java.util.HashMap;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Dictation.DictationAsr;
public final class h implements r {
    public final int f1209a = 1;
    public final boolean[] f1210b;
    public final android.support.v4.media.session.a0 f1211c;
    public final float[] d;
    public final p f1212e;

    public h(boolean[] zArr, android.support.v4.media.session.a0 a0Var, g21 g21Var, float[] fArr) {
        this.f1210b = zArr;
        this.f1211c = a0Var;
        this.f1212e = g21Var;
        this.d = fArr;
    }

    @Override
    public final void a(boolean z10) {
        switch (this.f1209a) {
            case 0:
                boolean[] zArr = this.f1210b;
                j7 j7Var = (j7) this.f1212e;
                float[] fArr = this.d;
                android.support.v4.media.session.a0 a0Var = this.f1211c;
                q[] qVarArr = DictationAsr.f43143a;
                if (!zArr[0]) {
                    if (!z10) {
                        j7Var.a(null, null, true);
                        return;
                    } else {
                        new Thread(new j(fArr, a0Var, j7Var, zArr, 0), "DictationAsrFile").start();
                        return;
                    }
                }
                return;
            default:
                boolean[] zArr2 = this.f1210b;
                android.support.v4.media.session.a0 a0Var2 = this.f1211c;
                g21 g21Var = (g21) this.f1212e;
                float[] fArr2 = this.d;
                q[] qVarArr2 = DictationAsr.f43143a;
                if (!zArr2[0]) {
                    if (!z10) {
                        q qVar = (q) a0Var2.f1676b;
                        if (qVar != null && qVar.f1458f == 0 && !DictationAsr.A(qVar) && !h1.b()) {
                            HashMap hashMap = i21.S;
                            Integer num = g21Var.f35294a;
                            hashMap.remove(num);
                            i21.R.remove(num);
                            i21.o(g21Var.f35295b);
                            return;
                        }
                        g21Var.a(null, null, true);
                        return;
                    }
                    new Thread(new g(fArr2, a0Var2, g21Var, zArr2), "DictationAsrFile").start();
                    return;
                }
                return;
        }
    }

    public h(boolean[] zArr, j7 j7Var, float[] fArr, android.support.v4.media.session.a0 a0Var) {
        this.f1210b = zArr;
        this.f1212e = j7Var;
        this.d = fArr;
        this.f1211c = a0Var;
    }
}
