package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kb implements Runnable {
    public final int f20752a = 0;
    public final int f20753b;
    public final long f20754c;
    public final long d;
    public final int f20755e;
    public final boolean f20756f;
    public final Object h;
    public final Object f20757n;
    public final Object f20758r;

    public kb(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f20754c = j10;
        this.f20753b = i10;
        this.f20755e = i11;
        this.d = j11;
        this.f20757n = tL_messages_affectedHistory;
        this.f20756f = z10;
        this.f20758r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20752a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f20754c, this.f20753b, this.f20755e, this.d, (TLRPC.TL_messages_affectedHistory) this.f20757n, this.f20756f, (Runnable) this.f20758r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f20753b, this.f20754c, this.d, this.f20755e, this.f20756f, (Context) this.f20757n, (String) this.f20758r);
                return;
        }
    }

    public kb(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f20753b = i10;
        this.f20754c = j10;
        this.d = j11;
        this.f20755e = i11;
        this.f20756f = z10;
        this.f20757n = context;
        this.f20758r = str;
    }
}
