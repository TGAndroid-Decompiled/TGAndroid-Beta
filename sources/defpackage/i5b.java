package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class i5b extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public i5b(wjb wjbVar, Context context, boolean z) {
        super(context);
        int i;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        tb4.w(textView, bkb.i5, wjbVar, 1, 20.0f);
        if (z) {
            i = 4;
        } else {
            i = 13;
        }
        addView(textView, nme.t(-1, -2, 55, 27, 16, 27, i));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        zkb.X(textView2, bkb.p5, wjbVar);
        textView2.setTextSize(1, 14.0f);
        if (z) {
            addView(textView2, nme.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
