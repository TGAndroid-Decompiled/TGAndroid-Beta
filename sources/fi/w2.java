package fi;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bm;
import org.telegram.ui.w71;
public final class w2 extends org.telegram.ui.ActionBar.r0 {
    public final Object A0;
    public final int f13026z0;

    public w2(FrameLayout frameLayout, Context context, org.telegram.ui.ActionBar.y yVar, org.telegram.ui.ActionBar.g6 g6Var, int i7) {
        super(context, yVar, 0, 0, false, g6Var);
        this.f13026z0 = i7;
        this.A0 = frameLayout;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f13026z0) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((f3) this.A0).D.getText());
                return;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) this.A0).f31240y.getText());
                return;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((bm) this.A0).f32281y.getText());
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((w71) this.A0).h.getText());
                return;
        }
    }

    public w2(w71 w71Var, Context context, org.telegram.ui.ActionBar.y yVar) {
        super(context, yVar, 0);
        this.f13026z0 = 3;
        this.A0 = w71Var;
    }
}
