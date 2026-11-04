package ii;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m91;
import org.telegram.ui.uw;
public final class p1 implements u10 {
    public final m91 f15138a;
    public final uw f15139b;
    public final long f15140c;
    public final int d;

    public p1(m91 m91Var, uw uwVar, long j10, int i3) {
        this.f15138a = m91Var;
        this.f15139b = uwVar;
        this.f15140c = j10;
        this.d = i3;
    }

    @Override
    public final void a(Object obj) {
        String str;
        TLRPC.User user;
        int i3;
        Boolean bool = (Boolean) obj;
        m91 m91Var = this.f15138a;
        uw uwVar = this.f15139b;
        if (m91Var != null) {
            m91Var.finishFragment();
            uwVar.removeSelfFromStack();
        } else {
            uwVar.finishFragment();
        }
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        long j10 = this.f15140c;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.d;
        if (i10 >= 0) {
            TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(j10));
            str = l10.k(a22);
            user = a22;
        } else {
            TLRPC.Chat M0 = hp.s1(i11).M0(Long.valueOf(-j10));
            if (M0 == null) {
                str = "";
                user = M0;
            } else {
                str = M0.title;
                user = M0;
            }
        }
        fc a02 = fc.a0(T);
        if (bool.booleanValue()) {
            i3 = 2131752988;
        } else {
            i3 = 2131752987;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, i3, str));
        a02.getClass();
        a02.V(Arrays.asList(user), X2, null, null).k(false);
    }
}
