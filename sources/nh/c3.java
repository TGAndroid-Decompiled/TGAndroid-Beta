package nh;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class c3 extends org.telegram.ui.ActionBar.w0 {
    public final n3 f17470r0;

    public c3(n3 n3Var, Context context, org.telegram.ui.ActionBar.a0 a0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, a0Var, 0, 0, false, c6Var);
        this.f17470r0 = n3Var;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f17470r0.f18182y.getText());
    }
}
