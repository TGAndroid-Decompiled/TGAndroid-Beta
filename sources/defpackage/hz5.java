package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class hz5 implements p8c {
    public final byte a;
    public final int b;
    public final String c;
    public final Object d;
    public final Object e;
    public final Object f;

    public hz5(Object obj, Object obj2, Object obj3, int i, String str, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = i;
        this.c = str;
    }

    @Override
    public final void a(Object obj) {
        TLRPC.User user;
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                na7 na7Var = (na7) obj3;
                c01 c01Var = (c01) obj2;
                Long l = (Long) obj;
                String str = LaunchActivity.C1;
                if (l != null && l.longValue() > 0 && l.longValue() != Long.MAX_VALUE) {
                    user = na7Var.V1(l);
                } else {
                    user = null;
                }
                int i = this.b;
                if (user != null && !l7c.C(user)) {
                    launchActivity.X(i, user, this.c, c01Var);
                    return;
                }
                if (c01Var != null) {
                    c01Var.b();
                }
                if (user != null) {
                    launchActivity.m0(i, user.id, null);
                    return;
                }
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    yjb.x(null, 2131747942, u21.b0(Q), null);
                    return;
                }
                return;
            default:
                Context context = (Context) obj3;
                wjb wjbVar = (wjb) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new kna(context, wjbVar, this.b, this.c, arrayList, false).show();
                    return;
                }
                return;
        }
    }
}
