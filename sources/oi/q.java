package oi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.a8;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;
public final class q {
    public static volatile boolean f22383e = false;
    public final Bitmap f22384a;
    public final int f22385b;
    public final int f22386c;
    public final int d;

    public q(Bitmap bitmap, int i7, int i10, int i11) {
        this.f22384a = bitmap;
        this.f22385b = i7;
        this.f22386c = i10;
        this.d = i11;
    }

    public static q a(String str, float f10, boolean z10) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!f22383e) {
                    synchronized (q.class) {
                        if (!f22383e) {
                            JLatexMathAndroid.init(org.telegram.messenger.t0.f27013b);
                            f22383e = true;
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
                    return new q(createBitmap, intrinsicWidth, intrinsicHeight, i7);
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return null;
    }
}
