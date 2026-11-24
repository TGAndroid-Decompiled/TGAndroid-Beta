package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class en1 implements Runnable {
    public final byte a;
    public final yv1 b;

    public en1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void run() {
        a8 a8Var;
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                ms1 ms1Var = yv1Var.a0;
                if (ms1Var != null && yv1Var.ac != 5) {
                    ms1Var.j1();
                    return;
                }
                return;
            case 1:
                ae2 ae2Var = ((ae2[]) yv1Var.c0.b)[0];
                lka lkaVar = ae2Var.d;
                lka lkaVar2 = ae2Var.e;
                yv1Var.U1 = !yv1Var.U1;
                lkaVar.setPivotX(0.0f);
                lkaVar2.setPivotX(0.0f);
                if (yv1Var.U1) {
                    lkaVar.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    lkaVar2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                } else {
                    lkaVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    lkaVar2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                }
                gm.d3(yv1Var.V1, 6000L);
                return;
            case 2:
                yv1Var.resumeDelayedFragmentAnimation();
                us1 us1Var = yv1Var.ta;
                gm.r(us1Var);
                us1Var.run();
                yv1Var.getNotificationCenter().o();
                return;
            case 3:
                gm.d0(yv1Var.A0, new bn0((byte) 5));
                hu1 hu1Var = yv1Var.D0;
                if (hu1Var != null) {
                    hu1Var.J(true);
                    return;
                }
                return;
            case 4:
                yv1Var.N5(true);
                return;
            case 5:
                yv1Var.N5(true);
                return;
            case 6:
                gm.d0(yv1Var.A0, new bn0((byte) 4));
                hu1 hu1Var2 = yv1Var.D0;
                if (hu1Var2 != null) {
                    hu1Var2.J(false);
                    return;
                }
                return;
            case 7:
                yv1Var.cd();
                return;
            case 8:
                yv1Var.N5(false);
                kj8 kj8Var = new kj8((d) yv1Var, 24, true);
                kj8Var.p0 = false;
                kj8Var.I0 = new km1(yv1Var, (byte) 2);
                kj8Var.show();
                return;
            case 9:
                yv1Var.Q9();
                return;
            case 10:
                if (yv1Var.getUserConfig().p()) {
                    yv1Var.Ac = null;
                    yv1Var.zd(true);
                    c41.b0(yv1Var).c(jb6.M0(2131754485, null)).j();
                    yv1Var.getMessagesController().l0(true);
                    return;
                }
                yv1Var.showDialog(new kj8((d) yv1Var, 3, true));
                return;
            case 11:
                ms1 ms1Var2 = yv1Var.a0;
                if (ms1Var2 != null) {
                    ms1Var2.N0(true);
                    return;
                }
                return;
            case 12:
                yv1Var.H9();
                return;
            case 13:
                yv1Var.Na = null;
                yv1Var.Ma = -1;
                View view = yv1Var.fragmentView;
                if (view != null) {
                    view.requestLayout();
                    return;
                }
                return;
            case 14:
                ArrayList arrayList = yv1Var.M6;
                for (int i = 0; i < arrayList.size(); i++) {
                    TLRPC.Message message = ((k47) arrayList.get(i)).k;
                    if (message.mentioned && !message.media_unread) {
                        message.media_unread = false;
                    }
                }
                yv1Var.D6 = 0;
                yv1Var.getMessagesController().s3(yv1Var.l6, yv1Var.d());
                yv1Var.E6 = true;
                yv1Var.mc(false);
                m8 m8Var = yv1Var.g9;
                if (m8Var != null) {
                    m8Var.dismiss();
                    return;
                }
                return;
            case 15:
                ArrayList arrayList2 = yv1Var.M6;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    ((k47) arrayList2.get(i2)).g5();
                }
                yv1Var.A1 = 0;
                yv1Var.jd(true);
                yv1Var.getMessagesController().x3(yv1Var.l6, yv1Var.d());
                m8 m8Var2 = yv1Var.g9;
                if (m8Var2 != null) {
                    m8Var2.dismiss();
                    return;
                }
                return;
            case 16:
                ArrayList arrayList3 = yv1Var.M6;
                for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                    TLRPC.Message message2 = ((k47) arrayList3.get(i3)).k;
                    if (message2 != null) {
                        TLRPC.MessageMedia messageMedia = message2.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            ((TLRPC.TL_messageMediaPoll) messageMedia).results.has_unread_votes = false;
                        }
                    }
                }
                yv1Var.B1 = 0;
                yv1Var.id(true);
                yv1Var.getMessagesController().w3(yv1Var.l6, yv1Var.d());
                m8 m8Var3 = yv1Var.g9;
                if (m8Var3 != null) {
                    m8Var3.dismiss();
                    return;
                }
                return;
            case 17:
                yv1Var.z9();
                return;
            case 18:
                a8[] a8VarArr = yv1Var.k9;
                if (a8VarArr != null && a8VarArr.length > 0 && (a8Var = a8VarArr[0]) != null) {
                    a8Var.requestFocus();
                    yv1Var.k9[0].performAccessibilityAction(64, null);
                    yv1Var.k9[0].sendAccessibilityEvent(8);
                    return;
                }
                return;
            case 19:
                yv1Var.a0.j1();
                return;
            case 20:
                c41.b0(yv1Var).I(2131623982, jb6.M0(2131753255, null), jb6.M0(2131753256, null)).j();
                return;
            case 21:
                yv1Var.P4(false, false, false);
                return;
            case 22:
                yv1Var.P4(false, true, false);
                return;
            case 23:
                yv1Var.P4(true, false, false);
                return;
            case 24:
                yv1Var.Hc(true);
                yv1Var.yd(true);
                c41.z(yv1Var, 4, 0, yv1Var.Ba).j();
                return;
            case 25:
                yv1Var.Pc(false);
                return;
            case 26:
                yv1Var.y6(false, true, 0.0f);
                return;
            case 27:
                gm.B2(yv1Var.Y0);
                return;
            case 28:
                yv1Var.f5();
                return;
            default:
                yv1Var.Q4 = null;
                yv1Var.O7();
                yv1Var.Q7();
                return;
        }
    }
}
