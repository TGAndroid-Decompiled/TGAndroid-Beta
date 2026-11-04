package mi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bg;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.uw;
public final class x1 extends bg {
    public final int f20018o0 = 0;
    public final Object f20019p0;

    public x1(y3 y3Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(2131232692, context, e6Var, true);
        this.f20019p0 = y3Var;
    }

    @Override
    public boolean b() {
        switch (this.f20018o0) {
            case 0:
                return ((c2) this.f20019p0).q0();
            case 1:
            case 2:
            default:
                return super.b();
            case 3:
                return false;
            case 4:
                return false;
        }
    }

    @Override
    public final boolean d() {
        switch (this.f20018o0) {
            case 0:
                if (!((c2) this.f20019p0).M0 && this.f32198r <= 0) {
                    return false;
                }
                return true;
            case 1:
                if (!((y3) this.f20019p0).f20054a0 && this.f32198r <= 0) {
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
        int i3 = this.f20018o0;
        Object obj = this.f20019p0;
        switch (i3) {
            case 2:
                return k6.w0(k6.S5, ((oo0) obj).J0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i10 = k6.f28071ng;
                Drawable[] drawableArr = PhotoViewer.V8;
                return ((PhotoViewer) obj).B1(i10);
        }
    }

    @Override
    public boolean j() {
        switch (this.f20018o0) {
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
        switch (this.f20018o0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(bd.G(((uw) this.f20019p0).J2.size(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public x1(c2 c2Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var, true);
        this.f20019p0 = c2Var;
    }

    public x1(oo0 oo0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(2131232692, context, e6Var, false);
        this.f20019p0 = oo0Var;
    }

    public x1(uw uwVar, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(2131232692, context, e6Var, false);
        this.f20019p0 = uwVar;
    }

    public x1(PhotoViewer photoViewer, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(2131232692, context, e6Var, false);
        this.f20019p0 = photoViewer;
    }
}
