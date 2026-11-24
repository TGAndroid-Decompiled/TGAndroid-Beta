package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class w42 extends r7 {
    public final byte A0;
    public final Object B0;

    public w42(FrameLayout frameLayout, Context context, r6 r6Var, wjb wjbVar, byte b) {
        super(context, r6Var, 0, 0, false, wjbVar);
        this.A0 = b;
        this.B0 = frameLayout;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        byte b = this.A0;
        Object obj = this.B0;
        switch (b) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) obj).y.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((m52) obj).y.getText());
                return;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((sr4) obj).E.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((qmb) obj).h.getText());
                return;
        }
    }

    public w42(qmb qmbVar, Context context, r6 r6Var) {
        super(context, r6Var, 0);
        this.A0 = (byte) 3;
        this.B0 = qmbVar;
    }
}
