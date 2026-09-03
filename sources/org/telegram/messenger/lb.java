package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lb implements Runnable {
    public final int f17727a = 0;
    public final int f17728b;
    public final long f17729c;
    public final long d;
    public final int e;
    public final boolean f17730f;
    public final Object h;
    public final Object f17731n;
    public final Object f17732r;

    public lb(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z4, Runnable runnable) {
        this.h = messagesController;
        this.f17729c = j10;
        this.f17728b = i10;
        this.e = i11;
        this.d = j11;
        this.f17731n = tL_messages_affectedHistory;
        this.f17730f = z4;
        this.f17732r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17727a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f17729c, this.f17728b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17731n, this.f17730f, (Runnable) this.f17732r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f17728b, this.f17729c, this.d, this.e, this.f17730f, (Context) this.f17731n, (String) this.f17732r);
                return;
        }
    }

    public lb(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z4, Context context, String str) {
        this.h = tLObject;
        this.f17728b = i10;
        this.f17729c = j10;
        this.d = j11;
        this.e = i11;
        this.f17730f = z4;
        this.f17731n = context;
        this.f17732r = str;
    }
}
