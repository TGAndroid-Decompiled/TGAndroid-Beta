package i5;

import android.view.Surface;
public abstract class o {
    public static void a(Surface surface, float f10) {
        int i10;
        if (f10 == 0.0f) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        try {
            surface.setFrameRate(f10, i10);
        } catch (IllegalStateException e) {
            h5.a.p("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
