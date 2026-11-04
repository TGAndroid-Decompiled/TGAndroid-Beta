package kh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.a0;
import ii.y3;
import org.telegram.ui.Components.la0;
import org.telegram.ui.zm;
public final class l {
    public static final Rect f17306f = new Rect();
    public final si.c f17307a = new si.c();
    public final si.b f17308b = new si.b();
    public final a0 f17309c = new a0(new y3(15));
    public final a0 d = new a0(new y3(16));
    public final a0 f17310e = new a0(new y3(17));

    public final int a(si.a aVar) {
        if (aVar instanceof si.c) {
            return ((si.c) aVar).f54747b;
        }
        if (aVar instanceof si.b) {
            return ((Integer) this.d.j(((si.b) aVar).d)).intValue();
        } else if (aVar instanceof si.g) {
            return a(((si.g) aVar).f54761a);
        } else {
            return 0;
        }
    }

    public final int b(si.a aVar) {
        if (aVar instanceof si.c) {
            return ((si.c) aVar).f54747b;
        }
        if (aVar instanceof si.b) {
            return ((Integer) this.f17310e.j(((si.b) aVar).d)).intValue();
        } else if (aVar instanceof si.g) {
            return b(((si.g) aVar).f54761a);
        } else {
            return 0;
        }
    }

    public final si.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        si.c cVar = this.f17307a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof la0;
        si.b bVar = this.f17308b;
        if (z11) {
            la0 la0Var = (la0) drawable;
            if (la0Var.f35664q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(la0Var.f35658k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        a0 a0Var = this.f17309c;
        if (z12) {
            bVar.a((Bitmap) a0Var.j(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof zm) {
            return c(((zm) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f10 = 120;
                float f11 = f10 / 1.0f;
                int round = Math.round(f11);
                int round2 = Math.round(f11);
                Bitmap bitmap = bVar.f54744f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f54744f.getWidth() == round2 && bVar.f54744f.getHeight() == round2) {
                    bVar.f54744f.eraseColor(0);
                } else {
                    bVar.f54744f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f54744f);
                canvas.scale(f10 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f17306f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f54744f);
                bVar.f54744f = null;
                bVar.a((Bitmap) a0Var.j(bVar.d));
            }
            return bVar;
        }
    }
}
