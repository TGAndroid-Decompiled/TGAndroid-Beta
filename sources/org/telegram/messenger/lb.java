package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lb implements Runnable {
    public final int f19254a = 0;
    public final int f19255b;
    public final long f19256c;
    public final long d;
    public final int f19257e;
    public final boolean f19258f;
    public final Object h;
    public final Object f19259n;
    public final Object f19260r;

    public lb(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z4, Runnable runnable) {
        this.h = messagesController;
        this.f19256c = j10;
        this.f19255b = i10;
        this.f19257e = i11;
        this.d = j11;
        this.f19259n = tL_messages_affectedHistory;
        this.f19258f = z4;
        this.f19260r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19254a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f19256c, this.f19255b, this.f19257e, this.d, (TLRPC.TL_messages_affectedHistory) this.f19259n, this.f19258f, (Runnable) this.f19260r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f19255b, this.f19256c, this.d, this.f19257e, this.f19258f, (Context) this.f19259n, (String) this.f19260r);
                return;
        }
    }

    public lb(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z4, Context context, String str) {
        this.h = tLObject;
        this.f19255b = i10;
        this.f19256c = j10;
        this.d = j11;
        this.f19257e = i11;
        this.f19258f = z4;
        this.f19259n = context;
        this.f19260r = str;
    }
}
