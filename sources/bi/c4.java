package bi;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class c4 extends org.telegram.ui.ActionBar.w0 {
    public final p4 f2409v0;

    public c4(p4 p4Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, zVar, 0, 0, false, f6Var);
        this.f2409v0 = p4Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f2409v0.f3386y.getText());
    }
}
