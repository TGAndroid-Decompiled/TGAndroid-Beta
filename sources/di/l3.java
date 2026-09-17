package di;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class l3 extends org.telegram.ui.ActionBar.v0 {
    public final x3 f7518v0;

    public l3(x3 x3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, zVar, 0, 0, false, f6Var);
        this.f7518v0 = x3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f7518v0.f8381y.getText());
    }
}
