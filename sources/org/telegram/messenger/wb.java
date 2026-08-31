package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wb implements RequestDelegate {
    public final int f20532a = 0;
    public final Object f20533b;
    public final long f20534c;
    public final int d;
    public final int f20535e;
    public final long f20536f;
    public final boolean f20537g;
    public final Object h;

    public wb(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z4) {
        this.f20533b = messagesController;
        this.f20534c = j10;
        this.f20536f = j11;
        this.d = i10;
        this.f20535e = i11;
        this.f20537g = z4;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20532a) {
            case 0:
                ((MessagesController) this.f20533b).lambda$deleteDialog$142(this.f20534c, this.f20536f, this.d, this.f20535e, this.f20537g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20533b).lambda$deleteMessagesRange$466(this.f20534c, this.d, this.f20535e, this.f20536f, this.f20537g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f20534c, this.f20536f, this.f20535e, this.f20537g, (Context) this.f20533b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public wb(Context context, int i10, long j10, String str, long j11, int i11, boolean z4) {
        this.d = i10;
        this.f20534c = j10;
        this.f20536f = j11;
        this.f20535e = i11;
        this.f20537g = z4;
        this.f20533b = context;
        this.h = str;
    }

    public wb(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z4, Runnable runnable) {
        this.f20533b = messagesController;
        this.f20534c = j10;
        this.d = i10;
        this.f20535e = i11;
        this.f20536f = j11;
        this.f20537g = z4;
        this.h = runnable;
    }
}
