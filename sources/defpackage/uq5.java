package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class uq5 extends n39 {
    public final zq5 c;

    public uq5(zq5 zq5Var) {
        this.c = zq5Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int b = s49Var.b();
        zq5 zq5Var = this.c;
        if (b == zq5Var.r1) {
            if (zq5Var.l1.admin_id != y6c.h(zq5Var.a).n) {
                return true;
            }
            return false;
        } else if (b < zq5Var.w1 || b >= zq5Var.x1) {
            if (b >= zq5Var.I1 && b < zq5Var.J1) {
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
        zq5 zq5Var = this.c;
        if (i != zq5Var.q1 && i != zq5Var.H1 && i != zq5Var.v1 && i != zq5Var.o1) {
            if (i != zq5Var.r1) {
                if (i < zq5Var.I1 || i >= zq5Var.J1) {
                    if (i < zq5Var.w1 || i >= zq5Var.x1) {
                        if (i != zq5Var.s1 && i != zq5Var.t1) {
                            if (i == zq5Var.B1) {
                                return 3;
                            }
                            if (i == zq5Var.C1) {
                                return 4;
                            }
                            if (i == zq5Var.D1) {
                                return 5;
                            }
                            if (i != 0 && i != zq5Var.E1 && i != zq5Var.F1) {
                                if (i == zq5Var.u1) {
                                    return 7;
                                }
                                if (i == zq5Var.G1) {
                                    return 8;
                                }
                                if (i == zq5Var.p1) {
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
    public final void t(defpackage.s49 r24, int r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uq5.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        pi4 pi4Var;
        qq5 qq5Var;
        Context context = viewGroup.getContext();
        zq5 zq5Var = this.c;
        switch (i) {
            case 1:
                qq5Var = new xq5(context);
                break;
            case 2:
                int i2 = bkb.Z6;
                View b9aVar = new b9a(context, bkb.w0(null, i2, false), 0);
                zkb.h(i2, null, b9aVar);
                qq5Var = b9aVar;
                break;
            case 3:
                qq5 qq5Var2 = new qq5(this, context, zq5Var.O1, zq5Var, zq5Var.b2);
                qq5Var2.setDelegate(new tq5(this));
                qq5Var2.setLayoutParams(new e49(-1, -2));
                qq5Var = qq5Var2;
                break;
            case 4:
                qq5Var = new yq5(zq5Var, context);
                break;
            case 5:
                pi4 pi4Var2 = new pi4(context, null);
                pi4Var2.setIsSingleCell(true);
                pi4Var2.setViewType(10);
                pi4Var2.x = false;
                pi4Var2.setPaddingLeft(gl.L(10.0f));
                pi4Var = pi4Var2;
                qq5Var = pi4Var;
                break;
            case 6:
                pi4Var = new d62(context, (byte) 10);
                qq5Var = pi4Var;
                break;
            case 7:
                qq5Var = new b9a(context, (de9) null);
                break;
            case 8:
                ?? frameLayout = new FrameLayout(context);
                TextView textView = new TextView(context);
                frameLayout.a = textView;
                textView.setTextSize(1, 14.0f);
                zkb.X(textView, bkb.x6, null);
                textView.setGravity(1);
                frameLayout.addView(textView, nme.d(-1, -2.0f, 16, 60.0f, 0.0f, 60.0f, 0.0f));
                qq5Var = frameLayout;
                break;
            case 9:
                qq5Var = new wq5(zq5Var, context);
                break;
            default:
                qq5Var = new l35(context, zq5Var.J0);
                break;
        }
        return ls6.h(qq5Var, qq5Var, -1, -2);
    }
}
