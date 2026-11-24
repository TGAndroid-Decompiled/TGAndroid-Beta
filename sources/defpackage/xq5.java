package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class xq5 extends v6c {
    public final TextView c0;
    public final TextView d0;

    public xq5(Context context) {
        super(context, 6, 0, true);
        LinearLayout j = de9.j(context, 1);
        TextView textView = new TextView(context);
        this.c0 = textView;
        tb4.w(textView, bkb.F6, null, 1, 16.0f);
        j.addView(textView, nme.r(-2, -2, 5));
        TextView textView2 = new TextView(context);
        this.d0 = textView2;
        zkb.X(textView2, bkb.y6, null);
        textView2.setTextSize(1, 13.0f);
        j.addView(textView2, nme.t(-2, -2, 5, 0, 1, 0, 0));
        addView(j, nme.d(-2, -2.0f, (k96.a0 ? 3 : 5) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
    }
}
