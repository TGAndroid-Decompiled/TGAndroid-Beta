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
public final class w1 extends ug {
    public final int f22496y0 = 0;
    public final Object f22497z0;

    public w1(y3 y3Var, Context context, h6 h6Var) {
        super(2131232696, context, h6Var, true);
        this.f22497z0 = y3Var;
    }

    @Override
    public boolean b() {
        switch (this.f22496y0) {
            case 0:
                return ((b2) this.f22497z0).q0();
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
        switch (this.f22496y0) {
            case 0:
                if (!((b2) this.f22497z0).M0 && this.f40355w <= 0) {
                    return false;
                }
                return true;
            case 1:
                if (!((y3) this.f22497z0).f22545a0 && this.f40355w <= 0) {
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
        int i7 = this.f22496y0;
        Object obj = this.f22497z0;
        switch (i7) {
            case 2:
                return m6.w0(m6.S5, ((ap0) obj).J0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i10 = m6.f29630qg;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return ((PhotoViewer) obj).w1(i10);
        }
    }

    @Override
    public boolean j() {
        switch (this.f22496y0) {
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
        switch (this.f22496y0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(hd.G(((cx) this.f22497z0).K2.size(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public w1(b2 b2Var, Context context, int i7, h6 h6Var) {
        super(i7, context, h6Var, true);
        this.f22497z0 = b2Var;
    }

    public w1(ap0 ap0Var, Context context, h6 h6Var) {
        super(2131232696, context, h6Var, false);
        this.f22497z0 = ap0Var;
    }

    public w1(cx cxVar, Context context, h6 h6Var) {
        super(2131232696, context, h6Var, false);
        this.f22497z0 = cxVar;
    }

    public w1(PhotoViewer photoViewer, Context context, h6 h6Var) {
        super(2131232696, context, h6Var, false);
        this.f22497z0 = photoViewer;
    }
}
