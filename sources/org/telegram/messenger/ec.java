package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ec implements RequestDelegate {
    public final int f19992a = 0;
    public final Object f19993b;
    public final long f19994c;
    public final int d;
    public final int e;
    public final long f19995f;
    public final boolean f19996g;
    public final Object h;

    public ec(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f19993b = messagesController;
        this.f19994c = j10;
        this.f19995f = j11;
        this.d = i10;
        this.e = i11;
        this.f19996g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19992a) {
            case 0:
                ((MessagesController) this.f19993b).lambda$deleteDialog$141(this.f19994c, this.f19995f, this.d, this.e, this.f19996g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19993b).lambda$deleteMessagesRange$472(this.f19994c, this.d, this.e, this.f19995f, this.f19996g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f19994c, this.f19995f, this.e, this.f19996g, (Context) this.f19993b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public ec(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f19994c = j10;
        this.f19995f = j11;
        this.e = i11;
        this.f19996g = z10;
        this.f19993b = context;
        this.h = str;
    }

    public ec(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.f19993b = messagesController;
        this.f19994c = j10;
        this.d = i10;
        this.e = i11;
        this.f19995f = j11;
        this.f19996g = z10;
        this.h = runnable;
    }
}
