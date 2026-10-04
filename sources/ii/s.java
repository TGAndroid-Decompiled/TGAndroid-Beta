package ii;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;
public final class s {
    public static volatile boolean f12616e = false;
    public final Bitmap f12617a;
    public final int f12618b;
    public final int f12619c;
    public final int d;

    public s(Bitmap bitmap, int i10, int i11, int i12) {
        this.f12617a = bitmap;
        this.f12618b = i10;
        this.f12619c = i11;
        this.d = i12;
    }

    public static s a(String str, float f7, boolean z10) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!f12616e) {
                    synchronized (s.class) {
                        if (!f12616e) {
                            JLatexMathAndroid.init(ApplicationLoader.applicationContext);
                            f12616e = true;
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
