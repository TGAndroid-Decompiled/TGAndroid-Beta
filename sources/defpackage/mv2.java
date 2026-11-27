package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class mv2 extends LinearLayout {
    public final de0 a;

    public mv2(Context context) {
        super(context);
        setOrientation(1);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setImageDrawable(new za6(de0Var, "m418 282.6c13.4-21.1 20.2-44.9 20.2-70.8 0-88.3-79.8-175.3-178.9-175.3-100.1 0-178.9 88-178.9 175.3 0 46.6 16.9 73.1 29.1 86.1-19.3 23.4-30.9 52.3-34.6 86.1-2.5 22.7 3.2 41.4 17.4 57.3 14.3 16 51.7 35 148.1 35 41.2 0 119.9-5.3 156.7-18.3 49.5-17.4 59.2-41.1 59.2-76.2 0-41.5-12.9-74.8-38.3-99.2z", hl.L(110.0f), hl.L(110.0f)));
        if (!hl.O1()) {
            addView(de0Var, tre.r(110, 110, 49));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        yob.X(textView, aob.G6, null);
        textView.setGravity(1);
        textView.setText(ob6.M0(2131747950, null));
        textView.setTypeface(hl.o());
        addView(textView, tre.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        yob.X(textView2, aob.c7, null);
        textView2.setGravity(1);
        textView2.setText(ob6.M0(2131747949, null));
        textView2.setMaxWidth(hl.L(260.0f));
        textView2.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView2, tre.t(-2, -2, 49, 0, 0, 0, 19));
        c51 c51Var = new c51(null, context, true);
        c51Var.setUseWrapContent(true);
        c51Var.f();
        c51Var.setPadding(hl.L(28.0f), 0, hl.L(28.0f), 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new wm2(2131231134, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) ob6.M0(2131748037, null));
        c51Var.i(spannableStringBuilder, false, true);
        addView(c51Var, tre.r(-2, 44, 49));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.setImageDrawable(new b29(2131624315, hl.L(110.0f), hl.L(110.0f)));
    }
}
