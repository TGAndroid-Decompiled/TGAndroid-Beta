package ch;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
public final class l extends e0 {
    public final o f5114i2;

    public l(o oVar, Context context, e6 e6Var, int i7) {
        super(i7, context, e6Var);
        this.f5114i2 = oVar;
    }

    @Override
    public final void G(int i7, int i10) {
        if (i10 > i7) {
            this.f5114i2.F.w0(0, org.telegram.messenger.g0.L(30.0f), null);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i7) {
        if (i7 != 2131296494 && i7 != 16908320) {
            if (i7 != 16908322 && i7 != 16908321) {
                return super.onTextContextMenuItem(i7);
            }
            return false;
        }
        return this.f5114i2.g0();
    }
}
