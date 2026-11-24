package defpackage;

import java.util.HashMap;
import org.telegram.ui.Dictation.DictationAsr;
public final class an3 implements hn3 {
    public final byte a = 1;
    public final boolean[] b;
    public final in3 c;
    public final float[] d;
    public final fn3 e;

    public an3(boolean[] zArr, in3 in3Var, t0c t0cVar, float[] fArr) {
        this.b = zArr;
        this.c = in3Var;
        this.e = t0cVar;
        this.d = fArr;
    }

    @Override
    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                o5b o5bVar = (o5b) this.e;
                float[] fArr = this.d;
                in3 in3Var = this.c;
                gn3[] gn3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    if (!z) {
                        o5bVar.a(null, null, true);
                        return;
                    } else {
                        new Thread(new xo1(fArr, in3Var, o5bVar, zArr, (byte) 13), "DictationAsrFile").start();
                        return;
                    }
                }
                return;
            default:
                boolean[] zArr2 = this.b;
                in3 in3Var2 = this.c;
                t0c t0cVar = (t0c) this.e;
                float[] fArr2 = this.d;
                gn3[] gn3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    if (!z) {
                        gn3 gn3Var = (gn3) in3Var2.b;
                        if (gn3Var != null && gn3Var.f == 0 && !DictationAsr.y(gn3Var) && !jo3.b()) {
                            HashMap hashMap = v0c.S;
                            Integer num = t0cVar.a;
                            hashMap.remove(num);
                            v0c.R.remove(num);
                            v0c.o(t0cVar.b);
                            return;
                        }
                        t0cVar.a(null, null, true);
                        return;
                    }
                    new Thread(new zm3(fArr2, in3Var2, t0cVar, zArr2), "DictationAsrFile").start();
                    return;
                }
                return;
        }
    }

    public an3(boolean[] zArr, o5b o5bVar, float[] fArr, in3 in3Var) {
        this.b = zArr;
        this.e = o5bVar;
        this.d = fArr;
        this.c = in3Var;
    }
}
