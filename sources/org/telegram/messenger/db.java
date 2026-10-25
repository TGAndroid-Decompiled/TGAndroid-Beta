package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class db implements Runnable {
    public final int f19899a = 0;
    public final int f19900b;
    public final long f19901c;
    public final long d;
    public final int e;
    public final boolean f19902f;
    public final Object h;
    public final Object f19903n;
    public final Object f19904r;

    public db(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f19901c = j10;
        this.f19900b = i10;
        this.e = i11;
        this.d = j11;
        this.f19903n = tL_messages_affectedHistory;
        this.f19902f = z10;
        this.f19904r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19899a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$469(this.f19901c, this.f19900b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f19903n, this.f19902f, (Runnable) this.f19904r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f19900b, this.f19901c, this.d, this.e, this.f19902f, (Context) this.f19903n, (String) this.f19904r);
                return;
        }
    }

    public db(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f19900b = i10;
        this.f19901c = j10;
        this.d = j11;
        this.e = i11;
        this.f19902f = z10;
        this.f19903n = context;
        this.f19904r = str;
    }
}
