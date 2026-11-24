package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class k6a extends LinearLayout {
    public final dka a;
    public final TextView b;
    public final TextView c;

    public k6a(Context context, ylb ylbVar) {
        super(context);
        setLayoutParams(new g69(-1, -2));
        setOrientation(0);
        setGravity(16);
        int L = gm.L(14.0f);
        int i = L / 2;
        setPadding(L, i, L, i);
        dka dkaVar = new dka(context);
        this.a = dkaVar;
        addView(dkaVar, qoe.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        int i2 = cmb.D8;
        anb.X(textView, i2, ylbVar);
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        anb.Y(textView2, anb.g(i2, 102), ylbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
