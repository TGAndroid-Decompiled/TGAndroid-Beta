package org.telegram.messenger.utils;

import android.view.Window;
import java.lang.ref.WeakReference;

public final class WindowVisibilityManager {
    public boolean isHidden;
    public final WindowVisibilityManager$$ExternalSyntheticLambda0 listener;
    public int reasonsToHide;

    public interface Controller {
        void destroy();

        void setHidden(boolean z);
    }

    public WindowVisibilityManager(Window window) {
        this.listener = new WindowVisibilityManager$$ExternalSyntheticLambda0(new WeakReference(window), 0);
    }
}
