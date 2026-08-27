package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class tb implements RequestDelegate {

    public final int f21625a = 0;

    public final Object f21626b;

    public final long f21627c;
    public final int d;

    public final int f21628e;

    public final long f21629f;

    public final boolean f21630g;
    public final Object h;

    public tb(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f21626b = messagesController;
        this.f21627c = j10;
        this.f21629f = j11;
        this.d = i10;
        this.f21628e = i11;
        this.f21630g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21625a) {
            case 0:
                ((MessagesController) this.f21626b).lambda$deleteDialog$142(this.f21627c, this.f21629f, this.d, this.f21628e, this.f21630g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.f21626b).lambda$deleteMessagesRange$466(this.f21627c, this.d, this.f21628e, this.f21629f, this.f21630g, (Runnable) this.h, tLObject, tL_error);
                break;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f21627c, this.f21629f, this.f21628e, this.f21630g, (Context) this.f21626b, (String) this.h, tLObject, tL_error);
                break;
        }
    }

    public tb(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f21627c = j10;
        this.f21629f = j11;
        this.f21628e = i11;
        this.f21630g = z10;
        this.f21626b = context;
        this.h = str;
    }

    public tb(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.f21626b = messagesController;
        this.f21627c = j10;
        this.d = i10;
        this.f21628e = i11;
        this.f21629f = j11;
        this.f21630g = z10;
        this.h = runnable;
    }
}
