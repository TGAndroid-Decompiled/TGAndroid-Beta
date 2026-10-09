package hh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import hg.o1;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.co;
public final class k {
    public static final Rect f11521f = new Rect();
    public final fh.c f11522a = new fh.c();
    public final fh.b f11523b = new fh.b();
    public final aa.a f11524c = new aa.a(new o1(1));
    public final aa.a d = new aa.a(new o1(2));
    public final aa.a f11525e = new aa.a(new o1(3));

    public final int a(fh.a aVar) {
        if (aVar instanceof fh.c) {
            return ((fh.c) aVar).f9933a.getColor();
        }
        if (aVar instanceof fh.b) {
            return ((Integer) this.d.m(((fh.b) aVar).d)).intValue();
        } else if (aVar instanceof fh.e) {
            return a(((fh.e) aVar).f9942a);
        } else {
            return 0;
        }
    }

    public final int b(fh.a aVar) {
        if (aVar instanceof fh.c) {
            return ((fh.c) aVar).f9933a.getColor();
        }
        if (aVar instanceof fh.b) {
            return ((Integer) this.f11525e.m(((fh.b) aVar).d)).intValue();
        } else if (aVar instanceof fh.e) {
            return b(((fh.e) aVar).f9942a);
        } else {
            return 0;
        }
    }

    public final fh.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        fh.c cVar = this.f11522a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof cd0;
        fh.b bVar = this.f11523b;
        if (z11) {
            cd0 cd0Var = (cd0) drawable;
            if (cd0Var.f25347q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(cd0Var.f25341k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        aa.a aVar = this.f11524c;
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
                Bitmap bitmap = bVar.f9931f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f9931f.getWidth() == round2 && bVar.f9931f.getHeight() == round2) {
                    bVar.f9931f.eraseColor(0);
                } else {
                    bVar.f9931f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f9931f);
                canvas.scale(f7 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f11521f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f9931f);
                bVar.f9931f = null;
                bVar.a((Bitmap) aVar.m(bVar.d));
            }
            return bVar;
        }
    }
}
