package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.LinearLayout;
public final class l21 extends h11 {
    public final hc0 a;
    public final l46 b;
    public final l46 c;
    public final LinearLayout d;

    public l21(wjb wjbVar, Context context, boolean z) {
        super(context, wjbVar);
        s11 s11Var;
        hc0 hc0Var = new hc0(context, false);
        this.a = hc0Var;
        hc0Var.setStyle(11);
        hc0Var.setAvatarsTextSize(gl.L(18.0f));
        addView(hc0Var, nme.i(56.0f, 48.0f, 8388627, 12.0f, 0.0f, 0.0f, 0.0f));
        if (!z) {
            s11Var = new s11(context, null, (byte) 1);
            this.b = s11Var;
            kk7.i(s11Var);
            s11Var.setTypeface(Typeface.SANS_SERIF);
            s11Var.setTextSize(1, 15.0f);
            s11Var.setEllipsize(TextUtils.TruncateAt.END);
            s11Var.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
            s11Var.setGravity(k96.a0 ? 5 : 3);
            addView(s11Var, nme.i(-2.0f, -2.0f, 8388627, 70.0f, 0.0f, 12.0f, 0.0f));
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.d = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, nme.i(-1.0f, -2.0f, 8388627, 76.0f, 6.0f, 12.0f, 6.0f));
            s11 s11Var2 = new s11(context, null, (byte) 2);
            this.b = s11Var2;
            kk7.i(s11Var2);
            Typeface typeface = Typeface.SANS_SERIF;
            s11Var2.setTypeface(typeface);
            s11Var2.setTextSize(1, 14.0f);
            s11Var2.setTypeface(gl.o());
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            s11Var2.setEllipsize(truncateAt);
            s11Var2.setMaxLines(1);
            linearLayout.addView(s11Var2);
            l46 l46Var = new l46(context, null);
            this.c = l46Var;
            l46Var.setTypeface(typeface);
            l46Var.setTextSize(1, 12.0f);
            l46Var.setEllipsize(truncateAt);
            l46Var.setSingleLine(false);
            l46Var.setMaxLines(3);
            zkb.G(l46Var, bkb.wj, wjbVar);
            linearLayout.addView(l46Var, nme.t(-2, -2, 0, 0, 0, 0, 0));
            s11Var = s11Var2;
        }
        zkb.G(s11Var, bkb.wj, wjbVar);
        setTextColor(getThemedColor(bkb.xj));
        setBackground(getThemedColor(bkb.vj));
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    public void setTextColor(int i) {
        this.b.setTextColor(i);
        l46 l46Var = this.c;
        if (l46Var != null) {
            l46Var.setTextColor(i);
        }
    }
}
