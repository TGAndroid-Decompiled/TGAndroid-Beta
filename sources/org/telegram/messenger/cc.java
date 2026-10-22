package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cc implements RequestDelegate {
    public final int f18080a = 0;
    public final Object f18081b;
    public final long f18082c;
    public final int d;
    public final int e;
    public final long f18083f;
    public final boolean f18084g;
    public final Object h;

    public cc(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f18081b = messagesController;
        this.f18082c = j10;
        this.f18083f = j11;
        this.d = i10;
        this.e = i11;
        this.f18084g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18080a) {
            case 0:
                ((MessagesController) this.f18081b).lambda$deleteDialog$141(this.f18082c, this.f18083f, this.d, this.e, this.f18084g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18081b).lambda$deleteMessagesRange$469(this.f18082c, this.d, this.e, this.f18083f, this.f18084g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f18082c, this.f18083f, this.e, this.f18084g, (Context) this.f18081b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public cc(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f18082c = j10;
        this.f18083f = j11;
        this.e = i11;
        this.f18084g = z10;
        this.f18081b = context;
        this.h = str;
    }

    public cc(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.f18081b = messagesController;
        this.f18082c = j10;
        this.d = i10;
        this.e = i11;
        this.f18083f = j11;
        this.f18084g = z10;
        this.h = runnable;
    }
}
