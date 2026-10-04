package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.uy;
public final class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f9938a;
    public final long f9939b;
    public final boolean f9940c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f9941e;

    public n0(b2 b2Var, n2 n2Var, int i10, long j3, boolean z10) {
        this.d = b2Var;
        this.f9941e = n2Var;
        this.f9938a = i10;
        this.f9939b = j3;
        this.f9940c = z10;
    }

    @Override
    public void run(boolean z10) {
        uy uyVar = (uy) this.d;
        long j3 = this.f9939b;
        boolean z11 = this.f9940c;
        uy.u0(this.f9938a, j3, (TLRPC.Chat) this.f9941e, uyVar, z11, z10);
    }

    public n0(uy uyVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = uyVar;
        this.f9938a = i10;
        this.f9941e = chat;
        this.f9939b = j3;
        this.f9940c = z10;
    }

    @Override
    public void run(long j3) {
        n2 n2Var = (n2) this.f9941e;
        ((b2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.f9938a).linkCommunity(-j3, this.f9939b, this.f9940c, new o0(n2Var, j3, 0));
    }
}
