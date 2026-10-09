package fi;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ty;
public final class n0 implements MessagesStorage.LongCallback, MessagesStorage.BooleanCallback {
    public final int f10013a;
    public final long f10014b;
    public final boolean f10015c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f10016e;

    public n0(b2 b2Var, n2 n2Var, int i10, long j3, boolean z10) {
        this.d = b2Var;
        this.f10016e = n2Var;
        this.f10013a = i10;
        this.f10014b = j3;
        this.f10015c = z10;
    }

    @Override
    public void run(boolean z10) {
        ty tyVar = (ty) this.d;
        long j3 = this.f10014b;
        boolean z11 = this.f10015c;
        ty.t0(this.f10013a, j3, (TLRPC.Chat) this.f10016e, tyVar, z11, z10);
    }

    public n0(ty tyVar, int i10, TLRPC.Chat chat, long j3, boolean z10) {
        this.d = tyVar;
        this.f10013a = i10;
        this.f10016e = chat;
        this.f10014b = j3;
        this.f10015c = z10;
    }

    @Override
    public void run(long j3) {
        n2 n2Var = (n2) this.f10016e;
        ((b2) this.d).dismiss();
        if (j3 == 0) {
            return;
        }
        MessagesController.getInstance(this.f10013a).linkCommunity(-j3, this.f10014b, this.f10015c, new o0(n2Var, j3, 0));
    }
}
