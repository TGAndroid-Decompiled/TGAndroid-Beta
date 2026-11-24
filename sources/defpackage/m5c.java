package defpackage;

import android.view.View;
import java.io.Serializable;
public final class m5c implements n8c, o8c {
    public final n5c a;

    @Override
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.valueOf(this.a.b0(c4cVar, view));
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.a0((c4c) obj, (View) obj2);
    }
}
