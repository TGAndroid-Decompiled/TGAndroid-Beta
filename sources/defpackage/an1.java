package defpackage;

import android.content.Context;
import android.text.style.CharacterStyle;
public final class an1 implements Runnable {
    public final byte a = 1;
    public final int b;
    public final byte c;
    public final Object d;
    public final Object e;
    public final Object f;

    public an1(yv1 yv1Var, int i, int i2, CharacterStyle characterStyle, rc2 rc2Var) {
        this.d = yv1Var;
        this.b = i;
        this.c = i2;
        this.e = characterStyle;
        this.f = rc2Var;
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
                yv1 yv1Var = (yv1) obj3;
                yv1Var.kc = i;
                yv1Var.lc = b2;
                yv1Var.mc = (CharacterStyle) obj2;
                ((rc2) obj).invalidate();
                return;
            default:
                joc jocVar = (joc) obj;
                gm.c3(new gcc((moc) obj3, new ioc(((Context) obj2).getApplicationContext(), i, b2, jocVar), jocVar, (byte) 15));
                return;
        }
    }

    public an1(moc mocVar, Context context, int i, int i2, joc jocVar) {
        this.d = mocVar;
        this.e = context;
        this.b = i;
        this.c = i2;
        this.f = jocVar;
    }
}
