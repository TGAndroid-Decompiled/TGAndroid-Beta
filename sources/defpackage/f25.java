package defpackage;

import android.widget.ImageView;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class f25 implements p8c {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public f25(u41 u41Var, u41 u41Var2, ImageView imageView, cj7 cj7Var, wjb wjbVar, oo6 oo6Var) {
        this.a = (byte) 1;
        this.b = u41Var;
        this.c = u41Var2;
        this.e = imageView;
        this.f = cj7Var;
        this.d = wjbVar;
        this.g = oo6Var;
    }

    @Override
    public final void a(Object obj) {
        rh3 rh3Var;
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
                u41 u41Var = (u41) obj6;
                ki7 ki7Var = (ki7) obj5;
                wjb wjbVar = (wjb) obj4;
                jf4 jf4Var = (jf4) obj3;
                s25 s25Var = (s25) obj2;
                String str = (String) obj;
                ((u41) obj7).setLoading(false);
                u41Var.setLoading(false);
                if (str == null) {
                    ki7Var.dismiss();
                    return;
                }
                u21.d0(str, ki7Var.F, wjbVar);
                jf4Var.run();
                if (s25Var.n || s25Var.o) {
                    z = false;
                }
                u41Var.setEnabled(z);
                return;
            case 1:
                cj7 cj7Var = (cj7) obj3;
                wjb wjbVar2 = (wjb) obj4;
                oo6 oo6Var = (oo6) obj2;
                String str2 = (String) obj;
                ((u41) obj7).setLoading(false);
                ((u41) obj6).setEnabled(true);
                ((ImageView) obj5).setEnabled(true);
                if (str2 == null) {
                    cj7Var.dismiss();
                    return;
                }
                u21.d0(str2, cj7Var.F, wjbVar2);
                oo6Var.run();
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj7;
                c01 c01Var = (c01) obj6;
                Long l = (Long) obj5;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                gb2 gb2Var = (gb2) obj3;
                kz5 kz5Var = (kz5) obj2;
                ng1 ng1Var = (ng1) obj;
                String str3 = LaunchActivity.C1;
                if (c01Var != null) {
                    c01Var.b();
                }
                d Q = LaunchActivity.Q();
                if (Q instanceof ah6) {
                    Q = ((ah6) Q).b0();
                }
                d dVar = Q;
                if (dVar != null) {
                    wjb resourceProvider = dVar.getResourceProvider();
                    if (dVar.getLastStoryViewer() != null && dVar.getLastStoryViewer().K0) {
                        resourceProvider = dVar.getLastStoryViewer().E;
                    }
                    h26 h26Var = new h26(19, launchActivity.P, resourceProvider, launchActivity, dVar);
                    h26Var.r1(ng1Var);
                    if (!(dVar instanceof mu1) ? !(!(dVar instanceof cj3) || (rh3Var = ((cj3) dVar).H3) == null || rh3Var.getCurrentFragmetDialogId() != l.longValue()) : ((mu1) dVar).a() == l.longValue()) {
                        z2 = true;
                    }
                    h26Var.q1(tL_premium_boostsStatus, z2);
                    h26Var.s1(l.longValue());
                    h26Var.b2 = gb2Var;
                    dVar.showDialog(h26Var);
                    if (kz5Var != null) {
                        try {
                            kz5Var.run();
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                LaunchActivity launchActivity2 = (LaunchActivity) obj7;
                c01 c01Var2 = (c01) obj6;
                kz5 kz5Var2 = (kz5) obj5;
                og1 og1Var = (og1) obj4;
                Long l2 = (Long) obj3;
                gb2 gb2Var2 = (gb2) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                String str4 = LaunchActivity.C1;
                if (tL_premium_boostsStatus2 == null) {
                    if (c01Var2 != null) {
                        c01Var2.b();
                    }
                    if (kz5Var2 != null) {
                        kz5Var2.run();
                        return;
                    }
                    return;
                }
                og1Var.b(l2.longValue(), tL_premium_boostsStatus2, new f25(launchActivity2, c01Var2, l2, tL_premium_boostsStatus2, gb2Var2, kz5Var2, (byte) 2));
                return;
            default:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj5;
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) obj4;
                fx0 fx0Var = (fx0) obj3;
                jf jfVar = (jf) obj2;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = (TL_wallet.inputTonConnectOauthSession) obj;
                ((fx0[]) obj7)[0] = null;
                un7.a = null;
                if (((boolean[]) obj6)[0]) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    return;
                }
                inputtonconnectoauthsessionArr[0] = inputtonconnectoauthsession;
                if (!tL_urlAuthResultRequest.request_write_access && !tL_urlAuthResultRequest.request_phone_number) {
                    jfVar.run();
                    return;
                }
                un7.a = fx0Var;
                fx0Var.show();
                return;
        }
    }

    public f25(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = obj4;
        this.f = obj5;
        this.g = obj6;
    }
}
