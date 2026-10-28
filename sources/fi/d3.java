package fi;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class d3 extends org.telegram.ui.ActionBar.w0 {
    public final o3 f10717x0;

    public d3(o3 o3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, zVar, 0, 0, false, u6Var);
        this.f10717x0 = o3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f10717x0.f11353y.getText());
    }
}
