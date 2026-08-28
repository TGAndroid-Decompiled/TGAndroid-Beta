package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pb implements RequestDelegate {
    public final int f21228a = 0;
    public final Object f21229b;
    public final long f21230c;
    public final int d;
    public final int f21231e;
    public final long f21232f;
    public final boolean f21233g;
    public final Object h;

    public pb(int i9, int i10, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f21229b = messagesController;
        this.f21230c = j10;
        this.f21232f = j11;
        this.d = i9;
        this.f21231e = i10;
        this.f21233g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21228a) {
            case 0:
                ((MessagesController) this.f21229b).lambda$deleteDialog$142(this.f21230c, this.f21232f, this.d, this.f21231e, this.f21233g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f21229b).lambda$deleteMessagesRange$466(this.f21230c, this.d, this.f21231e, this.f21232f, this.f21233g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f21230c, this.f21232f, this.f21231e, this.f21233g, (Context) this.f21229b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public pb(Context context, int i9, long j10, String str, long j11, int i10, boolean z10) {
        this.d = i9;
        this.f21230c = j10;
        this.f21232f = j11;
        this.f21231e = i10;
        this.f21233g = z10;
        this.f21229b = context;
        this.h = str;
    }

    public pb(MessagesController messagesController, long j10, int i9, int i10, long j11, boolean z10, Runnable runnable) {
        this.f21229b = messagesController;
        this.f21230c = j10;
        this.d = i9;
        this.f21231e = i10;
        this.f21232f = j11;
        this.f21233g = z10;
        this.h = runnable;
    }
}
