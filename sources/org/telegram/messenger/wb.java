package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wb implements RequestDelegate {
    public final int f18892a = 0;
    public final Object f18893b;
    public final long f18894c;
    public final int d;
    public final int e;
    public final long f18895f;
    public final boolean f18896g;
    public final Object h;

    public wb(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z4) {
        this.f18893b = messagesController;
        this.f18894c = j10;
        this.f18895f = j11;
        this.d = i10;
        this.e = i11;
        this.f18896g = z4;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18892a) {
            case 0:
                ((MessagesController) this.f18893b).lambda$deleteDialog$142(this.f18894c, this.f18895f, this.d, this.e, this.f18896g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18893b).lambda$deleteMessagesRange$466(this.f18894c, this.d, this.e, this.f18895f, this.f18896g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f18894c, this.f18895f, this.e, this.f18896g, (Context) this.f18893b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public wb(Context context, int i10, long j10, String str, long j11, int i11, boolean z4) {
        this.d = i10;
        this.f18894c = j10;
        this.f18895f = j11;
        this.e = i11;
        this.f18896g = z4;
        this.f18893b = context;
        this.h = str;
    }

    public wb(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z4, Runnable runnable) {
        this.f18893b = messagesController;
        this.f18894c = j10;
        this.d = i10;
        this.e = i11;
        this.f18895f = j11;
        this.f18896g = z4;
        this.h = runnable;
    }
}
