package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class un implements RequestDelegate {
    public final int f18455a = 2;
    public final Object f18456b;
    public final long f18457c;
    public final int d;
    public final int e;
    public final long f18458f;
    public final boolean f18459g;
    public final Object h;

    public un(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f18457c = j10;
        this.f18458f = j11;
        this.e = i11;
        this.f18459g = z10;
        this.f18456b = context;
        this.h = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18455a) {
            case 0:
                wp wpVar = (wp) this.f18456b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j10 = this.f18457c;
                if (j10 != 0) {
                    wpVar.getMessagesStorage().q1(j10);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i10 = tL_messages_affectedHistory.offset;
                    long j11 = this.f18458f;
                    if (i10 > 0) {
                        wpVar.Y(j11, 0, this.d, this.e, this.f18459g, inputPeer, 0L);
                    }
                    wpVar.J3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    is messagesStorage = wpVar.getMessagesStorage();
                    messagesStorage.f16331a.c(new dq(messagesStorage, j11, 5));
                    return;
                }
                return;
            case 1:
                wp wpVar2 = (wp) this.f18456b;
                org.telegram.ui.ng ngVar = (org.telegram.ui.ng) this.h;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    wpVar2.J3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    wpVar2.getMessagesStorage().f16331a.c(new co(wpVar2, this.f18457c, this.d, this.e, this.f18458f, tL_messages_affectedHistory2, this.f18459g, ngVar));
                    return;
                }
                i0.g3(new a(ngVar, 26));
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f18457c, this.f18458f, this.e, this.f18459g, (Context) this.f18456b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public un(wp wpVar, long j10, int i10, int i11, long j11, boolean z10, org.telegram.ui.ng ngVar) {
        this.f18456b = wpVar;
        this.f18457c = j10;
        this.d = i10;
        this.e = i11;
        this.f18458f = j11;
        this.f18459g = z10;
        this.h = ngVar;
    }

    public un(wp wpVar, long j10, long j11, int i10, int i11, boolean z10, TLRPC.InputPeer inputPeer) {
        this.f18456b = wpVar;
        this.f18457c = j10;
        this.f18458f = j11;
        this.d = i10;
        this.e = i11;
        this.f18459g = z10;
        this.h = inputPeer;
    }
}
