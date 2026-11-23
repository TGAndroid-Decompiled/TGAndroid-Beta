package di;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class b4 implements y10 {
    public final int f8516a;
    public final int f8517b;
    public final String f8518c;
    public final Object d;
    public final Object f8519e;
    public final Object f8520f;

    public b4(Object obj, Object obj2, Object obj3, int i7, String str, int i10) {
        this.f8516a = i10;
        this.d = obj;
        this.f8519e = obj2;
        this.f8520f = obj3;
        this.f8517b = i7;
        this.f8518c = str;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User user;
        int i7 = this.f8516a;
        Object obj2 = this.f8520f;
        Object obj3 = this.f8519e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new h1(context, h6Var, this.f8517b, this.f8518c, arrayList, false).show();
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
                    user = npVar.c2(l10);
                } else {
                    user = null;
                }
                int i10 = this.f8517b;
                if (user != null && !p10.C(user)) {
                    launchActivity.Y(i10, user, this.f8518c, bVar);
                    return;
                }
                if (bVar != null) {
                    bVar.b();
                }
                if (user != null) {
                    launchActivity.m0(i10, user.f28547id, null);
                    return;
                }
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.messenger.f3.o(null, 2131747941, org.telegram.ui.Components.lc.b0(Q), null);
                    return;
                }
                return;
        }
    }
}
