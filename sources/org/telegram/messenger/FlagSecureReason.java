package org.telegram.messenger;

import android.view.Window;
import java.util.HashMap;
public class FlagSecureReason {
    private static HashMap<Window, Integer> currentSecureReasons;
    private final FlagSecureCondition condition;
    private final Window window;
    private boolean attached = false;
    private boolean value = false;

    public interface FlagSecureCondition {
        boolean run();
    }

    public FlagSecureReason(Window window, FlagSecureCondition flagSecureCondition) {
        this.window = window;
        this.condition = flagSecureCondition;
    }

    public static boolean isSecuredNow(Window window) {
        HashMap<Window, Integer> hashMap = currentSecureReasons;
        if (hashMap != null && hashMap.get(window) != null) {
            return true;
        }
        return false;
    }

    private void update(int i10) {
        int intValue;
        if (currentSecureReasons == null) {
            currentSecureReasons = new HashMap<>();
        }
        Integer num = currentSecureReasons.get(this.window);
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        int max = Math.max(0, intValue + i10);
        if (max <= 0) {
            currentSecureReasons.remove(this.window);
        } else {
            currentSecureReasons.put(this.window, Integer.valueOf(max));
        }
        updateWindowSecure(this.window);
    }

    private static void updateWindowSecure(Window window) {
        if (window == null) {
            return;
        }
        if (isSecuredNow(window)) {
            window.addFlags(8192);
            AndroidUtilities.logFlagSecure();
            return;
        }
        window.clearFlags(8192);
        AndroidUtilities.logFlagSecure();
    }

    public void attach() {
        if (this.attached) {
            return;
        }
        this.attached = true;
        invalidate();
    }

    public void detach() {
        if (!this.attached) {
            return;
        }
        this.attached = false;
        invalidate();
    }

    public void invalidate() {
        boolean z10;
        FlagSecureCondition flagSecureCondition;
        int i10 = 1;
        if (this.attached && (flagSecureCondition = this.condition) != null && flagSecureCondition.run()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.value) {
            this.value = z10;
            if (!z10) {
                i10 = -1;
            }
            update(i10);
        }
    }
}
