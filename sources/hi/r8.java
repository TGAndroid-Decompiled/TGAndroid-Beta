package hi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class r8 extends LinearLayout {
    public final TextView f15321a;
    public final TextView f15322b;

    public r8(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        int i7;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f15321a = textView;
        org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.f29559j5, i6Var, 1, 20.0f);
        if (z10) {
            i7 = 4;
        } else {
            i7 = 13;
        }
        addView(textView, c8.na.t(-1, -2, 55, 27, 16, 27, i7));
        TextView textView2 = new TextView(context);
        this.f15322b = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29690q5, i6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, c8.na.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
