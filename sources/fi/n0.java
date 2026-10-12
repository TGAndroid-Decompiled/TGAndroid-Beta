package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.vy;
public final class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f10011a;
    public final long f10012b;
    public final boolean f10013c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f10014e;

    public n0(a2 a2Var, m2 m2Var, int i10, long j3, boolean z10) {
        this.d = a2Var;
        this.f10014e = m2Var;
        this.f10011a = i10;
        this.f10012b = j3;
        this.f10013c = z10;
    }

    @Override
    public void run(boolean z10) {
        vy vyVar = (vy) this.d;
        long j3 = this.f10012b;
        boolean z11 = this.f10013c;
        vy.t0(this.f10011a, j3, (TLRPC.Chat) this.f10014e, vyVar, z11, z10);
    }

    public n0(vy vyVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = vyVar;
        this.f10011a = i10;
        this.f10014e = chat;
        this.f10012b = j3;
        this.f10013c = z10;
    }

    @Override
    public void run(long j3) {
        m2 m2Var = (m2) this.f10014e;
        ((a2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.f10011a).linkCommunity(-j3, this.f10012b, this.f10013c, new o0(m2Var, j3, 0));
    }
}
