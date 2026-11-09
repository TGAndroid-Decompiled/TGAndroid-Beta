package bi;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class z4 implements c20 {
    public final int f5146a;
    public final int f5147b;
    public final String f5148c;
    public final Object d;
    public final Object f5149e;
    public final Object f5150f;

    public z4(Object obj, Object obj2, Object obj3, int i7, String str, int i10) {
        this.f5146a = i10;
        this.d = obj;
        this.f5149e = obj2;
        this.f5150f = obj3;
        this.f5147b = i7;
        this.f5148c = str;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User user;
        int i7 = this.f5146a;
        Object obj2 = this.f5150f;
        Object obj3 = this.f5149e;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new w1(context, g6Var, this.f5147b, this.f5148c, arrayList, false).show();
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                qp qpVar = (qp) obj3;
                vf.b bVar = (vf.b) obj2;
                Long l10 = (Long) obj;
                String str = LaunchActivity.B1;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = qpVar.a2(l10);
                } else {
                    user = null;
                }
                int i10 = this.f5147b;
                if (user != null && !t10.B(user)) {
                    launchActivity.Y(i10, user, this.f5148c, bVar);
                    return;
                }
                if (bVar != null) {
                    bVar.b();
                }
                if (user != null) {
                    launchActivity.m0(i10, user.f27105id, null);
                    return;
                }
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.messenger.k5.p(null, 2131748134, org.telegram.ui.Components.hc.a0(Q), null);
                    return;
                }
                return;
        }
    }
}
