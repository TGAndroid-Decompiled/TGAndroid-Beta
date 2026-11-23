package oi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.tg;
import org.telegram.ui.Components.zo0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bx;
public final class w1 extends tg {
    public final int f22563y0 = 0;
    public final Object f22564z0;

    public w1(y3 y3Var, Context context, i6 i6Var) {
        super(2131232699, context, i6Var, true);
        this.f22564z0 = y3Var;
    }

    @Override
    public boolean b() {
        switch (this.f22563y0) {
            case 0:
                return ((b2) this.f22564z0).q0();
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
        switch (this.f22563y0) {
            case 0:
                if (!((b2) this.f22564z0).M0 && this.f39944w <= 0) {
                    return false;
                }
                return true;
            case 1:
                if (!((y3) this.f22564z0).f22612a0 && this.f39944w <= 0) {
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
        int i7 = this.f22563y0;
        Object obj = this.f22564z0;
        switch (i7) {
            case 2:
                return n6.w0(n6.S5, ((zo0) obj).J0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i10 = n6.f29700qg;
                Drawable[] drawableArr = PhotoViewer.f43272f9;
                return ((PhotoViewer) obj).w1(i10);
        }
    }

    @Override
    public boolean j() {
        switch (this.f22563y0) {
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
        switch (this.f22563y0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(gd.G(((bx) this.f22564z0).K2.size(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public w1(b2 b2Var, Context context, int i7, i6 i6Var) {
        super(i7, context, i6Var, true);
        this.f22564z0 = b2Var;
    }

    public w1(zo0 zo0Var, Context context, i6 i6Var) {
        super(2131232699, context, i6Var, false);
        this.f22564z0 = zo0Var;
    }

    public w1(bx bxVar, Context context, i6 i6Var) {
        super(2131232699, context, i6Var, false);
        this.f22564z0 = bxVar;
    }

    public w1(PhotoViewer photoViewer, Context context, i6 i6Var) {
        super(2131232699, context, i6Var, false);
        this.f22564z0 = photoViewer;
    }
}
