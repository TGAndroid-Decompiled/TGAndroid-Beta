package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tb implements RequestDelegate {
    public final int f19097a = 0;
    public final Object f19098b;
    public final long f19099c;
    public final int d;
    public final int f19100e;
    public final long f19101f;
    public final boolean f19102g;
    public final Object h;

    public tb(int i10, int i11, long j3, long j10, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f19098b = messagesController;
        this.f19099c = j3;
        this.f19101f = j10;
        this.d = i10;
        this.f19100e = i11;
        this.f19102g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19097a) {
            case 0:
                ((MessagesController) this.f19098b).lambda$deleteDialog$142(this.f19099c, this.f19101f, this.d, this.f19100e, this.f19102g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19098b).lambda$deleteMessagesRange$466(this.f19099c, this.d, this.f19100e, this.f19101f, this.f19102g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f19099c, this.f19101f, this.f19100e, this.f19102g, (Context) this.f19098b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public tb(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        this.d = i10;
        this.f19099c = j3;
        this.f19101f = j10;
        this.f19100e = i11;
        this.f19102g = z10;
        this.f19098b = context;
        this.h = str;
    }

    public tb(MessagesController messagesController, long j3, int i10, int i11, long j10, boolean z10, Runnable runnable) {
        this.f19098b = messagesController;
        this.f19099c = j3;
        this.d = i10;
        this.f19100e = i11;
        this.f19101f = j10;
        this.f19102g = z10;
        this.h = runnable;
    }
}
