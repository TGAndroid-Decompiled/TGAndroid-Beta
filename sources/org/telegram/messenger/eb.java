package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class eb implements Runnable {
    public final int f20172a = 0;
    public final int f20173b;
    public final long f20174c;
    public final long d;
    public final int f20175e;
    public final boolean f20176f;
    public final Object h;
    public final Object f20177n;
    public final Object f20178r;

    public eb(MessagesController messagesController, long j10, int i9, int i10, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f20174c = j10;
        this.f20173b = i9;
        this.f20175e = i10;
        this.d = j11;
        this.f20177n = tL_messages_affectedHistory;
        this.f20176f = z10;
        this.f20178r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20172a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f20174c, this.f20173b, this.f20175e, this.d, (TLRPC.TL_messages_affectedHistory) this.f20177n, this.f20176f, (Runnable) this.f20178r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f20173b, this.f20174c, this.d, this.f20175e, this.f20176f, (Context) this.f20177n, (String) this.f20178r);
                return;
        }
    }

    public eb(TLObject tLObject, int i9, long j10, long j11, int i10, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f20173b = i9;
        this.f20174c = j10;
        this.d = j11;
        this.f20175e = i10;
        this.f20176f = z10;
        this.f20177n = context;
        this.f20178r = str;
    }
}
