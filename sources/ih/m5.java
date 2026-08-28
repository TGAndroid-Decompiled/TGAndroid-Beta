package ih;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class m5 extends FrameLayout implements r0.n {
    public final d5.p f11767a;
    public final o5 f11768b;

    public m5(o5 o5Var, Context context) {
        super(context);
        this.f11768b = o5Var;
        this.f11767a = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i9, int i10, int[] iArr, int i11) {
        o5 o5Var = this.f11768b;
        m9 m9Var = o5Var.f11896r;
        if (o5Var.f11899x <= 0) {
            float f10 = m9Var.f11784a0;
            float f11 = o5Var.f11892c;
            if (f10 < f11 && i10 > 0) {
                float f12 = f10 + i10;
                iArr[1] = i10;
                if (f12 <= f11) {
                    f11 = f12;
                }
                o5Var.setOffset(f11);
                m9Var.f11784a0 = f11;
                i4 currentPeerView = m9Var.f11806j0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                b9 b9Var = m9Var.v;
                if (b9Var != null) {
                    b9Var.invalidate();
                }
            }
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13, int[] iArr) {
        o5 o5Var = this.f11768b;
        m9 m9Var = o5Var.f11896r;
        if (o5Var.f11899x <= 0 && i12 != 0 && i10 == 0) {
            float f10 = m9Var.f11784a0;
            float f11 = i12 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            o5Var.setOffset(f10);
            m9Var.f11784a0 = f10;
            i4 currentPeerView = m9Var.f11806j0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            b9 b9Var = m9Var.v;
            if (b9Var != null) {
                b9Var.invalidate();
            }
        }
    }

    @Override
    public final void p(int i9, View view) {
        this.f11767a.f4376a = 0;
    }

    @Override
    public final boolean q(View view, View view2, int i9, int i10) {
        if (this.f11768b.f11899x <= 0 && i9 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void t(View view, View view2, int i9, int i10) {
        this.f11767a.f4376a = i9;
    }

    @Override
    public final void c(ViewGroup viewGroup, int i9, int i10, int i11, int i12, int i13) {
    }
}
