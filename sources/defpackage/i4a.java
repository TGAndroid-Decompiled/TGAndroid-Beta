package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class i4a extends LinearLayout {
    public final bia a;
    public final TextView b;
    public final TextView c;

    public i4a(Context context, wjb wjbVar) {
        super(context);
        setLayoutParams(new e49(-1, -2));
        setOrientation(0);
        setGravity(16);
        int L = gl.L(14.0f);
        int i = L / 2;
        setPadding(L, i, L, i);
        bia biaVar = new bia(context);
        this.a = biaVar;
        addView(biaVar, nme.c(40.0f, 40));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.m(1.0f, 0, -1, 12, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        int i2 = bkb.D8;
        zkb.X(textView, i2, wjbVar);
        textView.setTextSize(1, 16.0f);
        textView.setTag(textView);
        textView.setMaxLines(1);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        zkb.Y(textView2, zkb.g(i2, 102), wjbVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTag(textView2);
        textView2.setMaxLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView2);
    }
}
