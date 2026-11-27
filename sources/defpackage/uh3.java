package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class uh3 extends x46 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final tj3 L;
    public final uj3 M;

    public uh3(uj3 uj3Var, tj3 tj3Var) {
        this.M = uj3Var;
        this.L = tj3Var;
    }

    @Override
    public final int Q0() {
        tj3 tj3Var = this.L;
        if (tj3Var.s == 0 && this.M.y3() && tj3Var.w == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void a0(oh2 oh2Var, c89 c89Var) {
        boolean z = f11.a;
        try {
            super.a0(oh2Var, c89Var);
        } catch (IndexOutOfBoundsException e) {
            cc4.g(e, true);
            hl.c3(new th3(this.L, (byte) 0));
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
        tj3 tj3Var = this.L;
        if (tj3Var.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.U, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new lk(this, tj3Var, (byte) 13));
            this.K.addListener(new cn2(this, (byte) 7));
            this.K.setDuration(200L);
            this.K.setInterpolator(k43.f);
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
    public final int n0(int r23, defpackage.oh2 r24, defpackage.c89 r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh3.n0(int, oh2, c89):int");
    }

    @Override
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        if (this.M.y3() && i == 1) {
            super.u0(recyclerView, c89Var, i);
            return;
        }
        z46 z46Var = new z46(recyclerView.getContext(), 0);
        z46Var.a = i;
        v0(z46Var);
    }
}
