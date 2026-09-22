package hh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import hg.r;
import org.telegram.ui.Components.cc0;
import org.telegram.ui.fo;
public final class l {
    public static final Rect f10539f = new Rect();
    public final fh.c f10540a = new fh.c();
    public final fh.b f10541b = new fh.b();
    public final aa.a f10542c = new aa.a(new r(2));
    public final aa.a d = new aa.a(new r(3));
    public final aa.a e = new aa.a(new r(4));

    public final int a(fh.a aVar) {
        if (aVar instanceof fh.c) {
            return ((fh.c) aVar).f9070a.getColor();
        }
        if (aVar instanceof fh.b) {
            return ((Integer) this.d.o(((fh.b) aVar).d)).intValue();
        } else if (aVar instanceof fh.e) {
            return a(((fh.e) aVar).f9078a);
        } else {
            return 0;
        }
    }

    public final int b(fh.a aVar) {
        if (aVar instanceof fh.c) {
            return ((fh.c) aVar).f9070a.getColor();
        }
        if (aVar instanceof fh.b) {
            return ((Integer) this.e.o(((fh.b) aVar).d)).intValue();
        } else if (aVar instanceof fh.e) {
            return b(((fh.e) aVar).f9078a);
        } else {
            return 0;
        }
    }

    public final fh.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        fh.c cVar = this.f10540a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof cc0;
        fh.b bVar = this.f10541b;
        if (z11) {
            cc0 cc0Var = (cc0) drawable;
            if (cc0Var.f23060q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(cc0Var.f23054k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        aa.a aVar = this.f10542c;
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
                Bitmap bitmap = bVar.f9068f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f9068f.getWidth() == round2 && bVar.f9068f.getHeight() == round2) {
                    bVar.f9068f.eraseColor(0);
                } else {
                    bVar.f9068f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f9068f);
                canvas.scale(f7 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f10539f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f9068f);
                bVar.f9068f = null;
                bVar.a((Bitmap) aVar.o(bVar.d));
            }
            return bVar;
        }
    }
}
