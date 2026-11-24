package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class ah3 extends t26 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final bj3 L;
    public final cj3 M;

    public ah3(cj3 cj3Var, bj3 bj3Var) {
        this.M = cj3Var;
        this.L = bj3Var;
    }

    @Override
    public final int Q0() {
        bj3 bj3Var = this.L;
        if (bj3Var.s == 0 && this.M.w3() && bj3Var.w == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void a0(wg2 wg2Var, p49 p49Var) {
        boolean z = w01.a;
        try {
            super.a0(wg2Var, p49Var);
        } catch (IndexOutOfBoundsException e) {
            fa4.g(e, true);
            gl.d3(new zg3(this.L, (byte) 0));
        }
    }

    @Override
    public final void a1(View view, View view2, int i, int i2) {
        this.I = true;
        super.a1(view, view2, i, i2);
        this.I = false;
    }

    @Override
    public final void e0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        bj3 bj3Var = this.L;
        if (bj3Var.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.U, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new pk(this, bj3Var, (byte) 13));
            this.K.addListener(new im2(this, (byte) 7));
            this.K.setDuration(200L);
            this.K.setInterpolator(s33.f);
            this.K.start();
        }
    }

    @Override
    public final void g1(int i, int i2) {
        if (this.I) {
            i2 -= this.L.a.getPaddingTop();
        }
        super.g1(i, i2);
    }

    @Override
    public final int n0(int r23, defpackage.wg2 r24, defpackage.p49 r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah3.n0(int, wg2, p49):int");
    }

    @Override
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        if (this.M.w3() && i == 1) {
            super.u0(recyclerView, p49Var, i);
            return;
        }
        v26 v26Var = new v26(recyclerView.getContext(), 0);
        v26Var.a = i;
        v0(v26Var);
    }
}
