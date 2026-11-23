package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kn implements RequestDelegate {
    public final int f25074a = 2;
    public final Object f25075b;
    public final long f25076c;
    public final int d;
    public final int f25077e;
    public final long f25078f;
    public final boolean f25079g;
    public final Object h;

    public kn(Context context, int i7, long j3, String str, long j10, int i10, boolean z10) {
        this.d = i7;
        this.f25076c = j3;
        this.f25078f = j10;
        this.f25077e = i10;
        this.f25079g = z10;
        this.f25075b = context;
        this.h = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25074a) {
            case 0:
                np npVar = (np) this.f25075b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j3 = this.f25076c;
                if (j3 != 0) {
                    npVar.getMessagesStorage().q1(j3);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j10 = this.f25078f;
                    if (i7 > 0) {
                        npVar.Y(j10, 0, this.d, this.f25077e, this.f25079g, inputPeer, 0L);
                    }
                    npVar.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    ur messagesStorage = npVar.getMessagesStorage();
                    messagesStorage.f27214a.c(new qp(messagesStorage, j10, 5));
                    return;
                }
                return;
            case 1:
                np npVar2 = (np) this.f25075b;
                org.telegram.ui.vf vfVar = (org.telegram.ui.vf) this.h;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    npVar2.T3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    npVar2.getMessagesStorage().f27214a.c(new un(npVar2, this.f25076c, this.d, this.f25077e, this.f25078f, tL_messages_affectedHistory2, this.f25079g, vfVar));
                    return;
                }
                g0.g3(new a(vfVar, 26));
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f25076c, this.f25078f, this.f25077e, this.f25079g, (Context) this.f25075b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public kn(np npVar, long j3, int i7, int i10, long j10, boolean z10, org.telegram.ui.vf vfVar) {
        this.f25075b = npVar;
        this.f25076c = j3;
        this.d = i7;
        this.f25077e = i10;
        this.f25078f = j10;
        this.f25079g = z10;
        this.h = vfVar;
    }

    public kn(np npVar, long j3, long j10, int i7, int i10, boolean z10, TLRPC.InputPeer inputPeer) {
        this.f25075b = npVar;
        this.f25076c = j3;
        this.f25078f = j10;
        this.d = i7;
        this.f25077e = i10;
        this.f25079g = z10;
        this.h = inputPeer;
    }
}
