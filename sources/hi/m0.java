package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ey;
public final class m0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f12187a;
    public final long f12188b;
    public final boolean f12189c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;

    public m0(b2 b2Var, n2 n2Var, int i10, long j10, boolean z10) {
        this.d = b2Var;
        this.e = n2Var;
        this.f12187a = i10;
        this.f12188b = j10;
        this.f12189c = z10;
    }

    @Override
    public void run(boolean z10) {
        ey eyVar = (ey) this.d;
        long j10 = this.f12188b;
        boolean z11 = this.f12189c;
        ey.s0(this.f12187a, j10, (TLRPC.Chat) this.e, eyVar, z11, z10);
    }

    public m0(ey eyVar, int i10, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = eyVar;
        this.f12187a = i10;
        this.e = chat;
        this.f12188b = j10;
        this.f12189c = z10;
    }

    @Override
    public void run(long j10) {
        n2 n2Var = (n2) this.e;
        ((b2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.f12187a).linkCommunity(-j10, this.f12188b, this.f12189c, new n0(n2Var, j10, 0));
    }
}
