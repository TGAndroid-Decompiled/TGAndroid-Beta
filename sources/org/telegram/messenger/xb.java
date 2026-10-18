package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xb implements RequestDelegate {
    public final int f20076a = 0;
    public final Object f20077b;
    public final long f20078c;
    public final int d;
    public final int e;
    public final long f20079f;
    public final boolean f20080g;
    public final Object h;

    public xb(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f20077b = messagesController;
        this.f20078c = j10;
        this.f20079f = j11;
        this.d = i10;
        this.e = i11;
        this.f20080g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20076a) {
            case 0:
                ((MessagesController) this.f20077b).lambda$deleteDialog$141(this.f20078c, this.f20079f, this.d, this.e, this.f20080g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20077b).lambda$deleteMessagesRange$469(this.f20078c, this.d, this.e, this.f20079f, this.f20080g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f20078c, this.f20079f, this.e, this.f20080g, (Context) this.f20077b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public xb(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f20078c = j10;
        this.f20079f = j11;
        this.e = i11;
        this.f20080g = z10;
        this.f20077b = context;
        this.h = str;
    }

    public xb(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.f20077b = messagesController;
        this.f20078c = j10;
        this.d = i10;
        this.e = i11;
        this.f20079f = j11;
        this.f20080g = z10;
        this.h = runnable;
    }
}
