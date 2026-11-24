package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
public final class zj6 extends q59 {
    public final Context c;
    public final ak6 d;

    public zj6(ak6 ak6Var, Context context) {
        this.d = ak6Var;
        this.c = context;
    }

    @Override
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    @Override
    public final boolean D(u69 u69Var) {
        int b = u69Var.b();
        ak6 ak6Var = this.d;
        if (ak6Var.R != b && ak6Var.y != b) {
            if (b < ak6Var.E || b >= ak6Var.F) {
                if ((b < ak6Var.I || b >= ak6Var.J) && b != ak6Var.O) {
                    if (b >= ak6Var.V && b < ak6Var.W) {
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
        ak6 ak6Var = this.d;
        if (i == ak6Var.r) {
            return 0;
        }
        if (i != ak6Var.s && i != ak6Var.M && i != ak6Var.T && i != ak6Var.Q) {
            if (i == ak6Var.w) {
                return 2;
            }
            if (i == ak6Var.y) {
                return 3;
            }
            if (i != ak6Var.x && i != ak6Var.K && i != ak6Var.N && i != ak6Var.S && i != ak6Var.U) {
                if (i < ak6Var.E || i >= ak6Var.F) {
                    if (i >= ak6Var.I && i < ak6Var.J) {
                        return 5;
                    }
                    if (i == ak6Var.G) {
                        return 6;
                    }
                    if (i == ak6Var.L) {
                        return 7;
                    }
                    if (i == ak6Var.O) {
                        return 8;
                    }
                    if (i == ak6Var.P) {
                        return 9;
                    }
                    if (i != ak6Var.R) {
                        if (i < ak6Var.V || i >= ak6Var.W) {
                            if (i == ak6Var.H) {
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
    public final void t(defpackage.u69 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj6.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        f56 f56Var;
        ylb ylbVar;
        ylb ylbVar2;
        int i2;
        ak6 ak6Var = this.d;
        Context context = this.c;
        switch (i) {
            case 1:
                f56Var = new jf5(context, 23);
                break;
            case 2:
                f56 f56Var2 = new f56(this.c, ak6Var, null, true, ak6Var.h);
                f56Var2.setPermanent(true);
                f56Var2.setDelegate(new yj6(this, f56Var2));
                f56Var = f56Var2;
                break;
            case 3:
                ylbVar = ((d) ak6Var).resourceProvider;
                f56Var = new y23(64, ylbVar, context);
                break;
            case 4:
                f56Var = new bba(context, (hg9) null);
                break;
            case 5:
                f56Var = new xj6(ak6Var, context);
                break;
            case 6:
                tk4 tk4Var = new tk4(context, null);
                tk4Var.setIsSingleCell(true);
                tk4Var.setViewType(9);
                tk4Var.x = false;
                f56Var = tk4Var;
                break;
            case 7:
                f56Var = new bba(context, (hg9) null);
                break;
            case 8:
                vkb vkbVar = new vkb(context);
                vkbVar.b(jb6.M0(2131751512, null), false);
                anb.X(vkbVar.getTextView(), cmb.o7, null);
                f56Var = vkbVar;
                break;
            case 9:
                f56Var = new njb(context);
                break;
            case 10:
                f56Var = new ij6(this.c, 8, 6, false, null);
                break;
            case 11:
                ylbVar2 = ((d) ak6Var).resourceProvider;
                f56Var = new njb(context, ylbVar2);
                break;
            default:
                FrameLayout a6Var = new a6(context, (byte) 19);
                a6Var.addView(new tj6(context), qoe.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                anb.X(textView, cmb.f9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (ak6Var.h) {
                    i2 = 2131746605;
                } else {
                    i2 = 2131746606;
                }
                textView.setText(jb6.M0(i2, null));
                a6Var.addView(textView, qoe.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                a6Var.setTag(-33024);
                f56Var = a6Var;
                break;
        }
        return kt6.h(f56Var, f56Var, -1, -2);
    }
}
