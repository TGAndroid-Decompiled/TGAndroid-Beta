package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ge implements Runnable {
    public final int f17688a = 0;
    public final int f17689b;
    public final long f17690c;
    public final long d;
    public final int f17691e;
    public final boolean f17692f;
    public final Object h;
    public final Object f17693n;
    public final Object f17694r;

    public ge(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f17690c = j3;
        this.f17689b = i10;
        this.f17691e = i11;
        this.d = j10;
        this.f17693n = tL_messages_affectedHistory;
        this.f17692f = z10;
        this.f17694r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17688a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f17690c, this.f17689b, this.f17691e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17693n, this.f17692f, (Runnable) this.f17694r);
                return;
            default:
                VoIPGroupNotification.lambda$request$0((TLObject) this.h, this.f17689b, this.f17690c, this.d, this.f17691e, this.f17692f, (Context) this.f17693n, (String) this.f17694r);
                return;
        }
    }

    public ge(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f17689b = i10;
        this.f17690c = j3;
        this.d = j10;
        this.f17691e = i11;
        this.f17692f = z10;
        this.f17693n = context;
        this.f17694r = str;
    }
}
