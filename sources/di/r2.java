package di;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.c20;
import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.uj;
public final class r2 implements c20 {
    public final int f9681a;
    public final boolean f9682b;
    public final int f9683c;
    public final Object d;
    public final Object f9684e;

    public r2(int i7, int i10, Object obj, Object obj2, boolean z9) {
        this.f9681a = i10;
        this.d = obj;
        this.f9684e = obj2;
        this.f9682b = z9;
        this.f9683c = i7;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        String str;
        org.telegram.messenger.c accountInstance;
        boolean z9;
        switch (this.f9681a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f9684e;
                Long l10 = (Long) obj;
                j4 j4Var = ((t2) this.d).f9780a;
                TLRPC.User user = j4Var.M2.getAdapter().f16802w0;
                if (user != null) {
                    j3 = user.f27109id;
                } else {
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f26958id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = j4Var.M2.getAdapter().f16802w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.f2 f2Var = j4Var.f9229s0.f9613f;
                accountInstance = j4Var.getAccountInstance();
                long j10 = j3;
                gz.S(this.f9683c, j4Var.f9201k1, 0L, l10.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, j4Var.f9250x1.f9069a, f2Var, null, this.f9682b);
                j4Var.K1.setFieldText("");
                if (l10.longValue() <= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                j4Var.i0(z9);
                ui.b0(j4Var.f9205l2).v0(j10, false);
                return;
            case 1:
                l6 l6Var = (l6) this.d;
                List list = (List) this.f9684e;
                Long l11 = (Long) obj;
                o6 o6Var = l6Var.f9707q;
                TLObject f22 = qp.s1(l6Var.f9695c).f2(l6Var.D);
                l6Var.G = false;
                if (f22 != null) {
                    l6Var.q(this.f9683c, list, this.f9682b);
                    return;
                }
                l6Var.J = 0;
                l6Var.H = "";
                org.telegram.messenger.g0.r(o6Var);
                org.telegram.messenger.g0.h3(o6Var);
                return;
            default:
                ((uj) this.d).Q.p((ArrayList) this.f9684e, this.f9682b, this.f9683c, ((Long) obj).longValue());
                return;
        }
    }

    public r2(l6 l6Var, boolean z9, int i7, List list) {
        this.f9681a = 1;
        this.d = l6Var;
        this.f9682b = z9;
        this.f9683c = i7;
        this.f9684e = list;
    }
}
