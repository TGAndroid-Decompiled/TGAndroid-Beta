package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.j80;
public final class h0 extends LinearLayout {
    public final ImageView f8883a;
    public final j80 f8884b;
    public final j80 f8885c;

    public h0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
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
        this.f8883a = imageView;
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.na.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        j80 j80Var = new j80(context, null);
        this.f8884b = j80Var;
        j80Var.setTypeface(org.telegram.messenger.g0.o());
        j80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(j80Var, i10, i6Var);
        int i11 = org.telegram.ui.ActionBar.n6.Xc;
        org.telegram.ui.ActionBar.u6.G(j80Var, i11, i6Var);
        linearLayout.addView(j80Var, c8.na.t(-1, -2, 7, 0, 0, 0, 3));
        j80 j80Var2 = new j80(context, null);
        this.f8885c = j80Var2;
        j80Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(j80Var2, org.telegram.ui.ActionBar.n6.f29862z6, i6Var);
        org.telegram.ui.ActionBar.u6.G(j80Var2, i11, i6Var);
        linearLayout.addView(j80Var2, c8.na.r(-1, -2, 7));
        addView(linearLayout, c8.na.q(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.f8883a.setImageResource(i7);
        this.f8884b.setText(charSequence);
        this.f8885c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8885c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f8884b.setText(charSequence);
    }
}
