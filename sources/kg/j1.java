package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.w10;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.o41;
public final class j1 implements w10, x10 {
    public final s1 f18393a;

    @Override
    public Boolean a(o41 o41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        if (o41Var.f56634a == 16) {
            Object obj = o41Var.H;
            if (!(obj instanceof u1) || !((u1) obj).f18538g) {
                this.f18393a.j0(o41Var, view);
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
        s1.b0(this.f18393a, (o41) obj, (View) obj2);
    }
}
