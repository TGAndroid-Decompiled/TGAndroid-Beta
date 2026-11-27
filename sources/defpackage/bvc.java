package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
public final class bvc {
    public static final Rect f = new Rect();
    public final oz4 a = new oz4();
    public final nz4 b = new nz4();
    public final rx6 c = new rx6(new grb((byte) 25));
    public final rx6 d = new rx6(new grb((byte) 26));
    public final rx6 e = new rx6(new grb((byte) 27));

    public final int a(mz4 mz4Var) {
        if (mz4Var instanceof oz4) {
            return ((oz4) mz4Var).b;
        }
        if (mz4Var instanceof nz4) {
            return ((Integer) this.d.H(((nz4) mz4Var).d)).intValue();
        } else if (mz4Var instanceof sz4) {
            return a(((sz4) mz4Var).a);
        } else {
            return 0;
        }
    }

    public final int b(mz4 mz4Var) {
        if (mz4Var instanceof oz4) {
            return ((oz4) mz4Var).b;
        }
        if (mz4Var instanceof nz4) {
            return ((Integer) this.e.H(((nz4) mz4Var).d)).intValue();
        } else if (mz4Var instanceof sz4) {
            return b(((sz4) mz4Var).a);
        } else {
            return 0;
        }
    }

    public final mz4 c(Drawable drawable) {
        boolean z = drawable instanceof ColorDrawable;
        oz4 oz4Var = this.a;
        if (z) {
            oz4Var.a(((ColorDrawable) drawable).getColor());
            return oz4Var;
        }
        boolean z2 = drawable instanceof ih7;
        nz4 nz4Var = this.b;
        if (z2) {
            ih7 ih7Var = (ih7) drawable;
            if (ih7Var.q < 0) {
                oz4Var.a(-16777216);
                return oz4Var;
            }
            nz4Var.a(ih7Var.k);
            return nz4Var;
        }
        boolean z3 = drawable instanceof BitmapDrawable;
        rx6 rx6Var = this.c;
        if (z3) {
            nz4Var.a((Bitmap) rx6Var.H(((BitmapDrawable) drawable).getBitmap()));
            return nz4Var;
        } else if (drawable instanceof g82) {
            return c(((g82) drawable).c(false));
        } else {
            if (drawable != null) {
                Bitmap bitmap = nz4Var.f;
                if (bitmap != null && !bitmap.isRecycled() && nz4Var.f.getWidth() == 120 && nz4Var.f.getHeight() == 120) {
                    nz4Var.f.eraseColor(0);
                } else {
                    nz4Var.f = Bitmap.createBitmap(120, 120, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(nz4Var.f);
                canvas.scale(1.0f, 1.3333334f);
                Rect bounds = drawable.getBounds();
                Rect rect = f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                nz4Var.a(nz4Var.f);
                nz4Var.f = null;
                nz4Var.a((Bitmap) rx6Var.H(nz4Var.d));
            }
            return nz4Var;
        }
    }
}
