package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class xv9 implements ed, s29 {
    public final tx9 a;

    public xv9(tx9 tx9Var) {
        this.a = tx9Var;
    }

    @Override
    public final void f() {
        this.a.l();
    }

    @Override
    public final void u(hd hdVar, int i) {
        tx9 tx9Var = this.a;
        int i2 = tx9Var.W;
        ConnectionsManager.getInstance(i2).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        hq6 d0 = hq6.d0(i2);
        ArrayList[] arrayListArr = d0.F0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        d0.E0[0] = 0;
        d0.getMessagesStorage().a.c(new un6(d0, (byte) 9));
        ArrayList arrayList2 = arrayListArr[0];
        tx9Var.B(false, true, true);
    }
}
