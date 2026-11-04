package mi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.a8;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;
public final class q {
    public static volatile boolean f19823e = false;
    public final Bitmap f19824a;
    public final int f19825b;
    public final int f19826c;
    public final int d;

    public q(Bitmap bitmap, int i3, int i10, int i11) {
        this.f19824a = bitmap;
        this.f19825b = i3;
        this.f19826c = i10;
        this.d = i11;
    }

    public static q a(String str, float f10, boolean z10) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!f19823e) {
                    synchronized (q.class) {
                        if (!f19823e) {
                            JLatexMathAndroid.init(org.telegram.messenger.t0.f25457b);
                            f19823e = true;
                        }
                    }
                }
                JLatexMathDrawable build = JLatexMathDrawable.builder(str).textSize(f10).build();
                int intrinsicWidth = build.getIntrinsicWidth();
                int intrinsicHeight = build.getIntrinsicHeight();
                if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ALPHA_8);
                    int i3 = 0;
                    build.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                    build.draw(new Canvas(createBitmap));
                    if (z10) {
                        i3 = build.icon().getIconDepth();
                    }
                    return new q(createBitmap, intrinsicWidth, intrinsicHeight, i3);
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
        return null;
    }
}
