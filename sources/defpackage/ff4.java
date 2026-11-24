package defpackage;

import android.content.Context;
public final class ff4 extends jf5 {
    public final rj r;

    public ff4(Context context, ylb ylbVar) {
        super(context);
        int i;
        rj rjVar = new rj(context, true, true, true, (byte) 1);
        this.r = rjVar;
        if (jb6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        rjVar.setGravity(i);
        anb.U(rjVar, cmb.K6, ylbVar);
        rjVar.setTextSize(gm.N(15.0f));
        addView(rjVar, qoe.d(-1, 18.0f, (jb6.a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        rve.b(rjVar, 0.04f, 1.2f);
    }
}
