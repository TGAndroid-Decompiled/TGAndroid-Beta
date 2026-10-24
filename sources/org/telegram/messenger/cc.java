package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cc implements RequestDelegate {
    public final int f18144a = 0;
    public final Object f18145b;
    public final long f18146c;
    public final int d;
    public final int e;
    public final long f18147f;
    public final boolean f18148g;
    public final Object h;

    public cc(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f18145b = messagesController;
        this.f18146c = j10;
        this.f18147f = j11;
        this.d = i10;
        this.e = i11;
        this.f18148g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18144a) {
            case 0:
                ((MessagesController) this.f18145b).lambda$deleteDialog$141(this.f18146c, this.f18147f, this.d, this.e, this.f18148g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18145b).lambda$deleteMessagesRange$469(this.f18146c, this.d, this.e, this.f18147f, this.f18148g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f18146c, this.f18147f, this.e, this.f18148g, (Context) this.f18145b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public cc(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f18146c = j10;
        this.f18147f = j11;
        this.e = i11;
        this.f18148g = z10;
        this.f18145b = context;
        this.h = str;
    }

    public cc(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.f18145b = messagesController;
        this.f18146c = j10;
        this.d = i10;
        this.e = i11;
        this.f18147f = j11;
        this.f18148g = z10;
        this.h = runnable;
    }
}
