package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ib implements Runnable {

    public final int f20562a = 0;

    public final int f20563b;

    public final long f20564c;
    public final long d;

    public final int f20565e;

    public final boolean f20566f;
    public final Object h;

    public final Object f20567n;

    public final Object f20568r;

    public ib(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f20564c = j10;
        this.f20563b = i10;
        this.f20565e = i11;
        this.d = j11;
        this.f20567n = tL_messages_affectedHistory;
        this.f20566f = z10;
        this.f20568r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20562a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f20564c, this.f20563b, this.f20565e, this.d, (TLRPC.TL_messages_affectedHistory) this.f20567n, this.f20566f, (Runnable) this.f20568r);
                break;
            default:
                VoIPGroupNotification.lambda$request$0((TLObject) this.h, this.f20563b, this.f20564c, this.d, this.f20565e, this.f20566f, (Context) this.f20567n, (String) this.f20568r);
                break;
        }
    }

    public ib(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f20563b = i10;
        this.f20564c = j10;
        this.d = j11;
        this.f20565e = i11;
        this.f20566f = z10;
        this.f20567n = context;
        this.f20568r = str;
    }
}
