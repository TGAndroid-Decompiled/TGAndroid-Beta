package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f16397a = 0;
    public final int f16398b;
    public final long f16399c;
    public final long d;
    public final int e;
    public final boolean f16400f;
    public final Object h;
    public final Object f16401n;
    public final Object f16402r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16399c = j3;
        this.f16398b = i10;
        this.e = i11;
        this.d = j10;
        this.f16401n = tL_messages_affectedHistory;
        this.f16400f = z10;
        this.f16402r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16397a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16399c, this.f16398b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16401n, this.f16400f, (Runnable) this.f16402r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16398b, this.f16399c, this.d, this.e, this.f16400f, (Context) this.f16401n, (String) this.f16402r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16398b = i10;
        this.f16399c = j3;
        this.d = j10;
        this.e = i11;
        this.f16400f = z10;
        this.f16401n = context;
        this.f16402r = str;
    }
}
