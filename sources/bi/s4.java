package bi;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
public final class s4 implements di.j4, x10 {
    public final a6 f3867a;

    public s4(a6 a6Var) {
        this.f3867a = a6Var;
    }

    @Override
    public void c(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, boolean z10) {
        a6.b0(this.f3867a, tL_starGiftUnique, j3, z10);
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        a6.e0(this.f3867a, (b41) obj);
    }
}
