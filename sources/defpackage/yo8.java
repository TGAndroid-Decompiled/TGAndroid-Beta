package defpackage;

import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
public final class yo8 extends xp8 {
    @Override
    public final void dispatchDraw(Canvas canvas) {
        mm mmVar;
        super.dispatchDraw(canvas);
        vm vmVar = this.e;
        if (vmVar != null && (mmVar = vmVar.k) != null) {
            mmVar.w0(false);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getImageReceiver().E()) {
            accessibilityNodeInfo.setText(jb6.M0(2131754797, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, jb6.M0(2131747550, null)));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, jb6.M0(2131754817, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }
}
