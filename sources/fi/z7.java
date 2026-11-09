package fi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class z7 extends LinearLayout {
    public final TextView f13251a;
    public final TextView f13252b;

    public z7(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context);
        int i7;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f13251a = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.l6.f27973j5, g6Var, 1, 20.0f);
        if (z9) {
            i7 = 4;
        } else {
            i7 = 13;
        }
        addView(textView, c8.ha.t(-1, -2, 55, 27, 16, 27, i7));
        TextView textView2 = new TextView(context);
        this.f13252b = textView2;
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28104q5, g6Var);
        textView2.setTextSize(1, 14.0f);
        if (z9) {
            addView(textView2, c8.ha.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
