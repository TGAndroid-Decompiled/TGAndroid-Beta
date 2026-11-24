package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
public final class psc {
    public static final Rect f = new Rect();
    public final kz4 a = new kz4();
    public final jz4 b = new jz4();
    public final mx6 c = new mx6(new rjb((byte) 22));
    public final mx6 d = new mx6(new rjb((byte) 23));
    public final mx6 e = new mx6(new rjb((byte) 24));

    public final int a(iz4 iz4Var) {
        if (iz4Var instanceof kz4) {
            return ((kz4) iz4Var).b;
        }
        if (iz4Var instanceof jz4) {
            return ((Integer) this.d.H(((jz4) iz4Var).d)).intValue();
        } else if (iz4Var instanceof oz4) {
            return a(((oz4) iz4Var).a);
        } else {
            return 0;
        }
    }

    public final int b(iz4 iz4Var) {
        if (iz4Var instanceof kz4) {
            return ((kz4) iz4Var).b;
        }
        if (iz4Var instanceof jz4) {
            return ((Integer) this.e.H(((jz4) iz4Var).d)).intValue();
        } else if (iz4Var instanceof oz4) {
            return b(((oz4) iz4Var).a);
        } else {
            return 0;
        }
    }

    public final iz4 c(Drawable drawable) {
        boolean z = drawable instanceof ColorDrawable;
        kz4 kz4Var = this.a;
        if (z) {
            kz4Var.a(((ColorDrawable) drawable).getColor());
            return kz4Var;
        }
        boolean z2 = drawable instanceof ah7;
        jz4 jz4Var = this.b;
        if (z2) {
            ah7 ah7Var = (ah7) drawable;
            if (ah7Var.q < 0) {
                kz4Var.a(-16777216);
                return kz4Var;
            }
            jz4Var.a(ah7Var.k);
            return jz4Var;
        }
        boolean z3 = drawable instanceof BitmapDrawable;
        mx6 mx6Var = this.c;
        if (z3) {
            jz4Var.a((Bitmap) mx6Var.H(((BitmapDrawable) drawable).getBitmap()));
            return jz4Var;
        } else if (drawable instanceof a92) {
            return c(((a92) drawable).c(false));
        } else {
            if (drawable != null) {
                Bitmap bitmap = jz4Var.f;
                if (bitmap != null && !bitmap.isRecycled() && jz4Var.f.getWidth() == 120 && jz4Var.f.getHeight() == 120) {
                    jz4Var.f.eraseColor(0);
                } else {
                    jz4Var.f = Bitmap.createBitmap(120, 120, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(jz4Var.f);
                canvas.scale(1.0f, 1.3333334f);
                Rect bounds = drawable.getBounds();
                Rect rect = f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                jz4Var.a(jz4Var.f);
                jz4Var.f = null;
                jz4Var.a((Bitmap) mx6Var.H(jz4Var.d));
            }
            return jz4Var;
        }
    }
}
