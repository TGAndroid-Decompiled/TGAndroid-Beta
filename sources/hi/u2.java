package hi;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.rm;
import org.telegram.ui.x71;
public final class u2 extends org.telegram.ui.ActionBar.q0 {
    public final int A0;
    public final Object B0;

    public u2(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, yVar, 0, 0, false, h6Var);
        this.A0 = i7;
        this.B0 = frameLayout;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.A0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((d3) this.B0).E.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.B0).f32846y.getText());
                return;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((rm) this.B0).f39285y.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((x71) this.B0).h.getText());
                return;
        }
    }

    public u2(x71 x71Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0);
        this.A0 = 3;
        this.B0 = x71Var;
    }
}
