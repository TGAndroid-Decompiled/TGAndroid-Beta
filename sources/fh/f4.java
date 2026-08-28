package fh;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class f4 extends k41 {
    public static final int f6457a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        Typeface typeface;
        l80 l80Var = (l80) view;
        l80Var.setGravity(l41Var.f30352z);
        l80Var.setTextColor((int) l41Var.B);
        l80Var.setTextSize(1, l41Var.A);
        if (l41Var.f30344q) {
            typeface = AndroidUtilities.bold();
        } else {
            typeface = null;
        }
        l80Var.setTypeface(typeface);
        int i9 = l41Var.f30336i;
        l80Var.setPadding(i9, 0, i9, l41Var.f30338k);
        l80Var.setText(l41Var.f30339l);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new e4(context, 0, null);
    }
}
