package ci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
public final class z5 extends FrameLayout implements r0.m {
    public final b2.u0 f6177a;
    public final b6 f6178b;

    public z5(b6 b6Var, Context context) {
        super(context);
        this.f6178b = b6Var;
        this.f6177a = new Object();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        b6 b6Var = this.f6178b;
        z9 z9Var = b6Var.f5181r;
        if (b6Var.f5184x <= 0) {
            float f7 = z9Var.f6220e0;
            float f10 = b6Var.f5178c;
            if (f7 < f10 && i11 > 0) {
                float f11 = f7 + i11;
                iArr[1] = i11;
                if (f11 <= f10) {
                    f10 = f11;
                }
                b6Var.setOffset(f10);
                z9Var.f6220e0 = f10;
                p4 currentPeerView = z9Var.f6238n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                o9 o9Var = z9Var.v;
                if (o9Var != null) {
                    o9Var.invalidate();
                }
            }
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        b6 b6Var = this.f6178b;
        z9 z9Var = b6Var.f5181r;
        if (b6Var.f5184x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = z9Var.f6220e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            b6Var.setOffset(f7);
            z9Var.f6220e0 = f7;
            p4 currentPeerView = z9Var.f6238n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            o9 o9Var = z9Var.v;
            if (o9Var != null) {
                o9Var.invalidate();
            }
        }
    }

    @Override
    public final void n(int i10, View view) {
        this.f6177a.f4057a = 0;
    }

    @Override
    public final boolean p(View view, View view2, int i10, int i11) {
        if (this.f6178b.f5184x <= 0 && i10 == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final void s(View view, View view2, int i10, int i11) {
        this.f6177a.f4057a = i10;
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
