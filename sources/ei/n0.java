package ei;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.wy;
public final class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f7589a;
    public final long f7590b;
    public final boolean f7591c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;

    public n0(d2 d2Var, p2 p2Var, int i10, long j3, boolean z10) {
        this.d = d2Var;
        this.e = p2Var;
        this.f7589a = i10;
        this.f7590b = j3;
        this.f7591c = z10;
    }

    @Override
    public void run(boolean z10) {
        wy wyVar = (wy) this.d;
        long j3 = this.f7590b;
        boolean z11 = this.f7591c;
        wy.u0(this.f7589a, j3, (TLRPC.Chat) this.e, wyVar, z11, z10);
    }

    public n0(wy wyVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = wyVar;
        this.f7589a = i10;
        this.e = chat;
        this.f7590b = j3;
        this.f7591c = z10;
    }

    @Override
    public void run(long j3) {
        p2 p2Var = (p2) this.e;
        ((d2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.f7589a).linkCommunity(-j3, this.f7590b, this.f7591c, new o0(p2Var, j3, 0));
    }
}
