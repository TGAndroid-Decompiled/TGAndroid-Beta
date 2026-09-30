package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f16664a = 0;
    public final int f16665b;
    public final long f16666c;
    public final long d;
    public final int e;
    public final boolean f16667f;
    public final Object h;
    public final Object f16668n;
    public final Object f16669r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16666c = j3;
        this.f16665b = i10;
        this.e = i11;
        this.d = j10;
        this.f16668n = tL_messages_affectedHistory;
        this.f16667f = z10;
        this.f16669r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16664a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16666c, this.f16665b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16668n, this.f16667f, (Runnable) this.f16669r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16665b, this.f16666c, this.d, this.e, this.f16667f, (Context) this.f16668n, (String) this.f16669r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16665b = i10;
        this.f16666c = j3;
        this.d = j10;
        this.e = i11;
        this.f16667f = z10;
        this.f16668n = context;
        this.f16669r = str;
    }
}
