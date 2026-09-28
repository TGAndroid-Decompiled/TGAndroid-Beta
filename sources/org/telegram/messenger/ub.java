package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ub implements RequestDelegate {
    public final int f17693a = 0;
    public final Object f17694b;
    public final long f17695c;
    public final int d;
    public final int e;
    public final long f17696f;
    public final boolean f17697g;
    public final Object h;

    public ub(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f17694b = messagesController;
        this.f17695c = j3;
        this.f17696f = j10;
        this.d = i10;
        this.e = i11;
        this.f17697g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17693a) {
            case 0:
                ((MessagesController) this.f17694b).lambda$deleteDialog$142(this.f17695c, this.f17696f, this.d, this.e, this.f17697g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17694b).lambda$deleteMessagesRange$466(this.f17695c, this.d, this.e, this.f17696f, this.f17697g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f17695c, this.f17696f, this.e, this.f17697g, (Context) this.f17694b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public ub(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f17695c = j3;
        this.f17696f = j10;
        this.e = i11;
        this.f17697g = z10;
        this.f17694b = context;
        this.h = str;
    }

    public ub(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f17694b = messagesController;
        this.f17695c = j3;
        this.d = i10;
        this.e = i11;
        this.f17696f = j10;
        this.f17697g = z10;
        this.h = runnable;
    }
}
