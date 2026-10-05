package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ub implements RequestDelegate {
    public final int f19338a = 0;
    public final Object f19339b;
    public final long f19340c;
    public final int d;
    public final int f19341e;
    public final long f19342f;
    public final boolean f19343g;
    public final Object h;

    public ub(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f19339b = messagesController;
        this.f19340c = j3;
        this.f19342f = j10;
        this.d = i10;
        this.f19341e = i11;
        this.f19343g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19338a) {
            case 0:
                ((MessagesController) this.f19339b).lambda$deleteDialog$142(this.f19340c, this.f19342f, this.d, this.f19341e, this.f19343g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19339b).lambda$deleteMessagesRange$466(this.f19340c, this.d, this.f19341e, this.f19342f, this.f19343g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f19340c, this.f19342f, this.f19341e, this.f19343g, (Context) this.f19339b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public ub(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f19340c = j3;
        this.f19342f = j10;
        this.f19341e = i11;
        this.f19343g = z10;
        this.f19339b = context;
        this.h = str;
    }

    public ub(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f19339b = messagesController;
        this.f19340c = j3;
        this.d = i10;
        this.f19341e = i11;
        this.f19342f = j10;
        this.f19343g = z10;
        this.h = runnable;
    }
}
