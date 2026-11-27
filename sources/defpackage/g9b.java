package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class g9b extends LinearLayout {
    public final TextView a;
    public final TextView b;

    public g9b(vnb vnbVar, Context context, boolean z) {
        super(context);
        int i;
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        qd4.w(textView, aob.j5, vnbVar, 1, 20.0f);
        if (z) {
            i = 4;
        } else {
            i = 13;
        }
        addView(textView, tre.t(-1, -2, 55, 27, 16, 27, i));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        yob.X(textView2, aob.q5, vnbVar);
        textView2.setTextSize(1, 14.0f);
        if (z) {
            addView(textView2, tre.t(-1, -2, 55, 27, 0, 27, 13));
        }
    }
}
