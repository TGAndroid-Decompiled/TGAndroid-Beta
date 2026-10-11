package ci;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class j3 extends org.telegram.ui.ActionBar.u0 {
    public final v3 f5229v0;

    public j3(v3 v3Var, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, yVar, 0, 0, false, d6Var);
        this.f5229v0 = v3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f5229v0.f6146y.getText());
    }
}
