package defpackage;

import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
public final class xm8 extends wn8 {
    @Override
    public final void dispatchDraw(Canvas canvas) {
        ml mlVar;
        super.dispatchDraw(canvas);
        vl vlVar = this.e;
        if (vlVar != null && (mlVar = vlVar.k) != null) {
            mlVar.w0(false);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getImageReceiver().E()) {
            accessibilityNodeInfo.setText(k96.M0(2131754797, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, k96.M0(2131747624, null)));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, k96.M0(2131754817, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }
}
