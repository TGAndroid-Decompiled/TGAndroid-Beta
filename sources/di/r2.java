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
    public final int f9676a;
    public final boolean f9677b;
    public final int f9678c;
    public final Object d;
    public final Object f9679e;

    public r2(int i7, int i10, Object obj, Object obj2, boolean z9) {
        this.f9676a = i10;
        this.d = obj;
        this.f9679e = obj2;
        this.f9677b = z9;
        this.f9678c = i7;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        String str;
        org.telegram.messenger.c accountInstance;
        boolean z9;
        switch (this.f9676a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f9679e;
                Long l10 = (Long) obj;
                j4 j4Var = ((t2) this.d).f9775a;
                TLRPC.User user = j4Var.M2.getAdapter().f16802w0;
                if (user != null) {
                    j3 = user.f27105id;
                } else {
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f26954id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = j4Var.M2.getAdapter().f16802w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.f2 f2Var = j4Var.f9224s0.f9608f;
                accountInstance = j4Var.getAccountInstance();
                long j10 = j3;
                gz.S(this.f9678c, j4Var.f9196k1, 0L, l10.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, j4Var.f9245x1.f9064a, f2Var, null, this.f9677b);
                j4Var.K1.setFieldText("");
                if (l10.longValue() <= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                j4Var.i0(z9);
                ui.b0(j4Var.f9200l2).v0(j10, false);
                return;
            case 1:
                l6 l6Var = (l6) this.d;
                List list = (List) this.f9679e;
                Long l11 = (Long) obj;
                o6 o6Var = l6Var.f9702q;
                TLObject f22 = qp.s1(l6Var.f9690c).f2(l6Var.D);
                l6Var.G = false;
                if (f22 != null) {
                    l6Var.q(this.f9678c, list, this.f9677b);
                    return;
                }
                l6Var.J = 0;
                l6Var.H = "";
                org.telegram.messenger.g0.r(o6Var);
                org.telegram.messenger.g0.h3(o6Var);
                return;
            default:
                ((vj) this.d).Q.p((ArrayList) this.f9679e, this.f9677b, this.f9678c, ((Long) obj).longValue());
                return;
        }
    }

    public r2(l6 l6Var, boolean z9, int i7, List list) {
        this.f9676a = 1;
        this.d = l6Var;
        this.f9677b = z9;
        this.f9678c = i7;
        this.f9679e = list;
    }
}
