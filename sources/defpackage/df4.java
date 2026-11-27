package defpackage;

import android.content.Context;
public final class df4 extends mf5 {
    public final si r;

    public df4(Context context, vnb vnbVar) {
        super(context);
        int i;
        si siVar = new si(context, true, true, true, (byte) 1);
        this.r = siVar;
        if (ob6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        siVar.setGravity(i);
        yob.U(siVar, aob.L6, vnbVar);
        siVar.setTextSize(hl.N(15.0f));
        addView(siVar, tre.d(-1, 18.0f, (ob6.a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        iye.b(siVar, 0.04f, 1.2f);
    }
}
