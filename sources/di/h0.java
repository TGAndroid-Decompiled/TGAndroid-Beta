package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.m80;
public final class h0 extends LinearLayout {
    public final ImageView f8887a;
    public final m80 f8888b;
    public final m80 f8889c;

    public h0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        float f10;
        float f11;
        setOrientation(0);
        if (i7 == 1) {
            f10 = 11.0f;
        } else {
            f10 = 32.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        int L2 = org.telegram.messenger.g0.L(i7 == 1 ? 11.0f : 32.0f);
        if (i7 == 1) {
            f11 = 8.0f;
        } else {
            f11 = 12.0f;
        }
        setPadding(L, 0, L2, org.telegram.messenger.g0.L(f11));
        ImageView imageView = new ImageView(context);
        this.f8887a = imageView;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.na.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        m80 m80Var = new m80(context, null);
        this.f8888b = m80Var;
        m80Var.setTypeface(org.telegram.messenger.g0.o());
        m80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var, i10, h6Var);
        int i11 = org.telegram.ui.ActionBar.m6.Xc;
        org.telegram.ui.ActionBar.t6.G(m80Var, i11, h6Var);
        linearLayout.addView(m80Var, c8.na.t(-1, -2, 7, 0, 0, 0, 3));
        m80 m80Var2 = new m80(context, null);
        this.f8889c = m80Var2;
        m80Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var2, org.telegram.ui.ActionBar.m6.f29758z6, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var2, i11, h6Var);
        linearLayout.addView(m80Var2, c8.na.r(-1, -2, 7));
        addView(linearLayout, c8.na.q(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.f8887a.setImageResource(i7);
        this.f8888b.setText(charSequence);
        this.f8889c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8889c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f8888b.setText(charSequence);
    }
}
