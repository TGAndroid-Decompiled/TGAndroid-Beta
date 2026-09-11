package ji;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.uy;
public final class x1 extends vg {
    public final int f14325l0;
    public final Object m0;

    public x1(Object obj, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(i10, context, f6Var, true);
        this.f14325l0 = i11;
        this.m0 = obj;
    }

    @Override
    public boolean d() {
        switch (this.f14325l0) {
            case 0:
                return ((c2) this.m0).l0();
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
        switch (this.f14325l0) {
            case 0:
                if (!((c2) this.m0).L0 && this.f31239r <= 0) {
                    return false;
                }
                return true;
            case 1:
                if (!((a4) this.m0).W && this.f31239r <= 0) {
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
        int i10 = this.f14325l0;
        Object obj = this.m0;
        switch (i10) {
            case 2:
                return ((hq0) obj).getThemedColor(org.telegram.ui.ActionBar.j6.S5);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i11 = org.telegram.ui.ActionBar.j6.f21070zf;
                Drawable[] drawableArr = PhotoViewer.T8;
                return ((PhotoViewer) obj).z1(i11);
        }
    }

    @Override
    public boolean j() {
        switch (this.f14325l0) {
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
        switch (this.f14325l0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((uy) this.m0).I2.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public x1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(i10, context, f6Var, false);
        this.f14325l0 = i11;
        this.m0 = notificationCenterDelegate;
    }
}
