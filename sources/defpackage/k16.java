package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class k16 implements pcc {
    public final byte a;
    public final int b;
    public final String c;
    public final Object d;
    public final Object e;
    public final Object f;

    public k16(Object obj, Object obj2, Object obj3, int i, String str, byte b) {
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
                uc7 uc7Var = (uc7) obj3;
                l01 l01Var = (l01) obj2;
                Long l = (Long) obj;
                String str = LaunchActivity.C1;
                if (l != null && l.longValue() > 0 && l.longValue() != Long.MAX_VALUE) {
                    user = uc7Var.X1(l);
                } else {
                    user = null;
                }
                int i = this.b;
                if (user != null && !lbc.D(user)) {
                    launchActivity.X(i, user, this.c, l01Var);
                    return;
                }
                if (l01Var != null) {
                    l01Var.b();
                }
                if (user != null) {
                    launchActivity.m0(i, user.id, null);
                    return;
                }
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    xnb.x(null, 2131747865, d31.b0(Q), null);
                    return;
                }
                return;
            default:
                Context context = (Context) obj3;
                vnb vnbVar = (vnb) obj2;
                ArrayList arrayList = (ArrayList) obj;
                ((boolean[]) obj4)[0] = false;
                if (arrayList != null) {
                    new gra(context, vnbVar, this.b, this.c, arrayList, false).show();
                    return;
                }
                return;
        }
    }
}
