package ki;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.vg;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ey;
public final class y1 extends vg {
    public final int f15719n0;
    public final Object f15720o0;

    public y1(int i10, int i11, Context context, Object obj, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, context, g6Var, true);
        this.f15719n0 = i11;
        this.f15720o0 = obj;
    }

    @Override
    public boolean d() {
        switch (this.f15719n0) {
            case 0:
                return ((d2) this.f15720o0).l0();
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
        switch (this.f15719n0) {
            case 0:
                if (!((d2) this.f15720o0).L0 && this.f31464r <= 0) {
                    return false;
                }
                return true;
            case 1:
                if (!((b4) this.f15720o0).W && this.f31464r <= 0) {
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
        int i10 = this.f15719n0;
        Object obj = this.f15720o0;
        switch (i10) {
            case 2:
                return ((ir0) obj).getThemedColor(k6.S5);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i11 = k6.f21596zf;
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((PhotoViewer) obj).A1(i11);
        }
    }

    @Override
    public boolean j() {
        switch (this.f15719n0) {
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
        switch (this.f15719n0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((ey) this.f15720o0).I2.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public y1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(i10, context, g6Var, false);
        this.f15719n0 = i11;
        this.f15720o0 = notificationCenterDelegate;
    }
}
