package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.sy;
public final class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f10012a;
    public final long f10013b;
    public final boolean f10014c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f10015e;

    public n0(a2 a2Var, m2 m2Var, int i10, long j3, boolean z10) {
        this.d = a2Var;
        this.f10015e = m2Var;
        this.f10012a = i10;
        this.f10013b = j3;
        this.f10014c = z10;
    }

    @Override
    public void run(boolean z10) {
        sy syVar = (sy) this.d;
        long j3 = this.f10013b;
        boolean z11 = this.f10014c;
        sy.t0(this.f10012a, j3, (TLRPC.Chat) this.f10015e, syVar, z11, z10);
    }

    public n0(sy syVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = syVar;
        this.f10012a = i10;
        this.f10015e = chat;
        this.f10013b = j3;
        this.f10014c = z10;
    }

    @Override
    public void run(long j3) {
        m2 m2Var = (m2) this.f10015e;
        ((a2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.f10012a).linkCommunity(-j3, this.f10013b, this.f10014c, new o0(m2Var, j3, 0));
    }
}
