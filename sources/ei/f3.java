package ei;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class f3 extends org.telegram.ui.ActionBar.u0 {
    public final q3 f9006x0;

    public f3(q3 q3Var, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, yVar, 0, 0, false, g6Var);
        this.f9006x0 = q3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f9006x0.f9655y.getText());
    }
}
