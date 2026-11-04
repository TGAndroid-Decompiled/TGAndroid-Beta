package gi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
public final class y7 extends LinearLayout {
    public final TextView f13976a;
    public final TextView f13977b;

    public y7(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        int i3;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f13976a = textView;
        org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.f27988j5, e6Var, 1, 20.0f);
        if (z10) {
            i3 = 4;
        } else {
            i3 = 13;
        }
        addView(textView, mf.t(-1, -2, 55, 27, 16, 27, i3));
        TextView textView2 = new TextView(context);
        this.f13977b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28120q5, e6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, mf.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
