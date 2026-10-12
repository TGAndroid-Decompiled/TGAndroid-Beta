package di;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.yh;
public final class h9 extends LinearLayout {
    public final TextView f7008a;
    public final TextView f7009b;

    public h9(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f7008a = textView;
        org.telegram.ui.Cells.d0.p(org.telegram.ui.ActionBar.g6.f20007j5, c6Var, textView, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, w7.a6.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f7009b = textView2;
        yh.n(org.telegram.ui.ActionBar.g6.f20138q5, c6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.a6.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
