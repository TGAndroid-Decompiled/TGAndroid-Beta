package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.f8;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;
public final class u {
    public static volatile boolean e = false;
    public final Bitmap f3369a;
    public final int f3370b;
    public final int f3371c;
    public final int d;

    public u(Bitmap bitmap, int i10, int i11, int i12) {
        this.f3369a = bitmap;
        this.f3370b = i10;
        this.f3371c = i11;
        this.d = i12;
    }

    public static u a(String str, float f7, boolean z10) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!e) {
                    synchronized (u.class) {
                        if (!e) {
                            JLatexMathAndroid.init(org.telegram.messenger.w0.f19025b);
                            e = true;
                        }
                    }
                }
                JLatexMathDrawable build = JLatexMathDrawable.builder(str).textSize(f7).build();
                int intrinsicWidth = build.getIntrinsicWidth();
                int intrinsicHeight = build.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    int i10 = 0;
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    if (z10) {
                        i10 = build.icon().getIconDepth();
                    }
                    return new u(createBitmap, intrinsicWidth, intrinsicHeight, i10);
                }
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
        return null;
    }
}
