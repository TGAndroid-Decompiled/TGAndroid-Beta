package nh;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class k8 extends LinearLayout {
    public final TextView f18010a;
    public final TextView f18011b;

    public k8(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        int i10;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.f18010a = textView;
        org.telegram.ui.b.w(org.telegram.ui.ActionBar.g6.f23169j5, c6Var, textView, 1, 20.0f);
        if (z10) {
            i10 = 4;
        } else {
            i10 = 13;
        }
        addView(textView, i7.f6.t(-1, -2, 55, 27, 16, 27, i10));
        TextView textView2 = new TextView(context);
        this.f18011b = textView2;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23294q5, c6Var, textView2, 1, 14.0f);
        if (z10) {
            addView(textView2, i7.f6.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
