package defpackage;

import android.view.View;
import java.io.Serializable;
public final class bn2 implements n8c, o8c, no7, sc7 {
    public final en2 a;

    public bn2(en2 en2Var) {
        this.a = en2Var;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        io5 f = vxcVar.a.f(519);
        this.a.e.setPadding(0, f.b, 0, f.d);
        return vxc.b;
    }

    @Override
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.c0(c4cVar, view));
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.b0((c4c) obj);
    }

    @Override
    public final void k(boolean z) {
        en2 en2Var = this.a;
        en2Var.finishFragment();
        en2Var.getNotificationCenter().k(kk7.J2, Long.valueOf(-en2Var.c), null, en2Var.J, Boolean.valueOf(z));
    }
}
