package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import h6.m;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.dn;
public final class l {
    public static final Rect f17416f = new Rect();
    public final ui.c f17417a = new ui.c();
    public final ui.b f17418b = new ui.b();
    public final m f17419c = new m(new i0.b(6));
    public final m d = new m(new i0.b(7));
    public final m f17420e = new m(new i0.b(8));

    public final int a(ui.a aVar) {
        if (aVar instanceof ui.c) {
            return ((ui.c) aVar).f58431b;
        }
        if (aVar instanceof ui.b) {
            return ((Integer) this.d.n(((ui.b) aVar).d)).intValue();
        } else if (aVar instanceof ui.g) {
            return a(((ui.g) aVar).f58445a);
        } else {
            return 0;
        }
    }

    public final int b(ui.a aVar) {
        if (aVar instanceof ui.c) {
            return ((ui.c) aVar).f58431b;
        }
        if (aVar instanceof ui.b) {
            return ((Integer) this.f17420e.n(((ui.b) aVar).d)).intValue();
        } else if (aVar instanceof ui.g) {
            return b(((ui.g) aVar).f58445a);
        } else {
            return 0;
        }
    }

    public final ui.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        ui.c cVar = this.f17417a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof ra0;
        ui.b bVar = this.f17418b;
        if (z11) {
            ra0 ra0Var = (ra0) drawable;
            if (ra0Var.f38932q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(ra0Var.f38926k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        m mVar = this.f17419c;
        if (z12) {
            bVar.a((Bitmap) mVar.n(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof dn) {
            return c(((dn) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f10 = 120;
                float f11 = f10 / 1.0f;
                int round = Math.round(f11);
                int round2 = Math.round(f11);
                Bitmap bitmap = bVar.f58428f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f58428f.getWidth() == round2 && bVar.f58428f.getHeight() == round2) {
                    bVar.f58428f.eraseColor(0);
                } else {
                    bVar.f58428f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f58428f);
                canvas.scale(f10 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f17416f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f58428f);
                bVar.f58428f = null;
                bVar.a((Bitmap) mVar.n(bVar.d));
            }
            return bVar;
        }
    }
}
