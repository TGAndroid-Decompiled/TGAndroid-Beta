package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tn implements RequestDelegate {
    public final int f18086a = 2;
    public final Object f18087b;
    public final long f18088c;
    public final int d;
    public final int e;
    public final long f18089f;
    public final boolean f18090g;
    public final Object h;

    public tn(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        this.d = i10;
        this.f18088c = j10;
        this.f18089f = j11;
        this.e = i11;
        this.f18090g = z10;
        this.f18087b = context;
        this.h = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18086a) {
            case 0:
                vp vpVar = (vp) this.f18087b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.h;
                long j10 = this.f18088c;
                if (j10 != 0) {
                    vpVar.getMessagesStorage().q1(j10);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i10 = tL_messages_affectedHistory.offset;
                    long j11 = this.f18089f;
                    if (i10 > 0) {
                        vpVar.Y(j11, 0, this.d, this.e, this.f18090g, inputPeer, 0L);
                    }
                    vpVar.J3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    hs messagesStorage = vpVar.getMessagesStorage();
                    messagesStorage.f15938a.c(new cq(messagesStorage, j11, 5));
                    return;
                }
                return;
            case 1:
                vp vpVar2 = (vp) this.f18087b;
                org.telegram.ui.lg lgVar = (org.telegram.ui.lg) this.h;
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    vpVar2.J3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    vpVar2.getMessagesStorage().f15938a.c(new bo(vpVar2, this.f18088c, this.d, this.e, this.f18089f, tL_messages_affectedHistory2, this.f18090g, lgVar));
                    return;
                }
                i0.g3(new a(lgVar, 26));
                return;
            default:
                VoIPGroupNotification.lambda$request$1(this.d, this.f18088c, this.f18089f, this.e, this.f18090g, (Context) this.f18087b, (String) this.h, tLObject, tL_error);
                return;
        }
    }

    public tn(vp vpVar, long j10, int i10, int i11, long j11, boolean z10, org.telegram.ui.lg lgVar) {
        this.f18087b = vpVar;
        this.f18088c = j10;
        this.d = i10;
        this.e = i11;
        this.f18089f = j11;
        this.f18090g = z10;
        this.h = lgVar;
    }

    public tn(vp vpVar, long j10, long j11, int i10, int i11, boolean z10, TLRPC.InputPeer inputPeer) {
        this.f18087b = vpVar;
        this.f18088c = j10;
        this.f18089f = j11;
        this.d = i10;
        this.e = i11;
        this.f18090g = z10;
        this.h = inputPeer;
    }
}
