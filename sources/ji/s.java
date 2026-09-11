package ji;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;
public final class s {
    public static volatile boolean f14153e = false;
    public final Bitmap f14154a;
    public final int f14155b;
    public final int f14156c;
    public final int d;

    public s(Bitmap bitmap, int i10, int i11, int i12) {
        this.f14154a = bitmap;
        this.f14155b = i10;
        this.f14156c = i11;
        this.d = i12;
    }

    public static s a(String str, float f7, boolean z10) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!f14153e) {
                    synchronized (s.class) {
                        if (!f14153e) {
                            JLatexMathAndroid.init(ApplicationLoader.applicationContext);
                            f14153e = true;
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
                    return new s(createBitmap, intrinsicWidth, intrinsicHeight, i10);
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        return null;
    }
}
