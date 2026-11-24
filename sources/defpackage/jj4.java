package defpackage;

import android.widget.ImageView;
public final class jj4 implements Runnable {
    public final byte a;
    public final sj4 b;

    public jj4(sj4 sj4Var, byte b) {
        this.a = b;
        this.b = sj4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = false;
        sj4 sj4Var = this.b;
        switch (b) {
            case 0:
                ImageView imageView = sj4Var.l;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    sj4Var.l.setImageDrawable(null);
                    return;
                }
                return;
            case 1:
                ImageView imageView2 = sj4Var.l;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    sj4Var.l.setImageDrawable(null);
                    return;
                }
                return;
            case 2:
                if (sj4Var.b() && sj4Var.c()) {
                    float f = sj4Var.M[0];
                    if (f >= sj4Var.x * 0.5f) {
                        z = true;
                    }
                    if (sj4Var.b.Z(z, f, sj4Var.G) && !sj4Var.u) {
                        sj4Var.u = true;
                        sj4Var.o(true);
                        if (!sj4Var.w) {
                            sj4Var.w = true;
                            gl.e3(sj4Var.P, 1500L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                gl.d3(new jj4(sj4Var, (byte) 0));
                return;
            default:
                sj4Var.getClass();
                gl.d3(new jj4(sj4Var, (byte) 1));
                return;
        }
    }
}
