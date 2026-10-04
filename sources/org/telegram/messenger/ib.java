package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f18159a = 0;
    public final int f18160b;
    public final long f18161c;
    public final long d;
    public final int f18162e;
    public final boolean f18163f;
    public final Object h;
    public final Object f18164n;
    public final Object f18165r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f18161c = j3;
        this.f18160b = i10;
        this.f18162e = i11;
        this.d = j10;
        this.f18164n = tL_messages_affectedHistory;
        this.f18163f = z10;
        this.f18165r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18159a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f18161c, this.f18160b, this.f18162e, this.d, (TLRPC.TL_messages_affectedHistory) this.f18164n, this.f18163f, (Runnable) this.f18165r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f18160b, this.f18161c, this.d, this.f18162e, this.f18163f, (Context) this.f18164n, (String) this.f18165r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f18160b = i10;
        this.f18161c = j3;
        this.d = j10;
        this.f18162e = i11;
        this.f18163f = z10;
        this.f18164n = context;
        this.f18165r = str;
    }
}
