package ci;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ai;
public final class i9 extends LinearLayout {
    public final TextView f5206a;
    public final TextView f5207b;

    public i9(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f5206a = textView;
        org.telegram.ui.Cells.c1.n(org.telegram.ui.ActionBar.h6.f20930j5, d6Var, textView, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, w7.x5.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f5207b = textView2;
        ai.o(org.telegram.ui.ActionBar.h6.f21061q5, d6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.x5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
