package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.q;
public final class ho1 implements Runnable {
    public final byte a;
    public final yv1 b;

    public ho1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void run() {
        ms1 ms1Var;
        View sendButton;
        View sendButton2;
        boolean z;
        boolean z2;
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                ps1 ps1Var = yv1Var.J8;
                if (ps1Var != null && ps1Var.getParent() != null) {
                    yv1Var.A0.h1();
                    yv1Var.L8.setDrawingReady(false);
                    yv1Var.J8.setTag(null);
                    yv1Var.m1.removeView(yv1Var.J8);
                    return;
                }
                return;
            case 1:
                yv1Var.Tb = null;
                return;
            case 2:
                yv1Var.L9 = false;
                yv1Var.E7(true);
                return;
            case 3:
                yv1Var.I7 = null;
                q qVar = yv1Var.q3;
                if (qVar != null) {
                    wq5 cameraContainer = qVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(yv1Var.q3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(yv1Var.q3.getPaint(), so.b, 0), ObjectAnimator.ofFloat(yv1Var.q3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new yq1(yv1Var, (byte) 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 4:
                if (yv1Var.getParentActivity() != null && yv1Var.fragmentView != null && (ms1Var = yv1Var.a0) != null && (sendButton = ms1Var.getSendButton()) != null && yv1Var.a0.getEditField() != null && yv1Var.a0.getEditField().getText().length() >= 5) {
                    boolean z3 = gda.a;
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    gda.K = System.currentTimeMillis();
                    int i = gda.J + 1;
                    gda.J = i;
                    edit.putInt("scheduledOrNoSoundHintShows", i);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", gda.K);
                    edit.apply();
                    if (yv1Var.v2 == null) {
                        hg5 x4 = yv1Var.x4(280.0f, 3, -1, true);
                        yv1Var.v2 = x4;
                        x4.v0 = 0.0f;
                        x4.w0 = gm.L(56.0f) / 2.0f;
                        yv1Var.v2.t(jb6.M0(2131745581, null));
                    }
                    yv1Var.v2.x(sendButton, true);
                    yv1Var.w2 = true;
                    return;
                }
                return;
            case 5:
                yv1Var.y6(false, true, 0.0f);
                return;
            case 6:
                yv1Var.y6(false, true, 0.0f);
                return;
            case 7:
                ms1 ms1Var2 = yv1Var.a0;
                if (ms1Var2 != null && yv1Var.vd != null) {
                    boolean R0 = ms1Var2.R0();
                    ms1 ms1Var3 = yv1Var.a0;
                    if (R0) {
                        ms1Var3.J0(false);
                        gm.E3(yv1Var.vd.a);
                        ((fn0) yv1Var.vd.b.b).a(false, true);
                        return;
                    }
                    ms1Var3.z1(false, false, false);
                    yv1Var.a0.Y1();
                    ((fn0) yv1Var.vd.b.b).a(true, true);
                    return;
                }
                return;
            case 8:
                yv1Var.Ja();
                return;
            case 9:
                if (yv1Var.getParentActivity() != null && yv1Var.fragmentView != null && yv1Var.a0 != null && yv1Var.cb == null && yv1Var.getMessagesController().L1(yv1Var.a()) <= 0 && (sendButton2 = yv1Var.a0.getSendButton()) != null && yv1Var.a0.getEditField() != null && yv1Var.a0.getEditField().getText().length() != 0) {
                    boolean z4 = gda.a;
                    SharedPreferences.Editor edit2 = oc7.d1().edit();
                    gda.M = System.currentTimeMillis();
                    int i2 = gda.L + 1;
                    gda.L = i2;
                    edit2.putInt("scheduledHintShows", i2);
                    edit2.putLong("scheduledHintSeenAt", gda.M);
                    edit2.apply();
                    if (yv1Var.x2 == null) {
                        hg5 x42 = yv1Var.x4(280.0f, 3, -1, true);
                        yv1Var.x2 = x42;
                        x42.v0 = 0.0f;
                        x42.t(jb6.M0(2131745583, null));
                    }
                    yv1Var.x2.x(sendButton2, true);
                    yv1Var.y2 = true;
                    return;
                }
                return;
            case 10:
                yv1Var.C7();
                yv1Var.gd(0, true);
                return;
            case 11:
                yv1Var.y6(false, true, 0.0f);
                return;
            case 12:
                ArrayList arrayList = yv1Var.M6;
                yv1Var.vc = System.currentTimeMillis();
                if (yv1Var.A0 != null && yv1Var.D0 != null) {
                    int i3 = Integer.MAX_VALUE;
                    int i4 = Integer.MIN_VALUE;
                    for (int i5 = 0; i5 < yv1Var.A0.getChildCount(); i5++) {
                        View childAt = yv1Var.A0.getChildAt(i5);
                        if (childAt instanceof rc2) {
                            rc2 rc2Var = (rc2) childAt;
                            if (rc2Var.getCurrentMessagesGroup() != null) {
                                for (int i6 = 0; i6 < rc2Var.getCurrentMessagesGroup().d.size(); i6++) {
                                    int e1 = ((k47) rc2Var.getCurrentMessagesGroup().d.get(i6)).e1();
                                    i3 = Math.min(i3, e1);
                                    i4 = Math.max(i4, e1);
                                }
                            } else if (rc2Var.getMessageObject() != null) {
                                int e12 = rc2Var.getMessageObject().e1();
                                i3 = Math.min(i3, e12);
                                i4 = Math.max(i4, e12);
                            }
                        }
                    }
                    if (i3 <= i4) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            k47 k47Var = (k47) arrayList.get(i7);
                            f47 f47Var = (f47) yv1Var.P6.f(k47Var.c1());
                            if (f47Var != null) {
                                ArrayList arrayList3 = f47Var.d;
                                if (!arrayList2.contains(Long.valueOf(f47Var.a))) {
                                    for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                                        k47 k47Var2 = (k47) arrayList3.get(i8);
                                        if (k47Var2 != null) {
                                            int e13 = k47Var2.e1();
                                            b3c b3cVar = yv1Var.getMessagesController().i4;
                                            if (e13 >= i3 - 7 && e13 <= i4 + 7) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            b3cVar.g(k47Var2, z2, false);
                                        }
                                    }
                                    arrayList2.add(Long.valueOf(f47Var.a));
                                }
                            } else {
                                int e14 = k47Var.e1();
                                b3c b3cVar2 = yv1Var.getMessagesController().i4;
                                if (e14 >= i3 - 7 && e14 <= i4 + 7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                b3cVar2.g(k47Var, z, false);
                            }
                        }
                    }
                }
                if (yv1Var.Z4 > 0 && yv1Var.X4 != null) {
                    yv1Var.getMessagesController().i4.g((k47) yv1Var.X4.get(Integer.valueOf(yv1Var.Z4)), true, false);
                }
                yv1Var.Ed();
                return;
            case 13:
                yv1Var.y6(false, true, 0.0f);
                return;
            case 14:
                yv1Var.ha();
                return;
            case 15:
                yv1Var.w9();
                return;
            case 16:
                yv1Var.finishFragment();
                return;
            case 17:
                yv1Var.y6(false, true, 0.0f);
                return;
            case 18:
                yv1Var.getClass();
                he heVar = new he(3, yv1Var.Ba, yv1Var.getParentActivity());
                yv1Var.dc = heVar;
                heVar.setOnShowListener(new dn1(yv1Var, (byte) 1));
                yv1Var.dc.setOnCancelListener(yv1Var.Ja);
                yv1Var.dc.q(500L);
                return;
            case 19:
                yv1Var.Y5 = null;
                yv1Var.D6();
                return;
            case 20:
                yv1Var.Y5 = null;
                yv1Var.D6();
                return;
            case 21:
                gm.B2(yv1Var.a1);
                return;
            case 22:
                yv1Var.a5();
                return;
            case 23:
                yv1Var.a = (yv1Var.a + 1) % 3;
                return;
            case 24:
                yv1Var.b = !yv1Var.b;
                return;
            case 25:
                yv1Var.N5(true);
                ts2.u(null, 2131743657, c41.b0(yv1Var), 2131623982, 36);
                return;
            case 26:
                yv1Var.D0.N.clear();
                hu1 hu1Var = yv1Var.D0;
                hu1Var.M = false;
                hu1Var.J(true);
                yv1Var.sc(false);
                return;
            case 27:
                yv1Var.D0.N.clear();
                hu1 hu1Var2 = yv1Var.D0;
                hu1Var2.M = false;
                hu1Var2.J(true);
                yv1Var.sc(false);
                return;
            case 28:
                yv1Var.ad = 0;
                yv1Var.bd = false;
                yv1Var.A0.h1();
                return;
            default:
                yv1Var.Va = false;
                yv1Var.cd();
                return;
        }
    }
}
