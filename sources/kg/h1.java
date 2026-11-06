package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.ui.Components.r31;
public final class h1 implements a20, b20 {
    public final q1 f17396a;

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        boolean z9;
        if (r31Var.f54415a == 16) {
            Object obj = r31Var.G;
            if (!(obj instanceof s1) || !((s1) obj).f17534g) {
                this.f17396a.j0(r31Var, view);
                z9 = true;
                return Boolean.valueOf(z9);
            }
        }
        z9 = false;
        return Boolean.valueOf(z9);
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        q1.b0(this.f17396a, (r31) obj, (View) obj2);
    }
}
