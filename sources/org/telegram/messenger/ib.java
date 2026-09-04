package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f17958a = 0;
    public final int f17959b;
    public final long f17960c;
    public final long d;
    public final int f17961e;
    public final boolean f17962f;
    public final Object h;
    public final Object f17963n;
    public final Object f17964r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f17960c = j3;
        this.f17959b = i10;
        this.f17961e = i11;
        this.d = j10;
        this.f17963n = tL_messages_affectedHistory;
        this.f17962f = z10;
        this.f17964r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17958a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f17960c, this.f17959b, this.f17961e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17963n, this.f17962f, (Runnable) this.f17964r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f17959b, this.f17960c, this.d, this.f17961e, this.f17962f, (Context) this.f17963n, (String) this.f17964r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f17959b = i10;
        this.f17960c = j3;
        this.d = j10;
        this.f17961e = i11;
        this.f17962f = z10;
        this.f17963n = context;
        this.f17964r = str;
    }
}
