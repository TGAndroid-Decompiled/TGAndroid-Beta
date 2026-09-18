package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f16581a = 0;
    public final int f16582b;
    public final long f16583c;
    public final long d;
    public final int e;
    public final boolean f16584f;
    public final Object h;
    public final Object f16585n;
    public final Object f16586r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16583c = j3;
        this.f16582b = i10;
        this.e = i11;
        this.d = j10;
        this.f16585n = tL_messages_affectedHistory;
        this.f16584f = z10;
        this.f16586r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16581a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16583c, this.f16582b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16585n, this.f16584f, (Runnable) this.f16586r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16582b, this.f16583c, this.d, this.e, this.f16584f, (Context) this.f16585n, (String) this.f16586r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16582b = i10;
        this.f16583c = j3;
        this.d = j10;
        this.e = i11;
        this.f16584f = z10;
        this.f16585n = context;
        this.f16586r = str;
    }
}
