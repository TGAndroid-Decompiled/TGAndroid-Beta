package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ge implements Runnable {
    public final int f18436a = 0;
    public final int f18437b;
    public final long f18438c;
    public final long d;
    public final int e;
    public final boolean f18439f;
    public final Object h;
    public final Object f18440n;
    public final Object f18441r;

    public ge(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f18438c = j10;
        this.f18437b = i10;
        this.e = i11;
        this.d = j11;
        this.f18440n = tL_messages_affectedHistory;
        this.f18439f = z10;
        this.f18441r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18436a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f18438c, this.f18437b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f18440n, this.f18439f, (Runnable) this.f18441r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f18437b, this.f18438c, this.d, this.e, this.f18439f, (Context) this.f18440n, (String) this.f18441r);
                return;
        }
    }

    public ge(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f18437b = i10;
        this.f18438c = j10;
        this.d = j11;
        this.e = i11;
        this.f18439f = z10;
        this.f18440n = context;
        this.f18441r = str;
    }
}
