package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xb implements RequestDelegate {
    public final int f20070a = 0;
    public final Object f20071b;
    public final long f20072c;
    public final int d;
    public final int e;
    public final long f20073f;
    public final boolean f20074g;
    public final Object h;

    public xb(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f20071b = messagesController;
        this.f20072c = j10;
        this.f20073f = j11;
        this.d = i10;
        this.e = i11;
        this.f20074g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20070a) {
            case 0:
                ((MessagesController) this.f20071b).lambda$deleteDialog$141(this.f20072c, this.f20073f, this.d, this.e, this.f20074g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20071b).lambda$deleteMessagesRange$469(this.f20072c, this.d, this.e, this.f20073f, this.f20074g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f20072c, this.f20073f, this.e, this.f20074g, (Context) this.f20071b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public xb(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f20072c = j10;
        this.f20073f = j11;
        this.e = i11;
        this.f20074g = z10;
        this.f20071b = context;
        this.h = str;
    }

    public xb(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.f20071b = messagesController;
        this.f20072c = j10;
        this.d = i10;
        this.e = i11;
        this.f20073f = j11;
        this.f20074g = z10;
        this.h = runnable;
    }
}
