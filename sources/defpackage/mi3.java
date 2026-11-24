package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class mi3 extends u46 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final mk3 L;
    public final nk3 M;

    public mi3(nk3 nk3Var, mk3 mk3Var) {
        this.M = nk3Var;
        this.L = mk3Var;
    }

    @Override
    public final int Q0() {
        mk3 mk3Var = this.L;
        if (mk3Var.s == 0 && this.M.y3() && mk3Var.w == 2) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void a0(ki2 ki2Var, r69 r69Var) {
        boolean z = e21.a;
        try {
            super.a0(ki2Var, r69Var);
        } catch (IndexOutOfBoundsException e) {
            fc4.g(e, true);
            gm.c3(new li3(this.L, (byte) 0));
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
        mk3 mk3Var = this.L;
        if (mk3Var.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.U, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new pl(this, mk3Var, (byte) 13));
            this.K.addListener(new kh2(this, (byte) 9));
            this.K.setDuration(200L);
            this.K.setInterpolator(d53.f);
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
    public final int n0(int r23, defpackage.ki2 r24, defpackage.r69 r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mi3.n0(int, ki2, r69):int");
    }

    @Override
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        if (this.M.y3() && i == 1) {
            super.u0(recyclerView, r69Var, i);
            return;
        }
        w46 w46Var = new w46(recyclerView.getContext(), 0);
        w46Var.a = i;
        v0(w46Var);
    }
}
