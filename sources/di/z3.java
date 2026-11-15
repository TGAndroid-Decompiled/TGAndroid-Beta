package di;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class z3 implements z10 {
    public final int f9824a;
    public final int f9825b;
    public final String f9826c;
    public final Object d;
    public final Object f9827e;
    public final Object f9828f;

    public z3(Object obj, Object obj2, Object obj3, int i7, String str, int i10) {
        this.f9824a = i10;
        this.d = obj;
        this.f9827e = obj2;
        this.f9828f = obj3;
        this.f9825b = i7;
        this.f9826c = str;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User user;
        int i7 = this.f9824a;
        Object obj2 = this.f9828f;
        Object obj3 = this.f9827e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new i1(context, e6Var, this.f9825b, this.f9826c, arrayList, false).show();
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                np npVar = (np) obj3;
                vf.b bVar = (vf.b) obj2;
                Long l10 = (Long) obj;
                String str = LaunchActivity.C1;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = npVar.a2(l10);
                } else {
                    user = null;
                }
                int i10 = this.f9825b;
                if (user != null && !q10.B(user)) {
                    launchActivity.Y(i10, user, this.f9826c, bVar);
                    return;
                }
                if (bVar != null) {
                    bVar.b();
                }
                if (user != null) {
                    launchActivity.m0(i10, user.f28200id, null);
                    return;
                }
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.messenger.k5.o(null, 2131748134, org.telegram.ui.Components.cc.a0(Q), null);
                    return;
                }
                return;
        }
    }
}
