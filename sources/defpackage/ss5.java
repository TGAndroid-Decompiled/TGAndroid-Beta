package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class ss5 extends q59 {
    public final xs5 c;

    public ss5(xs5 xs5Var) {
        this.c = xs5Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int b = u69Var.b();
        xs5 xs5Var = this.c;
        if (b == xs5Var.r1) {
            if (xs5Var.l1.admin_id != z8c.h(xs5Var.a).n) {
                return true;
            }
            return false;
        } else if (b < xs5Var.w1 || b >= xs5Var.x1) {
            if (b >= xs5Var.I1 && b < xs5Var.J1) {
                return true;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final int b() {
        return this.c.M1;
    }

    @Override
    public final int d(int i) {
        xs5 xs5Var = this.c;
        if (i != xs5Var.q1 && i != xs5Var.H1 && i != xs5Var.v1 && i != xs5Var.o1) {
            if (i != xs5Var.r1) {
                if (i < xs5Var.I1 || i >= xs5Var.J1) {
                    if (i < xs5Var.w1 || i >= xs5Var.x1) {
                        if (i != xs5Var.s1 && i != xs5Var.t1) {
                            if (i == xs5Var.B1) {
                                return 3;
                            }
                            if (i == xs5Var.C1) {
                                return 4;
                            }
                            if (i == xs5Var.D1) {
                                return 5;
                            }
                            if (i != 0 && i != xs5Var.E1 && i != xs5Var.F1) {
                                if (i == xs5Var.u1) {
                                    return 7;
                                }
                                if (i == xs5Var.G1) {
                                    return 8;
                                }
                                if (i == xs5Var.p1) {
                                    return 9;
                                }
                                return 0;
                            }
                            return 6;
                        }
                        return 2;
                    }
                    return 1;
                }
                return 1;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(defpackage.u69 r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ss5.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        tk4 tk4Var;
        os5 os5Var;
        Context context = viewGroup.getContext();
        xs5 xs5Var = this.c;
        switch (i) {
            case 1:
                os5Var = new vs5(context);
                break;
            case 2:
                int i2 = cmb.Z6;
                View bbaVar = new bba(context, cmb.w0(null, i2, false), 0);
                anb.h(i2, null, bbaVar);
                os5Var = bbaVar;
                break;
            case 3:
                os5 os5Var2 = new os5(this, context, xs5Var.O1, xs5Var, xs5Var.b2);
                os5Var2.setDelegate(new rs5(this));
                os5Var2.setLayoutParams(new g69(-1, -2));
                os5Var = os5Var2;
                break;
            case 4:
                os5Var = new ws5(xs5Var, context);
                break;
            case 5:
                tk4 tk4Var2 = new tk4(context, null);
                tk4Var2.setIsSingleCell(true);
                tk4Var2.setViewType(10);
                tk4Var2.x = false;
                tk4Var2.setPaddingLeft(gm.L(10.0f));
                tk4Var = tk4Var2;
                os5Var = tk4Var;
                break;
            case 6:
                tk4Var = new o72(context, (byte) 10);
                os5Var = tk4Var;
                break;
            case 7:
                os5Var = new bba(context, (hg9) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.a = textView;
                textView.setTextSize(1, 14.0f);
                anb.X(textView, cmb.x6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, qoe.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                os5Var = frameLayout;
                break;
            case 9:
                os5Var = new us5(xs5Var, context);
                break;
            default:
                os5Var = new l55(context, xs5Var.J0);
                break;
        }
        return kt6.h(os5Var, os5Var, -1, -2);
    }
}
