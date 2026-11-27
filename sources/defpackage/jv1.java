package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
public final class jv1 extends LinearLayout {
    public final kv1[] a;

    public jv1(Context context) {
        super(context);
        this.a = new kv1[2];
    }

    public final void a(pr1 pr1Var, LinearLayout.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount < 2) {
            this.a[childCount] = pr1Var;
            addView(pr1Var, layoutParams);
        }
    }

    public kv1[] getButtons() {
        return this.a;
    }
}
