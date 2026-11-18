package hi;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.pm;
import org.telegram.ui.x71;
public final class v2 extends org.telegram.ui.ActionBar.r0 {
    public final int A0;
    public final Object B0;

    public v2(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.z zVar, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, zVar, 0, 0, false, i6Var);
        this.A0 = i7;
        this.B0 = frameLayout;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.A0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((e3) this.B0).E.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.B0).f32810y.getText());
                return;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((pm) this.B0).f38491y.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((x71) this.B0).h.getText());
                return;
        }
    }

    public v2(x71 x71Var, Context context, org.telegram.ui.ActionBar.z zVar) {
        super(context, zVar, 0);
        this.A0 = 3;
        this.B0 = x71Var;
    }
}
