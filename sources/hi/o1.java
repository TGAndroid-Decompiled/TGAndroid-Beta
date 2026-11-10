package hi;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.z91;
import org.telegram.ui.zw;
public final class o1 implements c20 {
    public final z91 f14841a;
    public final zw f14842b;
    public final long f14843c;
    public final int d;

    public o1(z91 z91Var, zw zwVar, long j3, int i7) {
        this.f14841a = z91Var;
        this.f14842b = zwVar;
        this.f14843c = j3;
        this.d = i7;
    }

    @Override
    public final void a(Object obj) {
        String str;
        TLRPC.User user;
        int i7;
        Boolean bool = (Boolean) obj;
        z91 z91Var = this.f14841a;
        zw zwVar = this.f14842b;
        if (z91Var != null) {
            z91Var.finishFragment();
            zwVar.removeSelfFromStack();
        } else {
            zwVar.finishFragment();
        }
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        long j3 = this.f14843c;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.d;
        if (i10 >= 0) {
            TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(j3));
            str = t10.k(a22);
            user = a22;
        } else {
            TLRPC.Chat M0 = qp.s1(i11).M0(Long.valueOf(-j3));
            if (M0 == null) {
                str = "";
                user = M0;
            } else {
                str = M0.title;
                user = M0;
            }
        }
        gc a02 = gc.a0(T);
        if (bool.booleanValue()) {
            i7 = 2131752988;
        } else {
            i7 = 2131752987;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.a0(null, null, i7, str));
        a02.getClass();
        a02.V(Arrays.asList(user), X2, null, null).k(false);
    }
}
