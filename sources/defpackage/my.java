package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class my implements Runnable {
    public final byte a;
    public final mu1 b;

    public my(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void run() {
        ar1 ar1Var;
        gb2 gb2Var;
        k27 messageObject;
        oy8[] oy8VarArr;
        byte b = this.a;
        TLRPC.ChatTheme chatTheme = null;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.rc();
                return;
            case 1:
                mu1Var.d6 = null;
                if (mu1Var.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mu1Var.Ba, mu1Var.getParentActivity());
                    boolean T = hc2.T(mu1Var.e);
                    hd hdVar = alertDialog$Builder.a;
                    if (T && !mu1Var.e.megagroup) {
                        hdVar.U = k96.M0(2131748893, null);
                        hdVar.S = k96.M0(2131748892, null);
                    } else {
                        hdVar.U = k96.M0(2131748891, null);
                        hdVar.S = k96.M0(2131748890, null);
                    }
                    alertDialog$Builder.j(k96.M0(2131748889, null), new yk1(mu1Var, (byte) 2));
                    alertDialog$Builder.g(k96.M0(2131752577, null), new yk1(mu1Var, (byte) 3));
                    mu1Var.showDialog(hdVar);
                    return;
                }
                return;
            case 2:
                mu1Var.e5();
                return;
            case 3:
                FrameLayout.LayoutParams e = nme.e(-1, -2, 87);
                e.bottomMargin = mu1Var.a0.getMeasuredHeight();
                mu1Var.m1.addView(mu1Var.N1, e);
                mu1Var.N1.setTranslationY(-gl.n);
                mu1Var.N1.o(0.0f, mu1Var.a0.getEmojiButton().getX() + gl.L(22.0f));
                mu1Var.N1.v();
                return;
            case 4:
            case 24:
                mu1Var.Q4();
                return;
            case 5:
                gl.B2(mu1Var.Z0);
                return;
            case 6:
                if (!d.hasSheets(mu1Var) && (ar1Var = mu1Var.a0) != null) {
                    ar1Var.setFieldFocused(true);
                    mu1Var.a0.h1();
                    return;
                }
                return;
            case 7:
                mu1Var.rd();
                mu1Var.G7();
                gl.d0(mu1Var.A0, new hl1(mu1Var, (byte) 5));
                mu1Var.A5();
                rq1 rq1Var = mu1Var.m3;
                if (rq1Var != null) {
                    rq1Var.setTranslationX(mu1Var.g7() / 2.0f);
                }
                qq1 qq1Var = mu1Var.n3;
                if (qq1Var != null) {
                    qq1Var.setTranslationX(mu1Var.g7() / 2.0f);
                }
                FrameLayout frameLayout = mu1Var.f1;
                if (frameLayout != null) {
                    frameLayout.setTranslationX(mu1Var.g7() / 2.0f);
                }
                mu1Var.Y4();
                mu1Var.z5();
                return;
            case 8:
                mu1Var.va(null, mu1Var.I8);
                mu1Var.I8 = null;
                return;
            case 9:
                vtb e0 = vtb.e0(-mu1Var.l6, 0L);
                e0.E = mu1Var;
                mu1Var.presentFragment(e0);
                return;
            case 10:
                mu1Var.vc(true);
                return;
            case 11:
                mu1Var.y1.d(true);
                return;
            case 12:
                mu1Var.resumeDelayedFragmentAnimation();
                ir1 ir1Var = mu1Var.ta;
                gl.r(ir1Var);
                ir1Var.run();
                mu1Var.getNotificationCenter().o();
                return;
            case 13:
                int childCount = mu1Var.A0.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = mu1Var.A0.getChildAt(i);
                    if (childAt instanceof gb2) {
                        gb2 gb2Var2 = (gb2) childAt;
                        if (gb2Var2.getMessageObject().D == 4) {
                            gb2Var2.J1();
                        }
                    }
                }
                return;
            case 14:
                mu1Var.fc = true;
                mu1Var.Tc(true);
                return;
            case 15:
                sr1 sr1Var = mu1Var.Bb;
                if (sr1Var != null) {
                    sr1Var.requestLayout();
                    return;
                }
                return;
            case 16:
                mu1Var.getNotificationCenter().j(mu1Var.ca);
                return;
            case 17:
                TLRPC.UserFull userFull = mu1Var.s8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                mu1Var.wb(chatTheme);
                return;
            case 18:
                mu1Var.u9();
                return;
            case 19:
                mu1Var.d8 = Integer.MAX_VALUE;
                mu1Var.f8 = false;
                mu1Var.g8 = 0L;
                mu1Var.h8 = null;
                mu1Var.i8 = null;
                mu1Var.j8 = null;
                mu1Var.k8 = -1;
                mu1Var.e8 = false;
                mu1Var.ud(false);
                mu1Var.m8 = null;
                return;
            case 20:
                mu1Var.T8();
                return;
            case 21:
                mu1Var.Lb(false, true);
                return;
            case 22:
                my myVar = new my(mu1Var, (byte) 12);
                if (vvc.z()) {
                    myVar.run();
                    return;
                }
                xia xiaVar = new xia(myVar, (byte) 18);
                vvc.h.add(xiaVar);
                gl.d3(xiaVar, 150L);
                return;
            case 23:
                mu1Var.X8();
                return;
            case 25:
                mu1Var.f5();
                return;
            case 26:
                mu1Var.a0.h1();
                return;
            case 27:
                mu1 mu1Var2 = this.b;
                int i2 = mu1Var2.Ub;
                if (i2 != 0) {
                    mu1Var2.J(i2, mu1Var2.Vb, mu1Var2.Xb ? 1 : 0, mu1Var2.Zb, mu1Var2.Wb, mu1Var2.Yb);
                    mu1Var2.Ub = 0;
                    return;
                }
                return;
            case 28:
                if (!mu1Var.A3 && mu1Var.A0 != null && mu1Var.getParentActivity() != null && mu1Var.fragmentView != null) {
                    cg2 cg2Var = mu1Var.K2;
                    if (cg2Var != null) {
                        if (cg2Var.W) {
                            return;
                        }
                    } else {
                        at1 at1Var = mu1Var.m1;
                        int indexOfChild = at1Var.indexOfChild(mu1Var.U);
                        if (indexOfChild != -1) {
                            cg2 cg2Var2 = new cg2(mu1Var.getParentActivity());
                            mu1Var.K2 = cg2Var2;
                            cg2Var2.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                            mu1Var.K2.k(mu1Var.L);
                            at1Var.addView(mu1Var.K2, indexOfChild + 1, nme.e(-1, 150, 55));
                        } else {
                            return;
                        }
                    }
                    int childCount2 = mu1Var.A0.getChildCount();
                    for (int i3 = 0; i3 < childCount2; i3++) {
                        View childAt2 = mu1Var.A0.getChildAt(i3);
                        if ((childAt2 instanceof gb2) && (messageObject = (gb2Var = (gb2) childAt2).getMessageObject()) != null && messageObject.O3() && messageObject.p4()) {
                            cg2 cg2Var3 = mu1Var.K2;
                            int[] iArr = (int[]) cg2Var3.Z0;
                            if (cg2Var3.getParent() instanceof View) {
                                gb2Var.getLocationInWindow(iArr);
                                int i4 = iArr[0];
                                int i5 = iArr[1];
                                ((View) cg2Var3.getParent()).getLocationInWindow(iArr);
                                float f = i5 - iArr[1];
                                if (f > gl.L(80.0f)) {
                                    for (oy8 oy8Var : (oy8[]) cg2Var3.Y0) {
                                        oy8Var.I(0, false, false);
                                        oy8Var.start();
                                    }
                                    cg2Var3.w(gl.L(5.0f) + gb2Var.getChecksX() + (i4 - iArr[0]), f + gb2Var.getChecksY() + gl.L(6.0f), true);
                                    mu1Var.getMessagesController().n4(0L, "NEWCOMER_TICKS");
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
                mu1Var.U8();
                return;
        }
    }
}
