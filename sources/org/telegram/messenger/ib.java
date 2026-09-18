package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f16406a = 0;
    public final int f16407b;
    public final long f16408c;
    public final long d;
    public final int e;
    public final boolean f16409f;
    public final Object h;
    public final Object f16410n;
    public final Object f16411r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16408c = j3;
        this.f16407b = i10;
        this.e = i11;
        this.d = j10;
        this.f16410n = tL_messages_affectedHistory;
        this.f16409f = z10;
        this.f16411r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16406a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16408c, this.f16407b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16410n, this.f16409f, (Runnable) this.f16411r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16407b, this.f16408c, this.d, this.e, this.f16409f, (Context) this.f16410n, (String) this.f16411r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16407b = i10;
        this.f16408c = j3;
        this.d = j10;
        this.e = i11;
        this.f16409f = z10;
        this.f16410n = context;
        this.f16411r = str;
    }
}
