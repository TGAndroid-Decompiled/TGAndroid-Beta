package ci;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class j3 extends org.telegram.ui.ActionBar.v0 {
    public final v3 f5230v0;

    public j3(v3 v3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, zVar, 0, 0, false, e6Var);
        this.f5230v0 = v3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f5230v0.f6147y.getText());
    }
}
