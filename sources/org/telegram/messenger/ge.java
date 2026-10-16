package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ge implements Runnable {
    public final int f17019a = 0;
    public final int f17020b;
    public final long f17021c;
    public final long d;
    public final int e;
    public final boolean f17022f;
    public final Object h;
    public final Object f17023n;
    public final Object f17024r;

    public ge(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f17021c = j10;
        this.f17020b = i10;
        this.e = i11;
        this.d = j11;
        this.f17023n = tL_messages_affectedHistory;
        this.f17022f = z10;
        this.f17024r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17019a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f17021c, this.f17020b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17023n, this.f17022f, (Runnable) this.f17024r);
                return;
            default:
                VoIPGroupNotification.lambda$request$0((TLObject) this.h, this.f17020b, this.f17021c, this.d, this.e, this.f17022f, (Context) this.f17023n, (String) this.f17024r);
                return;
        }
    }

    public ge(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f17020b = i10;
        this.f17021c = j10;
        this.d = j11;
        this.e = i11;
        this.f17022f = z10;
        this.f17023n = context;
        this.f17024r = str;
    }
}
