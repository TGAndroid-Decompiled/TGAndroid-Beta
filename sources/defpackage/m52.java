package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class m52 extends s7 {
    public final byte A0;
    public final Object B0;

    public m52(FrameLayout frameLayout, Context context, s6 s6Var, vnb vnbVar, byte b) {
        super(context, s6Var, 0, 0, false, vnbVar);
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
                accessibilityNodeInfo.setText(((c62) obj).y.getText());
                return;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((wt4) obj).E.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((pqb) obj).h.getText());
                return;
        }
    }

    public m52(pqb pqbVar, Context context, s6 s6Var) {
        super(context, s6Var, 0);
        this.A0 = (byte) 3;
        this.B0 = pqbVar;
    }
}
