package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class vs5 extends w8c {
    public final TextView c0;
    public final TextView d0;

    public vs5(Context context) {
        super(context, 6, 0, true);
        LinearLayout i = hg9.i(context, 1);
        TextView textView = new TextView(context);
        this.c0 = textView;
        td4.x(textView, cmb.F6, null, 1, 16.0f);
        i.addView(textView, qoe.r(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.d0 = textView2;
        anb.X(textView2, cmb.y6, null);
        textView2.setTextSize(1, 13.0f);
        i.addView(textView2, qoe.t(-2, -2, 5, 0, 1, 0, 0));
        addView(i, qoe.d(-2, -2.0f, (jb6.a0 ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
