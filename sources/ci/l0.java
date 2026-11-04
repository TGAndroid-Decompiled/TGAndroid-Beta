package ci;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b8.mf;
import org.telegram.ui.Components.s70;
public final class l0 extends LinearLayout {
    public final ImageView f5427a;
    public final s70 f5428b;
    public final s70 f5429c;

    public l0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        float f10;
        float f11;
        setOrientation(0);
        if (i3 == 1) {
            f10 = 11.0f;
        } else {
            f10 = 32.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        int L2 = org.telegram.messenger.g0.L(i3 == 1 ? 11.0f : 32.0f);
        if (i3 == 1) {
            f11 = 8.0f;
        } else {
            f11 = 12.0f;
        }
        setPadding(L, 0, L2, org.telegram.messenger.g0.L(f11));
        ImageView imageView = new ImageView(context);
        this.f5427a = imageView;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, mf.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        s70 s70Var = new s70(context, null);
        this.f5428b = s70Var;
        s70Var.setTypeface(org.telegram.messenger.g0.o());
        s70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var, i10, e6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.r6.H(s70Var, i11, e6Var);
        linearLayout.addView(s70Var, mf.t(-1, -2, 7, 0, 0, 0, 3));
        s70 s70Var2 = new s70(context, null);
        this.f5429c = s70Var2;
        s70Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(s70Var2, org.telegram.ui.ActionBar.k6.f28290z6, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var2, i11, e6Var);
        linearLayout.addView(s70Var2, mf.r(-1, -2, 7));
        addView(linearLayout, mf.q(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(int i3, CharSequence charSequence, CharSequence charSequence2) {
        this.f5427a.setImageResource(i3);
        this.f5428b.setText(charSequence);
        this.f5429c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f5429c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f5428b.setText(charSequence);
    }
}
