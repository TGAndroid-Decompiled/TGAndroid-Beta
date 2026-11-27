package defpackage;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class nz1 extends xbc {
    public final int N1;
    public final t07 O1;
    public final tk4 P1;
    public final z2b Q1;
    public final z2b R1;
    public float S1;
    public boolean T1;
    public int U1;
    public final pz1 V1;

    public nz1(pz1 pz1Var, e eVar, long j) {
        super(eVar.getCurrentAccount(), eVar.getResourceProvider(), eVar.getParentActivity());
        this.V1 = pz1Var;
        this.N1 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        int i = aob.a7;
        s0(aob.v0(i, this.J0));
        this.F1 = i;
        this.E1 = i;
        I0(0.0f);
        L(i);
        this.A1 = false;
        this.B1 = false;
        t07 t07Var = new t07(this, eVar, this.c, j);
        this.O1 = t07Var;
        t07Var.B = false;
        this.q0 = (byte) 75;
        this.v1.L.setHint(ob6.M0(2131745486, null));
        x07 x07Var = t07Var.f;
        this.p1 = x07Var;
        this.o1 = x07Var;
        this.n1.setAdapter(x07Var);
        this.n1.s1();
        gw9 gw9Var = this.n1;
        t07Var.p = gw9Var;
        gw9Var.setOnItemClickListener(new zg4(t07Var, (byte) 10));
        v79 onScrollListener = gw9Var.getOnScrollListener();
        if (onScrollListener == null) {
            gw9Var.setOnScrollListener(t07Var.D);
        } else {
            gw9Var.setOnScrollListener(new bj1(t07Var, onScrollListener, (byte) 5));
        }
        int indexOfChild = ((ViewGroup) this.n1.getParent()).indexOfChild(this.n1);
        tk4 b = t07Var.b();
        this.P1 = b;
        this.b.addView(b, indexOfChild, tre.c(-1.0f, -1));
        z2b a = t07Var.a();
        this.Q1 = a;
        this.b.addView(a, indexOfChild, tre.c(-1.0f, -1));
        z2b c = t07Var.c();
        this.R1 = c;
        this.b.addView(c, indexOfChild, tre.c(-1.0f, -1));
        t07Var.e();
    }

    @Override
    public final void F0(MotionEvent motionEvent, m7 m7Var) {
        e eVar;
        long j;
        int action = motionEvent.getAction();
        t07 t07Var = this.O1;
        if (action == 0) {
            this.S1 = this.x1;
            t07Var.i(false);
        } else if (motionEvent.getAction() == 1 && Math.abs(this.x1 - this.S1) < this.N1 && !this.T1) {
            Activity W = hl.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                eVar = (e) launchActivity.N().getFragmentStack().get(launchActivity.N().getFragmentStack().size() - 1);
            } else {
                eVar = null;
            }
            if (eVar instanceof zu1) {
                boolean fa = ((zu1) eVar).fa();
                this.T1 = true;
                mn6 mn6Var = new mn6(this, m7Var, (byte) 15);
                if (fa) {
                    j = 200;
                } else {
                    j = 0;
                }
                hl.d3(mn6Var, j);
            } else {
                this.T1 = true;
                w0(true);
                m7Var.requestFocus();
                hl.c3(new ct5(m7Var, (byte) 2));
            }
        }
        if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            return;
        }
        t07Var.i(true);
    }

    @Override
    public final void H0(String str) {
        this.O1.j(str);
    }

    @Override
    public final void J0(int i) {
        super.J0(i);
        this.P1.setTranslationY(this.m1.getMeasuredHeight() + i);
        float f = i;
        this.Q1.setTranslationY(f);
        this.R1.setTranslationY(f);
    }

    @Override
    public final void M0() {
        int i;
        gw9 gw9Var = this.n1;
        if (gw9Var.getChildCount() <= 0) {
            if (gw9Var.getVisibility() == 0) {
                i = gw9Var.getPaddingTop() - hl.L(8.0f);
            } else {
                i = 0;
            }
            if (this.x1 != i) {
                this.x1 = i;
                J0(i);
                return;
            }
            return;
        }
        super.M0();
    }

    @Override
    public final void dismiss() {
        pz1 pz1Var = this.V1;
        nz1 nz1Var = pz1Var.i;
        if (nz1Var != null && !nz1Var.O1.b) {
            pz1Var.i = null;
        }
        super.dismiss();
    }

    @Override
    public final void onBackPressed() {
        d17 d17Var = this.O1.s;
        if (d17Var != null) {
            d17Var.e(false);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void p0() {
        super.p0();
        int v0 = aob.v0(aob.a7, this.J0);
        if (v0 != this.U1) {
            this.U1 = v0;
            s0(v0);
        }
    }

    @Override
    public final void show() {
        t07 t07Var = this.O1;
        if (t07Var.b && this.x1 == 0) {
            this.x1 = hl.L(8.0f);
        }
        super.show();
        t07Var.b = false;
    }
}
