package hi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class x7 extends LinearLayout {
    public final TextView f15385a;
    public final TextView f15386b;

    public x7(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        int i7;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f15385a = textView;
        org.telegram.messenger.k5.m(textView, org.telegram.ui.ActionBar.j6.f28957j5, e6Var, 1, 20.0f);
        if (z10) {
            i7 = 4;
        } else {
            i7 = 13;
        }
        addView(textView, c8.ja.t(-1, -2, 55, 27, 16, 27, i7));
        TextView textView2 = new TextView(context);
        this.f15386b = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29088q5, e6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, c8.ja.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
