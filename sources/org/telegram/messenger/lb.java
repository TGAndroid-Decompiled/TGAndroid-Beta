package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lb implements Runnable {
    public final int f17748a = 0;
    public final int f17749b;
    public final long f17750c;
    public final long d;
    public final int e;
    public final boolean f17751f;
    public final Object h;
    public final Object f17752n;
    public final Object f17753r;

    public lb(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z4, Runnable runnable) {
        this.h = messagesController;
        this.f17750c = j10;
        this.f17749b = i10;
        this.e = i11;
        this.d = j11;
        this.f17752n = tL_messages_affectedHistory;
        this.f17751f = z4;
        this.f17753r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17748a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f17750c, this.f17749b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17752n, this.f17751f, (Runnable) this.f17753r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f17749b, this.f17750c, this.d, this.e, this.f17751f, (Context) this.f17752n, (String) this.f17753r);
                return;
        }
    }

    public lb(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z4, Context context, String str) {
        this.h = tLObject;
        this.f17749b = i10;
        this.f17750c = j10;
        this.d = j11;
        this.e = i11;
        this.f17751f = z4;
        this.f17752n = context;
        this.f17753r = str;
    }
}
