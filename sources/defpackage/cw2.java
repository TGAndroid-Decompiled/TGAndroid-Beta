package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class cw2 extends LinearLayout {
    public final bf0 a;

    public cw2(Context context) {
        super(context);
        setOrientation(1);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setImageDrawable(new ua6(bf0Var, "m418 282.6c13.4-21.1 20.2-44.9 20.2-70.8 0-88.3-79.8-175.3-178.9-175.3-100.1 0-178.9 88-178.9 175.3 0 46.6 16.9 73.1 29.1 86.1-19.3 23.4-30.9 52.3-34.6 86.1-2.5 22.7 3.2 41.4 17.4 57.3 14.3 16 51.7 35 148.1 35 41.2 0 119.9-5.3 156.7-18.3 49.5-17.4 59.2-41.1 59.2-76.2 0-41.5-12.9-74.8-38.3-99.2z", gm.L(110.0f), gm.L(110.0f)));
        if (!gm.O1()) {
            addView(bf0Var, qoe.r(110, 110, 49));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        anb.X(textView, cmb.F6, null);
        textView.setGravity(1);
        textView.setText(jb6.M0(2131747953, null));
        textView.setTypeface(gm.o());
        addView(textView, qoe.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        anb.X(textView2, cmb.b7, null);
        textView2.setGravity(1);
        textView2.setText(jb6.M0(2131747952, null));
        textView2.setMaxWidth(gm.L(260.0f));
        textView2.setLineSpacing(gm.L(2.0f), 1.0f);
        addView(textView2, qoe.t(-2, -2, 49, 0, 0, 0, 19));
        b61 b61Var = new b61(null, context, true);
        b61Var.setUseWrapContent(true);
        b61Var.f();
        b61Var.setPadding(gm.L(28.0f), 0, gm.L(28.0f), 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new pn2(2131231135, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) jb6.M0(2131748040, null));
        b61Var.i(spannableStringBuilder, false, true);
        addView(b61Var, qoe.r(-2, 44, 49));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.setImageDrawable(new p09(2131624315, gm.L(110.0f), gm.L(110.0f)));
    }
}
