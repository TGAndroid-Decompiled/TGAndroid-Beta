package jh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import h6.m;
import hi.x3;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.dn;
public final class l {
    public static final Rect f17061f = new Rect();
    public final ri.c f17062a = new ri.c();
    public final ri.b f17063b = new ri.b();
    public final m f17064c = new m(new x3(10));
    public final m d = new m(new x3(11));
    public final m f17065e = new m(new x3(12));

    public final int a(ri.a aVar) {
        if (aVar instanceof ri.c) {
            return ((ri.c) aVar).f54472b;
        }
        if (aVar instanceof ri.b) {
            return ((Integer) this.d.n(((ri.b) aVar).d)).intValue();
        } else if (aVar instanceof ri.g) {
            return a(((ri.g) aVar).f54486a);
        } else {
            return 0;
        }
    }

    public final int b(ri.a aVar) {
        if (aVar instanceof ri.c) {
            return ((ri.c) aVar).f54472b;
        }
        if (aVar instanceof ri.b) {
            return ((Integer) this.f17065e.n(((ri.b) aVar).d)).intValue();
        } else if (aVar instanceof ri.g) {
            return b(((ri.g) aVar).f54486a);
        } else {
            return 0;
        }
    }

    public final ri.a c(Drawable drawable) {
        boolean z9 = drawable instanceof ColorDrawable;
        ri.c cVar = this.f17062a;
        if (z9) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z10 = drawable instanceof qa0;
        ri.b bVar = this.f17063b;
        if (z10) {
            qa0 qa0Var = (qa0) drawable;
            if (qa0Var.f37241q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(qa0Var.f37235k);
            return bVar;
        }
        boolean z11 = drawable instanceof BitmapDrawable;
        m mVar = this.f17064c;
        if (z11) {
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
                Bitmap bitmap = bVar.f54469f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f54469f.getWidth() == round2 && bVar.f54469f.getHeight() == round2) {
                    bVar.f54469f.eraseColor(0);
                } else {
                    bVar.f54469f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f54469f);
                canvas.scale(f10 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f17061f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f54469f);
                bVar.f54469f = null;
                bVar.a((Bitmap) mVar.n(bVar.d));
            }
            return bVar;
        }
    }
}
