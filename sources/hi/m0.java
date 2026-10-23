package hi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ey;
public final class m0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f12215a;
    public final long f12216b;
    public final boolean f12217c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;

    public m0(c2 c2Var, o2 o2Var, int i10, long j10, boolean z10) {
        this.d = c2Var;
        this.e = o2Var;
        this.f12215a = i10;
        this.f12216b = j10;
        this.f12217c = z10;
    }

    @Override
    public void run(boolean z10) {
        ey eyVar = (ey) this.d;
        long j10 = this.f12216b;
        boolean z11 = this.f12217c;
        ey.t0(this.f12215a, j10, (TLRPC.Chat) this.e, eyVar, z11, z10);
    }

    public m0(ey eyVar, int i10, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = eyVar;
        this.f12215a = i10;
        this.e = chat;
        this.f12216b = j10;
        this.f12217c = z10;
    }

    @Override
    public void run(long j10) {
        o2 o2Var = (o2) this.e;
        ((c2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.f12215a).linkCommunity(-j10, this.f12216b, this.f12217c, new n0(o2Var, j10, 0));
    }
}
