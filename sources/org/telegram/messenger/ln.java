package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ln implements RequestDelegate {
    public final int f24854a = 2;
    public final Object f24855b;
    public final long f24856c;
    public final int d;
    public final int f24857e;
    public final long f24858f;
    public final boolean f24859g;
    public final Object h;

    public ln(Context context, int i7, long j3, String str, long j10, int i10, boolean z10) {
        this.d = i7;
        this.f24856c = j3;
        this.f24858f = j10;
        this.f24857e = i10;
        this.f24859g = z10;
        this.f24855b = context;
        this.h = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24854a) {
            case 0:
                np npVar = (np) this.f24855b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j3 = this.f24856c;
                if (j3 != 0) {
                    npVar.getMessagesStorage().q1(j3);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j10 = this.f24858f;
                    if (i7 > 0) {
                        npVar.Y(j10, 0, this.d, this.f24857e, this.f24859g, inputPeer, 0L);
                    }
                    npVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    vr messagesStorage = npVar.getMessagesStorage();
                    messagesStorage.f27219a.c(new rp(messagesStorage, j10, 5));
                    return;
                }
                return;
            case 1:
                np npVar2 = (np) this.f24855b;
                org.telegram.ui.uf ufVar = (org.telegram.ui.uf) this.h;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    npVar2.M3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    npVar2.getMessagesStorage().f27219a.c(new un(npVar2, this.f24856c, this.d, this.f24857e, this.f24858f, tL_messages_affectedHistory2, this.f24859g, ufVar));
                    return;
                }
                g0.h3(new a(ufVar, 26));
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f24856c, this.f24858f, this.f24857e, this.f24859g, (Context) this.f24855b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public ln(np npVar, long j3, int i7, int i10, long j10, boolean z10, org.telegram.ui.uf ufVar) {
        this.f24855b = npVar;
        this.f24856c = j3;
        this.d = i7;
        this.f24857e = i10;
        this.f24858f = j10;
        this.f24859g = z10;
        this.h = ufVar;
    }

    public ln(np npVar, long j3, long j10, int i7, int i10, boolean z10, TLRPC.InputPeer inputPeer) {
        this.f24855b = npVar;
        this.f24856c = j3;
        this.f24858f = j10;
        this.d = i7;
        this.f24857e = i10;
        this.f24859g = z10;
        this.h = inputPeer;
    }
}
