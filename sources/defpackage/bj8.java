package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class bj8 extends FrameLayout {
    public final byte a = 1;
    public final cj8 b;

    public bj8(Context context, ylb ylbVar) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, qoe.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        anb.Y(textView, anb.g(cmb.F6, 100), ylbVar);
        textView.setTextSize(1, 13.0f);
        hg9.p(textView, 17, null, 2131743543);
        linearLayout.addView(textView, qoe.t(-1, -2, 0, 16, 17, 17, 16));
        cj8 cj8Var = new cj8(ylbVar, context, false);
        this.b = cj8Var;
        String M0 = jb6.M0(2131743544, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new pn2(0, context.getDrawable(2131232315)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) M0);
        cj8Var.f.setText(spannableStringBuilder);
        linearLayout.addView(cj8Var, qoe.t(-1, 48, 0, 16, 0, 16, 16));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        aj8 aj8Var;
        aj8 aj8Var2;
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                cj8 cj8Var = this.b;
                if (cj8Var.r && (aj8Var2 = cj8Var.h) != null) {
                    charSequence = aj8Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (aj8Var = cj8Var.f) != null) {
                    charSequence = aj8Var.getText();
                }
                if (charSequence != null) {
                    accessibilityNodeInfo.setText(charSequence);
                    if (getContentDescription() == null) {
                        accessibilityNodeInfo.setContentDescription(charSequence);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public bj8(cj8 cj8Var, Context context) {
        super(context);
        this.b = cj8Var;
    }
}
