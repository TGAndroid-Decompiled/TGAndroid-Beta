package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hb implements Runnable {
    public final int f17878a = 0;
    public final int f17879b;
    public final long f17880c;
    public final long d;
    public final int f17881e;
    public final boolean f17882f;
    public final Object h;
    public final Object f17883n;
    public final Object f17884r;

    public hb(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f17880c = j3;
        this.f17879b = i10;
        this.f17881e = i11;
        this.d = j10;
        this.f17883n = tL_messages_affectedHistory;
        this.f17882f = z10;
        this.f17884r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17878a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f17880c, this.f17879b, this.f17881e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17883n, this.f17882f, (Runnable) this.f17884r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f17879b, this.f17880c, this.d, this.f17881e, this.f17882f, (Context) this.f17883n, (String) this.f17884r);
                return;
        }
    }

    public hb(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f17879b = i10;
        this.f17880c = j3;
        this.d = j10;
        this.f17881e = i11;
        this.f17882f = z10;
        this.f17883n = context;
        this.f17884r = str;
    }
}
