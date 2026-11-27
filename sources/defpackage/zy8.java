package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class zy8 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final pz8 c;

    public zy8(pz8 pz8Var, Context context) {
        super(context);
        this.c = pz8Var;
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(pz8Var.y);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(hl.o());
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        addView(textView, tre.d(-1, -1.0f, 51, 15.0f, 8.0f, 15.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 13.0f);
        textView2.setTypeface(hl.o());
        textView2.setGravity(17);
        textView2.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
        textView2.setText(ob6.M0(2131743531, null));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(620756991);
        gradientDrawable.setCornerRadius(hl.L(13.0f));
        textView2.setBackground(gradientDrawable);
        textView2.setOnClickListener(new jn8(this, (byte) 6));
        addView(textView2, tre.d(-2, 26.0f, 21, 0.0f, 4.0f, 12.0f, 0.0f));
    }
}
