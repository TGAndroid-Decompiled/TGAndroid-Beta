package ci;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.wn;
public final class o9 implements Runnable {
    public final int f5255a;
    public final long f5256b;
    public final boolean f5257c;
    public final Object d;

    public o9(Object obj, long j3, boolean z10, int i10) {
        this.f5255a = i10;
        this.d = obj;
        this.f5256b = j3;
        this.f5257c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5255a) {
            case 0:
                y9 y9Var = (y9) this.d;
                fa faVar = y9Var.W;
                boolean z10 = this.f5257c;
                long j3 = this.f5256b;
                if (z10) {
                    MessagesController.getInstance(fa.Z(faVar)).loadChannelParticipants(Long.valueOf(j3), new p9(y9Var, j3, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(fa.b0(faVar)).loadFullChat(j3, 0, true);
                    return;
                }
            case 1:
                fi.t0 t0Var = (fi.t0) this.d;
                t0Var.f9166i = null;
                a0.i iVar = t0Var.f9165g;
                long j10 = this.f5256b;
                iVar.l(j10);
                ArrayList arrayList = t0Var.f9167j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.f9167j.get(size)).peer) == j10) {
                            t0Var.f9167j.remove(size);
                        }
                    }
                }
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.f();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.e, j10, !this.f5257c, new fi.r0(t0Var, 2));
                return;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f5257c, this.f5256b);
                return;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f5257c, this.f5256b);
                return;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f5256b, this.f5257c);
                return;
            case 5:
                wn.o0((wn) this.d, this.f5256b, this.f5257c);
                return;
            default:
                yh.o8 o8Var = (yh.o8) this.d;
                long j11 = this.f5256b;
                o8Var.F = j11;
                o8Var.E = j11;
                if (this.f5257c) {
                    ai.m1 m1Var = o8Var.G;
                    m1Var.f1228c = j11;
                    o8Var.H.set(m1Var);
                }
                o8Var.r();
                o8Var.I.a(true, true);
                yh.n8 n8Var = o8Var.f47842y;
                if (n8Var != null) {
                    n8Var.setMyPrivacy(o8Var.E);
                    return;
                }
                return;
        }
    }

    public o9(Object obj, boolean z10, long j3, int i10) {
        this.f5255a = i10;
        this.d = obj;
        this.f5257c = z10;
        this.f5256b = j3;
    }
}
