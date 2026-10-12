package di;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class j3 extends org.telegram.ui.ActionBar.u0 {
    public final v3 f7104v0;

    public j3(v3 v3Var, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, yVar, 0, 0, false, c6Var);
        this.f7104v0 = v3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f7104v0.f7995y.getText());
    }
}
