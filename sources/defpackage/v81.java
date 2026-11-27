package defpackage;

import android.view.View;
import java.io.Serializable;
public final class v81 implements ncc, occ, nr7 {
    public final i91 a;

    public v81(i91 i91Var) {
        this.a = i91Var;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        return this.a.onInsetsInternal(view, l2dVar);
    }

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        Object obj = b8cVar.H;
        if (obj instanceof f91) {
            this.a.Z(((f91) obj).c, (e91) view);
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
        this.a.i0((b8c) obj, (View) obj2);
    }
}
