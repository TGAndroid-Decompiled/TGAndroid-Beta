package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
public final class xv9 extends FrameLayout {
    public zea a;

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.a.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }
}
