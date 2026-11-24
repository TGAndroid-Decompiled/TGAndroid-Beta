package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
public final class iw1 extends LinearLayout {
    public final jw1[] a;

    public iw1(Context context) {
        super(context);
        this.a = new jw1[2];
    }

    public final void a(os1 os1Var, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = os1Var;
            addView(os1Var, layoutParams);
        }
    }

    public jw1[] getButtons() {
        return this.a;
    }
}
