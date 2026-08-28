package kh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ll;
public final class y8 extends LinearLayout {
    public final TextView f16402a;
    public final TextView f16403b;

    public y8(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        int i9;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f16402a = textView;
        org.telegram.ui.Cells.j2.o(org.telegram.ui.ActionBar.f6.f23108j5, b6Var, textView, 1, 20.0f);
        if (z10) {
            i9 = 4;
        } else {
            i9 = 13;
        }
        addView(textView, g7.e6.t(-1, -2, 55, 27, 16, 27, i9));
        TextView textView2 = new TextView(context);
        this.f16403b = textView2;
        ll.n(org.telegram.ui.ActionBar.f6.f23228q5, b6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, g7.e6.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
