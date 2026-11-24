package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class ru2 extends LinearLayout {
    public final be0 a;

    public ru2(Context context) {
        super(context);
        setOrientation(1);
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setImageDrawable(new v86(be0Var, "m418 282.6c13.4-21.1 20.2-44.9 20.2-70.8 0-88.3-79.8-175.3-178.9-175.3-100.1 0-178.9 88-178.9 175.3 0 46.6 16.9 73.1 29.1 86.1-19.3 23.4-30.9 52.3-34.6 86.1-2.5 22.7 3.2 41.4 17.4 57.3 14.3 16 51.7 35 148.1 35 41.2 0 119.9-5.3 156.7-18.3 49.5-17.4 59.2-41.1 59.2-76.2 0-41.5-12.9-74.8-38.3-99.2z", gl.L(110.0f), gl.L(110.0f)));
        if (!gl.O1()) {
            addView(be0Var, nme.r(110, 110, 49));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        zkb.X(textView, bkb.F6, null);
        textView.setGravity(1);
        textView.setText(k96.M0(2131748027, null));
        textView.setTypeface(gl.o());
        addView(textView, nme.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        zkb.X(textView2, bkb.b7, null);
        textView2.setGravity(1);
        textView2.setText(k96.M0(2131748026, null));
        textView2.setMaxWidth(gl.L(260.0f));
        textView2.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView2, nme.t(-2, -2, 49, 0, 0, 0, 19));
        u41 u41Var = new u41(null, context, true);
        u41Var.setUseWrapContent(true);
        u41Var.f();
        u41Var.setPadding(gl.L(28.0f), 0, gl.L(28.0f), 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new cm2(2131231134, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) k96.M0(2131748091, null));
        u41Var.i(spannableStringBuilder, false, true);
        addView(u41Var, nme.r(-2, 44, 49));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.setImageDrawable(new oy8(2131624314, gl.L(110.0f), gl.L(110.0f)));
    }
}
