package hi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class w7 extends LinearLayout {
    public final TextView f15719a;
    public final TextView f15720b;

    public w7(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        int i7;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f15719a = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.m6.f29486j5, h6Var, 1, 20.0f);
        if (z10) {
            i7 = 4;
        } else {
            i7 = 13;
        }
        addView(textView, c8.ma.t(-1, -2, 55, 27, 16, 27, i7));
        TextView textView2 = new TextView(context);
        this.f15720b = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29617q5, h6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, c8.ma.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
