package ci;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.rk;
public final class l9 extends LinearLayout {
    public final TextView f4976a;
    public final TextView f4977b;

    public l9(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f4976a = textView;
        org.telegram.ui.Cells.c1.q(org.telegram.ui.ActionBar.j6.f19216j5, f6Var, textView, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, w7.y5.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f4977b = textView2;
        rk.n(org.telegram.ui.ActionBar.j6.f19347q5, f6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.y5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
