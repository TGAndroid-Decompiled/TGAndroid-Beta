package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class cv1 extends FrameLayout {
    public final vnb a;
    public bv1 b;
    public ey2 c;
    public boolean d;

    public cv1(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
    }

    public final void a(int i, boolean z) {
        if (this.c == null) {
            ey2 ey2Var = new ey2(getContext(), this.a);
            this.c = ey2Var;
            ey2Var.setReverse(this.d);
            addView(this.c, tre.e(-1, 28, 48));
        }
        this.c.a.c(i, z);
    }

    public final void b(boolean z, boolean z2) {
        super.setEnabled(z);
        this.b.e(z, z2);
    }

    public final void c(boolean z, boolean z2) {
        bv1 bv1Var = this.b;
        if (bv1Var.d == null) {
            if (!z) {
                return;
            }
            di2 di2Var = new di2(hl.L(18.0f), hl.L(1.7f), -9079435);
            bv1Var.e = di2Var;
            di2Var.f = 90.0f;
            ImageView imageView = new ImageView(bv1Var.getContext());
            bv1Var.d = imageView;
            imageView.setBackground(bv1Var.e);
            bv1Var.d.setVisibility(8);
            bv1Var.addView(bv1Var.d, tre.e(46, 46, 17));
        }
        fm0 fm0Var = bv1Var.a;
        if (!fm0Var.f && fm0Var.e == 0.0f) {
            bv1Var.e.c = -1L;
        }
        fm0Var.a(z, z2);
    }

    @Override
    public void setEnabled(boolean z) {
        b(z, false);
    }
}
