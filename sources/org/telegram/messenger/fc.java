package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fc implements RequestDelegate {
    public final int f20080a = 0;
    public final Object f20081b;
    public final long f20082c;
    public final int d;
    public final int e;
    public final long f20083f;
    public final boolean f20084g;
    public final Object h;

    public fc(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f20081b = messagesController;
        this.f20082c = j10;
        this.f20083f = j11;
        this.d = i10;
        this.e = i11;
        this.f20084g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20080a) {
            case 0:
                ((MessagesController) this.f20081b).lambda$deleteDialog$141(this.f20082c, this.f20083f, this.d, this.e, this.f20084g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20081b).lambda$deleteMessagesRange$471(this.f20082c, this.d, this.e, this.f20083f, this.f20084g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f20082c, this.f20083f, this.e, this.f20084g, (Context) this.f20081b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public fc(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f20082c = j10;
        this.f20083f = j11;
        this.e = i11;
        this.f20084g = z10;
        this.f20081b = context;
        this.h = str;
    }

    public fc(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.f20081b = messagesController;
        this.f20082c = j10;
        this.d = i10;
        this.e = i11;
        this.f20083f = j11;
        this.f20084g = z10;
        this.h = runnable;
    }
}
