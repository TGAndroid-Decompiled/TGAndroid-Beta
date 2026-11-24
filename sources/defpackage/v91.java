package defpackage;

import android.view.View;
import java.io.Serializable;
public final class v91 implements oac, pac, qq7 {
    public final ia1 a;

    public v91(ia1 ia1Var) {
        this.a = ia1Var;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        return this.a.onInsetsInternal(view, wzcVar);
    }

    @Override
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        Object obj = c6cVar.H;
        if (obj instanceof fa1) {
            this.a.a0(((fa1) obj).c, (ea1) view);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.j0((c6c) obj, (View) obj2);
    }
}
