package defpackage;

import android.widget.ImageView;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class f45 implements qac {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public f45(b61 b61Var, b61 b61Var2, ImageView imageView, el7 el7Var, ylb ylbVar, oq6 oq6Var) {
        this.a = (byte) 1;
        this.b = b61Var;
        this.c = b61Var2;
        this.e = imageView;
        this.f = el7Var;
        this.d = ylbVar;
        this.g = oq6Var;
    }

    @Override
    public final void a(Object obj) {
        dj3 dj3Var;
        byte b = this.a;
        boolean z = true;
        boolean z2 = false;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.e;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                b61 b61Var = (b61) obj6;
                mk7 mk7Var = (mk7) obj5;
                ylb ylbVar = (ylb) obj4;
                if4 if4Var = (if4) obj3;
                s45 s45Var = (s45) obj2;
                String str = (String) obj;
                ((b61) obj7).setLoading(false);
                b61Var.setLoading(false);
                if (str == null) {
                    mk7Var.dismiss();
                    return;
                }
                c41.d0(str, mk7Var.F, ylbVar);
                if4Var.run();
                if (s45Var.n || s45Var.o) {
                    z = false;
                }
                b61Var.setEnabled(z);
                return;
            case 1:
                el7 el7Var = (el7) obj3;
                ylb ylbVar2 = (ylb) obj4;
                oq6 oq6Var = (oq6) obj2;
                String str2 = (String) obj;
                ((b61) obj7).setLoading(false);
                ((b61) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str2 == null) {
                    el7Var.dismiss();
                    return;
                }
                c41.d0(str2, el7Var.F, ylbVar2);
                oq6Var.run();
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                k11 k11Var = (k11) obj6;
                Long l = (Long) obj5;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                rc2 rc2Var = (rc2) obj3;
                k16 k16Var = (k16) obj2;
                vh1 vh1Var = (vh1) obj;
                String str3 = LaunchActivity.C1;
                if (k11Var != null) {
                    k11Var.b();
                }
                d Q = LaunchActivity.Q();
                if (Q instanceof bj6) {
                    Q = ((bj6) Q).b0();
                }
                d dVar = Q;
                if (dVar != null) {
                    ylb resourceProvider = dVar.getResourceProvider();
                    if (dVar.getLastStoryViewer() != null && dVar.getLastStoryViewer().K0) {
                        resourceProvider = dVar.getLastStoryViewer().E;
                    }
                    i46 i46Var = new i46(19, launchActivity.P, resourceProvider, launchActivity, dVar);
                    i46Var.r1(vh1Var);
                    if (!(dVar instanceof yv1) ? !(!(dVar instanceof nk3) || (dj3Var = ((nk3) dVar).H3) == null || dj3Var.getCurrentFragmetDialogId() != l.longValue()) : ((yv1) dVar).a() == l.longValue()) {
                        z2 = true;
                    }
                    i46Var.q1(tL_premium_boostsStatus, z2);
                    i46Var.s1(l.longValue());
                    i46Var.b2 = rc2Var;
                    dVar.showDialog(i46Var);
                    if (k16Var != null) {
                        try {
                            k16Var.run();
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) obj7;
                k11 k11Var2 = (k11) obj6;
                k16 k16Var2 = (k16) obj5;
                wh1 wh1Var = (wh1) obj4;
                Long l2 = (Long) obj3;
                rc2 rc2Var2 = (rc2) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                String str4 = LaunchActivity.C1;
                if (tL_premium_boostsStatus2 == null) {
                    if (k11Var2 != null) {
                        k11Var2.b();
                    }
                    if (k16Var2 != null) {
                        k16Var2.run();
                        return;
                    }
                    return;
                }
                wh1Var.b(l2.longValue(), tL_premium_boostsStatus2, new f45(launchActivity2, k11Var2, l2, tL_premium_boostsStatus2, rc2Var2, k16Var2, (byte) 2));
                return;
            default:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj4;
                my0 my0Var = (my0) obj3;
                jg jgVar = (jg) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((my0[]) obj7)[0] = null;
                xp7.a = null;
                if (((boolean[]) obj6)[0]) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    return;
                }
                inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                    jgVar.run();
                    return;
                }
                xp7.a = my0Var;
                my0Var.show();
                return;
        }
    }

    public f45(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = obj4;
        this.f = obj5;
        this.g = obj6;
    }
}
