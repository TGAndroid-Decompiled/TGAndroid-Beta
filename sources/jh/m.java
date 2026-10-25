package jh;

import a8.h0;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.xn;
public final class m {
    public static final Rect f15965f = new Rect();
    public final hh.c f15966a = new hh.c();
    public final hh.b f15967b = new hh.b();
    public final h0 f15968c = new h0(new j2.d(29));
    public final h0 d = new h0(new l(0));
    public final h0 e = new h0(new l(1));

    public final int a(hh.a aVar) {
        if (aVar instanceof hh.c) {
            return ((hh.c) aVar).f12837b;
        }
        if (aVar instanceof hh.b) {
            return ((Integer) this.d.o(((hh.b) aVar).d)).intValue();
        } else if (aVar instanceof hh.e) {
            return a(((hh.e) aVar).f12845a);
        } else {
            return 0;
        }
    }

    public final int b(hh.a aVar) {
        if (aVar instanceof hh.c) {
            return ((hh.c) aVar).f12837b;
        }
        if (aVar instanceof hh.b) {
            return ((Integer) this.e.o(((hh.b) aVar).d)).intValue();
        } else if (aVar instanceof hh.e) {
            return b(((hh.e) aVar).f12845a);
        } else {
            return 0;
        }
    }

    public final hh.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        hh.c cVar = this.f15966a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof uc0;
        hh.b bVar = this.f15967b;
        if (z11) {
            uc0 uc0Var = (uc0) drawable;
            if (uc0Var.f33367q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(uc0Var.f33361k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        h0 h0Var = this.f15968c;
        if (z12) {
            bVar.a((Bitmap) h0Var.o(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof xn) {
            return c(((xn) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f7 = 120;
                float f10 = f7 / 1.0f;
                int round = Math.round(f10);
                int round2 = Math.round(f10);
                Bitmap bitmap = bVar.f12834f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f12834f.getWidth() == round2 && bVar.f12834f.getHeight() == round2) {
                    bVar.f12834f.eraseColor(0);
                } else {
                    bVar.f12834f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f12834f);
                canvas.scale(f7 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f15965f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f12834f);
                bVar.f12834f = null;
                bVar.a((Bitmap) h0Var.o(bVar.d));
            }
            return bVar;
        }
    }
}
