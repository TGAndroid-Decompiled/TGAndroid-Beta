package defpackage;

import java.util.HashMap;
import org.telegram.ui.Dictation.DictationAsr;
public final class pl3 implements wl3 {
    public final byte a = 0;
    public final boolean[] b;
    public final xl3 c;
    public final float[] d;
    public final ul3 e;

    public pl3(boolean[] zArr, xl3 xl3Var, syb sybVar, float[] fArr) {
        this.b = zArr;
        this.c = xl3Var;
        this.e = sybVar;
        this.d = fArr;
    }

    @Override
    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                n3b n3bVar = (n3b) this.e;
                float[] fArr = this.d;
                xl3 xl3Var = this.c;
                vl3[] vl3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    if (!z) {
                        n3bVar.a(null, null, true);
                        return;
                    } else {
                        new Thread(new hn1(fArr, xl3Var, n3bVar, zArr, (byte) 13), "DictationAsrFile").start();
                        return;
                    }
                }
                return;
            default:
                boolean[] zArr2 = this.b;
                xl3 xl3Var2 = this.c;
                syb sybVar = (syb) this.e;
                float[] fArr2 = this.d;
                vl3[] vl3VarArr2 = DictationAsr.a;
                if (!zArr2[0]) {
                    if (!z) {
                        vl3 vl3Var = (vl3) xl3Var2.b;
                        if (vl3Var != null && vl3Var.f == 0 && !DictationAsr.y(vl3Var) && !zm3.b()) {
                            HashMap hashMap = uyb.S;
                            Integer num = sybVar.a;
                            hashMap.remove(num);
                            uyb.R.remove(num);
                            uyb.o(sybVar.b);
                            return;
                        }
                        sybVar.a(null, null, true);
                        return;
                    }
                    new Thread(new ol3(fArr2, xl3Var2, sybVar, zArr2), "DictationAsrFile").start();
                    return;
                }
                return;
        }
    }

    public pl3(boolean[] zArr, n3b n3bVar, float[] fArr, xl3 xl3Var) {
        this.b = zArr;
        this.e = n3bVar;
        this.d = fArr;
        this.c = xl3Var;
    }
}
