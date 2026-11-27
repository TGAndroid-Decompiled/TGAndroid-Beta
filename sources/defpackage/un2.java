package defpackage;

import android.view.View;
import java.io.Serializable;
public final class un2 implements ncc, occ, nr7, cf7 {
    public final xn2 a;

    public un2(xn2 xn2Var) {
        this.a = xn2Var;
    }

    @Override
    public final void A(boolean z) {
        xn2 xn2Var = this.a;
        xn2Var.finishFragment();
        xn2Var.getNotificationCenter().k(jn7.K2, Long.valueOf(-xn2Var.c), null, xn2Var.J, Boolean.valueOf(z));
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        mq5 f = l2dVar.a.f(519);
        this.a.e.setPadding(0, f.b, 0, f.d);
        return l2d.b;
    }

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.c0(b8cVar, view));
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.b0((b8c) obj);
    }
}
