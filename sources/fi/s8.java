package fi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.gb1;
public final class s8 extends LinearLayout {
    public final TextView f11595a;
    public final TextView f11596b;

    public s8(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f11595a = textView;
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23462j5, u6Var, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, gb1.x(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f11596b = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q5, u6Var);
        textView2.setTextSize(1, 14.0f);
        if (z10) {
            addView(textView2, gb1.x(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
