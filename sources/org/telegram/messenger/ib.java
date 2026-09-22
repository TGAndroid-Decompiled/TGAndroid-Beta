package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f16644a = 0;
    public final int f16645b;
    public final long f16646c;
    public final long d;
    public final int e;
    public final boolean f16647f;
    public final Object h;
    public final Object f16648n;
    public final Object f16649r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16646c = j3;
        this.f16645b = i10;
        this.e = i11;
        this.d = j10;
        this.f16648n = tL_messages_affectedHistory;
        this.f16647f = z10;
        this.f16649r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16644a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16646c, this.f16645b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16648n, this.f16647f, (Runnable) this.f16649r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16645b, this.f16646c, this.d, this.e, this.f16647f, (Context) this.f16648n, (String) this.f16649r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16645b = i10;
        this.f16646c = j3;
        this.d = j10;
        this.e = i11;
        this.f16647f = z10;
        this.f16648n = context;
        this.f16649r = str;
    }
}
