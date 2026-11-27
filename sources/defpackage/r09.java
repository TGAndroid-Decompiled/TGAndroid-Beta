package defpackage;

import android.view.View;
import java.io.Serializable;
public final class r09 implements ncc, occ {
    public final w09 a;

    @Override
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        boolean z = false;
        if (b8cVar.a == 16) {
            Object obj = b8cVar.H;
            if (!(obj instanceof a19) || !((a19) obj).g) {
                this.a.h0(b8cVar, view);
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
        this.a.f0((b8c) obj, (View) obj2);
    }
}
