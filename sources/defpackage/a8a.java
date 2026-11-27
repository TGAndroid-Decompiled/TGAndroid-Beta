package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class a8a extends LinearLayout {
    public final wla a;
    public final TextView b;
    public final TextView c;

    public a8a(Context context, vnb vnbVar) {
        super(context);
        setLayoutParams(new r79(-1, -2));
        setOrientation(0);
        setGravity(16);
        int L = hl.L(14.0f);
        int i = L / 2;
        setPadding(L, i, L, i);
        wla wlaVar = new wla(context);
        this.a = wlaVar;
        addView(wlaVar, tre.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        int i2 = aob.E8;
        yob.X(textView, i2, vnbVar);
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        yob.Y(textView2, yob.g(i2, 102), vnbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
