package defpackage;

import android.view.View;
import java.io.Serializable;
public final class r12 implements ncc, occ {
    public final x12 a;

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        this.a.P(b8cVar, view);
        return Boolean.TRUE;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.P((b8c) obj, (View) obj2);
    }
}
