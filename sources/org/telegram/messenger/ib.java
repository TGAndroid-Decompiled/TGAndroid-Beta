package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f18158a = 0;
    public final int f18159b;
    public final long f18160c;
    public final long d;
    public final int f18161e;
    public final boolean f18162f;
    public final Object h;
    public final Object f18163n;
    public final Object f18164r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f18160c = j3;
        this.f18159b = i10;
        this.f18161e = i11;
        this.d = j10;
        this.f18163n = tL_messages_affectedHistory;
        this.f18162f = z10;
        this.f18164r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18158a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f18160c, this.f18159b, this.f18161e, this.d, (TLRPC.TL_messages_affectedHistory) this.f18163n, this.f18162f, (Runnable) this.f18164r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f18159b, this.f18160c, this.d, this.f18161e, this.f18162f, (Context) this.f18163n, (String) this.f18164r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f18159b = i10;
        this.f18160c = j3;
        this.d = j10;
        this.f18161e = i11;
        this.f18162f = z10;
        this.f18163n = context;
        this.f18164r = str;
    }
}
