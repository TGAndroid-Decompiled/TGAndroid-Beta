package oh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.gy;

public final class l0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {

    public final int f19522a;

    public final long f19523b;

    public final boolean f19524c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public final Object f19525e;

    public l0(b2 b2Var, n2 n2Var, int i10, long j10, boolean z10) {
        this.d = b2Var;
        this.f19525e = n2Var;
        this.f19522a = i10;
        this.f19523b = j10;
        this.f19524c = z10;
    }

    @Override
    public void run(boolean z10) {
        gy gyVar = (gy) this.d;
        TLRPC.Chat chat = (TLRPC.Chat) this.f19525e;
        gy.t0(this.f19522a, this.f19523b, chat, gyVar, this.f19524c, z10);
    }

    public l0(gy gyVar, int i10, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = gyVar;
        this.f19522a = i10;
        this.f19525e = chat;
        this.f19523b = j10;
        this.f19524c = z10;
    }

    @Override
    public void run(long j10) {
        b2 b2Var = (b2) this.d;
        n2 n2Var = (n2) this.f19525e;
        b2Var.dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.f19522a).linkCommunity(-j10, this.f19523b, this.f19524c, new gh.m(n2Var, j10, 1));
    }
}
