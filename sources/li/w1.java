package li;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.no0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.yw;
public final class w1 extends dg {
    public final int f18951n0 = 0;
    public final Object f18952o0;

    public w1(y3 y3Var, Context context, g6 g6Var) {
        super(2131232694, context, g6Var, true);
        this.f18952o0 = y3Var;
    }

    @Override
    public boolean b() {
        switch (this.f18951n0) {
            case 0:
                return ((b2) this.f18952o0).q0();
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
        switch (this.f18951n0) {
            case 0:
                if (!((b2) this.f18952o0).L0 && this.f32972r <= 0) {
                    return false;
                }
                return true;
            case 1:
                if (!((y3) this.f18952o0).W && this.f32972r <= 0) {
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
        int i7 = this.f18951n0;
        Object obj = this.f18952o0;
        switch (i7) {
            case 2:
                return l6.w0(l6.S5, ((no0) obj).I0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i10 = l6.f28056ng;
                Drawable[] drawableArr = PhotoViewer.Y8;
                return ((PhotoViewer) obj).w1(i10);
        }
    }

    @Override
    public boolean j() {
        switch (this.f18951n0) {
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
        switch (this.f18951n0) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(id.G(((yw) this.f18952o0).J2.size(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public w1(b2 b2Var, Context context, int i7, g6 g6Var) {
        super(i7, context, g6Var, true);
        this.f18952o0 = b2Var;
    }

    public w1(no0 no0Var, Context context, g6 g6Var) {
        super(2131232694, context, g6Var, false);
        this.f18952o0 = no0Var;
    }

    public w1(yw ywVar, Context context, g6 g6Var) {
        super(2131232694, context, g6Var, false);
        this.f18952o0 = ywVar;
    }

    public w1(PhotoViewer photoViewer, Context context, g6 g6Var) {
        super(2131232694, context, g6Var, false);
        this.f18952o0 = photoViewer;
    }
}
