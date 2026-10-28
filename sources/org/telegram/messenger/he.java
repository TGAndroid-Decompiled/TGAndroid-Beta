package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class he implements Runnable {
    public final int f20248a = 0;
    public final int f20249b;
    public final long f20250c;
    public final long d;
    public final int e;
    public final boolean f20251f;
    public final Object h;
    public final Object f20252n;
    public final Object f20253r;

    public he(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f20250c = j10;
        this.f20249b = i10;
        this.e = i11;
        this.d = j11;
        this.f20252n = tL_messages_affectedHistory;
        this.f20251f = z10;
        this.f20253r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f20248a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$470(this.f20250c, this.f20249b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f20252n, this.f20251f, (Runnable) this.f20253r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f20249b, this.f20250c, this.d, this.e, this.f20251f, (Context) this.f20252n, (String) this.f20253r);
                return;
        }
    }

    public he(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f20249b = i10;
        this.f20250c = j10;
        this.d = j11;
        this.e = i11;
        this.f20251f = z10;
        this.f20252n = context;
        this.f20253r = str;
    }
}
