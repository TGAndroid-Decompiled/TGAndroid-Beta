package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hb implements Runnable {
    public final int f17905a = 0;
    public final int f17906b;
    public final long f17907c;
    public final long d;
    public final int f17908e;
    public final boolean f17909f;
    public final Object h;
    public final Object f17910n;
    public final Object f17911r;

    public hb(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f17907c = j3;
        this.f17906b = i10;
        this.f17908e = i11;
        this.d = j10;
        this.f17910n = tL_messages_affectedHistory;
        this.f17909f = z10;
        this.f17911r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17905a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f17907c, this.f17906b, this.f17908e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17910n, this.f17909f, (Runnable) this.f17911r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f17906b, this.f17907c, this.d, this.f17908e, this.f17909f, (Context) this.f17910n, (String) this.f17911r);
                return;
        }
    }

    public hb(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f17906b = i10;
        this.f17907c = j3;
        this.d = j10;
        this.f17908e = i11;
        this.f17909f = z10;
        this.f17910n = context;
        this.f17911r = str;
    }
}
