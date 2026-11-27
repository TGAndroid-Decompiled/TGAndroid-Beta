package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class ws5 extends c79 {
    public final bt5 c;

    public ws5(bt5 bt5Var) {
        this.c = bt5Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int b = f89Var.b();
        bt5 bt5Var = this.c;
        if (b == bt5Var.r1) {
            if (bt5Var.l1.admin_id != yac.h(bt5Var.a).n) {
                return true;
            }
            return false;
        } else if (b < bt5Var.w1 || b >= bt5Var.x1) {
            if (b >= bt5Var.I1 && b < bt5Var.J1) {
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
        bt5 bt5Var = this.c;
        if (i != bt5Var.q1 && i != bt5Var.H1 && i != bt5Var.v1 && i != bt5Var.o1) {
            if (i != bt5Var.r1) {
                if (i < bt5Var.I1 || i >= bt5Var.J1) {
                    if (i < bt5Var.w1 || i >= bt5Var.x1) {
                        if (i != bt5Var.s1 && i != bt5Var.t1) {
                            if (i == bt5Var.B1) {
                                return 3;
                            }
                            if (i == bt5Var.C1) {
                                return 4;
                            }
                            if (i == bt5Var.D1) {
                                return 5;
                            }
                            if (i != 0 && i != bt5Var.E1 && i != bt5Var.F1) {
                                if (i == bt5Var.u1) {
                                    return 7;
                                }
                                if (i == bt5Var.G1) {
                                    return 8;
                                }
                                if (i == bt5Var.p1) {
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
    public final void t(defpackage.f89 r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws5.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        tk4 tk4Var;
        ss5 ss5Var;
        Context context = viewGroup.getContext();
        bt5 bt5Var = this.c;
        switch (i) {
            case 1:
                ss5Var = new zs5(context);
                break;
            case 2:
                int i2 = aob.a7;
                View scaVar = new sca(context, aob.w0(null, i2, false), 0);
                yob.h(i2, null, scaVar);
                ss5Var = scaVar;
                break;
            case 3:
                ss5 ss5Var2 = new ss5(this, context, bt5Var.O1, bt5Var, bt5Var.b2);
                ss5Var2.setDelegate(new vs5(this));
                ss5Var2.setLayoutParams(new r79(-1, -2));
                ss5Var = ss5Var2;
                break;
            case 4:
                ss5Var = new at5(bt5Var, context);
                break;
            case 5:
                tk4 tk4Var2 = new tk4(context, null);
                tk4Var2.setIsSingleCell(true);
                tk4Var2.setViewType(10);
                tk4Var2.x = false;
                tk4Var2.setPaddingLeft(hl.L(10.0f));
                tk4Var = tk4Var2;
                ss5Var = tk4Var;
                break;
            case 6:
                tk4Var = new t62(context, (byte) 10);
                ss5Var = tk4Var;
                break;
            case 7:
                ss5Var = new sca(context, (uh9) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.a = textView;
                textView.setTextSize(1, 14.0f);
                yob.X(textView, aob.y6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, tre.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                ss5Var = frameLayout;
                break;
            case 9:
                ss5Var = new ys5(bt5Var, context);
                break;
            default:
                ss5Var = new p55(context, bt5Var.J0);
                break;
        }
        return qu6.h(ss5Var, ss5Var, -1, -2);
    }
}
