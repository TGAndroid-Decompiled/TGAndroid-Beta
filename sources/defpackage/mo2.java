package defpackage;

import android.view.View;
import java.io.Serializable;
public final class mo2 implements oac, pac, qq7, ue7 {
    public final po2 a;

    public mo2(po2 po2Var) {
        this.a = po2Var;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        iq5 f = wzcVar.a.f(519);
        this.a.e.setPadding(0, f.b, 0, f.d);
        return wzc.b;
    }

    @Override
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.d0(c6cVar, view));
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.c0((c6c) obj);
    }

    @Override
    public final void z(boolean z) {
        po2 po2Var = this.a;
        po2Var.finishFragment();
        po2Var.getNotificationCenter().k(nm7.K2, Long.valueOf(-po2Var.c), null, po2Var.J, Boolean.valueOf(z));
    }
}
