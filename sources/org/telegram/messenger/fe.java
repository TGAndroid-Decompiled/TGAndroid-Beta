package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fe implements Runnable {
    public final int f18367a = 0;
    public final int f18368b;
    public final long f18369c;
    public final long d;
    public final int e;
    public final boolean f18370f;
    public final Object h;
    public final Object f18371n;
    public final Object f18372r;

    public fe(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f18369c = j10;
        this.f18368b = i10;
        this.e = i11;
        this.d = j11;
        this.f18371n = tL_messages_affectedHistory;
        this.f18370f = z10;
        this.f18372r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18367a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f18369c, this.f18368b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f18371n, this.f18370f, (Runnable) this.f18372r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f18368b, this.f18369c, this.d, this.e, this.f18370f, (Context) this.f18371n, (String) this.f18372r);
                return;
        }
    }

    public fe(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f18368b = i10;
        this.f18369c = j10;
        this.d = j11;
        this.e = i11;
        this.f18370f = z10;
        this.f18371n = context;
        this.f18372r = str;
    }
}
