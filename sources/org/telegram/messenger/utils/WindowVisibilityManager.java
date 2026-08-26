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

    public final class ControllerImpl implements Controller {
        public boolean destroyed;
        public boolean hidden;

        public ControllerImpl() {
        }

        @Override
        public final void destroy() {
            setHidden(false);
            this.destroyed = true;
        }

        @Override
        public final void setHidden(boolean z) {
            if (this.hidden == z || this.destroyed) {
                return;
            }
            this.hidden = z;
            WindowVisibilityManager windowVisibilityManager = WindowVisibilityManager.this;
            if (z) {
                windowVisibilityManager.reasonsToHide++;
            } else {
                windowVisibilityManager.reasonsToHide--;
            }
            boolean z2 = windowVisibilityManager.reasonsToHide > 0;
            if (windowVisibilityManager.isHidden != z2) {
                windowVisibilityManager.isHidden = z2;
                Window window = (Window) ((WeakReference) windowVisibilityManager.listener.f$0).get();
                if (window != null) {
                    window.getDecorView().setVisibility(z2 ? 8 : 0);
                }
            }
        }
    }

    public WindowVisibilityManager(Window window) {
        this.listener = new WindowVisibilityManager$$ExternalSyntheticLambda0(new WeakReference(window), 0);
    }
}
