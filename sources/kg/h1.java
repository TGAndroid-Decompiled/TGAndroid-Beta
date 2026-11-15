package kg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.x10;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.b41;
public final class h1 implements x10, y10 {
    public final r1 f17958a;

    @Override
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        if (b41Var.f56015a == 16) {
            Object obj = b41Var.G;
            if (!(obj instanceof u1) || !((u1) obj).f18118g) {
                this.f17958a.j0(b41Var, view);
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        r1.b0(this.f17958a, (b41) obj, (View) obj2);
    }
}
