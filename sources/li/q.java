package li;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.a8;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;
public final class q {
    public static volatile boolean f18783e = false;
    public final Bitmap f18784a;
    public final int f18785b;
    public final int f18786c;
    public final int d;

    public q(Bitmap bitmap, int i7, int i10, int i11) {
        this.f18784a = bitmap;
        this.f18785b = i7;
        this.f18786c = i10;
        this.d = i11;
    }

    public static q a(String str, float f10, boolean z9) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!f18783e) {
                    synchronized (q.class) {
                        if (!f18783e) {
                            JLatexMathAndroid.init(org.telegram.messenger.t0.f25570b);
                            f18783e = true;
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
                    if (z9) {
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
