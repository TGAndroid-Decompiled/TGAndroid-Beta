package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class on implements RequestDelegate {
    public final int f24357a = 2;
    public final Object f24358b;
    public final long f24359c;
    public final int d;
    public final int f24360e;
    public final long f24361f;
    public final boolean f24362g;
    public final Object h;

    public on(Context context, int i7, long j3, String str, long j10, int i10, boolean z9) {
        this.d = i7;
        this.f24359c = j3;
        this.f24361f = j10;
        this.f24360e = i10;
        this.f24362g = z9;
        this.f24358b = context;
        this.h = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24357a) {
            case 0:
                qp qpVar = (qp) this.f24358b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j3 = this.f24359c;
                if (j3 != 0) {
                    qpVar.getMessagesStorage().q1(j3);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j10 = this.f24361f;
                    if (i7 > 0) {
                        qpVar.Y(j10, 0, this.d, this.f24360e, this.f24362g, inputPeer, 0L);
                    }
                    qpVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    yr messagesStorage = qpVar.getMessagesStorage();
                    messagesStorage.f26719a.c(new xp(messagesStorage, j10, 5));
                    return;
                }
                return;
            case 1:
                qp qpVar2 = (qp) this.f24358b;
                org.telegram.ui.xf xfVar = (org.telegram.ui.xf) this.h;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    qpVar2.M3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    qpVar2.getMessagesStorage().f26719a.c(new xn(qpVar2, this.f24359c, this.d, this.f24360e, this.f24361f, tL_messages_affectedHistory2, this.f24362g, xfVar));
                    return;
                }
                g0.h3(new a(xfVar, 26));
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f24359c, this.f24361f, this.f24360e, this.f24362g, (Context) this.f24358b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public on(qp qpVar, long j3, int i7, int i10, long j10, boolean z9, org.telegram.ui.xf xfVar) {
        this.f24358b = qpVar;
        this.f24359c = j3;
        this.d = i7;
        this.f24360e = i10;
        this.f24361f = j10;
        this.f24362g = z9;
        this.h = xfVar;
    }

    public on(qp qpVar, long j3, long j10, int i7, int i10, boolean z9, TLRPC.InputPeer inputPeer) {
        this.f24358b = qpVar;
        this.f24359c = j3;
        this.f24361f = j10;
        this.d = i7;
        this.f24360e = i10;
        this.f24362g = z9;
        this.h = inputPeer;
    }
}
