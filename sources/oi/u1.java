package oi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.jg;
import org.telegram.ui.Components.po0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.yw;
public final class u1 extends jg {
    public final int f22025w0 = 1;
    public final Object f22026x0;

    public u1(v3 v3Var, Context context, e6 e6Var) {
        super(2131232695, context, e6Var, true);
        this.f22026x0 = v3Var;
    }

    @Override
    public boolean b() {
        switch (this.f22025w0) {
            case 0:
                return ((z1) this.f22026x0).q0();
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
        switch (this.f22025w0) {
            case 0:
                if (!((z1) this.f22026x0).M0 && this.f35992w <= 0) {
                    return false;
                }
                return true;
            case 1:
                if (!((v3) this.f22026x0).f22058a0 && this.f35992w <= 0) {
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
        int i7 = this.f22025w0;
        Object obj = this.f22026x0;
        switch (i7) {
            case 2:
                return j6.w0(j6.S5, ((po0) obj).J0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i10 = j6.f29098qg;
                Drawable[] drawableArr = PhotoViewer.Z8;
                return ((PhotoViewer) obj).w1(i10);
        }
    }

    @Override
    public boolean j() {
        switch (this.f22025w0) {
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
        switch (this.f22025w0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(hd.G(((yw) this.f22026x0).K2.size(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public u1(z1 z1Var, Context context, int i7, e6 e6Var) {
        super(i7, context, e6Var, true);
        this.f22026x0 = z1Var;
    }

    public u1(po0 po0Var, Context context, e6 e6Var) {
        super(2131232695, context, e6Var, false);
        this.f22026x0 = po0Var;
    }

    public u1(yw ywVar, Context context, e6 e6Var) {
        super(2131232695, context, e6Var, false);
        this.f22026x0 = ywVar;
    }

    public u1(PhotoViewer photoViewer, Context context, e6 e6Var) {
        super(2131232695, context, e6Var, false);
        this.f22026x0 = photoViewer;
    }
}
