package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class mz implements Runnable {
    public final byte a;
    public final yv1 b;

    public mz(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void run() {
        ms1 ms1Var;
        rc2 rc2Var;
        k47 messageObject;
        p09[] p09VarArr;
        byte b = this.a;
        TLRPC.ChatTheme chatTheme = null;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.Dc();
                return;
            case 1:
                yv1Var.Ba("");
                return;
            case 2:
                yv1Var.d6 = null;
                if (yv1Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, yv1Var.Ba, yv1Var.getParentActivity());
                    boolean T = sd2.T(yv1Var.e);
                    he heVar = alertDialog$Builder.a;
                    if (T && !yv1Var.e.megagroup) {
                        heVar.U = jb6.M0(2131748842, null);
                        heVar.S = jb6.M0(2131748841, null);
                    } else {
                        heVar.U = jb6.M0(2131748840, null);
                        heVar.S = jb6.M0(2131748839, null);
                    }
                    alertDialog$Builder.j(jb6.M0(2131748838, null), new gm1(yv1Var, (byte) 2));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), new gm1(yv1Var, (byte) 3));
                    yv1Var.showDialog(heVar);
                    return;
                }
                return;
            case 3:
                yv1Var.l5();
                return;
            case 4:
                FrameLayout.LayoutParams e = qoe.e(-1, -2, 87);
                e.bottomMargin = yv1Var.a0.getMeasuredHeight();
                yv1Var.m1.addView(yv1Var.N1, e);
                yv1Var.N1.setTranslationY(-gm.n);
                yv1Var.N1.o(0.0f, yv1Var.a0.getEmojiButton().getX() + gm.L(22.0f));
                yv1Var.N1.v();
                return;
            case 5:
            case 23:
                yv1Var.X4();
                return;
            case 6:
                if (!d.hasSheets(yv1Var) && (ms1Var = yv1Var.a0) != null) {
                    ms1Var.setFieldFocused(true);
                    yv1Var.a0.j1();
                    return;
                }
                return;
            case 7:
                yv1Var.Dd();
                yv1Var.O7();
                gm.d0(yv1Var.A0, new qm1(yv1Var, (byte) 6));
                yv1Var.H5();
                ds1 ds1Var = yv1Var.m3;
                if (ds1Var != null) {
                    ds1Var.setTranslationX(yv1Var.o7() / 2.0f);
                }
                cs1 cs1Var = yv1Var.n3;
                if (cs1Var != null) {
                    cs1Var.setTranslationX(yv1Var.o7() / 2.0f);
                }
                FrameLayout frameLayout = yv1Var.f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(yv1Var.o7() / 2.0f);
                }
                yv1Var.f5();
                yv1Var.G5();
                return;
            case 8:
                yv1Var.Fa(null, yv1Var.I8);
                yv1Var.I8 = null;
                return;
            case 9:
                wvb f0 = wvb.f0(-yv1Var.l6, 0L);
                f0.E = yv1Var;
                yv1Var.presentFragment(f0);
                return;
            case 10:
                gm.B2(yv1Var.Z0);
                return;
            case 11:
                yv1Var.Hc(true);
                return;
            case 12:
                yv1Var.y1.d(true);
                return;
            case 13:
                int childCount = yv1Var.A0.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = yv1Var.A0.getChildAt(i);
                    if (childAt instanceof rc2) {
                        rc2 rc2Var2 = (rc2) childAt;
                        if (rc2Var2.getMessageObject().D == 4) {
                            rc2Var2.J1();
                        }
                    }
                }
                return;
            case 14:
                yv1Var.pc = true;
                yv1Var.fd(true);
                return;
            case 15:
                ft1 ft1Var = yv1Var.Jb;
                if (ft1Var != null) {
                    ft1Var.requestLayout();
                    return;
                }
                return;
            case 16:
                yv1Var.getNotificationCenter().j(yv1Var.ca);
                return;
            case 17:
                TLRPC.UserFull userFull = yv1Var.s8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                yv1Var.Gb(chatTheme);
                return;
            case 18:
                yv1Var.E9();
                return;
            case 19:
                yv1Var.d8 = Integer.MAX_VALUE;
                yv1Var.f8 = false;
                yv1Var.g8 = 0L;
                yv1Var.h8 = null;
                yv1Var.i8 = null;
                yv1Var.j8 = null;
                yv1Var.k8 = -1;
                yv1Var.e8 = false;
                yv1Var.Gd(false);
                yv1Var.m8 = null;
                return;
            case 20:
                yv1Var.d9();
                return;
            case 21:
                yv1Var.Wb(false, true);
                return;
            case 22:
                en1 en1Var = new en1(yv1Var, (byte) 2);
                if (wxc.A()) {
                    en1Var.run();
                    return;
                }
                zka zkaVar = new zka(en1Var, (byte) 18);
                wxc.h.add(zkaVar);
                gm.d3(zkaVar, 150L);
                return;
            case 24:
                yv1Var.h9();
                return;
            case 25:
                yv1Var.m5();
                return;
            case 26:
                yv1Var.a0.j1();
                return;
            case 27:
                yv1 yv1Var2 = this.b;
                int i2 = yv1Var2.ec;
                if (i2 != 0) {
                    yv1Var2.J(i2, yv1Var2.fc, yv1Var2.hc ? 1 : 0, yv1Var2.jc, yv1Var2.gc, yv1Var2.ic);
                    yv1Var2.ec = 0;
                    return;
                }
                return;
            case 28:
                if (!yv1Var.A3 && yv1Var.A0 != null && yv1Var.getParentActivity() != null && yv1Var.fragmentView != null) {
                    qh2 qh2Var = yv1Var.K2;
                    if (qh2Var != null) {
                        if (qh2Var.W) {
                            return;
                        }
                    } else {
                        mu1 mu1Var = yv1Var.m1;
                        int indexOfChild = mu1Var.indexOfChild(yv1Var.U);
                        if (indexOfChild != -1) {
                            qh2 qh2Var2 = new qh2(yv1Var.getParentActivity());
                            yv1Var.K2 = qh2Var2;
                            qh2Var2.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                            yv1Var.K2.k(yv1Var.L);
                            mu1Var.addView(yv1Var.K2, indexOfChild + 1, qoe.e(-1, 150, 55));
                        } else {
                            return;
                        }
                    }
                    int childCount2 = yv1Var.A0.getChildCount();
                    for (int i3 = 0; i3 < childCount2; i3++) {
                        View childAt2 = yv1Var.A0.getChildAt(i3);
                        if ((childAt2 instanceof rc2) && (messageObject = (rc2Var = (rc2) childAt2).getMessageObject()) != null && messageObject.O3() && messageObject.p4()) {
                            qh2 qh2Var3 = yv1Var.K2;
                            int[] iArr = (int[]) qh2Var3.Z0;
                            if (qh2Var3.getParent() instanceof View) {
                                rc2Var.getLocationInWindow(iArr);
                                int i4 = iArr[0];
                                int i5 = iArr[1];
                                ((View) qh2Var3.getParent()).getLocationInWindow(iArr);
                                float f = i5 - iArr[1];
                                if (f > gm.L(80.0f)) {
                                    for (p09 p09Var : (p09[]) qh2Var3.Y0) {
                                        p09Var.I(0, false, false);
                                        p09Var.start();
                                    }
                                    qh2Var3.w(gm.L(5.0f) + rc2Var.getChecksX() + (i4 - iArr[0]), f + rc2Var.getChecksY() + gm.L(6.0f), true);
                                    yv1Var.getMessagesController().p4(0L, "NEWCOMER_TICKS");
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                yv1Var.e9();
                return;
        }
    }
}
