package fi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.x10;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kk;
public final class l2 implements x10 {
    public final int f12214a;
    public final boolean f12215b;
    public final int f12216c;
    public final Object d;
    public final Object f12217e;

    public l2(int i7, int i10, Object obj, Object obj2, boolean z10) {
        this.f12214a = i10;
        this.d = obj;
        this.f12217e = obj2;
        this.f12215b = z10;
        this.f12216c = i7;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        String str;
        org.telegram.messenger.c accountInstance;
        boolean z10;
        switch (this.f12214a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f12217e;
                Long l10 = (Long) obj;
                z3 z3Var = ((m2) this.d).f12263a;
                TLRPC.User user = z3Var.N2.getAdapter().f17533x0;
                if (user != null) {
                    j3 = user.f28554id;
                } else {
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f28403id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = z3Var.N2.getAdapter().f17533x0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.h2 h2Var = z3Var.f12875t0.f11969f;
                accountInstance = z3Var.getAccountInstance();
                long j10 = j3;
                zy.S(this.f12216c, z3Var.l1, 0L, l10.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, z3Var.f12896y1.f12723a, h2Var, null, this.f12215b);
                z3Var.L1.setFieldText("");
                if (l10.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z3Var.i0(z10);
                ri.d0(z3Var.f12850m2).x0(j10, false);
                return;
            case 1:
                b6 b6Var = (b6) this.d;
                List list = (List) this.f12217e;
                Long l11 = (Long) obj;
                e6 e6Var = b6Var.f12056q;
                TLObject h22 = mp.u1(b6Var.f12044c).h2(b6Var.D);
                b6Var.G = false;
                if (h22 != null) {
                    b6Var.q(this.f12216c, list, this.f12215b);
                    return;
                }
                b6Var.J = 0;
                b6Var.H = "";
                org.telegram.messenger.g0.r(e6Var);
                org.telegram.messenger.g0.g3(e6Var);
                return;
            default:
                ((kk) this.d).R.p((ArrayList) this.f12217e, this.f12215b, this.f12216c, ((Long) obj).longValue());
                return;
        }
    }

    public l2(b6 b6Var, boolean z10, int i7, List list) {
        this.f12214a = 1;
        this.d = b6Var;
        this.f12215b = z10;
        this.f12216c = i7;
        this.f12217e = list;
    }
}
