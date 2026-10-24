package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ge implements Runnable {
    public final int f18502a = 0;
    public final int f18503b;
    public final long f18504c;
    public final long d;
    public final int e;
    public final boolean f18505f;
    public final Object h;
    public final Object f18506n;
    public final Object f18507r;

    public ge(MessagesController messagesController, long j10, int i10, int i11, long j11, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f18504c = j10;
        this.f18503b = i10;
        this.e = i11;
        this.d = j11;
        this.f18506n = tL_messages_affectedHistory;
        this.f18505f = z10;
        this.f18507r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18502a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$467(this.f18504c, this.f18503b, this.e, this.d, (TLRPC.TL_messages_affectedHistory) this.f18506n, this.f18505f, (Runnable) this.f18507r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f18503b, this.f18504c, this.d, this.e, this.f18505f, (Context) this.f18506n, (String) this.f18507r);
                return;
        }
    }

    public ge(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f18503b = i10;
        this.f18504c = j10;
        this.d = j11;
        this.e = i11;
        this.f18505f = z10;
        this.f18506n = context;
        this.f18507r = str;
    }
}
