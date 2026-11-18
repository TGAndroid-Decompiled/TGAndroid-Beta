package oi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cx;
public final class u1 extends sg {
    public final int f22384y0 = 1;
    public final Object f22385z0;

    public u1(x3 x3Var, Context context, i6 i6Var) {
        super(2131232696, context, i6Var, true);
        this.f22385z0 = x3Var;
    }

    @Override
    public boolean b() {
        switch (this.f22384y0) {
            case 0:
                return ((z1) this.f22385z0).q0();
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
        switch (this.f22384y0) {
            case 0:
                if (!((z1) this.f22385z0).M0 && this.f39647w <= 0) {
                    return false;
                }
                return true;
            case 1:
                if (!((x3) this.f22385z0).f22456a0 && this.f39647w <= 0) {
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
        int i7 = this.f22384y0;
        Object obj = this.f22385z0;
        switch (i7) {
            case 2:
                return n6.w0(n6.S5, ((yo0) obj).J0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i10 = n6.f29643qg;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return ((PhotoViewer) obj).w1(i10);
        }
    }

    @Override
    public boolean j() {
        switch (this.f22384y0) {
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
        switch (this.f22384y0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(gd.G(((cx) this.f22385z0).K2.size(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public u1(z1 z1Var, Context context, int i7, i6 i6Var) {
        super(i7, context, i6Var, true);
        this.f22385z0 = z1Var;
    }

    public u1(yo0 yo0Var, Context context, i6 i6Var) {
        super(2131232696, context, i6Var, false);
        this.f22385z0 = yo0Var;
    }

    public u1(cx cxVar, Context context, i6 i6Var) {
        super(2131232696, context, i6Var, false);
        this.f22385z0 = cxVar;
    }

    public u1(PhotoViewer photoViewer, Context context, i6 i6Var) {
        super(2131232696, context, i6Var, false);
        this.f22385z0 = photoViewer;
    }
}
