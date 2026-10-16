package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cc implements RequestDelegate {
    public final int f16693a = 0;
    public final Object f16694b;
    public final long f16695c;
    public final int d;
    public final int e;
    public final long f16696f;
    public final boolean f16697g;
    public final Object h;

    public cc(int i10, int i11, long j10, long j11, MessagesController messagesController, TLRPC.InputPeer inputPeer, boolean z10) {
        this.f16694b = messagesController;
        this.f16695c = j10;
        this.f16696f = j11;
        this.d = i10;
        this.e = i11;
        this.f16697g = z10;
        this.h = inputPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16693a) {
            case 0:
                ((MessagesController) this.f16694b).lambda$deleteDialog$141(this.f16695c, this.f16696f, this.d, this.e, this.f16697g, (TLRPC.InputPeer) this.h, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16694b).lambda$deleteMessagesRange$469(this.f16695c, this.d, this.e, this.f16696f, this.f16697g, (Runnable) this.h, tLObject, tL_error);
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f16695c, this.f16696f, this.e, this.f16697g, (Context) this.f16694b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public cc(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f16695c = j10;
        this.f16696f = j11;
        this.e = i11;
        this.f16697g = z10;
        this.f16694b = context;
        this.h = str;
    }

    public cc(MessagesController messagesController, long j10, int i10, int i11, long j11, boolean z10, Runnable runnable) {
        this.f16694b = messagesController;
        this.f16695c = j10;
        this.d = i10;
        this.e = i11;
        this.f16696f = j11;
        this.f16697g = z10;
        this.h = runnable;
    }
}
