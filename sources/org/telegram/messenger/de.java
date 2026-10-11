package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class de implements Runnable {
    public final int f17689a = 0;
    public final int f17690b;
    public final long f17691c;
    public final long d;
    public final int f17692e;
    public final boolean f17693f;
    public final Object h;
    public final Object f17694n;
    public final Object f17695r;

    public de(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f17691c = j3;
        this.f17690b = i10;
        this.f17692e = i11;
        this.d = j10;
        this.f17694n = tL_messages_affectedHistory;
        this.f17693f = z10;
        this.f17695r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17689a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f17691c, this.f17690b, this.f17692e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17694n, this.f17693f, (Runnable) this.f17695r);
                return;
            default:
                VoIPGroupNotification.lambda$request$0((TLObject) this.h, this.f17690b, this.f17691c, this.d, this.f17692e, this.f17693f, (Context) this.f17694n, (String) this.f17695r);
                return;
        }
    }

    public de(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f17690b = i10;
        this.f17691c = j3;
        this.d = j10;
        this.f17692e = i11;
        this.f17693f = z10;
        this.f17694n = context;
        this.f17695r = str;
    }
}
