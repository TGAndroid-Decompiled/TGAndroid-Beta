package ci;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class k3 extends org.telegram.ui.ActionBar.u0 {
    public final w3 f4892v0;

    public k3(w3 w3Var, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, yVar, 0, 0, false, d6Var);
        this.f4892v0 = w3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f4892v0.f5734y.getText());
    }
}
