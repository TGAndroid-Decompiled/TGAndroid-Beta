package defpackage;

import android.view.View;
import java.io.Serializable;
public final class m9c implements ncc, occ {
    public final n9c a;

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.b0(b8cVar, view));
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.a0((b8c) obj, (View) obj2);
    }
}
