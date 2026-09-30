package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.qy;
public final class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f9139a;
    public final long f9140b;
    public final boolean f9141c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;

    public n0(a2 a2Var, m2 m2Var, int i10, long j3, boolean z10) {
        this.d = a2Var;
        this.e = m2Var;
        this.f9139a = i10;
        this.f9140b = j3;
        this.f9141c = z10;
    }

    @Override
    public void run(boolean z10) {
        qy qyVar = (qy) this.d;
        long j3 = this.f9140b;
        boolean z11 = this.f9141c;
        qy.u0(this.f9139a, j3, (TLRPC.Chat) this.e, qyVar, z11, z10);
    }

    public n0(qy qyVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = qyVar;
        this.f9139a = i10;
        this.e = chat;
        this.f9140b = j3;
        this.f9141c = z10;
    }

    @Override
    public void run(long j3) {
        m2 m2Var = (m2) this.e;
        ((a2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.f9139a).linkCommunity(-j3, this.f9140b, this.f9141c, new o0(m2Var, j3, 0));
    }
}
