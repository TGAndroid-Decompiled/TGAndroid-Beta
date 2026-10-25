package ii;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.cy;
public final class l0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f14379a;
    public final long f14380b;
    public final boolean f14381c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;

    public l0(e2 e2Var, r2 r2Var, int i10, long j10, boolean z10) {
        this.d = e2Var;
        this.e = r2Var;
        this.f14379a = i10;
        this.f14380b = j10;
        this.f14381c = z10;
    }

    @Override
    public void run(boolean z10) {
        cy cyVar = (cy) this.d;
        long j10 = this.f14380b;
        boolean z11 = this.f14381c;
        cy.t0(this.f14379a, j10, (TLRPC.Chat) this.e, cyVar, z11, z10);
    }

    public l0(cy cyVar, int i10, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = cyVar;
        this.f14379a = i10;
        this.e = chat;
        this.f14380b = j10;
        this.f14381c = z10;
    }

    @Override
    public void run(long j10) {
        r2 r2Var = (r2) this.e;
        ((e2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.f14379a).linkCommunity(-j10, this.f14380b, this.f14381c, new m0(r2Var, j10, 0));
    }
}
