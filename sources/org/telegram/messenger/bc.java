package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bc implements RequestDelegate {
    public final int f18024a = 0;
    public final Object f18025b;
    public final long f18026c;
    public final int d;
    public final int e;
    public final long f18027f;
    public final boolean f18028g;
    public final Object h;

    public bc(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f18025b = messagesController;
        this.f18026c = j10;
        this.f18027f = j11;
        this.d = i10;
        this.e = i11;
        this.f18028g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18024a) {
            case 0:
                ((MessagesController) this.f18025b).lambda$deleteDialog$141(this.f18026c, this.f18027f, this.d, this.e, this.f18028g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18025b).lambda$deleteMessagesRange$469(this.f18026c, this.d, this.e, this.f18027f, this.f18028g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f18026c, this.f18027f, this.e, this.f18028g, (Context) this.f18025b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public bc(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f18026c = j10;
        this.f18027f = j11;
        this.e = i11;
        this.f18028g = z10;
        this.f18025b = context;
        this.h = str;
    }

    public bc(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.f18025b = messagesController;
        this.f18026c = j10;
        this.d = i10;
        this.e = i11;
        this.f18027f = j11;
        this.f18028g = z10;
        this.h = runnable;
    }
}
