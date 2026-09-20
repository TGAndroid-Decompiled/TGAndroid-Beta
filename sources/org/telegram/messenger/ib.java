package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f16629a = 0;
    public final int f16630b;
    public final long f16631c;
    public final long d;
    public final int e;
    public final boolean f16632f;
    public final Object h;
    public final Object f16633n;
    public final Object f16634r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16631c = j3;
        this.f16630b = i10;
        this.e = i11;
        this.d = j10;
        this.f16633n = tL_messages_affectedHistory;
        this.f16632f = z10;
        this.f16634r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16629a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16631c, this.f16630b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16633n, this.f16632f, (Runnable) this.f16634r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16630b, this.f16631c, this.d, this.e, this.f16632f, (Context) this.f16633n, (String) this.f16634r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16630b = i10;
        this.f16631c = j3;
        this.d = j10;
        this.e = i11;
        this.f16632f = z10;
        this.f16633n = context;
        this.f16634r = str;
    }
}
