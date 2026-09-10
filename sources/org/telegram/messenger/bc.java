package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bc implements RequestDelegate {
    public final int f14780a = 0;
    public final Object f14781b;
    public final long f14782c;
    public final int d;
    public final int e;
    public final long f14783f;
    public final boolean f14784g;
    public final Object h;

    public bc(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f14781b = messagesController;
        this.f14782c = j3;
        this.f14783f = j10;
        this.d = i10;
        this.e = i11;
        this.f14784g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14780a) {
            case 0:
                ((MessagesController) this.f14781b).lambda$deleteDialog$142(this.f14782c, this.f14783f, this.d, this.e, this.f14784g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f14781b).lambda$deleteMessagesRange$466(this.f14782c, this.d, this.e, this.f14783f, this.f14784g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f14782c, this.f14783f, this.e, this.f14784g, (Context) this.f14781b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public bc(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f14782c = j3;
        this.f14783f = j10;
        this.e = i11;
        this.f14784g = z10;
        this.f14781b = context;
        this.h = str;
    }

    public bc(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f14781b = messagesController;
        this.f14782c = j3;
        this.d = i10;
        this.e = i11;
        this.f14783f = j10;
        this.f14784g = z10;
        this.h = runnable;
    }
}
