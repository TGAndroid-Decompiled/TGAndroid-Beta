package lg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.ui.Components.r31;
public final class i1 implements s10, t10 {
    public final r1 f18333a;

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        if (r31Var.f54715a == 16) {
            Object obj = r31Var.G;
            if (!(obj instanceof t1) || !((t1) obj).f18478g) {
                this.f18333a.j0(r31Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        r1.b0(this.f18333a, (r31) obj, (View) obj2);
    }
}
