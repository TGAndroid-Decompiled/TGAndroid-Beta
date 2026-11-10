package fi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class z7 extends LinearLayout {
    public final TextView f13253a;
    public final TextView f13254b;

    public z7(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context);
        int i7;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f13253a = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.m6.f27998j5, h6Var, 1, 20.0f);
        if (z9) {
            i7 = 4;
        } else {
            i7 = 13;
        }
        addView(textView, c8.ha.t(-1, -2, 55, 27, 16, 27, i7));
        TextView textView2 = new TextView(context);
        this.f13254b = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f28129q5, h6Var);
        textView2.setTextSize(1, 14.0f);
        if (z9) {
            addView(textView2, c8.ha.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
