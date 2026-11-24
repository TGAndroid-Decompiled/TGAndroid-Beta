package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
public final class nqc {
    public static final Rect f = new Rect();
    public final ix4 a = new ix4();
    public final hx4 b = new hx4();
    public final mv6 c = new mv6(new fyb((byte) 16));
    public final mv6 d = new mv6(new fyb((byte) 17));
    public final mv6 e = new mv6(new fyb((byte) 18));

    public final int a(gx4 gx4Var) {
        if (gx4Var instanceof ix4) {
            return ((ix4) gx4Var).b;
        }
        if (gx4Var instanceof hx4) {
            return ((Integer) this.d.G(((hx4) gx4Var).d)).intValue();
        } else if (gx4Var instanceof mx4) {
            return a(((mx4) gx4Var).a);
        } else {
            return 0;
        }
    }

    public final int b(gx4 gx4Var) {
        if (gx4Var instanceof ix4) {
            return ((ix4) gx4Var).b;
        }
        if (gx4Var instanceof hx4) {
            return ((Integer) this.e.G(((hx4) gx4Var).d)).intValue();
        } else if (gx4Var instanceof mx4) {
            return b(((mx4) gx4Var).a);
        } else {
            return 0;
        }
    }

    public final gx4 c(Drawable drawable) {
        boolean z = drawable instanceof ColorDrawable;
        ix4 ix4Var = this.a;
        if (z) {
            ix4Var.a(((ColorDrawable) drawable).getColor());
            return ix4Var;
        }
        boolean z2 = drawable instanceof ye7;
        hx4 hx4Var = this.b;
        if (z2) {
            ye7 ye7Var = (ye7) drawable;
            if (ye7Var.q < 0) {
                ix4Var.a(-16777216);
                return ix4Var;
            }
            hx4Var.a(ye7Var.k);
            return hx4Var;
        }
        boolean z3 = drawable instanceof BitmapDrawable;
        mv6 mv6Var = this.c;
        if (z3) {
            hx4Var.a((Bitmap) mv6Var.G(((BitmapDrawable) drawable).getBitmap()));
            return hx4Var;
        } else if (drawable instanceof p72) {
            return c(((p72) drawable).c(false));
        } else {
            if (drawable != null) {
                Bitmap bitmap = hx4Var.f;
                if (bitmap != null && !bitmap.isRecycled() && hx4Var.f.getWidth() == 120 && hx4Var.f.getHeight() == 120) {
                    hx4Var.f.eraseColor(0);
                } else {
                    hx4Var.f = Bitmap.createBitmap(120, 120, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(hx4Var.f);
                canvas.scale(1.0f, 1.3333334f);
                Rect bounds = drawable.getBounds();
                Rect rect = f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                hx4Var.a(hx4Var.f);
                hx4Var.f = null;
                hx4Var.a((Bitmap) mv6Var.G(hx4Var.d));
            }
            return hx4Var;
        }
    }
}
