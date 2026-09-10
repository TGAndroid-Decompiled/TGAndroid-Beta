package hi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import ru.noties.jlatexmath.JLatexMathAndroid;
import ru.noties.jlatexmath.JLatexMathDrawable;
public final class t {
    public static volatile boolean e = false;
    public final Bitmap f9850a;
    public final int f9851b;
    public final int f9852c;
    public final int d;

    public t(Bitmap bitmap, int i10, int i11, int i12) {
        this.f9850a = bitmap;
        this.f9851b = i10;
        this.f9852c = i11;
        this.d = i12;
    }

    public static t a(String str, float f7, boolean z10) {
        if (str != null && !str.isEmpty()) {
            try {
                if (!e) {
                    synchronized (t.class) {
                        if (!e) {
                            JLatexMathAndroid.init(ApplicationLoader.applicationContext);
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
                    return new t(createBitmap, intrinsicWidth, intrinsicHeight, i10);
                }
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        return null;
    }
}
