package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tb implements RequestDelegate {
    public final int f19070a = 0;
    public final Object f19071b;
    public final long f19072c;
    public final int d;
    public final int f19073e;
    public final long f19074f;
    public final boolean f19075g;
    public final Object h;

    public tb(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f19071b = messagesController;
        this.f19072c = j3;
        this.f19074f = j10;
        this.d = i10;
        this.f19073e = i11;
        this.f19075g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19070a) {
            case 0:
                ((MessagesController) this.f19071b).lambda$deleteDialog$142(this.f19072c, this.f19074f, this.d, this.f19073e, this.f19075g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19071b).lambda$deleteMessagesRange$466(this.f19072c, this.d, this.f19073e, this.f19074f, this.f19075g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f19072c, this.f19074f, this.f19073e, this.f19075g, (Context) this.f19071b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public tb(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f19072c = j3;
        this.f19074f = j10;
        this.f19073e = i11;
        this.f19075g = z10;
        this.f19071b = context;
        this.h = str;
    }

    public tb(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f19071b = messagesController;
        this.f19072c = j3;
        this.d = i10;
        this.f19073e = i11;
        this.f19074f = j10;
        this.f19075g = z10;
        this.h = runnable;
    }
}
