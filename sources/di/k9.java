package di;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.vl;
public final class k9 extends LinearLayout {
    public final TextView f7478a;
    public final TextView f7479b;

    public k9(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f7478a = textView;
        vl.x(org.telegram.ui.ActionBar.j6.f20770j5, f6Var, textView, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, w7.x5.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f7479b = textView2;
        vl.n(org.telegram.ui.ActionBar.j6.f20897q5, f6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.x5.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
