package h7;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p80;

public abstract class d6 {
    public static p80 a(Context context, float f10, int i10, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11 = org.telegram.ui.ActionBar.g6.gc;
        p80 p80Var = new p80(context, null);
        p80Var.setTextSize(1, f10);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        if (z10) {
            p80Var.setTypeface(AndroidUtilities.bold());
        }
        return p80Var;
    }

    public static TextView b(Context context, float f10, int i10, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        TextView textViewH = org.telegram.messenger.y1.h(context, 1, f10);
        textViewH.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        if (z10) {
            textViewH.setTypeface(AndroidUtilities.bold());
        }
        return textViewH;
    }
}
