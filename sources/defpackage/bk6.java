package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.e;
public final class bk6 extends c79 {
    public final Context c;
    public final ck6 d;

    public bk6(ck6 ck6Var, Context context) {
        this.d = ck6Var;
        this.c = context;
    }

    @Override
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        int b = f89Var.b();
        ck6 ck6Var = this.d;
        if (ck6Var.R != b && ck6Var.y != b) {
            if (b < ck6Var.E || b >= ck6Var.F) {
                if ((b < ck6Var.I || b >= ck6Var.J) && b != ck6Var.O) {
                    if (b >= ck6Var.V && b < ck6Var.W) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.Y;
    }

    @Override
    public final int d(int i) {
        ck6 ck6Var = this.d;
        if (i == ck6Var.r) {
            return 0;
        }
        if (i != ck6Var.s && i != ck6Var.M && i != ck6Var.T && i != ck6Var.Q) {
            if (i == ck6Var.w) {
                return 2;
            }
            if (i == ck6Var.y) {
                return 3;
            }
            if (i != ck6Var.x && i != ck6Var.K && i != ck6Var.N && i != ck6Var.S && i != ck6Var.U) {
                if (i < ck6Var.E || i >= ck6Var.F) {
                    if (i >= ck6Var.I && i < ck6Var.J) {
                        return 5;
                    }
                    if (i == ck6Var.G) {
                        return 6;
                    }
                    if (i == ck6Var.L) {
                        return 7;
                    }
                    if (i == ck6Var.O) {
                        return 8;
                    }
                    if (i == ck6Var.P) {
                        return 9;
                    }
                    if (i != ck6Var.R) {
                        if (i < ck6Var.V || i >= ck6Var.W) {
                            if (i == ck6Var.H) {
                                return 11;
                            }
                            return 1;
                        }
                        return 10;
                    }
                    return 10;
                }
                return 5;
            }
            return 4;
        }
        return 1;
    }

    @Override
    public final void t(defpackage.f89 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk6.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        i56 i56Var;
        vnb vnbVar;
        vnb vnbVar2;
        int i2;
        ck6 ck6Var = this.d;
        Context context = this.c;
        switch (i) {
            case 1:
                i56Var = new mf5(context, 23);
                break;
            case 2:
                i56 i56Var2 = new i56(this.c, ck6Var, null, true, ck6Var.h);
                i56Var2.setPermanent(true);
                i56Var2.setDelegate(new ak6(this, i56Var2));
                i56Var = i56Var2;
                break;
            case 3:
                vnbVar = ((e) ck6Var).resourceProvider;
                i56Var = new f23(64, vnbVar, context);
                break;
            case 4:
                i56Var = new sca(context, (uh9) null);
                break;
            case 5:
                i56Var = new zj6(ck6Var, context);
                break;
            case 6:
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(9);
                tk4Var.x = false;
                i56Var = tk4Var;
                break;
            case 7:
                i56Var = new sca(context, (uh9) null);
                break;
            case 8:
                qmb qmbVar = new qmb(context);
                qmbVar.b(ob6.M0(2131751540, null), false);
                yob.X(qmbVar.getTextView(), aob.p7, null);
                i56Var = qmbVar;
                break;
            case 9:
                i56Var = new ilb(context);
                break;
            case 10:
                i56Var = new lj6(this.c, 8, 6, false, null);
                break;
            case 11:
                vnbVar2 = ((e) ck6Var).resourceProvider;
                i56Var = new ilb(context, vnbVar2);
                break;
            default:
                FrameLayout b6Var = new b6(context, (byte) 20);
                b6Var.addView(new vj6(context), tre.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                yob.X(textView, aob.g9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (ck6Var.h) {
                    i2 = 2131746599;
                } else {
                    i2 = 2131746600;
                }
                textView.setText(ob6.M0(i2, null));
                b6Var.addView(textView, tre.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                b6Var.setTag(-33024);
                i56Var = b6Var;
                break;
        }
        return qu6.h(i56Var, i56Var, -1, -2);
    }
}
