package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
public final class nk8 extends FrameLayout {
    public final byte a = 1;
    public final ok8 b;

    public nk8(Context context, vnb vnbVar) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, tre.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        yob.Y(textView, yob.g(aob.G6, 100), vnbVar);
        textView.setTextSize(1, 13.0f);
        uh9.q(textView, 17, null, 2131743511);
        linearLayout.addView(textView, tre.t(-1, -2, 0, 16, 17, 17, 16));
        ok8 ok8Var = new ok8(vnbVar, context, false);
        this.b = ok8Var;
        String M0 = ob6.M0(2131743512, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new wm2(0, context.getDrawable(2131232314)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) M0);
        ok8Var.f.setText(spannableStringBuilder);
        linearLayout.addView(ok8Var, tre.t(-1, 48, 0, 16, 0, 16, 16));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        mk8 mk8Var;
        mk8 mk8Var2;
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                ok8 ok8Var = this.b;
                if (ok8Var.r && (mk8Var2 = ok8Var.h) != null) {
                    charSequence = mk8Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (mk8Var = ok8Var.f) != null) {
                    charSequence = mk8Var.getText();
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

    public nk8(ok8 ok8Var, Context context) {
        super(context);
        this.b = ok8Var;
    }
}
