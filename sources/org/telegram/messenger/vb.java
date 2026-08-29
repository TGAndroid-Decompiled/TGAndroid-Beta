package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vb implements RequestDelegate {
    public final int f21809a = 0;
    public final Object f21810b;
    public final long f21811c;
    public final int d;
    public final int f21812e;
    public final long f21813f;
    public final boolean f21814g;
    public final Object h;

    public vb(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f21810b = messagesController;
        this.f21811c = j10;
        this.f21813f = j11;
        this.d = i10;
        this.f21812e = i11;
        this.f21814g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21809a) {
            case 0:
                ((MessagesController) this.f21810b).lambda$deleteDialog$142(this.f21811c, this.f21813f, this.d, this.f21812e, this.f21814g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f21810b).lambda$deleteMessagesRange$466(this.f21811c, this.d, this.f21812e, this.f21813f, this.f21814g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f21811c, this.f21813f, this.f21812e, this.f21814g, (Context) this.f21810b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public vb(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f21811c = j10;
        this.f21813f = j11;
        this.f21812e = i11;
        this.f21814g = z10;
        this.f21810b = context;
        this.h = str;
    }

    public vb(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.f21810b = messagesController;
        this.f21811c = j10;
        this.d = i10;
        this.f21812e = i11;
        this.f21813f = j11;
        this.f21814g = z10;
        this.h = runnable;
    }
}
