package hh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import hg.o1;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.co;
public final class k {
    public static final Rect f11520f = new Rect();
    public final fh.c f11521a = new fh.c();
    public final fh.b f11522b = new fh.b();
    public final aa.a f11523c = new aa.a(new o1(1));
    public final aa.a d = new aa.a(new o1(2));
    public final aa.a f11524e = new aa.a(new o1(3));

    public final int a(fh.a aVar) {
        if (aVar instanceof fh.c) {
            return ((fh.c) aVar).f9932a.getColor();
        }
        if (aVar instanceof fh.b) {
            return ((Integer) this.d.m(((fh.b) aVar).d)).intValue();
        } else if (aVar instanceof fh.e) {
            return a(((fh.e) aVar).f9941a);
        } else {
            return 0;
        }
    }

    public final int b(fh.a aVar) {
        if (aVar instanceof fh.c) {
            return ((fh.c) aVar).f9932a.getColor();
        }
        if (aVar instanceof fh.b) {
            return ((Integer) this.f11524e.m(((fh.b) aVar).d)).intValue();
        } else if (aVar instanceof fh.e) {
            return b(((fh.e) aVar).f9941a);
        } else {
            return 0;
        }
    }

    public final fh.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        fh.c cVar = this.f11521a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof dd0;
        fh.b bVar = this.f11522b;
        if (z11) {
            dd0 dd0Var = (dd0) drawable;
            if (dd0Var.f25562q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(dd0Var.f25556k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        aa.a aVar = this.f11523c;
        if (z12) {
            bVar.a((Bitmap) aVar.m(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof co) {
            return c(((co) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f7 = 120;
                float f10 = f7 / 1.0f;
                int round = Math.round(f10);
                int round2 = Math.round(f10);
                Bitmap bitmap = bVar.f9930f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f9930f.getWidth() == round2 && bVar.f9930f.getHeight() == round2) {
                    bVar.f9930f.eraseColor(0);
                } else {
                    bVar.f9930f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f9930f);
                canvas.scale(f7 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f11520f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f9930f);
                bVar.f9930f = null;
                bVar.a((Bitmap) aVar.m(bVar.d));
            }
            return bVar;
        }
    }
}
