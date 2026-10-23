package ei;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.nk;
public final class w8 extends LinearLayout {
    public final TextView f10046a;
    public final TextView f10047b;

    public w8(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f10046a = textView;
        org.telegram.ui.Cells.c1.r(org.telegram.ui.ActionBar.h6.f21100j5, d6Var, textView, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, w7.z5.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f10047b = textView2;
        nk.o(org.telegram.ui.ActionBar.h6.f21231q5, d6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.z5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
