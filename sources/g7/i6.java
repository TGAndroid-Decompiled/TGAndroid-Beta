package g7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l80;
public abstract class i6 {
    public static l80 a(Context context, float f10, int i9, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        int i10 = org.telegram.ui.ActionBar.f6.f23061gc;
        l80 l80Var = new l80(context, null);
        l80Var.setTextSize(1, f10);
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        if (z10) {
            l80Var.setTypeface(AndroidUtilities.bold());
        }
        return l80Var;
    }

    public static TextView b(Context context, float f10, int i9, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        TextView g10 = org.telegram.messenger.l0.g(context, 1, f10);
        g10.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        if (z10) {
            g10.setTypeface(AndroidUtilities.bold());
        }
        return g10;
    }
}
