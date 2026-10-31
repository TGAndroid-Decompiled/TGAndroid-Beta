package bi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.zf;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ay;
public final class f2 extends zf {
    public final int f2992n0 = 1;
    public final Object f2993o0;

    public f2(i4 i4Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(2131232691, context, p6Var, true);
        this.f2993o0 = i4Var;
    }

    @Override
    public boolean d() {
        switch (this.f2992n0) {
            case 0:
                return ((k2) this.f2993o0).p0();
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
        switch (this.f2992n0) {
            case 0:
                if (!((k2) this.f2993o0).L0 && this.f33046r <= 0) {
                    return false;
                }
                return true;
            case 1:
                if (!((i4) this.f2993o0).W && this.f33046r <= 0) {
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
        int i10 = this.f2992n0;
        Object obj = this.f2993o0;
        switch (i10) {
            case 2:
                return org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.S5, ((op0) obj).I0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i11 = org.telegram.ui.ActionBar.t6.f21125ng;
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((PhotoViewer) obj).B1(i11);
        }
    }

    @Override
    public boolean j() {
        switch (this.f2992n0) {
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
        switch (this.f2992n0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(cd.G(((ay) this.f2993o0).I2.size(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public f2(k2 k2Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var, true);
        this.f2993o0 = k2Var;
    }

    public f2(op0 op0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(2131232691, context, p6Var, false);
        this.f2993o0 = op0Var;
    }

    public f2(ay ayVar, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(2131232691, context, p6Var, false);
        this.f2993o0 = ayVar;
    }

    public f2(PhotoViewer photoViewer, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(2131232691, context, p6Var, false);
        this.f2993o0 = photoViewer;
    }
}
