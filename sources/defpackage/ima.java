package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
public final class ima extends et8 {
    public View c;

    @Override
    public final void o() {
        WindowInsetsController windowInsetsController;
        View view = this.c;
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() {
                @Override
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                    boolean z;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if ((i & 8) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    atomicBoolean2.set(z);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
            return;
        }
        super.o();
    }

    @Override
    public final void r() {
        WindowInsetsController windowInsetsController;
        View view = this.c;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        if (view != null) {
            windowInsetsController = view.getWindowInsetsController();
        } else {
            windowInsetsController = null;
        }
        if (windowInsetsController != null) {
            windowInsetsController.show(WindowInsets.Type.ime());
        }
        super.r();
    }
}
