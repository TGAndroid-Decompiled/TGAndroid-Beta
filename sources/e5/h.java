package e5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
public abstract class h {
    public static boolean a(Context context) {
        Display display;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display != null && display.isHdr()) {
            for (int i9 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i9 == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
