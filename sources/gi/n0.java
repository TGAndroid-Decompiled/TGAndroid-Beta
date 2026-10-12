package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.yy;
public final class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f10220a;
    public final long f10221b;
    public final boolean f10222c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;

    public n0(a2 a2Var, m2 m2Var, int i10, long j10, boolean z10) {
        this.d = a2Var;
        this.e = m2Var;
        this.f10220a = i10;
        this.f10221b = j10;
        this.f10222c = z10;
    }

    @Override
    public void run(boolean z10) {
        yy yyVar = (yy) this.d;
        long j10 = this.f10221b;
        boolean z11 = this.f10222c;
        yy.t0(this.f10220a, j10, (TLRPC.Chat) this.e, yyVar, z11, z10);
    }

    public n0(yy yyVar, int i10, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = yyVar;
        this.f10220a = i10;
        this.e = chat;
        this.f10221b = j10;
        this.f10222c = z10;
    }

    @Override
    public void run(long j10) {
        m2 m2Var = (m2) this.e;
        ((a2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.f10220a).linkCommunity(-j10, this.f10221b, this.f10222c, new o0(m2Var, j10, 0));
    }
}
