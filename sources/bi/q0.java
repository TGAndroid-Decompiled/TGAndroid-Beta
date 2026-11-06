package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.w70;
public final class q0 extends LinearLayout {
    public final ImageView f4550a;
    public final w70 f4551b;
    public final w70 f4552c;

    public q0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
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
        this.f4550a = imageView;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        w70 w70Var = new w70(context, null);
        this.f4551b = w70Var;
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        w70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var, i10, f6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.r6.H(w70Var, i11, f6Var);
        linearLayout.addView(w70Var, c8.ha.t(-1, -2, 7, 0, 0, 0, 3));
        w70 w70Var2 = new w70(context, null);
        this.f4552c = w70Var2;
        w70Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var2, org.telegram.ui.ActionBar.k6.f28259z6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var2, i11, f6Var);
        linearLayout.addView(w70Var2, c8.ha.r(-1, -2, 7));
        addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.f4550a.setImageResource(i7);
        this.f4551b.setText(charSequence);
        this.f4552c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4552c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f4551b.setText(charSequence);
    }
}
