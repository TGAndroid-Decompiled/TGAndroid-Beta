package li;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ww;
public final class w1 extends dg {
    public final int f18951n0 = 0;
    public final Object f18952o0;

    public w1(y3 y3Var, Context context, f6 f6Var) {
        super(2131232694, context, f6Var, true);
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
                if (!((b2) this.f18952o0).L0 && this.f32902r <= 0) {
                    return false;
                }
                return true;
            case 1:
                if (!((y3) this.f18952o0).W && this.f32902r <= 0) {
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
                return k6.w0(k6.S5, ((mo0) obj).I0);
            case 3:
            default:
                return super.getFillColor();
            case 4:
                int i10 = k6.f28043ng;
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
                accessibilityNodeInfo.setText(id.G(((ww) this.f18952o0).I2.size(), "AccDescrShareInChats", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public w1(b2 b2Var, Context context, int i7, f6 f6Var) {
        super(i7, context, f6Var, true);
        this.f18952o0 = b2Var;
    }

    public w1(mo0 mo0Var, Context context, f6 f6Var) {
        super(2131232694, context, f6Var, false);
        this.f18952o0 = mo0Var;
    }

    public w1(ww wwVar, Context context, f6 f6Var) {
        super(2131232694, context, f6Var, false);
        this.f18952o0 = wwVar;
    }

    public w1(PhotoViewer photoViewer, Context context, f6 f6Var) {
        super(2131232694, context, f6Var, false);
        this.f18952o0 = photoViewer;
    }
}
