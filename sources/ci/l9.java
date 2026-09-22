package ci;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.vl;
public final class l9 extends LinearLayout {
    public final TextView f4974a;
    public final TextView f4975b;

    public l9(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f4974a = textView;
        org.telegram.ui.Cells.q3.p(org.telegram.ui.ActionBar.i6.f18940j5, e6Var, textView, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, w7.x5.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f4975b = textView2;
        vl.o(org.telegram.ui.ActionBar.i6.f19070q5, e6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.x5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
