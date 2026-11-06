package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class on implements RequestDelegate {
    public final int f24343a = 2;
    public final Object f24344b;
    public final long f24345c;
    public final int d;
    public final int f24346e;
    public final long f24347f;
    public final boolean f24348g;
    public final Object h;

    public on(Context context, int i7, long j3, String str, long j10, int i10, boolean z9) {
        this.d = i7;
        this.f24345c = j3;
        this.f24347f = j10;
        this.f24346e = i10;
        this.f24348g = z9;
        this.f24344b = context;
        this.h = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24343a) {
            case 0:
                qp qpVar = (qp) this.f24344b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j3 = this.f24345c;
                if (j3 != 0) {
                    qpVar.getMessagesStorage().q1(j3);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j10 = this.f24347f;
                    if (i7 > 0) {
                        qpVar.Y(j10, 0, this.d, this.f24346e, this.f24348g, inputPeer, 0L);
                    }
                    qpVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    yr messagesStorage = qpVar.getMessagesStorage();
                    messagesStorage.f26688a.c(new xp(messagesStorage, j10, 5));
                    return;
                }
                return;
            case 1:
                qp qpVar2 = (qp) this.f24344b;
                org.telegram.ui.xf xfVar = (org.telegram.ui.xf) this.h;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    qpVar2.M3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    qpVar2.getMessagesStorage().f26688a.c(new xn(qpVar2, this.f24345c, this.d, this.f24346e, this.f24347f, tL_messages_affectedHistory2, this.f24348g, xfVar));
                    return;
                }
                g0.h3(new a(xfVar, 26));
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f24345c, this.f24347f, this.f24346e, this.f24348g, (Context) this.f24344b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public on(qp qpVar, long j3, int i7, int i10, long j10, boolean z9, org.telegram.ui.xf xfVar) {
        this.f24344b = qpVar;
        this.f24345c = j3;
        this.d = i7;
        this.f24346e = i10;
        this.f24347f = j10;
        this.f24348g = z9;
        this.h = xfVar;
    }

    public on(qp qpVar, long j3, long j10, int i7, int i10, boolean z9, TLRPC.InputPeer inputPeer) {
        this.f24344b = qpVar;
        this.f24345c = j3;
        this.f24347f = j10;
        this.d = i7;
        this.f24346e = i10;
        this.f24348g = z9;
        this.h = inputPeer;
    }
}
