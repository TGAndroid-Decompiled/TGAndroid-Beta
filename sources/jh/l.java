package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import h6.m;
import hi.e9;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.en;
public final class l {
    public static final Rect f17824f = new Rect();
    public final ui.c f17825a = new ui.c();
    public final ui.b f17826b = new ui.b();
    public final m f17827c = new m(new e9(7));
    public final m d = new m(new e9(8));
    public final m f17828e = new m(new e9(9));

    public final int a(ui.a aVar) {
        if (aVar instanceof ui.c) {
            return ((ui.c) aVar).f59037b;
        }
        if (aVar instanceof ui.b) {
            return ((Integer) this.d.r(((ui.b) aVar).d)).intValue();
        } else if (aVar instanceof ui.g) {
            return a(((ui.g) aVar).f59051a);
        } else {
            return 0;
        }
    }

    public final int b(ui.a aVar) {
        if (aVar instanceof ui.c) {
            return ((ui.c) aVar).f59037b;
        }
        if (aVar instanceof ui.b) {
            return ((Integer) this.f17828e.r(((ui.b) aVar).d)).intValue();
        } else if (aVar instanceof ui.g) {
            return b(((ui.g) aVar).f59051a);
        } else {
            return 0;
        }
    }

    public final ui.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        ui.c cVar = this.f17825a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof cb0;
        ui.b bVar = this.f17826b;
        if (z11) {
            cb0 cb0Var = (cb0) drawable;
            if (cb0Var.f34167q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(cb0Var.f34161k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        m mVar = this.f17827c;
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
                Bitmap bitmap = bVar.f59034f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f59034f.getWidth() == round2 && bVar.f59034f.getHeight() == round2) {
                    bVar.f59034f.eraseColor(0);
                } else {
                    bVar.f59034f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f59034f);
                canvas.scale(f10 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f17824f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f59034f);
                bVar.f59034f = null;
                bVar.a((Bitmap) mVar.r(bVar.d));
            }
            return bVar;
        }
    }
}
