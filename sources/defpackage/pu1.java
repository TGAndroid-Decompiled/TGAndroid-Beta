package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class pu1 extends FrameLayout {
    public final wjb a;
    public ou1 b;
    public kx2 c;
    public boolean d;

    public pu1(Context context, wjb wjbVar) {
        super(context);
        this.a = wjbVar;
    }

    public final void a(int i, boolean z) {
        if (this.c == null) {
            kx2 kx2Var = new kx2(getContext(), this.a);
            this.c = kx2Var;
            kx2Var.setReverse(this.d);
            addView(this.c, nme.e(-1, 28, 48));
        }
        this.c.a.c(i, z);
    }

    public final void b(boolean z, boolean z2) {
        super.setEnabled(z);
        this.b.e(z, z2);
    }

    public final void c(boolean z, boolean z2) {
        ou1 ou1Var = this.b;
        if (ou1Var.d == null) {
            if (!z) {
                return;
            }
            ih2 ih2Var = new ih2(gl.L(18.0f), gl.L(1.7f), -9079435);
            ou1Var.e = ih2Var;
            ih2Var.f = 90.0f;
            ImageView imageView = new ImageView(ou1Var.getContext());
            ou1Var.d = imageView;
            imageView.setBackground(ou1Var.e);
            ou1Var.d.setVisibility(8);
            ou1Var.addView(ou1Var.d, nme.e(46, 46, 17));
        }
        fm0 fm0Var = ou1Var.a;
        if (!fm0Var.f && fm0Var.e == 0.0f) {
            ou1Var.e.c = -1L;
        }
        fm0Var.a(z, z2);
    }

    @Override
    public void setEnabled(boolean z) {
        b(z, false);
    }
}
