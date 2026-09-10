package bi;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.em;
public final class na extends LinearLayout {
    public final TextView f3245a;
    public final TextView f3246b;

    public na(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f3245a = textView;
        em.x(org.telegram.ui.ActionBar.j6.f18034j5, f6Var, textView, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, w7.a6.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f3246b = textView2;
        em.n(org.telegram.ui.ActionBar.j6.f18161q5, f6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, w7.a6.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
