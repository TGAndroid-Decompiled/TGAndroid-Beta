package defpackage;

import android.widget.ImageView;
public final class nl4 implements Runnable {
    public final byte a;
    public final tl4 b;

    public nl4(tl4 tl4Var, byte b) {
        this.a = b;
        this.b = tl4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = false;
        tl4 tl4Var = this.b;
        switch (b) {
            case 0:
                ImageView imageView = tl4Var.l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    tl4Var.l.setImageDrawable(null);
                    return;
                }
                return;
            case 1:
                ImageView imageView2 = tl4Var.l;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    tl4Var.l.setImageDrawable(null);
                    return;
                }
                return;
            case 2:
                if (tl4Var.b() && tl4Var.c()) {
                    float f = tl4Var.M[0];
                    if (f >= tl4Var.x * 0.5f) {
                        z = true;
                    }
                    if (tl4Var.b.F(z, f, tl4Var.G) && !tl4Var.u) {
                        tl4Var.u = true;
                        tl4Var.o(true);
                        if (!tl4Var.w) {
                            tl4Var.w = true;
                            gm.d3(tl4Var.P, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                gm.c3(new nl4(tl4Var, (byte) 0));
                return;
            default:
                tl4Var.getClass();
                gm.c3(new nl4(tl4Var, (byte) 1));
                return;
        }
    }
}
