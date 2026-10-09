package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class de implements Runnable {
    public final int f17653a = 0;
    public final int f17654b;
    public final long f17655c;
    public final long d;
    public final int f17656e;
    public final boolean f17657f;
    public final Object h;
    public final Object f17658n;
    public final Object f17659r;

    public de(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f17655c = j3;
        this.f17654b = i10;
        this.f17656e = i11;
        this.d = j10;
        this.f17658n = tL_messages_affectedHistory;
        this.f17657f = z10;
        this.f17659r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17653a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f17655c, this.f17654b, this.f17656e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17658n, this.f17657f, (Runnable) this.f17659r);
                return;
            default:
                VoIPGroupNotification.lambda$request$0((TLObject) this.h, this.f17654b, this.f17655c, this.d, this.f17656e, this.f17657f, (Context) this.f17658n, (String) this.f17659r);
                return;
        }
    }

    public de(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f17654b = i10;
        this.f17655c = j3;
        this.d = j10;
        this.f17656e = i11;
        this.f17657f = z10;
        this.f17658n = context;
        this.f17659r = str;
    }
}
