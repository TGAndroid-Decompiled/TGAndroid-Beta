package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.messenger.voip.VoIPService;
public final class q85 extends FrameLayout {
    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && hc2.W(sharedInstance.getChat())) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, k96.M0(2131743225, null)));
        } else {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, k96.M0(2131743108, null)));
        }
    }
}
