package hh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.bo;
public final class l {
    public static final Rect f11472f = new Rect();
    public final fh.c f11473a = new fh.c();
    public final fh.b f11474b = new fh.b();
    public final aa.a f11475c = new aa.a(new ga.a(3));
    public final aa.a d = new aa.a(new ga.a(4));
    public final aa.a f11476e = new aa.a(new ga.a(5));

    public final int a(fh.a aVar) {
        if (aVar instanceof fh.c) {
            return ((fh.c) aVar).f9857b;
        }
        if (aVar instanceof fh.b) {
            return ((Integer) this.d.l(((fh.b) aVar).d)).intValue();
        } else if (aVar instanceof fh.e) {
            return a(((fh.e) aVar).f9866a);
        } else {
            return 0;
        }
    }

    public final int b(fh.a aVar) {
        if (aVar instanceof fh.c) {
            return ((fh.c) aVar).f9857b;
        }
        if (aVar instanceof fh.b) {
            return ((Integer) this.f11476e.l(((fh.b) aVar).d)).intValue();
        } else if (aVar instanceof fh.e) {
            return b(((fh.e) aVar).f9866a);
        } else {
            return 0;
        }
    }

    public final fh.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        fh.c cVar = this.f11473a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof pc0;
        fh.b bVar = this.f11474b;
        if (z11) {
            pc0 pc0Var = (pc0) drawable;
            if (pc0Var.f29619q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(pc0Var.f29613k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        aa.a aVar = this.f11475c;
        if (z12) {
            bVar.a((Bitmap) aVar.l(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof bo) {
            return c(((bo) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f7 = 120;
                float f10 = f7 / 1.0f;
                int round = Math.round(f10);
                int round2 = Math.round(f10);
                Bitmap bitmap = bVar.f9854f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f9854f.getWidth() == round2 && bVar.f9854f.getHeight() == round2) {
                    bVar.f9854f.eraseColor(0);
                } else {
                    bVar.f9854f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f9854f);
                canvas.scale(f7 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f11472f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f9854f);
                bVar.f9854f = null;
                bVar.a((Bitmap) aVar.l(bVar.d));
            }
            return bVar;
        }
    }
}
