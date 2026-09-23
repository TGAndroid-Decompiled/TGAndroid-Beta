package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f16382a = 0;
    public final int f16383b;
    public final long f16384c;
    public final long d;
    public final int e;
    public final boolean f16385f;
    public final Object h;
    public final Object f16386n;
    public final Object f16387r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16384c = j3;
        this.f16383b = i10;
        this.e = i11;
        this.d = j10;
        this.f16386n = tL_messages_affectedHistory;
        this.f16385f = z10;
        this.f16387r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16382a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16384c, this.f16383b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16386n, this.f16385f, (Runnable) this.f16387r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16383b, this.f16384c, this.d, this.e, this.f16385f, (Context) this.f16386n, (String) this.f16387r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16383b = i10;
        this.f16384c = j3;
        this.d = j10;
        this.e = i11;
        this.f16385f = z10;
        this.f16386n = context;
        this.f16387r = str;
    }
}
