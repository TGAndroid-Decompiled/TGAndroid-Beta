package ei;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class f3 extends org.telegram.ui.ActionBar.u0 {
    public final q3 f8997v0;

    public f3(q3 q3Var, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, yVar, 0, 0, false, d6Var);
        this.f8997v0 = q3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f8997v0.f9641y.getText());
    }
}
