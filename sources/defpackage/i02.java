package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class i02 extends y9c {
    public final int N1;
    public final m07 O1;
    public final tk4 P1;
    public final a1b Q1;
    public final a1b R1;
    public float S1;
    public boolean T1;
    public int U1;
    public final k02 V1;

    public i02(k02 k02Var, d dVar, long j) {
        super(dVar.getCurrentAccount(), dVar.getResourceProvider(), dVar.getParentActivity());
        this.V1 = k02Var;
        this.N1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i = cmb.Z6;
        s0(cmb.v0(i, this.J0));
        this.F1 = i;
        this.E1 = i;
        H0(0.0f);
        L(i);
        this.A1 = false;
        this.B1 = false;
        m07 m07Var = new m07(this, dVar, this.c, j);
        this.O1 = m07Var;
        m07Var.B = false;
        this.q0 = (byte) 75;
        this.v1.K.setHint(jb6.M0(2131745492, null));
        q07 q07Var = m07Var.f;
        this.p1 = q07Var;
        this.o1 = q07Var;
        this.n1.setAdapter(q07Var);
        this.n1.r1();
        pu9 pu9Var = this.n1;
        m07Var.p = pu9Var;
        pu9Var.setOnItemClickListener(new kg4(m07Var, (byte) 11));
        k69 onScrollListener = pu9Var.getOnScrollListener();
        if (onScrollListener == null) {
            pu9Var.setOnScrollListener(m07Var.D);
        } else {
            pu9Var.setOnScrollListener(new bk1(m07Var, onScrollListener, (byte) 5));
        }
        int indexOfChild = ((ViewGroup) this.n1.getParent()).indexOfChild(this.n1);
        tk4 b = m07Var.b();
        this.P1 = b;
        this.b.addView(b, indexOfChild, qoe.c(-1.0f, -1));
        a1b a = m07Var.a();
        this.Q1 = a;
        this.b.addView(a, indexOfChild, qoe.c(-1.0f, -1));
        a1b c = m07Var.c();
        this.R1 = c;
        this.b.addView(c, indexOfChild, qoe.c(-1.0f, -1));
        m07Var.e();
    }

    @Override
    public final void E0(MotionEvent motionEvent, l7 l7Var) {
        d dVar;
        long j;
        int action = motionEvent.getAction();
        m07 m07Var = this.O1;
        if (action == 0) {
            this.S1 = this.x1;
            m07Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.x1 - this.S1) < this.N1 && !this.T1) {
            Activity W = gm.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                dVar = (d) launchActivity.N().getFragmentStack().get(launchActivity.N().getFragmentStack().size() - 1);
            } else {
                dVar = null;
            }
            if (dVar instanceof yv1) {
                boolean ea = ((yv1) dVar).ea();
                this.T1 = true;
                lj6 lj6Var = new lj6(this, l7Var, (byte) 19);
                if (ea) {
                    j = 200;
                } else {
                    j = 0;
                }
                gm.d3(lj6Var, j);
            } else {
                this.T1 = true;
                v0(true);
                l7Var.requestFocus();
                gm.c3(new ys5(l7Var, (byte) 2));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        m07Var.i(true);
    }

    @Override
    public final void G0(String str) {
        this.O1.j(str);
    }

    @Override
    public final void I0(int i) {
        super.I0(i);
        this.P1.setTranslationY(this.m1.getMeasuredHeight() + i);
        float f = i;
        this.Q1.setTranslationY(f);
        this.R1.setTranslationY(f);
    }

    @Override
    public final void L0() {
        int i;
        pu9 pu9Var = this.n1;
        if (pu9Var.getChildCount() <= 0) {
            if (pu9Var.getVisibility() == 0) {
                i = pu9Var.getPaddingTop() - gm.L(8.0f);
            } else {
                i = 0;
            }
            if (this.x1 != i) {
                this.x1 = i;
                I0(i);
                return;
            }
            return;
        }
        super.L0();
    }

    @Override
    public final void dismiss() {
        k02 k02Var = this.V1;
        i02 i02Var = k02Var.i;
        if (i02Var != null && !i02Var.O1.b) {
            k02Var.i = null;
        }
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        w07 w07Var = this.O1.s;
        if (w07Var != null) {
            w07Var.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void p0() {
        super.p0();
        int v0 = cmb.v0(cmb.Z6, this.J0);
        if (v0 != this.U1) {
            this.U1 = v0;
            s0(v0);
        }
    }

    @Override
    public final void show() {
        m07 m07Var = this.O1;
        if (m07Var.b && this.x1 == 0) {
            this.x1 = gm.L(8.0f);
        }
        super.show();
        m07Var.b = false;
    }
}
