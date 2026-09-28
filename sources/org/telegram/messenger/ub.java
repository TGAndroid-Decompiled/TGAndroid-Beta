package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ub implements RequestDelegate {
    public final int f17694a = 0;
    public final Object f17695b;
    public final long f17696c;
    public final int d;
    public final int e;
    public final long f17697f;
    public final boolean f17698g;
    public final Object h;

    public ub(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f17695b = messagesController;
        this.f17696c = j3;
        this.f17697f = j10;
        this.d = i10;
        this.e = i11;
        this.f17698g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17694a) {
            case 0:
                ((MessagesController) this.f17695b).lambda$deleteDialog$142(this.f17696c, this.f17697f, this.d, this.e, this.f17698g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17695b).lambda$deleteMessagesRange$466(this.f17696c, this.d, this.e, this.f17697f, this.f17698g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f17696c, this.f17697f, this.e, this.f17698g, (Context) this.f17695b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public ub(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f17696c = j3;
        this.f17697f = j10;
        this.e = i11;
        this.f17698g = z10;
        this.f17695b = context;
        this.h = str;
    }

    public ub(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f17695b = messagesController;
        this.f17696c = j3;
        this.d = i10;
        this.e = i11;
        this.f17697f = j10;
        this.f17698g = z10;
        this.h = runnable;
    }
}
