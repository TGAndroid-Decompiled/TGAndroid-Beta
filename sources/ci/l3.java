package ci;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class l3 extends org.telegram.ui.ActionBar.v0 {
    public final x3 f4925v0;

    public l3(x3 x3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, zVar, 0, 0, false, e6Var);
        this.f4925v0 = x3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f4925v0.f5751y.getText());
    }
}
