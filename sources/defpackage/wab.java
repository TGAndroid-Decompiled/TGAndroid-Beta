package defpackage;

import android.content.Context;
public final class wab extends ld5 {
    public final hn r;

    public wab(Context context, wjb wjbVar) {
        super(context, wjbVar);
        int i;
        hn hnVar = new hn(context, true, true, true);
        this.r = hnVar;
        hnVar.b(0.45f, 240L, s33.h);
        if (k96.a0) {
            i = 3;
        } else {
            i = 5;
        }
        hnVar.setGravity(i);
        hnVar.setTextSize(gl.L(15.0f));
        hnVar.setTypeface(gl.o());
        zkb.U(hnVar, bkb.K6, wjbVar);
        addView(hnVar, nme.d(-2, 24.0f, (k96.a0 ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        zkb.h(bkb.g5, wjbVar, this);
    }
}
