package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ib implements Runnable {
    public final int f17985a = 0;
    public final int f17986b;
    public final long f17987c;
    public final long d;
    public final int f17988e;
    public final boolean f17989f;
    public final Object h;
    public final Object f17990n;
    public final Object f17991r;

    public ib(MessagesController messagesController, long j3, int i10, int i11, long j10, TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory, boolean z10, Runnable runnable) {
        this.h = messagesController;
        this.f17987c = j3;
        this.f17986b = i10;
        this.f17988e = i11;
        this.d = j10;
        this.f17990n = tL_messages_affectedHistory;
        this.f17989f = z10;
        this.f17991r = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17985a) {
            case 0:
                ((MessagesController) this.h).lambda$deleteMessagesRange$464(this.f17987c, this.f17986b, this.f17988e, this.d, (TLRPC.TL_messages_affectedHistory) this.f17990n, this.f17989f, (Runnable) this.f17991r);
                return;
            default:
                VoIPGroupNotification.b((TLObject) this.h, this.f17986b, this.f17987c, this.d, this.f17988e, this.f17989f, (Context) this.f17990n, (String) this.f17991r);
                return;
        }
    }

    public ib(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        this.h = tLObject;
        this.f17986b = i10;
        this.f17987c = j3;
        this.d = j10;
        this.f17988e = i11;
        this.f17989f = z10;
        this.f17990n = context;
        this.f17991r = str;
    }
}
