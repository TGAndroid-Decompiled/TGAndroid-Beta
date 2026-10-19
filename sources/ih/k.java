package ih;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.tn;
public final class k {
    public static final Rect f13149f = new Rect();
    public final gh.c f13150a = new gh.c();
    public final gh.b f13151b = new gh.b();
    public final androidx.biometric.e f13152c = new androidx.biometric.e(new fh.b(26));
    public final androidx.biometric.e d = new androidx.biometric.e(new fh.b(27));
    public final androidx.biometric.e e = new androidx.biometric.e(new fh.b(28));

    public final int a(gh.a aVar) {
        if (aVar instanceof gh.c) {
            return ((gh.c) aVar).f11057a.getColor();
        }
        if (aVar instanceof gh.b) {
            return ((Integer) this.d.m(((gh.b) aVar).d)).intValue();
        } else if (aVar instanceof gh.e) {
            return a(((gh.e) aVar).f11065a);
        } else {
            return 0;
        }
    }

    public final int b(gh.a aVar) {
        if (aVar instanceof gh.c) {
            return ((gh.c) aVar).f11057a.getColor();
        }
        if (aVar instanceof gh.b) {
            return ((Integer) this.e.m(((gh.b) aVar).d)).intValue();
        } else if (aVar instanceof gh.e) {
            return b(((gh.e) aVar).f11065a);
        } else {
            return 0;
        }
    }

    public final gh.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        gh.c cVar = this.f13150a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof wc0;
        gh.b bVar = this.f13151b;
        if (z11) {
            wc0 wc0Var = (wc0) drawable;
            if (wc0Var.f32096q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(wc0Var.f32090k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        androidx.biometric.e eVar = this.f13152c;
        if (z12) {
            bVar.a((Bitmap) eVar.m(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof tn) {
            return c(((tn) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f7 = 120;
                float f10 = f7 / 1.0f;
                int round = Math.round(f10);
                int round2 = Math.round(f10);
                Bitmap bitmap = bVar.f11055f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f11055f.getWidth() == round2 && bVar.f11055f.getHeight() == round2) {
                    bVar.f11055f.eraseColor(0);
                } else {
                    bVar.f11055f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f11055f);
                canvas.scale(f7 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f13149f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f11055f);
                bVar.f11055f = null;
                bVar.a((Bitmap) eVar.m(bVar.d));
            }
            return bVar;
        }
    }
}
