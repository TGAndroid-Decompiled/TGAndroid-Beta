package k7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f90;
public abstract class f6 {
    public static f90 a(Context context, float f10, int i10, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11 = org.telegram.ui.ActionBar.j6.f19941gc;
        f90 f90Var = new f90(context, null);
        f90Var.setTextSize(1, f10);
        f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        if (z4) {
            f90Var.setTypeface(AndroidUtilities.bold());
        }
        return f90Var;
    }

    public static TextView b(Context context, float f10, int i10, boolean z4, org.telegram.ui.ActionBar.f6 f6Var) {
        TextView g10 = org.telegram.messenger.y3.g(context, 1, f10);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        if (z4) {
            g10.setTypeface(AndroidUtilities.bold());
        }
        return g10;
    }
}
