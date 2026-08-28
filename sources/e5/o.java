package e5;

import android.view.Surface;
public abstract class o {
    public static void a(Surface surface, float f10) {
        int i9;
        if (f10 == 0.0f) {
            i9 = 0;
        } else {
            i9 = 1;
        }
        try {
            surface.setFrameRate(f10, i9);
        } catch (IllegalStateException e10) {
            d5.a.p("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
