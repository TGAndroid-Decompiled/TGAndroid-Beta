package hg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
public final class p extends g0 {
    public final s h;

    public p(s sVar, Context context, b6 b6Var, int i9) {
        super(context, i9, b6Var);
        this.h = sVar;
    }

    @Override
    public final void onLineCountChanged(int i9, int i10) {
        if (i10 > i9) {
            this.h.f10729y.smoothScrollBy(0, AndroidUtilities.dp(30.0f));
        }
    }

    @Override
    public final boolean onTextContextMenuItem(int i9) {
        if (i9 != R.id.menu_delete && i9 != 16908320) {
            if (i9 != 16908322 && i9 != 16908321) {
                return super.onTextContextMenuItem(i9);
            }
            return false;
        }
        return this.h.Z();
    }
}
