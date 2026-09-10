package gh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.ho;
public final class l {
    public static final Rect f9151f = new Rect();
    public final eh.c f9152a = new eh.c();
    public final eh.b f9153b = new eh.b();
    public final aa.a f9154c = new aa.a(new dh.a(25));
    public final aa.a d = new aa.a(new dh.a(26));
    public final aa.a e = new aa.a(new dh.a(27));

    public final int a(eh.a aVar) {
        if (aVar instanceof eh.c) {
            return ((eh.c) aVar).f7517a.getColor();
        }
        if (aVar instanceof eh.b) {
            return ((Integer) this.d.o(((eh.b) aVar).d)).intValue();
        } else if (aVar instanceof eh.e) {
            return a(((eh.e) aVar).f7525a);
        } else {
            return 0;
        }
    }

    public final int b(eh.a aVar) {
        if (aVar instanceof eh.c) {
            return ((eh.c) aVar).f7517a.getColor();
        }
        if (aVar instanceof eh.b) {
            return ((Integer) this.e.o(((eh.b) aVar).d)).intValue();
        } else if (aVar instanceof eh.e) {
            return b(((eh.e) aVar).f7525a);
        } else {
            return 0;
        }
    }

    public final eh.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        eh.c cVar = this.f9152a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof lc0;
        eh.b bVar = this.f9153b;
        if (z11) {
            lc0 lc0Var = (lc0) drawable;
            if (lc0Var.f24955q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(lc0Var.f24949k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        aa.a aVar = this.f9154c;
        if (z12) {
            bVar.a((Bitmap) aVar.o(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof ho) {
            return c(((ho) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f7 = 120;
                float f10 = f7 / 1.0f;
                int round = Math.round(f10);
                int round2 = Math.round(f10);
                Bitmap bitmap = bVar.f7515f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f7515f.getWidth() == round2 && bVar.f7515f.getHeight() == round2) {
                    bVar.f7515f.eraseColor(0);
                } else {
                    bVar.f7515f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f7515f);
                canvas.scale(f7 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f9151f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f7515f);
                bVar.f7515f = null;
                bVar.a((Bitmap) aVar.o(bVar.d));
            }
            return bVar;
        }
    }
}
