package li;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cy;
public final class w1 extends vg {
    public final int f17595n0;
    public final Object f17596o0;

    public w1(int i10, int i11, Context context, Object obj, u6 u6Var) {
        super(i10, context, u6Var, true);
        this.f17595n0 = i11;
        this.f17596o0 = obj;
    }

    @Override
    public boolean d() {
        switch (this.f17595n0) {
            case 0:
                return ((b2) this.f17596o0).m0();
            case 1:
            case 2:
            default:
                return super.d();
            case 3:
                return false;
            case 4:
                return false;
        }
    }

    @Override
    public final boolean f() {
        switch (this.f17595n0) {
            case 0:
                if (!((b2) this.f17596o0).L0 && this.f33660r <= 0) {
                    return false;
                }
                return true;
            case 1:
                if (!((a4) this.f17596o0).W && this.f33660r <= 0) {
                    return false;
                }
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int getFillColor() {
        int i10 = this.f17595n0;
        Object obj = this.f17596o0;
        switch (i10) {
            case 2:
                return ((mr0) obj).getThemedColor(y6.S5);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i11 = y6.zf;
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((PhotoViewer) obj).A1(i11);
        }
    }

    @Override
    public boolean j() {
        switch (this.f17595n0) {
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            default:
                return super.j();
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f17595n0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((cy) this.f17596o0).I2.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public w1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10, u6 u6Var, int i11) {
        super(i10, context, u6Var, false);
        this.f17595n0 = i11;
        this.f17596o0 = notificationCenterDelegate;
    }
}
