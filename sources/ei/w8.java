package ei;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class w8 extends LinearLayout {
    public final TextView f10063a;
    public final TextView f10064b;

    public w8(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f10063a = textView;
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.f21290j5, g6Var, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, w7.z5.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f10064b = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21421q5, g6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, w7.z5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
