package fi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ez;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dk;
public final class n2 implements z10 {
    public final int f12069a;
    public final boolean f12070b;
    public final int f12071c;
    public final Object d;
    public final Object f12072e;

    public n2(int i7, int i10, Object obj, Object obj2, boolean z10) {
        this.f12069a = i10;
        this.d = obj;
        this.f12072e = obj2;
        this.f12070b = z10;
        this.f12071c = i7;
    }

    @Override
    public final void a(Object obj) {
        long j3;
        String str;
        org.telegram.messenger.c accountInstance;
        boolean z10;
        switch (this.f12069a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f12072e;
                Long l10 = (Long) obj;
                b4 b4Var = ((o2) this.d).f12111a;
                TLRPC.User user = b4Var.N2.getAdapter().f17147x0;
                if (user != null) {
                    j3 = user.f28200id;
                } else {
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f28049id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = b4Var.N2.getAdapter().f17147x0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.e2 e2Var = b4Var.f11522t0.f11844f;
                accountInstance = b4Var.getAccountInstance();
                long j10 = j3;
                ez.S(this.f12071c, b4Var.l1, 0L, l10.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, b4Var.f11543y1.f12579a, e2Var, null, this.f12070b);
                b4Var.L1.setFieldText("");
                if (l10.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b4Var.i0(z10);
                si.b0(b4Var.f11497m2).v0(j10, false);
                return;
            case 1:
                d6 d6Var = (d6) this.d;
                List list = (List) this.f12072e;
                Long l11 = (Long) obj;
                h6 h6Var = d6Var.f11952q;
                TLObject f22 = np.s1(d6Var.f11940c).f2(d6Var.D);
                d6Var.G = false;
                if (f22 != null) {
                    d6Var.q(this.f12071c, list, this.f12070b);
                    return;
                }
                d6Var.J = 0;
                d6Var.H = "";
                org.telegram.messenger.g0.r(h6Var);
                org.telegram.messenger.g0.h3(h6Var);
                return;
            default:
                ((dk) this.d).R.p((ArrayList) this.f12072e, this.f12070b, this.f12071c, ((Long) obj).longValue());
                return;
        }
    }

    public n2(d6 d6Var, boolean z10, int i7, List list) {
        this.f12069a = 1;
        this.d = d6Var;
        this.f12070b = z10;
        this.f12071c = i7;
        this.f12072e = list;
    }
}
