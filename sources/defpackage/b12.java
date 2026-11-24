package defpackage;

import android.view.View;
import java.io.Serializable;
public final class b12 implements n8c, o8c {
    public final h12 a;

    @Override
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        this.a.Q(c4cVar, view);
        return Boolean.TRUE;
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.Q((c4c) obj, (View) obj2);
    }
}
