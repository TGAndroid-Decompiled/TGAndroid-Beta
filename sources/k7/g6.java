package k7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g90;
public abstract class g6 {
    public static g90 a(Context context, float f10, int i10, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11 = org.telegram.ui.ActionBar.k6.f21722gc;
        g90 g90Var = new g90(context, null);
        g90Var.setTextSize(1, f10);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        if (z4) {
            g90Var.setTypeface(AndroidUtilities.bold());
        }
        return g90Var;
    }

    public static TextView b(Context context, float f10, int i10, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        TextView g10 = org.telegram.messenger.y3.g(context, 1, f10);
        g10.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        if (z4) {
            g10.setTypeface(AndroidUtilities.bold());
        }
        return g10;
    }
}
