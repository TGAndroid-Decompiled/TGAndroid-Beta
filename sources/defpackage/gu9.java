package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class gu9 extends FrameLayout {
    public ida a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
