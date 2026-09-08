package gi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.uy;
public final class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f10760a;
    public final long f10761b;
    public final boolean f10762c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f10763e;

    public n0(b2 b2Var, n2 n2Var, int i10, long j3, boolean z10) {
        this.d = b2Var;
        this.f10763e = n2Var;
        this.f10760a = i10;
        this.f10761b = j3;
        this.f10762c = z10;
    }

    @Override
    public void run(boolean z10) {
        uy uyVar = (uy) this.d;
        long j3 = this.f10761b;
        boolean z11 = this.f10762c;
        uy.u0(this.f10760a, j3, (TLRPC.Chat) this.f10763e, uyVar, z11, z10);
    }

    public n0(uy uyVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = uyVar;
        this.f10760a = i10;
        this.f10763e = chat;
        this.f10761b = j3;
        this.f10762c = z10;
    }

    @Override
    public void run(long j3) {
        n2 n2Var = (n2) this.f10763e;
        ((b2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.f10760a).linkCommunity(-j3, this.f10761b, this.f10762c, new o0(n2Var, j3, 0));
    }
}
