package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class zg8 extends FrameLayout {
    public final byte a = 0;
    public final ah8 b;

    public zg8(Context context, wjb wjbVar) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, nme.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        zkb.Y(textView, zkb.g(bkb.F6, 100), wjbVar);
        textView.setTextSize(1, 13.0f);
        de9.q(textView, 17, null, 2131743617);
        linearLayout.addView(textView, nme.t(-1, -2, 0, 16, 17, 17, 16));
        ah8 ah8Var = new ah8(wjbVar, context, false);
        this.b = ah8Var;
        String M0 = k96.M0(2131743618, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new cm2(0, context.getDrawable(2131232314)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) M0);
        ah8Var.f.setText(spannableStringBuilder);
        linearLayout.addView(ah8Var, nme.t(-1, 48, 0, 16, 0, 16, 16));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        yg8 yg8Var;
        yg8 yg8Var2;
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                ah8 ah8Var = this.b;
                if (ah8Var.r && (yg8Var2 = ah8Var.h) != null) {
                    charSequence = yg8Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (yg8Var = ah8Var.f) != null) {
                    charSequence = yg8Var.getText();
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

    public zg8(ah8 ah8Var, Context context) {
        super(context);
        this.b = ah8Var;
    }
}
