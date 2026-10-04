package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f18150a = 0;
    public final int f18151b;
    public final long f18152c;
    public final long d;
    public final int f18153e;
    public final boolean f18154f;
    public final Object h;
    public final Object f18155n;
    public final Object f18156r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f18152c = j3;
        this.f18151b = i10;
        this.f18153e = i11;
        this.d = j10;
        this.f18155n = tL_messages_affectedHistory;
        this.f18154f = z10;
        this.f18156r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18150a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f18152c, this.f18151b, this.f18153e, this.d, (TLRPC.TL_messages_affectedHistory) this.f18155n, this.f18154f, (Runnable) this.f18156r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f18151b, this.f18152c, this.d, this.f18153e, this.f18154f, (Context) this.f18155n, (String) this.f18156r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f18151b = i10;
        this.f18152c = j3;
        this.d = j10;
        this.f18153e = i11;
        this.f18154f = z10;
        this.f18155n = context;
        this.f18156r = str;
    }
}
