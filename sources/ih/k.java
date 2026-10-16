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
    public static final Rect f11760f = new Rect();
    public final gh.c f11761a = new gh.c();
    public final gh.b f11762b = new gh.b();
    public final androidx.biometric.e f11763c = new androidx.biometric.e(new c2(24));
    public final androidx.biometric.e d = new androidx.biometric.e(new c2(25));
    public final androidx.biometric.e e = new androidx.biometric.e(new c2(26));

    public final int a(gh.a aVar) {
        if (aVar instanceof gh.c) {
            return ((gh.c) aVar).f10152a.getColor();
        }
        if (aVar instanceof gh.b) {
            return ((Integer) this.d.m(((gh.b) aVar).d)).intValue();
        } else if (aVar instanceof gh.e) {
            return a(((gh.e) aVar).f10160a);
        } else {
            return 0;
        }
    }

    public final int b(gh.a aVar) {
        if (aVar instanceof gh.c) {
            return ((gh.c) aVar).f10152a.getColor();
        }
        if (aVar instanceof gh.b) {
            return ((Integer) this.e.m(((gh.b) aVar).d)).intValue();
        } else if (aVar instanceof gh.e) {
            return b(((gh.e) aVar).f10160a);
        } else {
            return 0;
        }
    }

    public final gh.a c(Drawable drawable) {
        boolean z10 = drawable instanceof ColorDrawable;
        gh.c cVar = this.f11761a;
        if (z10) {
            cVar.a(((ColorDrawable) drawable).getColor());
            return cVar;
        }
        boolean z11 = drawable instanceof cd0;
        gh.b bVar = this.f11762b;
        if (z11) {
            cd0 cd0Var = (cd0) drawable;
            if (cd0Var.f23706q < 0) {
                cVar.a(-16777216);
                return cVar;
            }
            bVar.a(cd0Var.f23700k);
            return bVar;
        }
        boolean z12 = drawable instanceof BitmapDrawable;
        androidx.biometric.e eVar = this.f11763c;
        if (z12) {
            bVar.a((Bitmap) eVar.m(((BitmapDrawable) drawable).getBitmap()));
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
                Bitmap bitmap = bVar.f10150f;
                if (bitmap != null && !bitmap.isRecycled() && bVar.f10150f.getWidth() == round2 && bVar.f10150f.getHeight() == round2) {
                    bVar.f10150f.eraseColor(0);
                } else {
                    bVar.f10150f = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                }
                Canvas canvas = new Canvas(bVar.f10150f);
                canvas.scale(f7 / round, 160 / round2);
                Rect bounds = drawable.getBounds();
                Rect rect = f11760f;
                rect.set(bounds);
                drawable.setBounds(0, 0, 120, 160);
                drawable.draw(canvas);
                drawable.setBounds(rect);
                bVar.a(bVar.f10150f);
                bVar.f10150f = null;
                bVar.a((Bitmap) eVar.m(bVar.d));
            }
            return bVar;
        }
    }
}
