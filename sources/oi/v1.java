package oi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.ug;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cx;
public final class v1 extends ug {
    public final int f22433y0 = 0;
    public final Object f22434z0;

    public v1(x3 x3Var, Context context, h6 h6Var) {
        super(2131232696, context, h6Var, true);
        this.f22434z0 = x3Var;
    }

    @Override
    public boolean b() {
        switch (this.f22433y0) {
            case 0:
                return ((a2) this.f22434z0).q0();
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
        switch (this.f22433y0) {
            case 0:
                if (!((a2) this.f22434z0).M0 && this.f40340w <= 0) {
                    return false;
                }
                return true;
            case 1:
                if (!((x3) this.f22434z0).f22482a0 && this.f40340w <= 0) {
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
        int i7 = this.f22433y0;
        Object obj = this.f22434z0;
        switch (i7) {
            case 2:
                return m6.w0(m6.S5, ((ap0) obj).J0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i10 = m6.f29596qg;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return ((PhotoViewer) obj).w1(i10);
        }
    }

    @Override
    public boolean j() {
        switch (this.f22433y0) {
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
        switch (this.f22433y0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(hd.G(((cx) this.f22434z0).K2.size(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public v1(a2 a2Var, Context context, int i7, h6 h6Var) {
        super(i7, context, h6Var, true);
        this.f22434z0 = a2Var;
    }

    public v1(ap0 ap0Var, Context context, h6 h6Var) {
        super(2131232696, context, h6Var, false);
        this.f22434z0 = ap0Var;
    }

    public v1(cx cxVar, Context context, h6 h6Var) {
        super(2131232696, context, h6Var, false);
        this.f22434z0 = cxVar;
    }

    public v1(PhotoViewer photoViewer, Context context, h6 h6Var) {
        super(2131232696, context, h6Var, false);
        this.f22434z0 = photoViewer;
    }
}
