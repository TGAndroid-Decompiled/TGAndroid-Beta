package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f16647a = 0;
    public final int f16648b;
    public final long f16649c;
    public final long d;
    public final int e;
    public final boolean f16650f;
    public final Object h;
    public final Object f16651n;
    public final Object f16652r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16649c = j3;
        this.f16648b = i10;
        this.e = i11;
        this.d = j10;
        this.f16651n = tL_messages_affectedHistory;
        this.f16650f = z10;
        this.f16652r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16647a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16649c, this.f16648b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16651n, this.f16650f, (Runnable) this.f16652r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16648b, this.f16649c, this.d, this.e, this.f16650f, (Context) this.f16651n, (String) this.f16652r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16648b = i10;
        this.f16649c = j3;
        this.d = j10;
        this.e = i11;
        this.f16650f = z10;
        this.f16651n = context;
        this.f16652r = str;
    }
}
