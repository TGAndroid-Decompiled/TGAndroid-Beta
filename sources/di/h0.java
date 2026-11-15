package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.z70;
public final class h0 extends LinearLayout {
    public final ImageView f8651a;
    public final z70 f8652b;
    public final z70 f8653c;

    public h0(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
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
        this.f8651a = imageView;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.s(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ja.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        z70 z70Var = new z70(context, null);
        this.f8652b = z70Var;
        z70Var.setTypeface(org.telegram.messenger.g0.o());
        z70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var, i10, e6Var);
        int i11 = org.telegram.ui.ActionBar.j6.Xc;
        org.telegram.ui.ActionBar.q6.G(z70Var, i11, e6Var);
        linearLayout.addView(z70Var, c8.ja.t(-1, -2, 7, 0, 0, 0, 3));
        z70 z70Var2 = new z70(context, null);
        this.f8653c = z70Var2;
        z70Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(z70Var2, org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var2, i11, e6Var);
        linearLayout.addView(z70Var2, c8.ja.r(-1, -2, 7));
        addView(linearLayout, c8.ja.q(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.f8651a.setImageResource(i7);
        this.f8652b.setText(charSequence);
        this.f8653c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f8653c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.f8652b.setText(charSequence);
    }
}
