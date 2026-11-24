package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d;
public final class xh6 extends n39 {
    public final Context c;
    public final yh6 d;

    public xh6(yh6 yh6Var, Context context) {
        this.d = yh6Var;
        this.c = context;
    }

    @Override
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof gh6) {
            ((gh6) view).a();
        }
    }

    @Override
    public final boolean D(s49 s49Var) {
        int b = s49Var.b();
        yh6 yh6Var = this.d;
        if (yh6Var.R != b && yh6Var.y != b) {
            if (b < yh6Var.E || b >= yh6Var.F) {
                if ((b < yh6Var.I || b >= yh6Var.J) && b != yh6Var.O) {
                    if (b >= yh6Var.V && b < yh6Var.W) {
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
        yh6 yh6Var = this.d;
        if (i == yh6Var.r) {
            return 0;
        }
        if (i != yh6Var.s && i != yh6Var.M && i != yh6Var.T && i != yh6Var.Q) {
            if (i == yh6Var.w) {
                return 2;
            }
            if (i == yh6Var.y) {
                return 3;
            }
            if (i != yh6Var.x && i != yh6Var.K && i != yh6Var.N && i != yh6Var.S && i != yh6Var.U) {
                if (i < yh6Var.E || i >= yh6Var.F) {
                    if (i >= yh6Var.I && i < yh6Var.J) {
                        return 5;
                    }
                    if (i == yh6Var.G) {
                        return 6;
                    }
                    if (i == yh6Var.L) {
                        return 7;
                    }
                    if (i == yh6Var.O) {
                        return 8;
                    }
                    if (i == yh6Var.P) {
                        return 9;
                    }
                    if (i != yh6Var.R) {
                        if (i < yh6Var.V || i >= yh6Var.W) {
                            if (i == yh6Var.H) {
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
    public final void t(defpackage.s49 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh6.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        f36 f36Var;
        wjb wjbVar;
        wjb wjbVar2;
        int i2;
        yh6 yh6Var = this.d;
        Context context = this.c;
        switch (i) {
            case 1:
                f36Var = new ld5(context, 23);
                break;
            case 2:
                f36 f36Var2 = new f36(this.c, yh6Var, null, true, yh6Var.h);
                f36Var2.setPermanent(true);
                f36Var2.setDelegate(new wh6(this, f36Var2));
                f36Var = f36Var2;
                break;
            case 3:
                wjbVar = ((d) yh6Var).resourceProvider;
                f36Var = new m13(64, wjbVar, context);
                break;
            case 4:
                f36Var = new b9a(context, (de9) null);
                break;
            case 5:
                f36Var = new vh6(yh6Var, context);
                break;
            case 6:
                pi4 pi4Var = new pi4(context, null);
                pi4Var.setIsSingleCell(true);
                pi4Var.setViewType(9);
                pi4Var.x = false;
                f36Var = pi4Var;
                break;
            case 7:
                f36Var = new b9a(context, (de9) null);
                break;
            case 8:
                uib uibVar = new uib(context);
                uibVar.b(k96.M0(2131751563, null), false);
                zkb.X(uibVar.getTextView(), bkb.o7, null);
                f36Var = uibVar;
                break;
            case 9:
                f36Var = new mhb(context);
                break;
            case 10:
                f36Var = new gh6(this.c, 8, 6, false, null);
                break;
            case 11:
                wjbVar2 = ((d) yh6Var).resourceProvider;
                f36Var = new mhb(context, wjbVar2);
                break;
            default:
                FrameLayout a6Var = new a6(context, (byte) 19);
                a6Var.addView(new rh6(context), nme.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                zkb.X(textView, bkb.f9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (yh6Var.h) {
                    i2 = 2131746679;
                } else {
                    i2 = 2131746680;
                }
                textView.setText(k96.M0(i2, null));
                a6Var.addView(textView, nme.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                a6Var.setTag(-33024);
                f36Var = a6Var;
                break;
        }
        return ls6.h(f36Var, f36Var, -1, -2);
    }
}
