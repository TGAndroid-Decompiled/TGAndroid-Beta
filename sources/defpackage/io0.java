package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class io0 extends FrameLayout {
    public final lo0 a;

    public io0(lo0 lo0Var, Activity activity) {
        super(activity);
        this.a = lo0Var;
        setWillNotDraw(false);
        jo0 jo0Var = new jo0(lo0Var, getContext());
        jo0 jo0Var2 = new jo0(lo0Var, getContext());
        jo0 jo0Var3 = new jo0(lo0Var, getContext());
        jo0Var.c(2131231085, k96.M0(2131753661, null));
        jo0Var2.c(2131231118, k96.M0(2131749378, null));
        jo0Var3.c(2131231128, k96.M0(2131750818, null));
        jo0Var.setOnClickListener(new View.OnClickListener(this) {
            public final io0 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                wjb wjbVar;
                byte b = r2;
                io0 io0Var = this.b;
                switch (b) {
                    case 0:
                        lo0 lo0Var2 = io0Var.a;
                        long j = lo0Var2.S;
                        ng1 ng1Var = lo0Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = lo0Var2.U;
                        int i = h26.R2;
                        if (ng1Var != null && tL_premium_boostsStatus != null && lo0Var2.getParentActivity() != null) {
                            h26 h26Var = new h26(19, lo0Var2.getCurrentAccount(), lo0Var2.getResourceProvider(), lo0Var2.getParentActivity(), lo0Var2);
                            h26Var.r1(ng1Var);
                            h26Var.q1(tL_premium_boostsStatus, true);
                            h26Var.s1(j);
                            h26Var.b2 = null;
                            lo0Var2.showDialog(h26Var);
                            return;
                        }
                        return;
                    case 1:
                        lo0 lo0Var3 = io0Var.a;
                        lo0Var3.x0(true);
                        long j2 = lo0Var3.S;
                        wjbVar = ((d) lo0Var3).resourceProvider;
                        dn0.D0(lo0Var3, wjbVar, j2, null);
                        dn0.o1.I0 = new n1(io0Var, (byte) 5);
                        return;
                    default:
                        lo0 lo0Var4 = io0Var.a;
                        h26 h26Var2 = new h26(31, lo0Var4.T, lo0Var4.getResourceProvider(), io0Var.getContext(), lo0Var4);
                        h26Var2.q1(lo0Var4.U, true);
                        h26Var2.s1(lo0Var4.S);
                        lo0Var4.showDialog(h26Var2);
                        return;
                }
            }
        });
        jo0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final io0 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                wjb wjbVar;
                byte b = r2;
                io0 io0Var = this.b;
                switch (b) {
                    case 0:
                        lo0 lo0Var2 = io0Var.a;
                        long j = lo0Var2.S;
                        ng1 ng1Var = lo0Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = lo0Var2.U;
                        int i = h26.R2;
                        if (ng1Var != null && tL_premium_boostsStatus != null && lo0Var2.getParentActivity() != null) {
                            h26 h26Var = new h26(19, lo0Var2.getCurrentAccount(), lo0Var2.getResourceProvider(), lo0Var2.getParentActivity(), lo0Var2);
                            h26Var.r1(ng1Var);
                            h26Var.q1(tL_premium_boostsStatus, true);
                            h26Var.s1(j);
                            h26Var.b2 = null;
                            lo0Var2.showDialog(h26Var);
                            return;
                        }
                        return;
                    case 1:
                        lo0 lo0Var3 = io0Var.a;
                        lo0Var3.x0(true);
                        long j2 = lo0Var3.S;
                        wjbVar = ((d) lo0Var3).resourceProvider;
                        dn0.D0(lo0Var3, wjbVar, j2, null);
                        dn0.o1.I0 = new n1(io0Var, (byte) 5);
                        return;
                    default:
                        lo0 lo0Var4 = io0Var.a;
                        h26 h26Var2 = new h26(31, lo0Var4.T, lo0Var4.getResourceProvider(), io0Var.getContext(), lo0Var4);
                        h26Var2.q1(lo0Var4.U, true);
                        h26Var2.s1(lo0Var4.S);
                        lo0Var4.showDialog(h26Var2);
                        return;
                }
            }
        });
        jo0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final io0 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                wjb wjbVar;
                byte b = r2;
                io0 io0Var = this.b;
                switch (b) {
                    case 0:
                        lo0 lo0Var2 = io0Var.a;
                        long j = lo0Var2.S;
                        ng1 ng1Var = lo0Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = lo0Var2.U;
                        int i = h26.R2;
                        if (ng1Var != null && tL_premium_boostsStatus != null && lo0Var2.getParentActivity() != null) {
                            h26 h26Var = new h26(19, lo0Var2.getCurrentAccount(), lo0Var2.getResourceProvider(), lo0Var2.getParentActivity(), lo0Var2);
                            h26Var.r1(ng1Var);
                            h26Var.q1(tL_premium_boostsStatus, true);
                            h26Var.s1(j);
                            h26Var.b2 = null;
                            lo0Var2.showDialog(h26Var);
                            return;
                        }
                        return;
                    case 1:
                        lo0 lo0Var3 = io0Var.a;
                        lo0Var3.x0(true);
                        long j2 = lo0Var3.S;
                        wjbVar = ((d) lo0Var3).resourceProvider;
                        dn0.D0(lo0Var3, wjbVar, j2, null);
                        dn0.o1.I0 = new n1(io0Var, (byte) 5);
                        return;
                    default:
                        lo0 lo0Var4 = io0Var.a;
                        h26 h26Var2 = new h26(31, lo0Var4.T, lo0Var4.getResourceProvider(), io0Var.getContext(), lo0Var4);
                        h26Var2.q1(lo0Var4.U, true);
                        h26Var2.s1(lo0Var4.S);
                        lo0Var4.showDialog(h26Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(jo0Var, nme.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (na7.q1(lo0Var.T).k4.O1.f && hc2.N(lo0Var.j0)) {
            linearLayout.addView(jo0Var2, nme.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(jo0Var3, nme.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, nme.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
