package ci;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class i4 implements u10 {
    public final int f5288a;
    public final int f5289b;
    public final String f5290c;
    public final Object d;
    public final Object f5291e;
    public final Object f5292f;

    public i4(Object obj, Object obj2, Object obj3, int i3, String str, int i10) {
        this.f5288a = i10;
        this.d = obj;
        this.f5291e = obj2;
        this.f5292f = obj3;
        this.f5289b = i3;
        this.f5290c = str;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User user;
        int i3 = this.f5288a;
        Object obj2 = this.f5292f;
        Object obj3 = this.f5291e;
        Object obj4 = this.d;
        switch (i3) {
            case 0:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new p1(context, e6Var, this.f5289b, this.f5290c, arrayList, false).show();
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                hp hpVar = (hp) obj3;
                sf.b bVar = (sf.b) obj2;
                Long l10 = (Long) obj;
                String str = LaunchActivity.E1;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = hpVar.a2(l10);
                } else {
                    user = null;
                }
                int i10 = this.f5289b;
                if (user != null && !l10.B(user)) {
                    launchActivity.Y(i10, user, this.f5290c, bVar);
                    return;
                }
                if (bVar != null) {
                    bVar.b();
                }
                if (user != null) {
                    launchActivity.m0(i10, user.f27150id, null);
                    return;
                }
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.messenger.k5.p(null, 2131748142, org.telegram.ui.Components.fc.a0(Q), null);
                    return;
                }
                return;
        }
    }
}
