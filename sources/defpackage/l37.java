package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class l37 extends FrameLayout implements snb {
    public TLRPC.User a;
    public p66 b;
    public tk4 c;
    public boolean d;
    public int e;

    @Override
    public final void onMeasure(int i, int i2) {
        p66 p66Var = this.b;
        tk4 tk4Var = this.c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(hl.L(36.0f), 1073741824);
        boolean z = true;
        this.d = true;
        if (tk4Var.getVisibility() != 0) {
            z = false;
        }
        p66Var.setVisibility(8);
        if (z) {
            tk4Var.setVisibility(8);
        }
        super.onMeasure(i, makeMeasureSpec);
        if (z) {
            tk4Var.getLayoutParams().width = getMeasuredWidth();
            tk4Var.setVisibility(0);
        }
        p66Var.setVisibility(0);
        p66Var.getLayoutParams().width = getMeasuredWidth() - hl.L(24.0f);
        this.d = false;
        super.onMeasure(i, makeMeasureSpec);
    }

    @Override
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void updateColors() {
        try {
            int w0 = aob.w0(null, aob.I5, false);
            if (w0 != this.e) {
                this.e = w0;
                aob.F1(getBackground(), w0, true);
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
