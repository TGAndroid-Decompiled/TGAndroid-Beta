package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f16394a = 0;
    public final int f16395b;
    public final long f16396c;
    public final long d;
    public final int e;
    public final boolean f16397f;
    public final Object h;
    public final Object f16398n;
    public final Object f16399r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16396c = j3;
        this.f16395b = i10;
        this.e = i11;
        this.d = j10;
        this.f16398n = tL_messages_affectedHistory;
        this.f16397f = z10;
        this.f16399r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16394a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16396c, this.f16395b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16398n, this.f16397f, (Runnable) this.f16399r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16395b, this.f16396c, this.d, this.e, this.f16397f, (Context) this.f16398n, (String) this.f16399r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16395b = i10;
        this.f16396c = j3;
        this.d = j10;
        this.e = i11;
        this.f16397f = z10;
        this.f16398n = context;
        this.f16399r = str;
    }
}
