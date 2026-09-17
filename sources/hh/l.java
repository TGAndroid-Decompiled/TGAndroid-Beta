package hh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.fo;
public final class l {
    public static final Rect f10542f = new Rect();
    public final fh.c f10543a = new fh.c();
    public final fh.b f10544b = new fh.b();
    public final aa.a f10545c = new aa.a(new ga.a(3));
    public final aa.a d = new aa.a(new ga.a(4));
    public final aa.a e = new aa.a(new ga.a(5));

    public final int a(fh.a aVar) {
        if (aVar instanceof fh.c) {
            return ((fh.c) aVar).f9073a.getColor();
        }
        if (aVar instanceof fh.b) {
            return ((Integer) this.d.o(((fh.b) aVar).d)).intValue();
        } else if (aVar instanceof fh.e) {
            return a(((fh.e) aVar).f9081a);
        } else {
            return 0;
        }
    }

    public final int b(fh.a aVar) {
        if (aVar instanceof fh.c) {
            return ((fh.c) aVar).f9073a.getColor();
        }
        if (aVar instanceof fh.b) {
            return ((Integer) this.e.o(((fh.b) aVar).d)).intValue();
        } else if (aVar instanceof fh.e) {
            return b(((fh.e) aVar).f9081a);
        } else {
            return 0;
        }
    }

    public final fh.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        fh.c cVar = this.f10543a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof cc0;
        fh.b bVar = this.f10544b;
        if (z11) {
            cc0 cc0Var = (cc0) drawable;
            if (cc0Var.f23012q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(cc0Var.f23006k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        aa.a aVar = this.f10545c;
        if (z12) {
            bVar.a((Bitmap) aVar.o(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof fo) {
            return c(((fo) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f7 = 120;
                float f10 = f7 / 1.0f;
                int round = Math.round(f10);
                int round2 = Math.round(f10);
                Bitmap bitmap = bVar.f9071f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f9071f.getWidth() == round2 && bVar.f9071f.getHeight() == round2) {
                    bVar.f9071f.eraseColor(0);
                } else {
                    bVar.f9071f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f9071f);
                canvas.scale(f7 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f10542f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f9071f);
                bVar.f9071f = null;
                bVar.a((Bitmap) aVar.o(bVar.d));
            }
            return bVar;
        }
    }
}
