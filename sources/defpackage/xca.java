package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class xca implements va5 {
    public final nfa a;

    public xca(nfa nfaVar) {
        this.a = nfaVar;
    }

    @Override
    public final void a(wa5 wa5Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j);
        bundle.putBoolean("just_created_chat", true);
        wa5Var.presentFragment(new mu1(bundle), true);
        bea beaVar = this.a.S;
        d dVar = beaVar.r.y1;
        if (beaVar.n != 0) {
            dVar.getConnectionsManager().cancelRequest(beaVar.n, true);
            beaVar.n = 0;
        }
        beaVar.d.clear();
        beaVar.e = false;
        beaVar.h = false;
        beaVar.E(0L);
        TLRPC.User V1 = dVar.getMessagesController().V1(Long.valueOf(beaVar.F()));
        if (V1 != null) {
            dVar.getMessagesController().Z2(V1, dVar.getClassGuid(), true, null);
        }
    }
}
