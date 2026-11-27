package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
public final class wk7 extends r4 {
    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.b(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.getScrollRange() > 0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override
    public final void c(View view, v4 v4Var) {
        int scrollRange;
        AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        v4Var.i("android.widget.ScrollView");
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            accessibilityNodeInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                v4Var.b(s4.g);
                v4Var.b(s4.h);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                v4Var.b(s4.f);
                v4Var.b(s4.i);
            }
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk7.d(android.view.View, int, android.os.Bundle):boolean");
    }
}
