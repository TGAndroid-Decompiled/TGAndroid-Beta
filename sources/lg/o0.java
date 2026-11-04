package lg;

import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.r31;
public final class o0 implements org.telegram.ui.ActionBar.p1, s10 {
    public final int f18384a;
    public final r0 f18385b;

    public o0(r0 r0Var, int i3) {
        this.f18384a = i3;
        this.f18385b = r0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f18384a) {
            case 0:
                this.f18385b.f0();
                return;
            case 1:
                this.f18385b.finishFragment();
                return;
            default:
                this.f18385b.f0();
                return;
        }
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        r0.b0(this.f18385b, (r31) obj, (View) obj2);
    }
}
