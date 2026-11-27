package defpackage;

import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
public final class iq8 extends hr8 {
    @Override
    public final void dispatchDraw(Canvas canvas) {
        nl nlVar;
        super.dispatchDraw(canvas);
        wl wlVar = this.e;
        if (wlVar != null && (nlVar = wlVar.k) != null) {
            nlVar.w0(false);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (getImageReceiver().E()) {
            accessibilityNodeInfo.setText(ob6.M0(2131754793, null));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, ob6.M0(2131747544, null)));
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, ob6.M0(2131754813, null)));
            return;
        }
        accessibilityNodeInfo.setVisibleToUser(false);
    }
}
