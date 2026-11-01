package oh;

import ag.b1;
import ag.y0;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import bi.t3;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.n0;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;
import s4.s0;
import w7.b6;
public final class c extends f61 {
    public final int K1;
    public final o90 L1;
    public final zz M1;
    public final ew0 N1;
    public final ew0 O1;
    public float P1;
    public boolean Q1;
    public int R1;
    public final e S1;

    public c(e eVar, k2 k2Var, long j10) {
        super(k2Var.getCurrentAccount(), k2Var.getParentActivity(), k2Var.getResourceProvider());
        this.S1 = eVar;
        this.K1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i10 = t6.f20873a7;
        v0(t6.w0(i10, this.I0));
        this.C1 = i10;
        this.B1 = i10;
        M0(0.0f);
        Q(i10);
        this.f26100x1 = false;
        this.f26101y1 = false;
        o90 o90Var = new o90(this, k2Var, this.f21590c, j10);
        this.L1 = o90Var;
        o90Var.B = false;
        this.f21610p0 = 75;
        this.f26095s1.J.setHint(dd.L0(2131745775, null));
        j jVar = o90Var.f14296f;
        this.f26089m1 = jVar;
        this.l1 = jVar;
        this.f26088k1.setAdapter(jVar);
        this.f26088k1.r1();
        b1 b1Var = this.f26088k1;
        o90Var.f14305p = b1Var;
        b1Var.setOnItemClickListener(new y0(o90Var, 8));
        s0 onScrollListener = b1Var.getOnScrollListener();
        if (onScrollListener == null) {
            b1Var.setOnScrollListener(o90Var.D);
        } else {
            b1Var.setOnScrollListener(new t3(2, o90Var, onScrollListener));
        }
        int indexOfChild = ((ViewGroup) this.f26088k1.getParent()).indexOfChild(this.f26088k1);
        zz b10 = o90Var.b();
        this.M1 = b10;
        this.f21587b.addView(b10, indexOfChild, b6.c(-1.0f, -1));
        ew0 a2 = o90Var.a();
        this.N1 = a2;
        this.f21587b.addView(a2, indexOfChild, b6.c(-1.0f, -1));
        ew0 c10 = o90Var.c();
        this.O1 = c10;
        this.f21587b.addView(c10, indexOfChild, b6.c(-1.0f, -1));
        o90Var.e();
    }

    @Override
    public final void J0(MotionEvent motionEvent, n0 n0Var) {
        k2 k2Var;
        long j10;
        int action = motionEvent.getAction();
        o90 o90Var = this.L1;
        if (action == 0) {
            this.P1 = this.f26097u1;
            o90Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.f26097u1 - this.P1) < this.K1 && !this.Q1) {
            Activity W = i0.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                k2Var = (k2) launchActivity.M().getFragmentStack().get(launchActivity.M().getFragmentStack().size() - 1);
            } else {
                k2Var = null;
            }
            if (k2Var instanceof un) {
                boolean ka2 = ((un) k2Var).ka();
                this.Q1 = true;
                at atVar = new at(24, this, n0Var);
                if (ka2) {
                    j10 = 200;
                } else {
                    j10 = 0;
                }
                i0.h3(atVar, j10);
            } else {
                this.Q1 = true;
                A0(true);
                n0Var.requestFocus();
                i0.g3(new ot(n0Var, 5));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        o90Var.i(true);
    }

    @Override
    public final void L0(String str) {
        this.L1.j(str);
    }

    @Override
    public final void N0(int i10) {
        super.N0(i10);
        this.M1.setTranslationY(this.f26087j1.getMeasuredHeight() + i10);
        float f7 = i10;
        this.N1.setTranslationY(f7);
        this.O1.setTranslationY(f7);
    }

    @Override
    public final void Q0() {
        int i10;
        b1 b1Var = this.f26088k1;
        if (b1Var.getChildCount() <= 0) {
            if (b1Var.getVisibility() == 0) {
                i10 = b1Var.getPaddingTop() - i0.L(8.0f);
            } else {
                i10 = 0;
            }
            if (this.f26097u1 != i10) {
                this.f26097u1 = i10;
                N0(i10);
                return;
            }
            return;
        }
        super.Q0();
    }

    @Override
    public final void dismiss() {
        e eVar = this.S1;
        c cVar = eVar.f14253i;
        if (cVar != null && !cVar.L1.f14294b) {
            eVar.f14253i = null;
        }
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        p pVar = this.L1.f14308s;
        if (pVar != null) {
            pVar.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void s0() {
        super.s0();
        int w02 = t6.w0(t6.f20873a7, this.I0);
        if (w02 != this.R1) {
            this.R1 = w02;
            v0(w02);
        }
    }

    @Override
    public final void show() {
        o90 o90Var = this.L1;
        if (o90Var.f14294b && this.f26097u1 == 0) {
            this.f26097u1 = i0.L(8.0f);
        }
        super.show();
        o90Var.f14294b = false;
    }
}
