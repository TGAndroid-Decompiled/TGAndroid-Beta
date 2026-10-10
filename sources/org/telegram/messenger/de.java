package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class de implements Runnable {
    public final int f17657a = 0;
    public final int f17658b;
    public final long f17659c;
    public final long d;
    public final int f17660e;
    public final boolean f17661f;
    public final Object h;
    public final Object f17662n;
    public final Object f17663r;

    public de(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f17659c = j3;
        this.f17658b = i10;
        this.f17660e = i11;
        this.d = j10;
        this.f17662n = tL_messages_affectedHistory;
        this.f17661f = z10;
        this.f17663r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17657a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f17659c, this.f17658b, this.f17660e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17662n, this.f17661f, (Runnable) this.f17663r);
                return;
            default:
                VoIPGroupNotification.lambda$request$0((TLObject) this.h, this.f17658b, this.f17659c, this.d, this.f17660e, this.f17661f, (Context) this.f17662n, (String) this.f17663r);
                return;
        }
    }

    public de(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f17658b = i10;
        this.f17659c = j3;
        this.d = j10;
        this.f17660e = i11;
        this.f17661f = z10;
        this.f17662n = context;
        this.f17663r = str;
    }
}
