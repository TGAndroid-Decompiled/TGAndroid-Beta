package ig;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f61;
public final class p0 implements org.telegram.ui.ActionBar.a2, Utilities.Callback5 {
    public final int f12985a;
    public final r0 f12986b;

    public p0(r0 r0Var, int i10) {
        this.f12985a = i10;
        this.f12986b = r0Var;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f12985a) {
            case 0:
                this.f12986b.a0();
                return;
            case 1:
                this.f12986b.finishFragment();
                return;
            default:
                this.f12986b.a0();
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        r0.W(this.f12986b, (f61) obj, (View) obj2);
    }
}
