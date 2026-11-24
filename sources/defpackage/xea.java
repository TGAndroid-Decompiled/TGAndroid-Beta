package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class xea implements tc5 {
    public final nha a;

    public xea(nha nhaVar) {
        this.a = nhaVar;
    }

    @Override
    public final void a(uc5 uc5Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j);
        bundle.putBoolean("just_created_chat", true);
        uc5Var.presentFragment(new yv1(bundle), true);
        bga bgaVar = this.a.S;
        d dVar = bgaVar.r.y1;
        if (bgaVar.n != 0) {
            dVar.getConnectionsManager().cancelRequest(bgaVar.n, true);
            bgaVar.n = 0;
        }
        bgaVar.d.clear();
        bgaVar.e = false;
        bgaVar.h = false;
        bgaVar.E(0L);
        TLRPC.User W1 = dVar.getMessagesController().W1(Long.valueOf(bgaVar.F()));
        if (W1 != null) {
            dVar.getMessagesController().b3(W1, dVar.getClassGuid(), true, null);
        }
    }
}
