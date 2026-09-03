package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lb implements Runnable {
    public final int f19256a = 0;
    public final int f19257b;
    public final long f19258c;
    public final long d;
    public final int f19259e;
    public final boolean f19260f;
    public final Object h;
    public final Object f19261n;
    public final Object f19262r;

    public lb(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z4, Runnable runnable) {
        this.h = messagesController;
        this.f19258c = j10;
        this.f19257b = i10;
        this.f19259e = i11;
        this.d = j11;
        this.f19261n = tL_messages_affectedHistory;
        this.f19260f = z4;
        this.f19262r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f19256a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f19258c, this.f19257b, this.f19259e, this.d, (TLRPC.TL_messages_affectedHistory) this.f19261n, this.f19260f, (Runnable) this.f19262r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f19257b, this.f19258c, this.d, this.f19259e, this.f19260f, (Context) this.f19261n, (String) this.f19262r);
                return;
        }
    }

    public lb(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z4, Context context, String str) {
        this.h = tLObject;
        this.f19257b = i10;
        this.f19258c = j10;
        this.d = j11;
        this.f19259e = i11;
        this.f19260f = z4;
        this.f19261n = context;
        this.f19262r = str;
    }
}
