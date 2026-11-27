package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;
public final class xgc implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap a = new WeakHashMap();

    @Override
    public final void onGlobalLayout() {
        boolean z;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.a.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (view.isShown() && view.getWindowVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (booleanValue != z) {
                    if (z) {
                        i = 16;
                    } else {
                        i = 32;
                    }
                    ihc.h(i, view);
                    entry.setValue(Boolean.valueOf(z));
                }
            }
        }
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
    }
}
