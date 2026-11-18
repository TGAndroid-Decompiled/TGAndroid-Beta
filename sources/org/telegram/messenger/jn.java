package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jn implements RequestDelegate {
    public final int f24898a = 2;
    public final Object f24899b;
    public final long f24900c;
    public final int d;
    public final int f24901e;
    public final long f24902f;
    public final boolean f24903g;
    public final Object h;

    public jn(Context context, int i7, long j3, String str, long j10, int i10, boolean z10) {
        this.d = i7;
        this.f24900c = j3;
        this.f24902f = j10;
        this.f24901e = i10;
        this.f24903g = z10;
        this.f24899b = context;
        this.h = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f24898a) {
            case 0:
                mp mpVar = (mp) this.f24899b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j3 = this.f24900c;
                if (j3 != 0) {
                    mpVar.getMessagesStorage().q1(j3);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j10 = this.f24902f;
                    if (i7 > 0) {
                        mpVar.Y(j10, 0, this.d, this.f24901e, this.f24903g, inputPeer, 0L);
                    }
                    mpVar.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    tr messagesStorage = mpVar.getMessagesStorage();
                    messagesStorage.f27054a.c(new pp(messagesStorage, j10, 5));
                    return;
                }
                return;
            case 1:
                mp mpVar2 = (mp) this.f24899b;
                org.telegram.ui.vf vfVar = (org.telegram.ui.vf) this.h;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    mpVar2.T3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    mpVar2.getMessagesStorage().f27054a.c(new tn(mpVar2, this.f24900c, this.d, this.f24901e, this.f24902f, tL_messages_affectedHistory2, this.f24903g, vfVar));
                    return;
                }
                g0.g3(new a(vfVar, 26));
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f24900c, this.f24902f, this.f24901e, this.f24903g, (Context) this.f24899b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public jn(mp mpVar, long j3, int i7, int i10, long j10, boolean z10, org.telegram.ui.vf vfVar) {
        this.f24899b = mpVar;
        this.f24900c = j3;
        this.d = i7;
        this.f24901e = i10;
        this.f24902f = j10;
        this.f24903g = z10;
        this.h = vfVar;
    }

    public jn(mp mpVar, long j3, long j10, int i7, int i10, boolean z10, TLRPC.InputPeer inputPeer) {
        this.f24899b = mpVar;
        this.f24900c = j3;
        this.f24902f = j10;
        this.d = i7;
        this.f24901e = i10;
        this.f24903g = z10;
        this.h = inputPeer;
    }
}
