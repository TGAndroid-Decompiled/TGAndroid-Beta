package ci;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.am;
public final class i9 extends LinearLayout {
    public final TextView f5205a;
    public final TextView f5206b;

    public i9(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f5205a = textView;
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.h6.f20667j5, c6Var, textView, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, w7.w5.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f5206b = textView2;
        am.o(org.telegram.ui.ActionBar.h6.f20798q5, c6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.w5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
