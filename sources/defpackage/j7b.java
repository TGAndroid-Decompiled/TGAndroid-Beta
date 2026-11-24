package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class j7b extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public j7b(ylb ylbVar, Context context, boolean z) {
        super(context);
        int i;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        td4.x(textView, cmb.i5, ylbVar, 1, 20.0f);
        if (z) {
            i = 4;
        } else {
            i = 13;
        }
        addView(textView, qoe.t(-1, -2, 55, 27, 16, 27, i));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        anb.X(textView2, cmb.p5, ylbVar);
        textView2.setTextSize(1, 14.0f);
        if (z) {
            addView(textView2, qoe.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
