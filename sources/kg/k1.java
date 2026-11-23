package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.n41;
public final class k1 implements u10, v10 {
    public final t1 f18465a;

    @Override
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        if (n41Var.f56712a == 16) {
            Object obj = n41Var.H;
            if (!(obj instanceof v1) || !((v1) obj).f18606g) {
                this.f18465a.j0(n41Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        t1.b0(this.f18465a, (n41) obj, (View) obj2);
    }
}
