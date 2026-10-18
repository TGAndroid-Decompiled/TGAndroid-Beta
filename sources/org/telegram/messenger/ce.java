package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ce implements Runnable {
    public final int f18087a = 0;
    public final int f18088b;
    public final long f18089c;
    public final long d;
    public final int e;
    public final boolean f18090f;
    public final Object h;
    public final Object f18091n;
    public final Object f18092r;

    public ce(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f18089c = j10;
        this.f18088b = i10;
        this.e = i11;
        this.d = j11;
        this.f18091n = tL_messages_affectedHistory;
        this.f18090f = z10;
        this.f18092r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18087a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f18089c, this.f18088b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f18091n, this.f18090f, (Runnable) this.f18092r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f18088b, this.f18089c, this.d, this.e, this.f18090f, (Context) this.f18091n, (String) this.f18092r);
                return;
        }
    }

    public ce(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f18088b = i10;
        this.f18089c = j10;
        this.d = j11;
        this.e = i11;
        this.f18090f = z10;
        this.f18091n = context;
        this.f18092r = str;
    }
}
