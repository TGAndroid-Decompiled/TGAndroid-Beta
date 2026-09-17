package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.wy;
public final class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f9145a;
    public final long f9146b;
    public final boolean f9147c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;

    public n0(c2 c2Var, o2 o2Var, int i10, long j3, boolean z10) {
        this.d = c2Var;
        this.e = o2Var;
        this.f9145a = i10;
        this.f9146b = j3;
        this.f9147c = z10;
    }

    @Override
    public void run(boolean z10) {
        wy wyVar = (wy) this.d;
        long j3 = this.f9146b;
        boolean z11 = this.f9147c;
        wy.u0(this.f9145a, j3, (TLRPC.Chat) this.e, wyVar, z11, z10);
    }

    public n0(wy wyVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = wyVar;
        this.f9145a = i10;
        this.e = chat;
        this.f9146b = j3;
        this.f9147c = z10;
    }

    @Override
    public void run(long j3) {
        o2 o2Var = (o2) this.e;
        ((c2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.f9145a).linkCommunity(-j3, this.f9146b, this.f9147c, new o0(o2Var, j3, 0));
    }
}
