package ch;

import android.content.Context;
import org.telegram.ui.ActionBar.h6;
public final class m extends e0 {
    public final p f5452i2;

    public m(p pVar, Context context, h6 h6Var, int i7) {
        super(i7, context, h6Var);
        this.f5452i2 = pVar;
    }

    @Override
    public final void G(int i7, int i10) {
        if (i10 > i7) {
            this.f5452i2.F.w0(0, org.telegram.messenger.g0.L(30.0f), null);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i7) {
        if (i7 != 2131296496 && i7 != 16908320) {
            if (i7 != 16908322 && i7 != 16908321) {
                return super.onTextContextMenuItem(i7);
            }
            return false;
        }
        return this.f5452i2.g0();
    }
}
