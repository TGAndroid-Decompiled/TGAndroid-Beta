package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class de implements Runnable {
    public final int f18185a = 0;
    public final int f18186b;
    public final long f18187c;
    public final long d;
    public final int e;
    public final boolean f18188f;
    public final Object h;
    public final Object f18189n;
    public final Object f18190r;

    public de(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f18187c = j10;
        this.f18186b = i10;
        this.e = i11;
        this.d = j11;
        this.f18189n = tL_messages_affectedHistory;
        this.f18188f = z10;
        this.f18190r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18185a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f18187c, this.f18186b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f18189n, this.f18188f, (Runnable) this.f18190r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f18186b, this.f18187c, this.d, this.e, this.f18188f, (Context) this.f18189n, (String) this.f18190r);
                return;
        }
    }

    public de(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f18186b = i10;
        this.f18187c = j10;
        this.d = j11;
        this.e = i11;
        this.f18188f = z10;
        this.f18189n = context;
        this.f18190r = str;
    }
}
