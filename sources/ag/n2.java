package ag;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.p20;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.b51;
public final class n2 implements p20, q20 {
    public final z2 f654a;

    @Override
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        boolean z10;
        if (b51Var.f7681a == 16) {
            Object obj = b51Var.G;
            if (!(obj instanceof h3) || !((h3) obj).f555g) {
                this.f654a.j0(b51Var, view);
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
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        z2.b0(this.f654a, (b51) obj, (View) obj2);
    }
}
