package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cc implements RequestDelegate {
    public final int f17309a = 0;
    public final Object f17310b;
    public final long f17311c;
    public final int d;
    public final int f17312e;
    public final long f17313f;
    public final boolean f17314g;
    public final Object h;

    public cc(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f17310b = messagesController;
        this.f17311c = j3;
        this.f17313f = j10;
        this.d = i10;
        this.f17312e = i11;
        this.f17314g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17309a) {
            case 0:
                ((MessagesController) this.f17310b).lambda$deleteDialog$141(this.f17311c, this.f17313f, this.d, this.f17312e, this.f17314g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17310b).lambda$deleteMessagesRange$469(this.f17311c, this.d, this.f17312e, this.f17313f, this.f17314g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f17311c, this.f17313f, this.f17312e, this.f17314g, (Context) this.f17310b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public cc(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f17311c = j3;
        this.f17313f = j10;
        this.f17312e = i11;
        this.f17314g = z10;
        this.f17310b = context;
        this.h = str;
    }

    public cc(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f17310b = messagesController;
        this.f17311c = j3;
        this.d = i10;
        this.f17312e = i11;
        this.f17313f = j10;
        this.f17314g = z10;
        this.h = runnable;
    }
}
