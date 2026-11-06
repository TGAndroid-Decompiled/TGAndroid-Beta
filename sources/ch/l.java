package ch;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
public final class l extends d0 {
    public final o f6305c2;

    public l(o oVar, Context context, f6 f6Var, int i7) {
        super(i7, context, f6Var);
        this.f6305c2 = oVar;
    }

    @Override
    public final void F(int i7, int i10) {
        if (i10 > i7) {
            this.f6305c2.E.w0(0, org.telegram.messenger.g0.L(30.0f), null);
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
        return this.f6305c2.g0();
    }
}
