package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ub implements RequestDelegate {
    public final int f19169a = 0;
    public final Object f19170b;
    public final long f19171c;
    public final int d;
    public final int f19172e;
    public final long f19173f;
    public final boolean f19174g;
    public final Object h;

    public ub(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f19170b = messagesController;
        this.f19171c = j3;
        this.f19173f = j10;
        this.d = i10;
        this.f19172e = i11;
        this.f19174g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19169a) {
            case 0:
                ((MessagesController) this.f19170b).lambda$deleteDialog$142(this.f19171c, this.f19173f, this.d, this.f19172e, this.f19174g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19170b).lambda$deleteMessagesRange$466(this.f19171c, this.d, this.f19172e, this.f19173f, this.f19174g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f19171c, this.f19173f, this.f19172e, this.f19174g, (Context) this.f19170b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public ub(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f19171c = j3;
        this.f19173f = j10;
        this.f19172e = i11;
        this.f19174g = z10;
        this.f19170b = context;
        this.h = str;
    }

    public ub(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f19170b = messagesController;
        this.f19171c = j3;
        this.d = i10;
        this.f19172e = i11;
        this.f19173f = j10;
        this.f19174g = z10;
        this.h = runnable;
    }
}
