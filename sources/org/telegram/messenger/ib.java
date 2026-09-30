package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f16648a = 0;
    public final int f16649b;
    public final long f16650c;
    public final long d;
    public final int e;
    public final boolean f16651f;
    public final Object h;
    public final Object f16652n;
    public final Object f16653r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16650c = j3;
        this.f16649b = i10;
        this.e = i11;
        this.d = j10;
        this.f16652n = tL_messages_affectedHistory;
        this.f16651f = z10;
        this.f16653r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16648a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16650c, this.f16649b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16652n, this.f16651f, (Runnable) this.f16653r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16649b, this.f16650c, this.d, this.e, this.f16651f, (Context) this.f16652n, (String) this.f16653r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16649b = i10;
        this.f16650c = j3;
        this.d = j10;
        this.e = i11;
        this.f16651f = z10;
        this.f16652n = context;
        this.f16653r = str;
    }
}
