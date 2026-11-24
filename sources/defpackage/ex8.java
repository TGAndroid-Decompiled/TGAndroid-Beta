package defpackage;

import android.view.View;
import java.io.Serializable;
public final class ex8 implements n8c, o8c {
    public final kx8 a;

    @Override
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        boolean z = false;
        if (c4cVar.a == 16) {
            Object obj = c4cVar.H;
            if (!(obj instanceof nx8) || !((nx8) obj).g) {
                this.a.h0(c4cVar, view);
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        this.a.f0((c4c) obj, (View) obj2);
    }
}
