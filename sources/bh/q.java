package bh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.u6;
public final class q extends l0 {
    public final u h;

    public q(u uVar, Context context, u6 u6Var, int i10) {
        super(context, i10, u6Var);
        this.h = uVar;
    }

    @Override
    public final void onLineCountChanged(int i10, int i11) {
        if (i11 > i10) {
            this.h.E.w0(0, AndroidUtilities.dp(30.0f), null);
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i10) {
        if (i10 != R.id.menu_delete && i10 != 16908320) {
            if (i10 != 16908322 && i10 != 16908321) {
                return super.onTextContextMenuItem(i10);
            }
            return false;
        }
        return this.h.c0();
    }
}
