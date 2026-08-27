package e5;

import android.view.Surface;

public abstract class n {
    public static void a(Surface surface, float f10) {
        try {
            surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e9) {
            d5.a.p("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e9);
        }
    }
}
