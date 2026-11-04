package ei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.messenger.yy;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.uj;
public final class v2 implements u10 {
    public final int f11118a;
    public final boolean f11119b;
    public final int f11120c;
    public final Object d;
    public final Object f11121e;

    public v2(int i3, int i10, Object obj, Object obj2, boolean z10) {
        this.f11118a = i10;
        this.d = obj;
        this.f11121e = obj2;
        this.f11119b = z10;
        this.f11120c = i3;
    }

    @Override
    public final void a(Object obj) {
        long j10;
        String str;
        org.telegram.messenger.c accountInstance;
        boolean z10;
        switch (this.f11118a) {
            case 0:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f11121e;
                Long l10 = (Long) obj;
                j4 j4Var = ((w2) this.d).f11176a;
                TLRPC.User user = j4Var.N2.getAdapter().f17020x0;
                if (user != null) {
                    j10 = user.f27150id;
                } else {
                    j10 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f26999id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j10);
                TLRPC.User user2 = j4Var.N2.getAdapter().f17020x0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.d2 d2Var = j4Var.f10506t0.f10922f;
                accountInstance = j4Var.getAccountInstance();
                long j11 = j10;
                yy.S(this.f11120c, j4Var.f10477l1, 0L, l10.longValue(), hashMap, accountInstance, null, null, null, botInlineResult, j4Var.f10527y1.f10358a, d2Var, null, this.f11119b);
                j4Var.L1.setFieldText("");
                if (l10.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j4Var.i0(z10);
                li.b0(j4Var.f10480m2).v0(j11, false);
                return;
            case 1:
                l6 l6Var = (l6) this.d;
                List list = (List) this.f11121e;
                Long l11 = (Long) obj;
                o6 o6Var = l6Var.f10884q;
                TLObject f22 = hp.s1(l6Var.f10872c).f2(l6Var.D);
                l6Var.G = false;
                if (f22 != null) {
                    l6Var.q(this.f11120c, list, this.f11119b);
                    return;
                }
                l6Var.J = 0;
                l6Var.H = "";
                org.telegram.messenger.g0.r(o6Var);
                org.telegram.messenger.g0.h3(o6Var);
                return;
            default:
                ((uj) this.d).R.p((ArrayList) this.f11121e, this.f11119b, this.f11120c, ((Long) obj).longValue());
                return;
        }
    }

    public v2(l6 l6Var, boolean z10, int i3, List list) {
        this.f11118a = 1;
        this.d = l6Var;
        this.f11119b = z10;
        this.f11120c = i3;
        this.f11121e = list;
    }
}
