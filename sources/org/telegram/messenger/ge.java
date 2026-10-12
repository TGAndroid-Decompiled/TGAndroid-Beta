package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ge implements Runnable {
    public final int f17323a = 0;
    public final int f17324b;
    public final long f17325c;
    public final long d;
    public final int e;
    public final boolean f17326f;
    public final Object h;
    public final Object f17327n;
    public final Object f17328r;

    public ge(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f17325c = j10;
        this.f17324b = i10;
        this.e = i11;
        this.d = j11;
        this.f17327n = tL_messages_affectedHistory;
        this.f17326f = z10;
        this.f17328r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17323a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f17325c, this.f17324b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17327n, this.f17326f, (Runnable) this.f17328r);
                return;
            default:
                VoIPGroupNotification.lambda$request$0((TLObject) this.h, this.f17324b, this.f17325c, this.d, this.e, this.f17326f, (Context) this.f17327n, (String) this.f17328r);
                return;
        }
    }

    public ge(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f17324b = i10;
        this.f17325c = j10;
        this.d = j11;
        this.e = i11;
        this.f17326f = z10;
        this.f17327n = context;
        this.f17328r = str;
    }
}
