package ci;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ok;
public final class h9 extends LinearLayout {
    public final TextView f5137a;
    public final TextView f5138b;

    public h9(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f5137a = textView;
        org.telegram.ui.Cells.c1.p(org.telegram.ui.ActionBar.i6.f20925j5, d6Var, textView, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, w7.z5.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f5138b = textView2;
        ok.n(org.telegram.ui.ActionBar.i6.f21057q5, d6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.z5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
