package defpackage;

import android.view.View;
import java.io.Serializable;
public final class fz8 implements oac, pac {
    public final lz8 a;

    @Override
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        boolean z = false;
        if (c6cVar.a == 16) {
            Object obj = c6cVar.H;
            if (!(obj instanceof oz8) || !((oz8) obj).g) {
                this.a.i0(c6cVar, view);
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.g0((c6c) obj, (View) obj2);
    }
}
