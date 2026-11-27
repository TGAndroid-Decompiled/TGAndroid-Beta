package defpackage;

import android.widget.ImageView;
public final class nl4 implements Runnable {
    public final byte a;
    public final xl4 b;

    public nl4(xl4 xl4Var, byte b) {
        this.a = b;
        this.b = xl4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = false;
        xl4 xl4Var = this.b;
        switch (b) {
            case 0:
                ImageView imageView = xl4Var.n;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    xl4Var.n.setImageDrawable(null);
                    return;
                }
                return;
            case 1:
                ImageView imageView2 = xl4Var.n;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    xl4Var.n.setImageDrawable(null);
                    return;
                }
                return;
            case 2:
                if (xl4Var.b() && xl4Var.c()) {
                    float f = xl4Var.S[0];
                    if (f >= xl4Var.A * 0.5f) {
                        z = true;
                    }
                    if (xl4Var.b.G(z, f, xl4Var.J) && !xl4Var.x) {
                        xl4Var.x = true;
                        xl4Var.q(true);
                        if (!xl4Var.z) {
                            xl4Var.z = true;
                            hl.d3(xl4Var.V, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                hl.c3(new nl4(xl4Var, (byte) 0));
                return;
            default:
                xl4Var.getClass();
                hl.c3(new nl4(xl4Var, (byte) 1));
                return;
        }
    }
}
