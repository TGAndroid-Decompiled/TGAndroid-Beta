package gi;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.am;
import org.telegram.ui.l71;
public final class u2 extends org.telegram.ui.ActionBar.q0 {
    public final int A0;
    public final Object B0;

    public u2(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.x xVar, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, xVar, 0, 0, false, e6Var);
        this.A0 = i3;
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
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.B0).f31306y.getText());
                return;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((am) this.B0).f31900y.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((l71) this.B0).h.getText());
                return;
        }
    }

    public u2(l71 l71Var, Context context, org.telegram.ui.ActionBar.x xVar) {
        super(context, xVar, 0);
        this.A0 = 3;
        this.B0 = l71Var;
    }
}
