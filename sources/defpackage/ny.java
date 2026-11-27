package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
public final class ny implements Runnable {
    public final byte a;
    public final zu1 b;

    public ny(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void run() {
        wb2 wb2Var;
        r47 messageObject;
        b29[] b29VarArr;
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.Dc();
                return;
            case 1:
                zu1Var.Ca("");
                return;
            case 2:
                zu1Var.qc = true;
                zu1Var.fd(true);
                return;
            case 3:
                gs1 gs1Var = zu1Var.Mb;
                if (gs1Var != null) {
                    gs1Var.requestLayout();
                    return;
                }
                return;
            case 4:
                zu1Var.F9();
                return;
            case 5:
                zu1Var.d8 = Integer.MAX_VALUE;
                zu1Var.f8 = false;
                zu1Var.g8 = 0L;
                zu1Var.h8 = null;
                zu1Var.i8 = null;
                zu1Var.j8 = null;
                zu1Var.k8 = -1;
                zu1Var.e8 = false;
                zu1Var.Gd(false);
                zu1Var.m8 = null;
                return;
            case 6:
                FrameLayout.LayoutParams e = tre.e(-1, -2, 87);
                e.bottomMargin = zu1Var.a0.getMeasuredHeight();
                zu1Var.m1.addView(zu1Var.N1, e);
                zu1Var.N1.setTranslationY(-hl.n);
                zu1Var.N1.o(0.0f, zu1Var.a0.getEmojiButton().getX() + hl.L(22.0f));
                zu1Var.N1.v();
                return;
            case 7:
                zu1Var.Wb(false, true);
                return;
            case 8:
                zu1Var.getNotificationCenter().j(zu1Var.ca);
                return;
            case 9:
                zu1Var.e9();
                return;
            case 10:
                hm1 hm1Var = new hm1(zu1Var, (byte) 13);
                if (k0d.A()) {
                    hm1Var.run();
                    return;
                }
                bva bvaVar = new bva(hm1Var, (byte) 17);
                k0d.h.add(bvaVar);
                hl.d3(bvaVar, 150L);
                return;
            case 11:
                zu1Var.W4();
                return;
            case 12:
                zu1Var.Ga(null, zu1Var.I8);
                zu1Var.I8 = null;
                return;
            case 13:
                hl.d0(zu1Var.A0, new bm0((byte) 5));
                it1 it1Var = zu1Var.D0;
                if (it1Var != null) {
                    it1Var.J(true);
                    return;
                }
                return;
            case 14:
                hl.d0(zu1Var.A0, new bm0((byte) 4));
                it1 it1Var2 = zu1Var.D0;
                if (it1Var2 != null) {
                    it1Var2.J(false);
                    return;
                }
                return;
            case 15:
                zu1Var.cd();
                return;
            case 16:
                zu1Var.l5();
                return;
            case 17:
                zu1Var.a0.o1();
                return;
            case 18:
                zu1 zu1Var2 = this.b;
                int i = zu1Var2.fc;
                if (i != 0) {
                    zu1Var2.J(i, zu1Var2.gc, zu1Var2.ic ? 1 : 0, zu1Var2.kc, zu1Var2.hc, zu1Var2.jc);
                    zu1Var2.fc = 0;
                    return;
                }
                return;
            case 19:
                if (!zu1Var.A3 && zu1Var.A0 != null && zu1Var.getParentActivity() != null && zu1Var.fragmentView != null) {
                    ug2 ug2Var = zu1Var.K2;
                    if (ug2Var != null) {
                        if (ug2Var.W) {
                            return;
                        }
                    } else {
                        nt1 nt1Var = zu1Var.m1;
                        int indexOfChild = nt1Var.indexOfChild(zu1Var.U);
                        if (indexOfChild != -1) {
                            ug2 ug2Var2 = new ug2(zu1Var.getParentActivity());
                            zu1Var.K2 = ug2Var2;
                            ug2Var2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                            zu1Var.K2.k(zu1Var.L);
                            nt1Var.addView(zu1Var.K2, indexOfChild + 1, tre.e(-1, 150, 55));
                        } else {
                            return;
                        }
                    }
                    int childCount = zu1Var.A0.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = zu1Var.A0.getChildAt(i2);
                        if ((childAt instanceof wb2) && (messageObject = (wb2Var = (wb2) childAt).getMessageObject()) != null && messageObject.O3() && messageObject.p4()) {
                            ug2 ug2Var3 = zu1Var.K2;
                            int[] iArr = (int[]) ug2Var3.Z0;
                            if (ug2Var3.getParent() instanceof View) {
                                wb2Var.getLocationInWindow(iArr);
                                int i3 = iArr[0];
                                int i4 = iArr[1];
                                ((View) ug2Var3.getParent()).getLocationInWindow(iArr);
                                float f = i4 - iArr[1];
                                if (f > hl.L(80.0f)) {
                                    for (b29 b29Var : (b29[]) ug2Var3.Y0) {
                                        b29Var.I(0, false, false);
                                        b29Var.start();
                                    }
                                    ug2Var3.w(hl.L(5.0f) + wb2Var.getChecksX() + (i3 - iArr[0]), f + wb2Var.getChecksY() + hl.L(6.0f), true);
                                    zu1Var.getMessagesController().v4(0L, "NEWCOMER_TICKS");
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
            case 20:
                zu1Var.f9();
                return;
            case 21:
                zu1Var.i9();
                return;
            case 22:
                nr1 nr1Var = zu1Var.a0;
                if (nr1Var != null && zu1Var.dc != 5) {
                    nr1Var.o1();
                    return;
                }
                return;
            case 23:
                fd2 fd2Var = ((fd2[]) zu1Var.c0.b)[0];
                ema emaVar = fd2Var.d;
                ema emaVar2 = fd2Var.e;
                zu1Var.U1 = !zu1Var.U1;
                emaVar.setPivotX(0.0f);
                emaVar2.setPivotX(0.0f);
                if (zu1Var.U1) {
                    emaVar.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    emaVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    emaVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    emaVar2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                hl.d3(zu1Var.V1, 6000L);
                return;
            case 24:
                d31.b0(zu1Var).I(2131623982, ob6.M0(2131753283, null), ob6.M0(2131753284, null)).j();
                return;
            case 25:
                zu1Var.m5(false);
                return;
            case 26:
                zu1Var.R9();
                return;
            case 27:
                if (zu1Var.getUserConfig().p()) {
                    zu1Var.Bc = null;
                    zu1Var.zd(true);
                    d31.b0(zu1Var).c(ob6.M0(2131754481, null)).j();
                    zu1Var.getMessagesController().n0(true);
                    return;
                }
                zu1Var.showDialog(new xk8((e) zu1Var, 3, true));
                return;
            case 28:
                hl.B2(zu1Var.Z0);
                return;
            default:
                zu1Var.I9();
                return;
        }
    }
}
