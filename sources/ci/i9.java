package ci;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ul;
public final class i9 extends LinearLayout {
    public final TextView f4790a;
    public final TextView f4791b;

    public i9(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f4790a = textView;
        org.telegram.ui.Cells.q3.p(org.telegram.ui.ActionBar.h6.f18895j5, d6Var, textView, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, w7.x5.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f4791b = textView2;
        ul.o(org.telegram.ui.ActionBar.h6.f19025q5, d6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.x5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
