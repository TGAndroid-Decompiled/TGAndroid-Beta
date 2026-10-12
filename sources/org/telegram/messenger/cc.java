package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cc implements RequestDelegate {
    public final int f17310a = 0;
    public final Object f17311b;
    public final long f17312c;
    public final int d;
    public final int f17313e;
    public final long f17314f;
    public final boolean f17315g;
    public final Object h;

    public cc(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f17311b = messagesController;
        this.f17312c = j3;
        this.f17314f = j10;
        this.d = i10;
        this.f17313e = i11;
        this.f17315g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17310a) {
            case 0:
                ((MessagesController) this.f17311b).lambda$deleteDialog$141(this.f17312c, this.f17314f, this.d, this.f17313e, this.f17315g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17311b).lambda$deleteMessagesRange$469(this.f17312c, this.d, this.f17313e, this.f17314f, this.f17315g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f17312c, this.f17314f, this.f17313e, this.f17315g, (Context) this.f17311b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public cc(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f17312c = j3;
        this.f17314f = j10;
        this.f17313e = i11;
        this.f17315g = z10;
        this.f17311b = context;
        this.h = str;
    }

    public cc(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f17311b = messagesController;
        this.f17312c = j3;
        this.d = i10;
        this.f17313e = i11;
        this.f17314f = j10;
        this.f17315g = z10;
        this.h = runnable;
    }
}
