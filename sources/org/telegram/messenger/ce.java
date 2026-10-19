package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ce implements Runnable {
    public final int f18090a = 0;
    public final int f18091b;
    public final long f18092c;
    public final long d;
    public final int e;
    public final boolean f18093f;
    public final Object h;
    public final Object f18094n;
    public final Object f18095r;

    public ce(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f18092c = j10;
        this.f18091b = i10;
        this.e = i11;
        this.d = j11;
        this.f18094n = tL_messages_affectedHistory;
        this.f18093f = z10;
        this.f18095r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18090a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f18092c, this.f18091b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f18094n, this.f18093f, (Runnable) this.f18095r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f18091b, this.f18092c, this.d, this.e, this.f18093f, (Context) this.f18094n, (String) this.f18095r);
                return;
        }
    }

    public ce(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f18091b = i10;
        this.f18092c = j10;
        this.d = j11;
        this.e = i11;
        this.f18093f = z10;
        this.f18094n = context;
        this.f18095r = str;
    }
}
