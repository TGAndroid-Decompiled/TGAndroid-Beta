package defpackage;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
public final class vm1 implements Runnable {
    public final byte a;
    public final mu1 b;

    public vm1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void run() {
        a8 a8Var;
        ar1 ar1Var;
        View sendButton;
        View sendButton2;
        boolean z;
        boolean z2;
        je5 je5Var;
        byte b = this.a;
        boolean z3 = true;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.za();
                return;
            case 1:
                mu1Var.u7();
                mu1Var.Uc(0, true);
                return;
            case 2:
                mu1Var.r6(false, true, 0.0f);
                return;
            case 3:
                a8[] a8VarArr = mu1Var.k9;
                if (a8VarArr != null && a8VarArr.length > 0 && (a8Var = a8VarArr[0]) != null) {
                    a8Var.requestFocus();
                    mu1Var.k9[0].performAccessibilityAction(64, null);
                    mu1Var.k9[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 4:
                mu1Var.Y5 = null;
                mu1Var.w6();
                return;
            case 5:
                mu1Var.Y5 = null;
                mu1Var.w6();
                return;
            case 6:
                if (mu1Var.getParentActivity() != null && mu1Var.fragmentView != null && (ar1Var = mu1Var.a0) != null && (sendButton = ar1Var.getSendButton()) != null && mu1Var.a0.getEditField() != null && mu1Var.a0.getEditField().getText().length() >= 5) {
                    boolean z4 = gba.a;
                    SharedPreferences.Editor edit = na7.c1().edit();
                    gba.K = System.currentTimeMillis();
                    int i = gba.J + 1;
                    gba.J = i;
                    edit.putInt("scheduledOrNoSoundHintShows", i);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", gba.K);
                    edit.apply();
                    if (mu1Var.v2 == null) {
                        je5 s4 = mu1Var.s4(280.0f, 3, -1, true);
                        mu1Var.v2 = s4;
                        s4.v0 = 0.0f;
                        s4.w0 = gl.L(56.0f) / 2.0f;
                        mu1Var.v2.t(k96.M0(2131745655, null));
                    }
                    mu1Var.v2.x(sendButton, true);
                    mu1Var.w2 = true;
                    return;
                }
                return;
            case 7:
                mu1Var.r6(false, true, 0.0f);
                return;
            case 8:
                if (mu1Var.getParentActivity() != null && mu1Var.fragmentView != null && mu1Var.a0 != null && mu1Var.cb == null && mu1Var.getMessagesController().K1(mu1Var.a()) <= 0 && (sendButton2 = mu1Var.a0.getSendButton()) != null && mu1Var.a0.getEditField() != null && mu1Var.a0.getEditField().getText().length() != 0) {
                    boolean z5 = gba.a;
                    SharedPreferences.Editor edit2 = na7.c1().edit();
                    gba.M = System.currentTimeMillis();
                    int i2 = gba.L + 1;
                    gba.L = i2;
                    edit2.putInt("scheduledHintShows", i2);
                    edit2.putLong("scheduledHintSeenAt", gba.M);
                    edit2.apply();
                    if (mu1Var.x2 == null) {
                        je5 s42 = mu1Var.s4(280.0f, 3, -1, true);
                        mu1Var.x2 = s42;
                        s42.v0 = 0.0f;
                        s42.t(k96.M0(2131745657, null));
                    }
                    mu1Var.x2.x(sendButton2, true);
                    mu1Var.y2 = true;
                    return;
                }
                return;
            case 9:
                mu1Var.m9();
                return;
            case 10:
                ArrayList arrayList = mu1Var.M6;
                mu1Var.lc = System.currentTimeMillis();
                if (mu1Var.A0 != null && mu1Var.D0 != null) {
                    int i3 = Integer.MAX_VALUE;
                    int i4 = Integer.MIN_VALUE;
                    for (int i5 = 0; i5 < mu1Var.A0.getChildCount(); i5++) {
                        View childAt = mu1Var.A0.getChildAt(i5);
                        if (childAt instanceof gb2) {
                            gb2 gb2Var = (gb2) childAt;
                            if (gb2Var.getCurrentMessagesGroup() != null) {
                                for (int i6 = 0; i6 < gb2Var.getCurrentMessagesGroup().d.size(); i6++) {
                                    int e1 = ((k27) gb2Var.getCurrentMessagesGroup().d.get(i6)).e1();
                                    i3 = Math.min(i3, e1);
                                    i4 = Math.max(i4, e1);
                                }
                            } else if (gb2Var.getMessageObject() != null) {
                                int e12 = gb2Var.getMessageObject().e1();
                                i3 = Math.min(i3, e12);
                                i4 = Math.max(i4, e12);
                            }
                        }
                    }
                    if (i3 <= i4) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            k27 k27Var = (k27) arrayList.get(i7);
                            f27 f27Var = (f27) mu1Var.P6.f(k27Var.c1());
                            if (f27Var != null) {
                                ArrayList arrayList3 = f27Var.d;
                                if (!arrayList2.contains(Long.valueOf(f27Var.a))) {
                                    for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                                        k27 k27Var2 = (k27) arrayList3.get(i8);
                                        if (k27Var2 != null) {
                                            int e13 = k27Var2.e1();
                                            b1c b1cVar = mu1Var.getMessagesController().i4;
                                            if (e13 >= i3 - 7 && e13 <= i4 + 7) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            b1cVar.g(k27Var2, z2, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(f27Var.a));
                                }
                            } else {
                                int e14 = k27Var.e1();
                                b1c b1cVar2 = mu1Var.getMessagesController().i4;
                                if (e14 >= i3 - 7 && e14 <= i4 + 7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                b1cVar2.g(k27Var, z, false);
                            }
                        }
                    }
                }
                if (mu1Var.Z4 > 0 && mu1Var.X4 != null) {
                    mu1Var.getMessagesController().i4.g((k27) mu1Var.X4.get(Integer.valueOf(mu1Var.Z4)), true, false);
                }
                mu1Var.sd();
                return;
            case 11:
                mu1Var.r6(false, true, 0.0f);
                return;
            case 12:
                mu1Var.X9();
                return;
            case 13:
                mu1Var.r6(false, true, 0.0f);
                return;
            case 14:
                mu1Var.getClass();
                hd hdVar = new hd(3, mu1Var.Ba, mu1Var.getParentActivity());
                mu1Var.Tb = hdVar;
                hdVar.setOnShowListener(new vl1(mu1Var, (byte) 1));
                mu1Var.Tb.setOnCancelListener(mu1Var.Ja);
                mu1Var.Tb.q(500L);
                return;
            case 15:
                mu1Var.finishFragment();
                return;
            case 16:
                mu1Var.r6(false, true, 0.0f);
                return;
            case 17:
                gl.B2(mu1Var.a1);
                return;
            case 18:
                mu1Var.T4();
                return;
            case 19:
                mu1Var.a = (mu1Var.a + 1) % 3;
                return;
            case 20:
                mu1Var.b = !mu1Var.b;
                return;
            case 21:
                mu1Var.D0.N.clear();
                vs1 vs1Var = mu1Var.D0;
                vs1Var.M = false;
                vs1Var.J(true);
                mu1Var.gc(false);
                return;
            case 22:
                mu1Var.G5(true);
                ir2.v(null, 2131743731, u21.b0(mu1Var), 2131623982, 36);
                return;
            case 23:
                mu1Var.D0.N.clear();
                vs1 vs1Var2 = mu1Var.D0;
                vs1Var2.M = false;
                vs1Var2.J(true);
                mu1Var.gc(false);
                return;
            case 24:
                mu1Var.Qc = 0;
                mu1Var.Rc = false;
                mu1Var.A0.h1();
                return;
            case 25:
                mu1Var.Va = false;
                mu1Var.Qc();
                return;
            case 26:
                mu1Var.G7();
                mu1Var.I7();
                mu1Var.x5();
                mu1Var.z5();
                return;
            case 27:
                dr1 dr1Var = mu1Var.g3;
                if ((dr1Var == null || dr1Var.getVisibility() != 0) && (je5Var = mu1Var.L1) != null) {
                    je5Var.v();
                    return;
                }
                return;
            case 28:
                mu1Var.q5();
                return;
            default:
                mu1Var.Uc(0, (mu1Var.h6 == 0 || SystemClock.elapsedRealtime() < mu1Var.h6 + 150) ? false : false);
                return;
        }
    }
}
