package ki;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u91;
import org.telegram.ui.yw;
public final class p1 implements z10 {
    public final u91 f18490a;
    public final yw f18491b;
    public final long f18492c;
    public final int d;

    public p1(u91 u91Var, yw ywVar, long j3, int i7) {
        this.f18490a = u91Var;
        this.f18491b = ywVar;
        this.f18492c = j3;
        this.d = i7;
    }

    @Override
    public final void a(Object obj) {
        String str;
        TLRPC.User user;
        int i7;
        Boolean bool = (Boolean) obj;
        u91 u91Var = this.f18490a;
        yw ywVar = this.f18491b;
        if (u91Var != null) {
            u91Var.finishFragment();
            ywVar.removeSelfFromStack();
        } else {
            ywVar.finishFragment();
        }
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        long j3 = this.f18492c;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.d;
        if (i10 >= 0) {
            TLRPC.User a22 = np.s1(i11).a2(Long.valueOf(j3));
            str = q10.k(a22);
            user = a22;
        } else {
            TLRPC.Chat M0 = np.s1(i11).M0(Long.valueOf(-j3));
            if (M0 == null) {
                str = "";
                user = M0;
            } else {
                str = M0.title;
                user = M0;
            }
        }
        cc a02 = cc.a0(T);
        if (bool.booleanValue()) {
            i7 = 2131752988;
        } else {
            i7 = 2131752987;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, i7, str));
        a02.getClass();
        a02.V(Arrays.asList(user), X2, null, null).k(false);
    }
}
