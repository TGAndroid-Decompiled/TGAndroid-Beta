package kg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
public final class p extends f0 {
    public final s h;

    public p(s sVar, Context context, c6 c6Var, int i10) {
        super(context, i10, c6Var);
        this.h = sVar;
    }

    @Override
    public final void onLineCountChanged(int i10, int i11) {
        if (i11 > i10) {
            this.h.f13864y.smoothScrollBy(0, AndroidUtilities.dp(30.0f));
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
        return this.h.a0();
    }
}
