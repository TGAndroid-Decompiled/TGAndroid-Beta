package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ub implements RequestDelegate {
    public final int f17675a = 0;
    public final Object f17676b;
    public final long f17677c;
    public final int d;
    public final int e;
    public final long f17678f;
    public final boolean f17679g;
    public final Object h;

    public ub(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f17676b = messagesController;
        this.f17677c = j3;
        this.f17678f = j10;
        this.d = i10;
        this.e = i11;
        this.f17679g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17675a) {
            case 0:
                ((MessagesController) this.f17676b).lambda$deleteDialog$142(this.f17677c, this.f17678f, this.d, this.e, this.f17679g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17676b).lambda$deleteMessagesRange$466(this.f17677c, this.d, this.e, this.f17678f, this.f17679g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f17677c, this.f17678f, this.e, this.f17679g, (Context) this.f17676b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public ub(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f17677c = j3;
        this.f17678f = j10;
        this.e = i11;
        this.f17679g = z10;
        this.f17676b = context;
        this.h = str;
    }

    public ub(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f17676b = messagesController;
        this.f17677c = j3;
        this.d = i10;
        this.e = i11;
        this.f17678f = j10;
        this.f17679g = z10;
        this.h = runnable;
    }
}
