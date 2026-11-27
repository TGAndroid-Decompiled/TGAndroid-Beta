package defpackage;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class tra implements Runnable {
    public final byte a;
    public final wua b;
    public final String c;

    public tra(wua wuaVar, String str, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = str;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                wua wuaVar = this.b;
                String str = this.c;
                Context context = wuaVar.getContext();
                m01.w(context, uc7.s1(wuaVar.a).k4.O1.f + str, false);
                return;
            case 1:
                wua wuaVar2 = this.b;
                String str2 = this.c;
                Context context2 = wuaVar2.getContext();
                m01.w(context2, uc7.s1(wuaVar2.a).k4.O1.f + str2, false);
                return;
            case 2:
                wua wuaVar3 = this.b;
                String str3 = this.c;
                Context context3 = wuaVar3.getContext();
                m01.w(context3, uc7.s1(wuaVar3.a).k4.O1.f + str3, false);
                return;
            case 3:
                wua wuaVar4 = this.b;
                String str4 = this.c;
                Context context4 = wuaVar4.getContext();
                m01.w(context4, uc7.s1(wuaVar4.a).k4.O1.f + str4, false);
                return;
            case 4:
                wua wuaVar5 = this.b;
                String str5 = this.c;
                long j = wuaVar5.S1;
                wuaVar5.f2.setLoading(false);
                if (!TextUtils.isEmpty(str5)) {
                    wuaVar5.dismiss();
                    e Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof zu1) {
                            zu1 zu1Var = (zu1) Q;
                            if (zu1Var.a() == j) {
                                d31.b0(zu1Var).I(2131624034, ob6.M0(2131744753, null), hl.S2(ob6.a0(null, null, 2131744751, wf3.s(j)))).k(true);
                                return;
                            }
                        }
                        jn7 f = jn7.f(wuaVar5.a);
                        Long valueOf = Long.valueOf(j);
                        Boolean bool = Boolean.FALSE;
                        f.k(6, valueOf, bool);
                        jn7.f(wuaVar5.a).k(5, Long.valueOf(j), bool);
                        zu1 ha = zu1.ha(j);
                        ha.whenFullyVisible(new ida(wuaVar5, ha, (byte) 15));
                        Q.presentFragment(ha);
                        return;
                    }
                    return;
                }
                wuaVar5.A2(0, true, null);
                return;
            case 5:
                wua wuaVar6 = this.b;
                hl.g(this.c);
                v21 k = wuaVar6.j().k(false);
                k.u = true;
                k.j();
                return;
            case 6:
                wua wuaVar7 = this.b;
                String str6 = this.c;
                wuaVar7.dismiss();
                Context context5 = wuaVar7.getContext();
                m01.u(context5, "https://" + uc7.s1(wuaVar7.a).N2 + "/" + str6);
                return;
            case 7:
                wua wuaVar8 = this.b;
                String str7 = this.c;
                Context context6 = wuaVar8.getContext();
                m01.w(context6, uc7.s1(wuaVar8.a).k4.O1.f + str7, false);
                return;
            default:
                wua wuaVar9 = this.b;
                String str8 = this.c;
                Context context7 = wuaVar9.getContext();
                m01.w(context7, uc7.s1(wuaVar9.a).k4.O1.f + str8, false);
                return;
        }
    }
}
