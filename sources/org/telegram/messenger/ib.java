package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f16640a = 0;
    public final int f16641b;
    public final long f16642c;
    public final long d;
    public final int e;
    public final boolean f16643f;
    public final Object h;
    public final Object f16644n;
    public final Object f16645r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16642c = j3;
        this.f16641b = i10;
        this.e = i11;
        this.d = j10;
        this.f16644n = tL_messages_affectedHistory;
        this.f16643f = z10;
        this.f16645r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16640a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16642c, this.f16641b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16644n, this.f16643f, (Runnable) this.f16645r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16641b, this.f16642c, this.d, this.e, this.f16643f, (Context) this.f16644n, (String) this.f16645r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16641b = i10;
        this.f16642c = j3;
        this.d = j10;
        this.e = i11;
        this.f16643f = z10;
        this.f16644n = context;
        this.f16645r = str;
    }
}
