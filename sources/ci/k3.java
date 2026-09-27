package ci;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class k3 extends org.telegram.ui.ActionBar.w0 {
    public final w3 f4903v0;

    public k3(w3 w3Var, Context context, org.telegram.ui.ActionBar.a0 a0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, a0Var, 0, 0, false, e6Var);
        this.f4903v0 = w3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f4903v0.f5781y.getText());
    }
}
