package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.SharedPreferences;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q;
public final class hm1 implements Runnable {
    public final byte a;
    public final zu1 b;

    public hm1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void run() {
        nr1 nr1Var;
        View sendButton;
        View sendButton2;
        boolean z;
        boolean z2;
        byte b = this.a;
        TLRPC.ChatTheme chatTheme = null;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = zu1Var.M6;
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.Message message = ((r47) arrayList.get(i)).k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                zu1Var.D6 = 0;
                zu1Var.getMessagesController().w3(zu1Var.l6, zu1Var.c());
                zu1Var.E6 = true;
                zu1Var.mc(false);
                n8 n8Var = zu1Var.g9;
                if (n8Var != null) {
                    n8Var.dismiss();
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = zu1Var.M6;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    ((r47) arrayList2.get(i2)).g5();
                }
                zu1Var.A1 = 0;
                zu1Var.jd(true);
                zu1Var.getMessagesController().B3(zu1Var.l6, zu1Var.c());
                n8 n8Var2 = zu1Var.g9;
                if (n8Var2 != null) {
                    n8Var2.dismiss();
                    return;
                }
                return;
            case 2:
                ArrayList arrayList3 = zu1Var.M6;
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    TLRPC.Message message2 = ((r47) arrayList3.get(i3)).k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                zu1Var.B1 = 0;
                zu1Var.id(true);
                zu1Var.getMessagesController().A3(zu1Var.l6, zu1Var.c());
                n8 n8Var3 = zu1Var.g9;
                if (n8Var3 != null) {
                    n8Var3.dismiss();
                    return;
                }
                return;
            case 3:
                zu1Var.a0.o1();
                return;
            case 4:
                zu1Var.e5();
                return;
            case 5:
                zu1Var.P4(false, false, false);
                return;
            case 6:
                zu1Var.P4(false, true, false);
                return;
            case 7:
                zu1Var.P4(true, false, false);
                return;
            case 8:
                int childCount = zu1Var.A0.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = zu1Var.A0.getChildAt(i4);
                    if (childAt instanceof wb2) {
                        wb2 wb2Var = (wb2) childAt;
                        if (wb2Var.getMessageObject().D == 4) {
                            wb2Var.J1();
                        }
                    }
                }
                return;
            case 9:
                qr1 qr1Var = zu1Var.J8;
                if (qr1Var != null && qr1Var.getParent() != null) {
                    zu1Var.A0.i1();
                    zu1Var.L8.setDrawingReady(false);
                    zu1Var.J8.setTag(null);
                    zu1Var.m1.removeView(zu1Var.J8);
                    return;
                }
                return;
            case 10:
                hl.B2(zu1Var.Y0);
                return;
            case 11:
                TLRPC.UserFull userFull = zu1Var.s8;
                if (userFull != null) {
                    chatTheme = userFull.theme;
                }
                zu1Var.Hb(chatTheme);
                return;
            case 12:
                zu1Var.Q4 = null;
                zu1Var.O7();
                zu1Var.Q7();
                return;
            case 13:
                zu1Var.resumeDelayedFragmentAnimation();
                vr1 vr1Var = zu1Var.ta;
                hl.r(vr1Var);
                vr1Var.run();
                zu1Var.getNotificationCenter().o();
                return;
            case 14:
                if (zu1Var.getParentActivity() != null && zu1Var.fragmentView != null && (nr1Var = zu1Var.a0) != null && (sendButton = nr1Var.getSendButton()) != null && zu1Var.a0.getEditField() != null && zu1Var.a0.getEditField().getText().length() >= 5) {
                    boolean z3 = xea.a;
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    xea.K = System.currentTimeMillis();
                    int i5 = xea.J + 1;
                    xea.J = i5;
                    edit.putInt("scheduledOrNoSoundHintShows", i5);
                    edit.putLong("scheduledOrNoSoundHintSeenAt", xea.K);
                    edit.apply();
                    if (zu1Var.v2 == null) {
                        kg5 x4 = zu1Var.x4(280.0f, 3, -1, true);
                        zu1Var.v2 = x4;
                        x4.v0 = 0.0f;
                        x4.w0 = hl.L(56.0f) / 2.0f;
                        zu1Var.v2.t(ob6.M0(2131745575, null));
                    }
                    zu1Var.v2.x(sendButton, true);
                    zu1Var.w2 = true;
                    return;
                }
                return;
            case 15:
                zu1Var.L9 = false;
                zu1Var.E7(true);
                return;
            case 16:
                zu1Var.I7 = null;
                q qVar = zu1Var.q3;
                if (qVar != null) {
                    zq5 cameraContainer = qVar.getCameraContainer();
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_X, 0.5f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cameraContainer, View.SCALE_Y, 0.5f);
                    Property property = View.ALPHA;
                    animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(cameraContainer, property, 0.0f), ObjectAnimator.ofFloat(zu1Var.q3.getButtonsLayout(), property, 0.0f), ObjectAnimator.ofInt(zu1Var.q3.getPaint(), sn.b, 0), ObjectAnimator.ofFloat(zu1Var.q3.getMuteImageView(), property, 0.0f));
                    animatorSet.addListener(new zp1(zu1Var, (byte) 0));
                    animatorSet.start();
                    return;
                }
                return;
            case 17:
                if (zu1Var.getParentActivity() != null && zu1Var.fragmentView != null && zu1Var.a0 != null && zu1Var.cb == null && zu1Var.getMessagesController().M1(zu1Var.a()) <= 0 && (sendButton2 = zu1Var.a0.getSendButton()) != null && zu1Var.a0.getEditField() != null && zu1Var.a0.getEditField().getText().length() != 0) {
                    boolean z4 = xea.a;
                    SharedPreferences.Editor edit2 = uc7.e1().edit();
                    xea.M = System.currentTimeMillis();
                    int i6 = xea.L + 1;
                    xea.L = i6;
                    edit2.putInt("scheduledHintShows", i6);
                    edit2.putLong("scheduledHintSeenAt", xea.M);
                    edit2.apply();
                    if (zu1Var.x2 == null) {
                        kg5 x42 = zu1Var.x4(280.0f, 3, -1, true);
                        zu1Var.x2 = x42;
                        x42.v0 = 0.0f;
                        x42.t(ob6.M0(2131745577, null));
                    }
                    zu1Var.x2.x(sendButton2, true);
                    zu1Var.y2 = true;
                    return;
                }
                return;
            case 18:
                ArrayList arrayList4 = zu1Var.M6;
                zu1Var.wc = System.currentTimeMillis();
                if (zu1Var.A0 != null && zu1Var.D0 != null) {
                    int i7 = Integer.MAX_VALUE;
                    int i8 = Integer.MIN_VALUE;
                    for (int i9 = 0; i9 < zu1Var.A0.getChildCount(); i9++) {
                        View childAt2 = zu1Var.A0.getChildAt(i9);
                        if (childAt2 instanceof wb2) {
                            wb2 wb2Var2 = (wb2) childAt2;
                            if (wb2Var2.getCurrentMessagesGroup() != null) {
                                for (int i10 = 0; i10 < wb2Var2.getCurrentMessagesGroup().d.size(); i10++) {
                                    int e1 = ((r47) wb2Var2.getCurrentMessagesGroup().d.get(i10)).e1();
                                    i7 = Math.min(i7, e1);
                                    i8 = Math.max(i8, e1);
                                }
                            } else if (wb2Var2.getMessageObject() != null) {
                                int e12 = wb2Var2.getMessageObject().e1();
                                i7 = Math.min(i7, e12);
                                i8 = Math.max(i8, e12);
                            }
                        }
                    }
                    if (i7 <= i8) {
                        ArrayList arrayList5 = new ArrayList();
                        for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                            r47 r47Var = (r47) arrayList4.get(i11);
                            m47 m47Var = (m47) zu1Var.P6.f(r47Var.c1());
                            if (m47Var != null) {
                                ArrayList arrayList6 = m47Var.d;
                                if (!arrayList5.contains(Long.valueOf(m47Var.a))) {
                                    for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                                        r47 r47Var2 = (r47) arrayList6.get(i12);
                                        if (r47Var2 != null) {
                                            int e13 = r47Var2.e1();
                                            a5c a5cVar = zu1Var.getMessagesController().i4;
                                            if (e13 >= i7 - 7 && e13 <= i8 + 7) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            a5cVar.g(r47Var2, z2, false);
                                        }
                                    }
                                    arrayList5.add(Long.valueOf(m47Var.a));
                                }
                            } else {
                                int e14 = r47Var.e1();
                                a5c a5cVar2 = zu1Var.getMessagesController().i4;
                                if (e14 >= i7 - 7 && e14 <= i8 + 7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                a5cVar2.g(r47Var, z, false);
                            }
                        }
                    }
                }
                if (zu1Var.Z4 > 0 && zu1Var.X4 != null) {
                    zu1Var.getMessagesController().i4.g((r47) zu1Var.X4.get(Integer.valueOf(zu1Var.Z4)), true, false);
                }
                zu1Var.Ed();
                return;
            case 19:
                zu1Var.C7();
                zu1Var.gd(0, true);
                return;
            case 20:
                zu1Var.y6(false, true, 0.0f);
                return;
            case 21:
                zu1Var.ia();
                return;
            case 22:
                nr1 nr1Var2 = zu1Var.a0;
                if (nr1Var2 != null) {
                    nr1Var2.R0(true);
                    return;
                }
                return;
            case 23:
                zu1Var.y6(false, true, 0.0f);
                return;
            case 24:
                zu1Var.x9();
                return;
            case 25:
                zu1Var.y6(false, true, 0.0f);
                return;
            case 26:
                hl.B2(zu1Var.a1);
                return;
            case 27:
                zu1Var.Na = null;
                zu1Var.Ma = -1;
                View view = zu1Var.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 28:
                zu1Var.A9();
                return;
            default:
                zu1Var.y1.d(true);
                return;
        }
    }
}
