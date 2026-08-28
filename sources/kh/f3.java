package kh;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class f3 extends org.telegram.ui.ActionBar.w0 {
    public final q3 f15227r0;

    public f3(q3 q3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, zVar, 0, 0, false, b6Var);
        this.f15227r0 = q3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f15227r0.f15873y.getText());
    }
}
