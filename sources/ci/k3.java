package ci;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class k3 extends org.telegram.ui.ActionBar.v0 {
    public final w3 f5292v0;

    public k3(w3 w3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, zVar, 0, 0, false, d6Var);
        this.f5292v0 = w3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f5292v0.f6227y.getText());
    }
}
