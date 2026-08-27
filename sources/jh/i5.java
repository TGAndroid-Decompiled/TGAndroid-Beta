package jh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class i5 extends FrameLayout implements r0.n {

    public final d5.p f13448a;

    public final k5 f13449b;

    public i5(k5 k5Var, Context context) {
        super(context);
        this.f13449b = k5Var;
        this.f13448a = new d5.p();
    }

    @Override
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        k5 k5Var = this.f13449b;
        i9 i9Var = k5Var.f13583r;
        if (k5Var.f13586x > 0) {
            return;
        }
        float f10 = i9Var.f13465a0;
        float f11 = k5Var.f13579c;
        if (f10 >= f11 || i11 <= 0) {
            return;
        }
        float f12 = f10 + i11;
        iArr[1] = i11;
        if (f12 <= f11) {
            f11 = f12;
        }
        k5Var.setOffset(f11);
        i9Var.f13465a0 = f11;
        e4 currentPeerView = i9Var.f13487j0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        x8 x8Var = i9Var.v;
        if (x8Var != null) {
            x8Var.invalidate();
        }
    }

    @Override
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        k5 k5Var = this.f13449b;
        i9 i9Var = k5Var.f13583r;
        if (k5Var.f13586x <= 0 && i13 != 0 && i11 == 0) {
            float f10 = i9Var.f13465a0;
            float f11 = i13 + f10;
            if (f11 <= f10) {
                f10 = f11;
            }
            k5Var.setOffset(f10);
            i9Var.f13465a0 = f10;
            e4 currentPeerView = i9Var.f13487j0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            x8 x8Var = i9Var.v;
            if (x8Var != null) {
                x8Var.invalidate();
            }
        }
    }

    @Override
    public final void p(int i10, View view) {
        this.f13448a.f4821a = 0;
    }

    @Override
    public final boolean q(View view, View view2, int i10, int i11) {
        return this.f13449b.f13586x <= 0 && i10 == 2;
    }

    @Override
    public final void t(View view, View view2, int i10, int i11) {
        this.f13448a.f4821a = i10;
    }

    @Override
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
