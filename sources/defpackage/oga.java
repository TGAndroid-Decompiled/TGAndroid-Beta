package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class oga implements wc5 {
    public final eja a;

    public oga(eja ejaVar) {
        this.a = ejaVar;
    }

    @Override
    public final void a(xc5 xc5Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j);
        bundle.putBoolean("just_created_chat", true);
        xc5Var.presentFragment(new zu1(bundle), true);
        sha shaVar = this.a.S;
        e eVar = shaVar.r.y1;
        if (shaVar.n != 0) {
            eVar.getConnectionsManager().cancelRequest(shaVar.n, true);
            shaVar.n = 0;
        }
        shaVar.d.clear();
        shaVar.e = false;
        shaVar.h = false;
        shaVar.E(0L);
        TLRPC.User X1 = eVar.getMessagesController().X1(Long.valueOf(shaVar.F()));
        if (X1 != null) {
            eVar.getMessagesController().f3(X1, eVar.getClassGuid(), true, null);
        }
    }
}
