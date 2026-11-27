package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
public final class er3 implements Runnable {
    public final byte a;
    public final fr3 b;

    public er3(fr3 fr3Var, byte b) {
        this.a = b;
        this.b = fr3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fr3 fr3Var = this.b;
        switch (b) {
            case 0:
                try {
                    int i = fr3Var.x + 0;
                    Bitmap bitmap = fr3Var.b;
                    if (bitmap == null || bitmap.getWidth() != fr3Var.y || fr3Var.b.getHeight() != i) {
                        Bitmap bitmap2 = fr3Var.b;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        fr3Var.b = Bitmap.createBitmap(fr3Var.y, i, Bitmap.Config.ARGB_8888);
                        fr3Var.c = new Canvas(fr3Var.b);
                    }
                    fr3Var.b.eraseColor(0);
                    fr3Var.c.save();
                    fr3Var.c.translate(0.0f, 0);
                    fr3Var.c(fr3Var.c);
                    fr3Var.c.restore();
                    fr3Var.b.prepareToDraw();
                } catch (Exception e) {
                    cc4.g(e, true);
                    fr3Var.F = true;
                }
                hl.c3(fr3Var.I);
                return;
            default:
                fr3Var.f = false;
                fr3Var.g();
                if (!fr3Var.a) {
                    fr3Var.j();
                    return;
                } else if (fr3Var.w == fr3Var.K) {
                    fr3Var.H = true;
                    return;
                } else {
                    return;
                }
        }
    }
}
