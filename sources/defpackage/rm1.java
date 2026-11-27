package defpackage;

import android.content.Context;
import android.text.style.CharacterStyle;
public final class rm1 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final byte c;
    public final Object d;
    public final Object e;
    public final Object f;

    public rm1(zu1 zu1Var, int i, int i2, CharacterStyle characterStyle, wb2 wb2Var) {
        this.d = zu1Var;
        this.b = i;
        this.c = i2;
        this.e = characterStyle;
        this.f = wb2Var;
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
                zu1 zu1Var = (zu1) obj3;
                zu1Var.lc = i;
                zu1Var.mc = b2;
                zu1Var.nc = (CharacterStyle) obj2;
                ((wb2) obj).invalidate();
                return;
            default:
                xqc xqcVar = (xqc) obj;
                hl.c3(new b6c((zqc) obj3, new wqc(((Context) obj2).getApplicationContext(), i, b2, xqcVar), xqcVar, (byte) 22));
                return;
        }
    }

    public rm1(zqc zqcVar, Context context, int i, int i2, xqc xqcVar) {
        this.d = zqcVar;
        this.e = context;
        this.b = i;
        this.c = i2;
        this.f = xqcVar;
    }
}
