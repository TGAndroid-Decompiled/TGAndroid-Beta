package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f16643a = 0;
    public final int f16644b;
    public final long f16645c;
    public final long d;
    public final int e;
    public final boolean f16646f;
    public final Object h;
    public final Object f16647n;
    public final Object f16648r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16645c = j3;
        this.f16644b = i10;
        this.e = i11;
        this.d = j10;
        this.f16647n = tL_messages_affectedHistory;
        this.f16646f = z10;
        this.f16648r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16643a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16645c, this.f16644b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16647n, this.f16646f, (Runnable) this.f16648r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16644b, this.f16645c, this.d, this.e, this.f16646f, (Context) this.f16647n, (String) this.f16648r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16644b = i10;
        this.f16645c = j3;
        this.d = j10;
        this.e = i11;
        this.f16646f = z10;
        this.f16647n = context;
        this.f16648r = str;
    }
}
