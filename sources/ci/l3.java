package ci;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class l3 extends org.telegram.ui.ActionBar.w0 {
    public final x3 f4925v0;

    public l3(x3 x3Var, Context context, org.telegram.ui.ActionBar.a0 a0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, a0Var, 0, 0, false, f6Var);
        this.f4925v0 = x3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f4925v0.f5751y.getText());
    }
}
