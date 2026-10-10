package ci;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.bi;
public final class i9 extends LinearLayout {
    public final TextView f5207a;
    public final TextView f5208b;

    public i9(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f5207a = textView;
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.i6.f20909j5, e6Var, textView, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, w7.x5.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f5208b = textView2;
        bi.o(org.telegram.ui.ActionBar.i6.f21040q5, e6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.x5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
