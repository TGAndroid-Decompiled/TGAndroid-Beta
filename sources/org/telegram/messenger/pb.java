package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pb implements Runnable {
    public final int f16044a = 0;
    public final int f16045b;
    public final long f16046c;
    public final long d;
    public final int e;
    public final boolean f16047f;
    public final Object h;
    public final Object f16048n;
    public final Object f16049r;

    public pb(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f16046c = j3;
        this.f16045b = i10;
        this.e = i11;
        this.d = j10;
        this.f16048n = tL_messages_affectedHistory;
        this.f16047f = z10;
        this.f16049r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f16044a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f16046c, this.f16045b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f16048n, this.f16047f, (Runnable) this.f16049r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f16045b, this.f16046c, this.d, this.e, this.f16047f, (Context) this.f16048n, (String) this.f16049r);
                return;
        }
    }

    public pb(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f16045b = i10;
        this.f16046c = j3;
        this.d = j10;
        this.e = i11;
        this.f16047f = z10;
        this.f16048n = context;
        this.f16049r = str;
    }
}
