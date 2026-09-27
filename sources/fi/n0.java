package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ty;
public final class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f9132a;
    public final long f9133b;
    public final boolean f9134c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;

    public n0(c2 c2Var, o2 o2Var, int i10, long j3, boolean z10) {
        this.d = c2Var;
        this.e = o2Var;
        this.f9132a = i10;
        this.f9133b = j3;
        this.f9134c = z10;
    }

    @Override
    public void run(boolean z10) {
        ty tyVar = (ty) this.d;
        long j3 = this.f9133b;
        boolean z11 = this.f9134c;
        ty.u0(this.f9132a, j3, (TLRPC.Chat) this.e, tyVar, z11, z10);
    }

    public n0(ty tyVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = tyVar;
        this.f9132a = i10;
        this.e = chat;
        this.f9133b = j3;
        this.f9134c = z10;
    }

    @Override
    public void run(long j3) {
        o2 o2Var = (o2) this.e;
        ((c2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.f9132a).linkCommunity(-j3, this.f9133b, this.f9134c, new o0(o2Var, j3, 0));
    }
}
