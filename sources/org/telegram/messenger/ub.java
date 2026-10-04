package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ub implements RequestDelegate {
    public final int f19327a = 0;
    public final Object f19328b;
    public final long f19329c;
    public final int d;
    public final int f19330e;
    public final long f19331f;
    public final boolean f19332g;
    public final Object h;

    public ub(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f19328b = messagesController;
        this.f19329c = j3;
        this.f19331f = j10;
        this.d = i10;
        this.f19330e = i11;
        this.f19332g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19327a) {
            case 0:
                ((MessagesController) this.f19328b).lambda$deleteDialog$142(this.f19329c, this.f19331f, this.d, this.f19330e, this.f19332g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19328b).lambda$deleteMessagesRange$466(this.f19329c, this.d, this.f19330e, this.f19331f, this.f19332g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f19329c, this.f19331f, this.f19330e, this.f19332g, (Context) this.f19328b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public ub(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f19329c = j3;
        this.f19331f = j10;
        this.f19330e = i11;
        this.f19332g = z10;
        this.f19328b = context;
        this.h = str;
    }

    public ub(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f19328b = messagesController;
        this.f19329c = j3;
        this.d = i10;
        this.f19330e = i11;
        this.f19331f = j10;
        this.f19332g = z10;
        this.h = runnable;
    }
}
