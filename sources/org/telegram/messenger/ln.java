package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ln implements RequestDelegate {
    public final int f24848a = 2;
    public final Object f24849b;
    public final long f24850c;
    public final int d;
    public final int f24851e;
    public final long f24852f;
    public final boolean f24853g;
    public final Object h;

    public ln(Context context, int i7, long j3, String str, long j10, int i10, boolean z10) {
        this.d = i7;
        this.f24850c = j3;
        this.f24852f = j10;
        this.f24851e = i10;
        this.f24853g = z10;
        this.f24849b = context;
        this.h = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24848a) {
            case 0:
                np npVar = (np) this.f24849b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j3 = this.f24850c;
                if (j3 != 0) {
                    npVar.getMessagesStorage().q1(j3);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j10 = this.f24852f;
                    if (i7 > 0) {
                        npVar.Y(j10, 0, this.d, this.f24851e, this.f24853g, inputPeer, 0L);
                    }
                    npVar.M3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    vr messagesStorage = npVar.getMessagesStorage();
                    messagesStorage.f27220a.c(new up(messagesStorage, j10, 5));
                    return;
                }
                return;
            case 1:
                np npVar2 = (np) this.f24849b;
                org.telegram.ui.uf ufVar = (org.telegram.ui.uf) this.h;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    npVar2.M3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    npVar2.getMessagesStorage().f27220a.c(new un(npVar2, this.f24850c, this.d, this.f24851e, this.f24852f, tL_messages_affectedHistory2, this.f24853g, ufVar));
                    return;
                }
                g0.h3(new a(ufVar, 26));
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f24850c, this.f24852f, this.f24851e, this.f24853g, (Context) this.f24849b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public ln(np npVar, long j3, int i7, int i10, long j10, boolean z10, org.telegram.ui.uf ufVar) {
        this.f24849b = npVar;
        this.f24850c = j3;
        this.d = i7;
        this.f24851e = i10;
        this.f24852f = j10;
        this.f24853g = z10;
        this.h = ufVar;
    }

    public ln(np npVar, long j3, long j10, int i7, int i10, boolean z10, TLRPC.InputPeer inputPeer) {
        this.f24849b = npVar;
        this.f24850c = j3;
        this.f24852f = j10;
        this.d = i7;
        this.f24851e = i10;
        this.f24853g = z10;
        this.h = inputPeer;
    }
}
