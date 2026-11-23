package fi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.az;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mk;
public final class l2 implements y10 {
    public final int f12256a;
    public final boolean f12257b;
    public final int f12258c;
    public final Object d;
    public final Object f12259e;

    public l2(int i7, int i10, Object obj, Object obj2, boolean z10) {
        this.f12256a = i10;
        this.d = obj;
        this.f12259e = obj2;
        this.f12257b = z10;
        this.f12258c = i7;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        String str;
        org.telegram.messenger.c accountInstance;
        boolean z10;
        switch (this.f12256a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f12259e;
                Long l10 = (Long) obj;
                z3 z3Var = ((m2) this.d).f12306a;
                TLRPC.User user = z3Var.N2.getAdapter().f17558x0;
                if (user != null) {
                    j3 = user.f28583id;
                } else {
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f28432id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = z3Var.N2.getAdapter().f17558x0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.g2 g2Var = z3Var.f12916t0.f12010f;
                accountInstance = z3Var.getAccountInstance();
                long j10 = j3;
                az.S(this.f12258c, z3Var.l1, 0L, l10.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, z3Var.f12937y1.f12765a, g2Var, null, this.f12257b);
                z3Var.L1.setFieldText("");
                if (l10.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z3Var.i0(z10);
                si.d0(z3Var.f12891m2).x0(j10, false);
                return;
            case 1:
                b6 b6Var = (b6) this.d;
                List list = (List) this.f12259e;
                Long l11 = (Long) obj;
                e6 e6Var = b6Var.f12097q;
                TLObject h22 = np.u1(b6Var.f12085c).h2(b6Var.D);
                b6Var.G = false;
                if (h22 != null) {
                    b6Var.q(this.f12258c, list, this.f12257b);
                    return;
                }
                b6Var.J = 0;
                b6Var.H = "";
                org.telegram.messenger.g0.r(e6Var);
                org.telegram.messenger.g0.g3(e6Var);
                return;
            default:
                ((mk) this.d).R.p((ArrayList) this.f12259e, this.f12257b, this.f12258c, ((Long) obj).longValue());
                return;
        }
    }

    public l2(b6 b6Var, boolean z10, int i7, List list) {
        this.f12256a = 1;
        this.d = b6Var;
        this.f12257b = z10;
        this.f12258c = i7;
        this.f12259e = list;
    }
}
