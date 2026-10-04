package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ub implements RequestDelegate {
    public final int f19333a = 0;
    public final Object f19334b;
    public final long f19335c;
    public final int d;
    public final int f19336e;
    public final long f19337f;
    public final boolean f19338g;
    public final Object h;

    public ub(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f19334b = messagesController;
        this.f19335c = j3;
        this.f19337f = j10;
        this.d = i10;
        this.f19336e = i11;
        this.f19338g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19333a) {
            case 0:
                ((MessagesController) this.f19334b).lambda$deleteDialog$142(this.f19335c, this.f19337f, this.d, this.f19336e, this.f19338g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19334b).lambda$deleteMessagesRange$466(this.f19335c, this.d, this.f19336e, this.f19337f, this.f19338g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f19335c, this.f19337f, this.f19336e, this.f19338g, (Context) this.f19334b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public ub(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f19335c = j3;
        this.f19337f = j10;
        this.f19336e = i11;
        this.f19338g = z10;
        this.f19334b = context;
        this.h = str;
    }

    public ub(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f19334b = messagesController;
        this.f19335c = j3;
        this.d = i10;
        this.f19336e = i11;
        this.f19337f = j10;
        this.f19338g = z10;
        this.h = runnable;
    }
}
