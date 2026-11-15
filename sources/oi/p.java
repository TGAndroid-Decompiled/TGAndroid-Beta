package oi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.a8;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;
public final class p {
    public static volatile boolean f21861e = false;
    public final Bitmap f21862a;
    public final int f21863b;
    public final int f21864c;
    public final int d;

    public p(Bitmap bitmap, int i7, int i10, int i11) {
        this.f21862a = bitmap;
        this.f21863b = i7;
        this.f21864c = i10;
        this.d = i11;
    }

    public static p a(String str, float f10, boolean z10) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!f21861e) {
                    synchronized (p.class) {
                        if (!f21861e) {
                            JLatexMathAndroid.init(org.telegram.messenger.t0.f26600b);
                            f21861e = true;
                        }
                    }
                }
                JLatexMathDrawable build = JLatexMathDrawable.builder(str).textSize(f10).build();
                int intrinsicWidth = build.getIntrinsicWidth();
                int intrinsicHeight = build.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    int i7 = 0;
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    if (z10) {
                        i7 = build.icon().getIconDepth();
                    }
                    return new p(createBitmap, intrinsicWidth, intrinsicHeight, i7);
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return null;
    }
}
