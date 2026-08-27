package lh;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

public final class e3 extends org.telegram.ui.ActionBar.v0 {

    public final p3 f15927r0;

    public e3(p3 p3Var, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, zVar, 0, 0, false, c6Var);
        this.f15927r0 = p3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f15927r0.f16522y.getText());
    }
}
