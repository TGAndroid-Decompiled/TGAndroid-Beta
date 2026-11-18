package di;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class b4 implements x10 {
    public final int f8532a;
    public final int f8533b;
    public final String f8534c;
    public final Object d;
    public final Object f8535e;
    public final Object f8536f;

    public b4(Object obj, Object obj2, Object obj3, int i7, String str, int i10) {
        this.f8532a = i10;
        this.d = obj;
        this.f8535e = obj2;
        this.f8536f = obj3;
        this.f8533b = i7;
        this.f8534c = str;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User user;
        int i7 = this.f8532a;
        Object obj2 = this.f8536f;
        Object obj3 = this.f8535e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new h1(context, i6Var, this.f8533b, this.f8534c, arrayList, false).show();
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                mp mpVar = (mp) obj3;
                vf.b bVar = (vf.b) obj2;
                Long l10 = (Long) obj;
                String str = LaunchActivity.C1;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = mpVar.c2(l10);
                } else {
                    user = null;
                }
                int i10 = this.f8533b;
                if (user != null && !o10.C(user)) {
                    launchActivity.Y(i10, user, this.f8534c, bVar);
                    return;
                }
                if (bVar != null) {
                    bVar.b();
                }
                if (user != null) {
                    launchActivity.m0(i10, user.f28554id, null);
                    return;
                }
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.messenger.f3.o(null, 2131747942, org.telegram.ui.Components.lc.b0(Q), null);
                    return;
                }
                return;
        }
    }
}
