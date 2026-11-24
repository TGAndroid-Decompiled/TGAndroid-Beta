package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class bw1 extends FrameLayout {
    public final ylb a;
    public aw1 b;
    public uy2 c;
    public boolean d;

    public bw1(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
    }

    public final void a(int i, boolean z) {
        if (this.c == null) {
            uy2 uy2Var = new uy2(getContext(), this.a);
            this.c = uy2Var;
            uy2Var.setReverse(this.d);
            addView(this.c, qoe.e(-1, 28, 48));
        }
        this.c.a.c(i, z);
    }

    public final void b(boolean z, boolean z2) {
        super.setEnabled(z);
        this.b.e(z, z2);
    }

    public final void c(boolean z, boolean z2) {
        aw1 aw1Var = this.b;
        if (aw1Var.d == null) {
            if (!z) {
                return;
            }
            wi2 wi2Var = new wi2(gm.L(18.0f), gm.L(1.7f), -9079435);
            aw1Var.e = wi2Var;
            wi2Var.f = 90.0f;
            ImageView imageView = new ImageView(aw1Var.getContext());
            aw1Var.d = imageView;
            imageView.setBackground(aw1Var.e);
            aw1Var.d.setVisibility(8);
            aw1Var.addView(aw1Var.d, qoe.e(46, 46, 17));
        }
        fn0 fn0Var = aw1Var.a;
        if (!fn0Var.f && fn0Var.e == 0.0f) {
            aw1Var.e.c = -1L;
        }
        fn0Var.a(z, z2);
    }

    @Override
    public void setEnabled(boolean z) {
        b(z, false);
    }
}
