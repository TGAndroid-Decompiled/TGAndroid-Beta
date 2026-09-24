package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f16628a = 0;
    public final int f16629b;
    public final long f16630c;
    public final long d;
    public final int e;
    public final boolean f16631f;
    public final Object h;
    public final Object f16632n;
    public final Object f16633r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16630c = j3;
        this.f16629b = i10;
        this.e = i11;
        this.d = j10;
        this.f16632n = tL_messages_affectedHistory;
        this.f16631f = z10;
        this.f16633r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16628a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16630c, this.f16629b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16632n, this.f16631f, (Runnable) this.f16633r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16629b, this.f16630c, this.d, this.e, this.f16631f, (Context) this.f16632n, (String) this.f16633r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16629b = i10;
        this.f16630c = j3;
        this.d = j10;
        this.e = i11;
        this.f16631f = z10;
        this.f16632n = context;
        this.f16633r = str;
    }
}
