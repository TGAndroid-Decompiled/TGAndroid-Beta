package defpackage;

import java.util.HashMap;
import org.telegram.ui.Dictation.DictationAsr;
public final class im3 implements om3 {
    public final byte a = 1;
    public final boolean[] b;
    public final float[] c;
    public final pm3 d;
    public final mm3 e;

    public im3(boolean[] zArr, pm3 pm3Var, s2c s2cVar, float[] fArr) {
        this.b = zArr;
        this.d = pm3Var;
        this.e = s2cVar;
        this.c = fArr;
    }

    @Override
    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                pm3 pm3Var = this.d;
                s2c s2cVar = (s2c) this.e;
                float[] fArr = this.c;
                nm3[] nm3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    if (!z) {
                        nm3 nm3Var = (nm3) pm3Var.b;
                        if (nm3Var != null && nm3Var.f == 0 && !DictationAsr.z(nm3Var) && !qn3.b()) {
                            HashMap hashMap = u2c.S;
                            Integer num = s2cVar.a;
                            hashMap.remove(num);
                            u2c.R.remove(num);
                            u2c.o(s2cVar.b);
                            return;
                        }
                        s2cVar.a(null, null, true);
                        return;
                    }
                    new Thread(new fm3(fArr, pm3Var, s2cVar, zArr), "DictationAsrFile").start();
                    return;
                }
                return;
            default:
                boolean[] zArr2 = this.b;
                j7b j7bVar = (j7b) this.e;
                float[] fArr2 = this.c;
                pm3 pm3Var2 = this.d;
                nm3[] nm3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    if (!z) {
                        j7bVar.a(null, null, true);
                        return;
                    } else {
                        new Thread(new ao1(fArr2, pm3Var2, j7bVar, zArr2, (byte) 13), "DictationAsrFile").start();
                        return;
                    }
                }
                return;
        }
    }

    public im3(boolean[] zArr, j7b j7bVar, float[] fArr, pm3 pm3Var) {
        this.b = zArr;
        this.e = j7bVar;
        this.c = fArr;
        this.d = pm3Var;
    }
}
