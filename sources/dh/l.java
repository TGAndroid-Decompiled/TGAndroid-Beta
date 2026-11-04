package dh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
public final class l extends c0 {
    public final o f9059d2;

    public l(o oVar, Context context, e6 e6Var, int i3) {
        super(i3, context, e6Var);
        this.f9059d2 = oVar;
    }

    @Override
    public final void F(int i3, int i10) {
        if (i10 > i3) {
            this.f9059d2.F.w0(0, org.telegram.messenger.g0.L(30.0f), null);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i3) {
        if (i3 != 2131296494 && i3 != 16908320) {
            if (i3 != 16908322 && i3 != 16908321) {
                return super.onTextContextMenuItem(i3);
            }
            return false;
        }
        return this.f9059d2.g0();
    }
}
