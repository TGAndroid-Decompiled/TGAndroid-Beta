package defpackage;

import android.content.Context;
public final class teb extends mf5 {
    public final in r;

    public teb(Context context, vnb vnbVar) {
        super(context, vnbVar);
        int i;
        in inVar = new in(context, true, true, true);
        this.r = inVar;
        inVar.b(0.45f, 240L, k43.h);
        if (ob6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        inVar.setGravity(i);
        inVar.setTextSize(hl.L(15.0f));
        inVar.setTypeface(hl.o());
        yob.U(inVar, aob.L6, vnbVar);
        addView(inVar, tre.d(-2, 24.0f, (ob6.a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        yob.h(aob.h5, vnbVar, this);
    }
}
