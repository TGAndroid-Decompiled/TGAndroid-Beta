package defpackage;

import android.content.Context;
import android.text.style.CharacterStyle;
public final class ql1 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final byte c;
    public final Object d;
    public final Object e;
    public final Object f;

    public ql1(mu1 mu1Var, int i, int i2, CharacterStyle characterStyle, gb2 gb2Var) {
        this.d = mu1Var;
        this.b = i;
        this.c = i2;
        this.e = characterStyle;
        this.f = gb2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.f;
        byte b2 = this.c;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                mu1 mu1Var = (mu1) obj3;
                mu1Var.ac = i;
                mu1Var.bc = b2;
                mu1Var.cc = (CharacterStyle) obj2;
                ((gb2) obj).invalidate();
                return;
            default:
                kmc kmcVar = (kmc) obj;
                gl.d3(new wbc((mmc) obj3, new jmc(((Context) obj2).getApplicationContext(), i, b2, kmcVar), kmcVar, (byte) 12));
                return;
        }
    }

    public ql1(mmc mmcVar, Context context, int i, int i2, kmc kmcVar) {
        this.d = mmcVar;
        this.e = context;
        this.b = i;
        this.c = i2;
        this.f = kmcVar;
    }
}
