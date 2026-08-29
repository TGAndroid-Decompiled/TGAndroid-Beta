package i7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y80;
public abstract class j6 {
    public static y80 a(Context context, float f9, int i10, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11 = org.telegram.ui.ActionBar.g6.gc;
        y80 y80Var = new y80(context, null);
        y80Var.setTextSize(1, f9);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        if (z10) {
            y80Var.setTypeface(AndroidUtilities.bold());
        }
        return y80Var;
    }

    public static TextView b(Context context, float f9, int i10, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        TextView h = org.telegram.messenger.x3.h(context, 1, f9);
        h.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        if (z10) {
            h.setTypeface(AndroidUtilities.bold());
        }
        return h;
    }
}
