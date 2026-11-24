package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class nq3 implements Runnable {
    public final byte a;
    public final oq3 b;

    public nq3(oq3 oq3Var, byte b) {
        this.a = b;
        this.b = oq3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        oq3 oq3Var = this.b;
        switch (b) {
            case 0:
                try {
                    int i = oq3Var.x + 0;
                    Bitmap bitmap = oq3Var.b;
                    if (bitmap == null || bitmap.getWidth() != oq3Var.y || oq3Var.b.getHeight() != i) {
                        Bitmap bitmap2 = oq3Var.b;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        oq3Var.b = Bitmap.createBitmap(oq3Var.y, i, Bitmap.Config.ARGB_8888);
                        oq3Var.c = new Canvas(oq3Var.b);
                    }
                    oq3Var.b.eraseColor(0);
                    oq3Var.c.save();
                    oq3Var.c.translate(0.0f, 0);
                    oq3Var.c(oq3Var.c);
                    oq3Var.c.restore();
                    oq3Var.b.prepareToDraw();
                } catch (Exception e) {
                    fa4.g(e, true);
                    oq3Var.F = true;
                }
                gl.d3(oq3Var.I);
                return;
            default:
                oq3Var.f = false;
                oq3Var.g();
                if (!oq3Var.a) {
                    oq3Var.j();
                    return;
                } else if (oq3Var.w == oq3Var.K) {
                    oq3Var.H = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
