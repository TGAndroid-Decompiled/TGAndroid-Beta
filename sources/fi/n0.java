package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.qy;
public final class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f9127a;
    public final long f9128b;
    public final boolean f9129c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;

    public n0(a2 a2Var, m2 m2Var, int i10, long j3, boolean z10) {
        this.d = a2Var;
        this.e = m2Var;
        this.f9127a = i10;
        this.f9128b = j3;
        this.f9129c = z10;
    }

    @Override
    public void run(boolean z10) {
        qy qyVar = (qy) this.d;
        long j3 = this.f9128b;
        boolean z11 = this.f9129c;
        qy.u0(this.f9127a, j3, (TLRPC.Chat) this.e, qyVar, z11, z10);
    }

    public n0(qy qyVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = qyVar;
        this.f9127a = i10;
        this.e = chat;
        this.f9128b = j3;
        this.f9129c = z10;
    }

    @Override
    public void run(long j3) {
        m2 m2Var = (m2) this.e;
        ((a2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.f9127a).linkCommunity(-j3, this.f9128b, this.f9129c, new o0(m2Var, j3, 0));
    }
}
