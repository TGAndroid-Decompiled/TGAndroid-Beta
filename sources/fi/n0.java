package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ry;
public final class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f9128a;
    public final long f9129b;
    public final boolean f9130c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;

    public n0(b2 b2Var, n2 n2Var, int i10, long j3, boolean z10) {
        this.d = b2Var;
        this.e = n2Var;
        this.f9128a = i10;
        this.f9129b = j3;
        this.f9130c = z10;
    }

    @Override
    public void run(boolean z10) {
        ry ryVar = (ry) this.d;
        long j3 = this.f9129b;
        boolean z11 = this.f9130c;
        ry.u0(this.f9128a, j3, (TLRPC.Chat) this.e, ryVar, z11, z10);
    }

    public n0(ry ryVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = ryVar;
        this.f9128a = i10;
        this.e = chat;
        this.f9129b = j3;
        this.f9130c = z10;
    }

    @Override
    public void run(long j3) {
        n2 n2Var = (n2) this.e;
        ((b2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.f9128a).linkCommunity(-j3, this.f9129b, this.f9130c, new o0(n2Var, j3, 0));
    }
}
