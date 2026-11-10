package fi;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.am;
import org.telegram.ui.x71;
public final class w2 extends org.telegram.ui.ActionBar.r0 {
    public final Object A0;
    public final int f13028z0;

    public w2(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.h6 h6Var, int i7) {
        super(context, yVar, 0, 0, false, h6Var);
        this.f13028z0 = i7;
        this.A0 = frameLayout;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f13028z0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((f3) this.A0).D.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.A0).f31251y.getText());
                return;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((am) this.A0).f31884y.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((x71) this.A0).h.getText());
                return;
        }
    }

    public w2(x71 x71Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0);
        this.f13028z0 = 3;
        this.A0 = x71Var;
    }
}
