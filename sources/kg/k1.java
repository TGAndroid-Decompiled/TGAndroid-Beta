package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.l41;
public final class k1 implements v10, w10 {
    public final t1 f18366a;

    @Override
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        if (l41Var.f56589a == 16) {
            Object obj = l41Var.H;
            if (!(obj instanceof v1) || !((v1) obj).f18511g) {
                this.f18366a.j0(l41Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        t1.b0(this.f18366a, (l41) obj, (View) obj2);
    }
}
