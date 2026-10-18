package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class be implements Runnable {
    public final int f17962a = 0;
    public final int f17963b;
    public final long f17964c;
    public final long d;
    public final int e;
    public final boolean f17965f;
    public final Object h;
    public final Object f17966n;
    public final Object f17967r;

    public be(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f17964c = j10;
        this.f17963b = i10;
        this.e = i11;
        this.d = j11;
        this.f17966n = tL_messages_affectedHistory;
        this.f17965f = z10;
        this.f17967r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17962a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f17964c, this.f17963b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17966n, this.f17965f, (Runnable) this.f17967r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f17963b, this.f17964c, this.d, this.e, this.f17965f, (Context) this.f17966n, (String) this.f17967r);
                return;
        }
    }

    public be(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f17963b = i10;
        this.f17964c = j10;
        this.d = j11;
        this.e = i11;
        this.f17965f = z10;
        this.f17966n = context;
        this.f17967r = str;
    }
}
