package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.uy;
public final class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f10732a;
    public final long f10733b;
    public final boolean f10734c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f10735e;

    public n0(b2 b2Var, n2 n2Var, int i10, long j3, boolean z10) {
        this.d = b2Var;
        this.f10735e = n2Var;
        this.f10732a = i10;
        this.f10733b = j3;
        this.f10734c = z10;
    }

    @Override
    public void run(boolean z10) {
        uy uyVar = (uy) this.d;
        long j3 = this.f10733b;
        boolean z11 = this.f10734c;
        uy.u0(this.f10732a, j3, (TLRPC.Chat) this.f10735e, uyVar, z11, z10);
    }

    public n0(uy uyVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = uyVar;
        this.f10732a = i10;
        this.f10735e = chat;
        this.f10733b = j3;
        this.f10734c = z10;
    }

    @Override
    public void run(long j3) {
        n2 n2Var = (n2) this.f10735e;
        ((b2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.f10732a).linkCommunity(-j3, this.f10733b, this.f10734c, new o0(n2Var, j3, 0));
    }
}
