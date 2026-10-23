package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fe implements Runnable {
    public final int f18430a = 0;
    public final int f18431b;
    public final long f18432c;
    public final long d;
    public final int e;
    public final boolean f18433f;
    public final Object h;
    public final Object f18434n;
    public final Object f18435r;

    public fe(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f18432c = j10;
        this.f18431b = i10;
        this.e = i11;
        this.d = j11;
        this.f18434n = tL_messages_affectedHistory;
        this.f18433f = z10;
        this.f18435r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18430a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f18432c, this.f18431b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f18434n, this.f18433f, (Runnable) this.f18435r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f18431b, this.f18432c, this.d, this.e, this.f18433f, (Context) this.f18434n, (String) this.f18435r);
                return;
        }
    }

    public fe(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f18431b = i10;
        this.f18432c = j10;
        this.d = j11;
        this.e = i11;
        this.f18433f = z10;
        this.f18434n = context;
        this.f18435r = str;
    }
}
