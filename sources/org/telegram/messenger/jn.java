package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jn implements RequestDelegate {
    public final int f25005a = 2;
    public final Object f25006b;
    public final long f25007c;
    public final int d;
    public final int f25008e;
    public final long f25009f;
    public final boolean f25010g;
    public final Object h;

    public jn(Context context, int i7, long j3, String str, long j10, int i10, boolean z10) {
        this.d = i7;
        this.f25007c = j3;
        this.f25009f = j10;
        this.f25008e = i10;
        this.f25010g = z10;
        this.f25006b = context;
        this.h = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25005a) {
            case 0:
                mp mpVar = (mp) this.f25006b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j3 = this.f25007c;
                if (j3 != 0) {
                    mpVar.getMessagesStorage().q1(j3);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i7 = tL_messages_affectedHistory.offset;
                    long j10 = this.f25009f;
                    if (i7 > 0) {
                        mpVar.Y(j10, 0, this.d, this.f25008e, this.f25010g, inputPeer, 0L);
                    }
                    mpVar.T3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    tr messagesStorage = mpVar.getMessagesStorage();
                    messagesStorage.f27149a.c(new pp(messagesStorage, j10, 5));
                    return;
                }
                return;
            case 1:
                mp mpVar2 = (mp) this.f25006b;
                org.telegram.ui.vf vfVar = (org.telegram.ui.vf) this.h;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    mpVar2.T3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    mpVar2.getMessagesStorage().f27149a.c(new tn(mpVar2, this.f25007c, this.d, this.f25008e, this.f25009f, tL_messages_affectedHistory2, this.f25010g, vfVar));
                    return;
                }
                g0.g3(new a(vfVar, 26));
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f25007c, this.f25009f, this.f25008e, this.f25010g, (Context) this.f25006b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public jn(mp mpVar, long j3, int i7, int i10, long j10, boolean z10, org.telegram.ui.vf vfVar) {
        this.f25006b = mpVar;
        this.f25007c = j3;
        this.d = i7;
        this.f25008e = i10;
        this.f25009f = j10;
        this.f25010g = z10;
        this.h = vfVar;
    }

    public jn(mp mpVar, long j3, long j10, int i7, int i10, boolean z10, TLRPC.InputPeer inputPeer) {
        this.f25006b = mpVar;
        this.f25007c = j3;
        this.f25009f = j10;
        this.d = i7;
        this.f25008e = i10;
        this.f25010g = z10;
        this.h = inputPeer;
    }
}
