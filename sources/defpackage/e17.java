package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public abstract class e17 extends FrameLayout implements tjb {
    public TLRPC.User a;
    public l46 b;
    public pi4 c;
    public boolean d;
    public int e;

    @Override
    public final void onMeasure(int i, int i2) {
        l46 l46Var = this.b;
        pi4 pi4Var = this.c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i = View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(gl.L(36.0f), 1073741824);
        boolean z = true;
        this.d = true;
        if (pi4Var.getVisibility() != 0) {
            z = false;
        }
        l46Var.setVisibility(8);
        if (z) {
            pi4Var.setVisibility(8);
        }
        super.onMeasure(i, makeMeasureSpec);
        if (z) {
            pi4Var.getLayoutParams().width = getMeasuredWidth();
            pi4Var.setVisibility(0);
        }
        l46Var.setVisibility(0);
        l46Var.getLayoutParams().width = getMeasuredWidth() - gl.L(24.0f);
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
            int w0 = bkb.w0(null, bkb.H5, false);
            if (w0 != this.e) {
                this.e = w0;
                bkb.F1(getBackground(), w0, true);
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
