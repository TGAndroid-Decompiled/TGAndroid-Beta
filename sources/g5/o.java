package g5;

import android.view.Surface;
public abstract class o {
    public static void a(Surface surface, float f9) {
        int i10;
        if (f9 == 0.0f) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        try {
            surface.setFrameRate(f9, i10);
        } catch (IllegalStateException e10) {
            f5.a.p("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
