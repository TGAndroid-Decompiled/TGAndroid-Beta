package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public final class ip0 extends FrameLayout {
    public final lp0 a;

    public ip0(lp0 lp0Var, Activity activity) {
        super(activity);
        this.a = lp0Var;
        setWillNotDraw(false);
        jp0 jp0Var = new jp0(lp0Var, getContext());
        jp0 jp0Var2 = new jp0(lp0Var, getContext());
        jp0 jp0Var3 = new jp0(lp0Var, getContext());
        jp0Var.c(2131231086, jb6.M0(2131753629, null));
        jp0Var2.c(2131231119, jb6.M0(2131749327, null));
        jp0Var3.c(2131231129, jb6.M0(2131750767, null));
        jp0Var.setOnClickListener(new View.OnClickListener(this) {
            public final ip0 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                ylb ylbVar;
                byte b = r2;
                ip0 ip0Var = this.b;
                switch (b) {
                    case 0:
                        lp0 lp0Var2 = ip0Var.a;
                        long j = lp0Var2.S;
                        vh1 vh1Var = lp0Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = lp0Var2.U;
                        int i = i46.R2;
                        if (vh1Var != null && tL_premium_boostsStatus != null && lp0Var2.getParentActivity() != null) {
                            i46 i46Var = new i46(19, lp0Var2.getCurrentAccount(), lp0Var2.getResourceProvider(), lp0Var2.getParentActivity(), lp0Var2);
                            i46Var.r1(vh1Var);
                            i46Var.q1(tL_premium_boostsStatus, true);
                            i46Var.s1(j);
                            i46Var.b2 = null;
                            lp0Var2.showDialog(i46Var);
                            return;
                        }
                        return;
                    case 1:
                        lp0 lp0Var3 = ip0Var.a;
                        lp0Var3.y0(true);
                        long j2 = lp0Var3.S;
                        ylbVar = ((d) lp0Var3).resourceProvider;
                        do0.D0(lp0Var3, ylbVar, j2, null);
                        do0.o1.I0 = new n1(ip0Var, (byte) 5);
                        return;
                    default:
                        lp0 lp0Var4 = ip0Var.a;
                        i46 i46Var2 = new i46(31, lp0Var4.T, lp0Var4.getResourceProvider(), ip0Var.getContext(), lp0Var4);
                        i46Var2.q1(lp0Var4.U, true);
                        i46Var2.s1(lp0Var4.S);
                        lp0Var4.showDialog(i46Var2);
                        return;
                }
            }
        });
        jp0Var2.setOnClickListener(new View.OnClickListener(this) {
            public final ip0 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                ylb ylbVar;
                byte b = r2;
                ip0 ip0Var = this.b;
                switch (b) {
                    case 0:
                        lp0 lp0Var2 = ip0Var.a;
                        long j = lp0Var2.S;
                        vh1 vh1Var = lp0Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = lp0Var2.U;
                        int i = i46.R2;
                        if (vh1Var != null && tL_premium_boostsStatus != null && lp0Var2.getParentActivity() != null) {
                            i46 i46Var = new i46(19, lp0Var2.getCurrentAccount(), lp0Var2.getResourceProvider(), lp0Var2.getParentActivity(), lp0Var2);
                            i46Var.r1(vh1Var);
                            i46Var.q1(tL_premium_boostsStatus, true);
                            i46Var.s1(j);
                            i46Var.b2 = null;
                            lp0Var2.showDialog(i46Var);
                            return;
                        }
                        return;
                    case 1:
                        lp0 lp0Var3 = ip0Var.a;
                        lp0Var3.y0(true);
                        long j2 = lp0Var3.S;
                        ylbVar = ((d) lp0Var3).resourceProvider;
                        do0.D0(lp0Var3, ylbVar, j2, null);
                        do0.o1.I0 = new n1(ip0Var, (byte) 5);
                        return;
                    default:
                        lp0 lp0Var4 = ip0Var.a;
                        i46 i46Var2 = new i46(31, lp0Var4.T, lp0Var4.getResourceProvider(), ip0Var.getContext(), lp0Var4);
                        i46Var2.q1(lp0Var4.U, true);
                        i46Var2.s1(lp0Var4.S);
                        lp0Var4.showDialog(i46Var2);
                        return;
                }
            }
        });
        jp0Var3.setOnClickListener(new View.OnClickListener(this) {
            public final ip0 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                ylb ylbVar;
                byte b = r2;
                ip0 ip0Var = this.b;
                switch (b) {
                    case 0:
                        lp0 lp0Var2 = ip0Var.a;
                        long j = lp0Var2.S;
                        vh1 vh1Var = lp0Var2.V;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = lp0Var2.U;
                        int i = i46.R2;
                        if (vh1Var != null && tL_premium_boostsStatus != null && lp0Var2.getParentActivity() != null) {
                            i46 i46Var = new i46(19, lp0Var2.getCurrentAccount(), lp0Var2.getResourceProvider(), lp0Var2.getParentActivity(), lp0Var2);
                            i46Var.r1(vh1Var);
                            i46Var.q1(tL_premium_boostsStatus, true);
                            i46Var.s1(j);
                            i46Var.b2 = null;
                            lp0Var2.showDialog(i46Var);
                            return;
                        }
                        return;
                    case 1:
                        lp0 lp0Var3 = ip0Var.a;
                        lp0Var3.y0(true);
                        long j2 = lp0Var3.S;
                        ylbVar = ((d) lp0Var3).resourceProvider;
                        do0.D0(lp0Var3, ylbVar, j2, null);
                        do0.o1.I0 = new n1(ip0Var, (byte) 5);
                        return;
                    default:
                        lp0 lp0Var4 = ip0Var.a;
                        i46 i46Var2 = new i46(31, lp0Var4.T, lp0Var4.getResourceProvider(), ip0Var.getContext(), lp0Var4);
                        i46Var2.q1(lp0Var4.U, true);
                        i46Var2.s1(lp0Var4.S);
                        lp0Var4.showDialog(i46Var2);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(jp0Var, qoe.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        if (oc7.r1(lp0Var.T).l4.O1.f && sd2.N(lp0Var.j0)) {
            linearLayout.addView(jp0Var2, qoe.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(jp0Var3, qoe.k(6.0f, 0.0f, 6.0f, 0.0f, -2, -2));
        addView(linearLayout, qoe.d(-2, -2.0f, 1, 0.0f, 19.0f, 0.0f, 0.0f));
    }
}
