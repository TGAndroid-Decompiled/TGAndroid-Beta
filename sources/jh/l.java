package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import h6.m;
import hi.f9;
import org.telegram.ui.Components.bb0;
import org.telegram.ui.en;
public final class l {
    public static final Rect f17802f = new Rect();
    public final ui.c f17803a = new ui.c();
    public final ui.b f17804b = new ui.b();
    public final m f17805c = new m(new f9(7));
    public final m d = new m(new f9(8));
    public final m f17806e = new m(new f9(9));

    public final int a(ui.a aVar) {
        if (aVar instanceof ui.c) {
            return ((ui.c) aVar).f58998b;
        }
        if (aVar instanceof ui.b) {
            return ((Integer) this.d.r(((ui.b) aVar).d)).intValue();
        } else if (aVar instanceof ui.g) {
            return a(((ui.g) aVar).f59012a);
        } else {
            return 0;
        }
    }

    public final int b(ui.a aVar) {
        if (aVar instanceof ui.c) {
            return ((ui.c) aVar).f58998b;
        }
        if (aVar instanceof ui.b) {
            return ((Integer) this.f17806e.r(((ui.b) aVar).d)).intValue();
        } else if (aVar instanceof ui.g) {
            return b(((ui.g) aVar).f59012a);
        } else {
            return 0;
        }
    }

    public final ui.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        ui.c cVar = this.f17803a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof bb0;
        ui.b bVar = this.f17804b;
        if (z11) {
            bb0 bb0Var = (bb0) drawable;
            if (bb0Var.f33641q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(bb0Var.f33635k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        m mVar = this.f17805c;
        if (z12) {
            bVar.a((Bitmap) mVar.r(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof en) {
            return c(((en) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f10 = 120;
                float f11 = f10 / 1.0f;
                int round = Math.round(f11);
                int round2 = Math.round(f11);
                Bitmap bitmap = bVar.f58995f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f58995f.getWidth() == round2 && bVar.f58995f.getHeight() == round2) {
                    bVar.f58995f.eraseColor(0);
                } else {
                    bVar.f58995f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f58995f);
                canvas.scale(f10 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f17802f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f58995f);
                bVar.f58995f = null;
                bVar.a((Bitmap) mVar.r(bVar.d));
            }
            return bVar;
        }
    }
}
