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
    public final int f12206a;
    public final boolean f12207b;
    public final int f12208c;
    public final Object d;
    public final Object f12209e;

    public l2(int i7, int i10, Object obj, Object obj2, boolean z10) {
        this.f12206a = i10;
        this.d = obj;
        this.f12209e = obj2;
        this.f12207b = z10;
        this.f12208c = i7;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        String str;
        org.telegram.messenger.c accountInstance;
        boolean z10;
        switch (this.f12206a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f12209e;
                Long l10 = (Long) obj;
                z3 z3Var = ((m2) this.d).f12255a;
                TLRPC.User user = z3Var.N2.getAdapter().f17524x0;
                if (user != null) {
                    j3 = user.f28547id;
                } else {
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f28396id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = z3Var.N2.getAdapter().f17524x0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.g2 g2Var = z3Var.f12867t0.f11961f;
                accountInstance = z3Var.getAccountInstance();
                long j10 = j3;
                az.S(this.f12208c, z3Var.l1, 0L, l10.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, z3Var.f12888y1.f12715a, g2Var, null, this.f12207b);
                z3Var.L1.setFieldText("");
                if (l10.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z3Var.i0(z10);
                si.d0(z3Var.f12842m2).x0(j10, false);
                return;
            case 1:
                b6 b6Var = (b6) this.d;
                List list = (List) this.f12209e;
                Long l11 = (Long) obj;
                e6 e6Var = b6Var.f12048q;
                TLObject h22 = np.u1(b6Var.f12036c).h2(b6Var.D);
                b6Var.G = false;
                if (h22 != null) {
                    b6Var.q(this.f12208c, list, this.f12207b);
                    return;
                }
                b6Var.J = 0;
                b6Var.H = "";
                org.telegram.messenger.g0.r(e6Var);
                org.telegram.messenger.g0.g3(e6Var);
                return;
            default:
                ((mk) this.d).R.p((ArrayList) this.f12209e, this.f12207b, this.f12208c, ((Long) obj).longValue());
                return;
        }
    }

    public l2(b6 b6Var, boolean z10, int i7, List list) {
        this.f12206a = 1;
        this.d = b6Var;
        this.f12207b = z10;
        this.f12208c = i7;
        this.f12209e = list;
    }
}
