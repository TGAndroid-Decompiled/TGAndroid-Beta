package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f18155a = 0;
    public final int f18156b;
    public final long f18157c;
    public final long d;
    public final int f18158e;
    public final boolean f18159f;
    public final Object h;
    public final Object f18160n;
    public final Object f18161r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f18157c = j3;
        this.f18156b = i10;
        this.f18158e = i11;
        this.d = j10;
        this.f18160n = tL_messages_affectedHistory;
        this.f18159f = z10;
        this.f18161r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18155a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f18157c, this.f18156b, this.f18158e, this.d, (TLRPC.TL_messages_affectedHistory) this.f18160n, this.f18159f, (Runnable) this.f18161r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f18156b, this.f18157c, this.d, this.f18158e, this.f18159f, (Context) this.f18160n, (String) this.f18161r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f18156b = i10;
        this.f18157c = j3;
        this.d = j10;
        this.f18158e = i11;
        this.f18159f = z10;
        this.f18160n = context;
        this.f18161r = str;
    }
}
