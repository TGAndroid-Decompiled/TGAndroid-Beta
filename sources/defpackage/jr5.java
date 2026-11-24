package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public class jr5 extends x7c implements gk7 {
    public final vf6 N1;
    public final ir5 O1;
    public final xc P1;
    public final fr5 Q1;
    public int R1;
    public int S1;
    public int T1;
    public int U1;
    public int V1;
    public int W1;
    public AnimatorSet X1;
    public final ArrayList Y1;
    public final vf6 Z1;
    public boolean a2;
    public float b2;
    public ValueAnimator c2;
    public ya5 d2;
    public int e2;
    public ka5 f2;
    public vu2 g2;
    public ArrayList h2;
    public int i2;
    public final float j2;
    public final d k2;
    public final g6 l2;
    public int m2;
    public final un4 n2;
    public int o2;
    public final long p2;
    public boolean q2;
    public float r2;
    public boolean s2;
    public TLRPC.TL_chatInviteExported t2;

    public jr5(Context context, int i, vf6 vf6Var, long j, d dVar, wjb wjbVar) {
        super(i, wjbVar, context);
        this.Y1 = new ArrayList();
        this.Z1 = new vf6();
        this.b2 = 0.0f;
        this.l2 = new g6(this, (byte) 7);
        this.N1 = vf6Var;
        this.A1 = false;
        this.k2 = dVar;
        this.p2 = j;
        K();
        this.v1.K.setHint(k96.M0(2131745578, null));
        this.j2 = ViewConfiguration.get(context).getScaledTouchSlop();
        fr5 fr5Var = new fr5(this);
        this.Q1 = fr5Var;
        this.o1 = fr5Var;
        ns9 ns9Var = this.n1;
        dr5 dr5Var = new dr5(this);
        this.p1 = dr5Var;
        ns9Var.setAdapter(dr5Var);
        this.t1.e(false, false);
        this.t1.setVisibility(8);
        ArrayList arrayList = qu2.r(i).f0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC.User V1 = na7.q1(this.a).V1(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i2)).user_id));
            if (V1 != null && !V1.self && !V1.deleted) {
                this.Y1.add(V1);
            }
        }
        ir5 ir5Var = new ir5(this, context);
        this.O1 = ir5Var;
        this.n1.setOnItemClickListener(new gg1(this, j, dVar, vf6Var, context));
        ns9 ns9Var2 = this.n1;
        gb3 gb3Var = new gb3();
        gb3Var.o = s33.f;
        gb3Var.e = (short) 150;
        gb3Var.c = (short) 150;
        gb3Var.d = (short) 150;
        this.f0 = false;
        ns9Var2.setItemAnimator(gb3Var);
        O0();
        xc xcVar = new xc(this, context, (byte) 2);
        this.P1 = xcVar;
        xcVar.setVisibility(8);
        xcVar.setClipChildren(false);
        xcVar.addView(ir5Var);
        this.b.addView(xcVar);
        un4 un4Var = new un4(wjbVar, context, false);
        this.n2 = un4Var;
        un4Var.setImageResource(2131231198);
        un4Var.setOnClickListener(new fg(this, context, j, (byte) 4));
        un4Var.e(false, false);
        un4Var.setContentDescription(k96.M0(2131748058, null));
        this.b.addView(un4Var, un4.b());
        ((ViewGroup.MarginLayoutParams) this.t1.getLayoutParams()).topMargin = gl.L(20.0f);
        ((ViewGroup.MarginLayoutParams) this.t1.getLayoutParams()).leftMargin = gl.L(4.0f);
        ((ViewGroup.MarginLayoutParams) this.t1.getLayoutParams()).rightMargin = gl.L(4.0f);
    }

    @Override
    public final v7c D0(Context context) {
        return new br5(this, context);
    }

    @Override
    public final void E0(MotionEvent motionEvent, l7 l7Var) {
        d dVar;
        long j;
        if (motionEvent.getAction() == 0) {
            this.r2 = this.x1;
        } else if (motionEvent.getAction() == 1 && Math.abs(this.x1 - this.r2) < this.j2 && !this.q2) {
            Activity W = gl.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                dVar = (d) launchActivity.N().getFragmentStack().get(launchActivity.N().getFragmentStack().size() - 1);
            } else {
                dVar = null;
            }
            if (dVar instanceof mu1) {
                boolean U9 = ((mu1) dVar).U9();
                this.q2 = true;
                hb5 hb5Var = new hb5(this, l7Var, (byte) 15);
                if (U9) {
                    j = 200;
                } else {
                    j = 0;
                }
                gl.d3(hb5Var, j);
                return;
            }
            this.q2 = true;
            v0(true);
            l7Var.requestFocus();
            gl.c3(new ar5(l7Var, (byte) 0));
        }
    }

    @Override
    public final void G0(String str) {
        fr5 fr5Var = this.Q1;
        if (fr5Var.h != null) {
            Utilities.g.a(fr5Var.h);
            fr5Var.h = null;
        }
        fr5Var.c.clear();
        fr5Var.d.clear();
        fr5Var.e.f(null, null);
        fr5Var.e.g(null, true, false, false, false, 0L, false, 0, 0);
        fr5Var.f();
        boolean isEmpty = TextUtils.isEmpty(str);
        ns9 ns9Var = fr5Var.n.n1;
        if (!isEmpty) {
            w39 adapter = ns9Var.getAdapter();
            jr5 jr5Var = fr5Var.n;
            n39 n39Var = jr5Var.o1;
            if (adapter != n39Var) {
                jr5Var.n1.setAdapter(n39Var);
            }
            fr5Var.n.t1.e(true, false);
            co3 co3Var = Utilities.g;
            er5 er5Var = new er5(fr5Var, str, (byte) 0);
            fr5Var.h = er5Var;
            co3Var.d(er5Var, 300L);
            return;
        }
        w39 adapter2 = ns9Var.getAdapter();
        jr5 jr5Var2 = fr5Var.n;
        n39 n39Var2 = jr5Var2.p1;
        if (adapter2 != n39Var2) {
            jr5Var2.n1.setAdapter(n39Var2);
        }
    }

    @Override
    public final void I() {
        super.I();
        if (this.q2) {
            Activity W = gl.W(getContext());
            if (W instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) W;
                d dVar = (d) launchActivity.N().getFragmentStack().get(launchActivity.N().getFragmentStack().size() - 1);
                if (dVar instanceof mu1) {
                    ((mu1) dVar).Y9(true, true);
                }
            }
        }
    }

    public boolean M0() {
        return true;
    }

    public final void N0(boolean z) {
        boolean z2;
        boolean z3 = true;
        if (this.Z1.m() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.a2 != z2) {
            ValueAnimator valueAnimator = this.c2;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.c2.cancel();
            }
            this.a2 = z2;
            xc xcVar = this.P1;
            if (z2) {
                xcVar.setVisibility(0);
            }
            float f = 0.0f;
            if (z) {
                float f2 = this.b2;
                if (z2) {
                    f = 1.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                this.c2 = ofFloat;
                ofFloat.addUpdateListener(new ni4(this, (byte) 11));
                this.c2.addListener(new id4((byte) 9, this, z2));
                this.c2.setDuration(150L);
                this.c2.start();
            } else {
                if (z2) {
                    f = 1.0f;
                }
                this.b2 = f;
                this.b.invalidate();
                if (!z2) {
                    xcVar.setVisibility(8);
                }
            }
            if (!this.a2 && this.g2 == null) {
                z3 = false;
            }
            this.n2.e(z3, z);
        }
    }

    public final void O0() {
        int i;
        this.S1 = -1;
        this.T1 = -1;
        this.R1 = -1;
        this.U1 = -1;
        boolean z = true;
        this.W1 = 1;
        if (this.g2 == null) {
            na7 q1 = na7.q1(this.a);
            long j = this.p2;
            TLRPC.Chat K0 = q1.K0(Long.valueOf(j));
            TLRPC.ChatFull L0 = na7.q1(this.a).L0(j);
            if ((K0 == null || TextUtils.isEmpty(hc2.K(K0, false))) && (L0 == null || L0.exported_invite == null)) {
                z = M0();
            }
            if (z) {
                int i2 = this.W1;
                this.W1 = i2 + 1;
                this.R1 = i2;
            }
            ArrayList arrayList = this.Y1;
            int size = arrayList.size();
            int i3 = this.W1;
            if (size != 0) {
                this.S1 = i3;
                i = arrayList.size() + i3;
                this.W1 = i;
                this.T1 = i;
            } else {
                i = i3 + 1;
                this.W1 = i;
                this.U1 = i3;
            }
        } else {
            int size2 = this.h2.size();
            int i4 = this.W1;
            if (size2 != 0) {
                this.S1 = i4;
                i = this.h2.size() + i4;
                this.W1 = i;
                this.T1 = i;
            } else {
                i = i4 + 1;
                this.W1 = i;
                this.U1 = i4;
            }
        }
        this.W1 = i + 1;
        this.V1 = i;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.r && this.g2 != null && this.h2.isEmpty()) {
            this.h2 = new ArrayList(na7.q1(this.a).F);
            this.p1.f();
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        kk7.f(this.a).n(this, kk7.r);
    }
}
