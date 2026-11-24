package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class ay9 implements ee, v49 {
    public final vz9 a;

    public ay9(vz9 vz9Var) {
        this.a = vz9Var;
    }

    @Override
    public final void e() {
        this.a.l();
    }

    @Override
    public final void r(he heVar, int i) {
        vz9 vz9Var = this.a;
        int i2 = vz9Var.W;
        ConnectionsManager.getInstance(i2).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        hs6 d0 = hs6.d0(i2);
        ArrayList[] arrayListArr = d0.F0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        d0.E0[0] = 0;
        d0.getMessagesStorage().a.c(new vp6(d0, (byte) 9));
        ArrayList arrayList2 = arrayListArr[0];
        vz9Var.B(false, true, true);
    }
}
