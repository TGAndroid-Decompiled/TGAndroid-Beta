package nh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.dy;
public final class l0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f18673a;
    public final long f18674b;
    public final boolean f18675c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f18676e;

    public l0(c2 c2Var, o2 o2Var, int i9, long j10, boolean z10) {
        this.d = c2Var;
        this.f18676e = o2Var;
        this.f18673a = i9;
        this.f18674b = j10;
        this.f18675c = z10;
    }

    @Override
    public void run(boolean z10) {
        dy dyVar = (dy) this.d;
        long j10 = this.f18674b;
        boolean z11 = this.f18675c;
        dy.s0(this.f18673a, j10, (TLRPC.Chat) this.f18676e, dyVar, z11, z10);
    }

    public l0(dy dyVar, int i9, TLRPC.Chat chat, long j10, boolean z10) {
        this.d = dyVar;
        this.f18673a = i9;
        this.f18676e = chat;
        this.f18674b = j10;
        this.f18675c = z10;
    }

    @Override
    public void run(long j10) {
        o2 o2Var = (o2) this.f18676e;
        ((c2) this.d).dismiss();
        if (j10 == 0) {
            return;
        }
        MessagesController.getInstance(this.f18673a).linkCommunity(-j10, this.f18674b, this.f18675c, new fh.m(o2Var, j10, 1));
    }
}
