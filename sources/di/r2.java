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
import org.telegram.ui.Components.vj;
public final class r2 implements c20 {
    public final int f9689a;
    public final boolean f9690b;
    public final int f9691c;
    public final Object d;
    public final Object f9692e;

    public r2(int i7, int i10, Object obj, Object obj2, boolean z9) {
        this.f9689a = i10;
        this.d = obj;
        this.f9692e = obj2;
        this.f9690b = z9;
        this.f9691c = i7;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        String str;
        org.telegram.messenger.c accountInstance;
        boolean z9;
        switch (this.f9689a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f9692e;
                Long l10 = (Long) obj;
                i4 i4Var = ((t2) this.d).f9781a;
                TLRPC.User user = i4Var.M2.getAdapter().f16799w0;
                if (user != null) {
                    j3 = user.f27102id;
                } else {
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f26951id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = i4Var.M2.getAdapter().f16799w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.f2 f2Var = i4Var.f9192s0.f9543f;
                accountInstance = i4Var.getAccountInstance();
                long j10 = j3;
                gz.S(this.f9691c, i4Var.f9164k1, 0L, l10.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, i4Var.f9213x1.f9038a, f2Var, null, this.f9690b);
                i4Var.K1.setFieldText("");
                if (l10.longValue() <= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                i4Var.i0(z9);
                ui.b0(i4Var.f9168l2).v0(j10, false);
                return;
            case 1:
                k6 k6Var = (k6) this.d;
                List list = (List) this.f9692e;
                Long l11 = (Long) obj;
                n6 n6Var = k6Var.f9651q;
                TLObject f22 = qp.s1(k6Var.f9639c).f2(k6Var.D);
                k6Var.G = false;
                if (f22 != null) {
                    k6Var.q(this.f9691c, list, this.f9690b);
                    return;
                }
                k6Var.J = 0;
                k6Var.H = "";
                org.telegram.messenger.g0.r(n6Var);
                org.telegram.messenger.g0.h3(n6Var);
                return;
            default:
                ((vj) this.d).Q.p((ArrayList) this.f9692e, this.f9690b, this.f9691c, ((Long) obj).longValue());
                return;
        }
    }

    public r2(k6 k6Var, boolean z9, int i7, List list) {
        this.f9689a = 1;
        this.d = k6Var;
        this.f9690b = z9;
        this.f9691c = i7;
        this.f9692e = list;
    }
}
