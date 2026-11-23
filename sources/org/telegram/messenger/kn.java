package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kn implements RequestDelegate {
    public final int f25110a = 2;
    public final Object f25111b;
    public final long f25112c;
    public final int d;
    public final int f25113e;
    public final long f25114f;
    public final boolean f25115g;
    public final Object h;

    public kn(Context context, int i7, long j3, String str, long j10, int i10, boolean z10) {
        this.d = i7;
        this.f25112c = j3;
        this.f25114f = j10;
        this.f25113e = i10;
        this.f25115g = z10;
        this.f25111b = context;
        this.h = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25110a) {
            case 0:
                np npVar = (np) this.f25111b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j3 = this.f25112c;
                if (j3 != 0) {
                    npVar.getMessagesStorage().q1(j3);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j10 = this.f25114f;
                    if (i7 > 0) {
                        npVar.Y(j10, 0, this.d, this.f25113e, this.f25115g, inputPeer, 0L);
                    }
                    npVar.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    ur messagesStorage = npVar.getMessagesStorage();
                    messagesStorage.f27250a.c(new qp(messagesStorage, j10, 5));
                    return;
                }
                return;
            case 1:
                np npVar2 = (np) this.f25111b;
                org.telegram.ui.vf vfVar = (org.telegram.ui.vf) this.h;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    npVar2.T3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    npVar2.getMessagesStorage().f27250a.c(new un(npVar2, this.f25112c, this.d, this.f25113e, this.f25114f, tL_messages_affectedHistory2, this.f25115g, vfVar));
                    return;
                }
                g0.g3(new a(vfVar, 26));
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f25112c, this.f25114f, this.f25113e, this.f25115g, (Context) this.f25111b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public kn(np npVar, long j3, int i7, int i10, long j10, boolean z10, org.telegram.ui.vf vfVar) {
        this.f25111b = npVar;
        this.f25112c = j3;
        this.d = i7;
        this.f25113e = i10;
        this.f25114f = j10;
        this.f25115g = z10;
        this.h = vfVar;
    }

    public kn(np npVar, long j3, long j10, int i7, int i10, boolean z10, TLRPC.InputPeer inputPeer) {
        this.f25111b = npVar;
        this.f25112c = j3;
        this.f25114f = j10;
        this.d = i7;
        this.f25113e = i10;
        this.f25115g = z10;
        this.h = inputPeer;
    }
}
