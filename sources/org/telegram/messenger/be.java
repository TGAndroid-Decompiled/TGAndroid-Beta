package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class be implements Runnable {
    public final int f17946a = 0;
    public final int f17947b;
    public final long f17948c;
    public final long d;
    public final int e;
    public final boolean f17949f;
    public final Object h;
    public final Object f17950n;
    public final Object f17951r;

    public be(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f17948c = j10;
        this.f17947b = i10;
        this.e = i11;
        this.d = j11;
        this.f17950n = tL_messages_affectedHistory;
        this.f17949f = z10;
        this.f17951r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17946a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f17948c, this.f17947b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17950n, this.f17949f, (Runnable) this.f17951r);
                return;
            default:
                VoIPGroupNotification.lambda$request$0((TLObject) this.h, this.f17947b, this.f17948c, this.d, this.e, this.f17949f, (Context) this.f17950n, (String) this.f17951r);
                return;
        }
    }

    public be(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f17947b = i10;
        this.f17948c = j10;
        this.d = j11;
        this.e = i11;
        this.f17949f = z10;
        this.f17950n = context;
        this.f17951r = str;
    }
}
