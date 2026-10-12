package ih;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import fi.c2;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.io;
public final class k {
    public static final Rect f11756f = new Rect();
    public final gh.c f11757a = new gh.c();
    public final gh.b f11758b = new gh.b();
    public final androidx.biometric.e f11759c = new androidx.biometric.e(new c2(24));
    public final androidx.biometric.e d = new androidx.biometric.e(new c2(25));
    public final androidx.biometric.e e = new androidx.biometric.e(new c2(26));

    public final int a(gh.a aVar) {
        if (aVar instanceof gh.c) {
            return ((gh.c) aVar).f10148a.getColor();
        }
        if (aVar instanceof gh.b) {
            return ((Integer) this.d.o(((gh.b) aVar).d)).intValue();
        } else if (aVar instanceof gh.e) {
            return a(((gh.e) aVar).f10156a);
        } else {
            return 0;
        }
    }

    public final int b(gh.a aVar) {
        if (aVar instanceof gh.c) {
            return ((gh.c) aVar).f10148a.getColor();
        }
        if (aVar instanceof gh.b) {
            return ((Integer) this.e.o(((gh.b) aVar).d)).intValue();
        } else if (aVar instanceof gh.e) {
            return b(((gh.e) aVar).f10156a);
        } else {
            return 0;
        }
    }

    public final gh.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        gh.c cVar = this.f11757a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof cd0;
        gh.b bVar = this.f11758b;
        if (z11) {
            cd0 cd0Var = (cd0) drawable;
            if (cd0Var.f24052q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(cd0Var.f24046k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        androidx.biometric.e eVar = this.f11759c;
        if (z12) {
            bVar.a((Bitmap) eVar.o(((BitmapDrawable) drawable).getBitmap()));
            return bVar;
        } else if (drawable instanceof io) {
            return c(((io) drawable).c(false));
        } else {
            if (drawable != null) {
                bVar.getClass();
                float f7 = 120;
                float f10 = f7 / 1.0f;
                int round = Math.round(f10);
                int round2 = Math.round(f10);
                Bitmap bitmap = bVar.f10146f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f10146f.getWidth() == round2 && bVar.f10146f.getHeight() == round2) {
                    bVar.f10146f.eraseColor(0);
                } else {
                    bVar.f10146f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f10146f);
                canvas.scale(f7 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f11756f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f10146f);
                bVar.f10146f = null;
                bVar.a((Bitmap) eVar.o(bVar.d));
            }
            return bVar;
        }
    }
}
