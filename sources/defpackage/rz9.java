package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
public final class rz9 implements fd, h69 {
    public final n1a a;

    public rz9(n1a n1aVar) {
        this.a = n1aVar;
    }

    @Override
    public final void f() {
        this.a.l();
    }

    @Override
    public final void w(id idVar, int i) {
        n1a n1aVar = this.a;
        int i2 = n1aVar.W;
        ConnectionsManager.getInstance(i2).sendRequest(new TL_account.clearRecentEmojiStatuses(), null);
        ls6 d0 = ls6.d0(i2);
        ArrayList[] arrayListArr = d0.F0;
        ArrayList arrayList = arrayListArr[0];
        if (arrayList != null) {
            arrayList.clear();
        }
        d0.E0[0] = 0;
        d0.getMessagesStorage().a.c(new ip6(d0, (byte) 9));
        ArrayList arrayList2 = arrayListArr[0];
        n1aVar.B(false, true, true);
    }
}
