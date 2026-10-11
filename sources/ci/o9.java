package ci;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.zn;
public final class o9 implements Runnable {
    public final int f5692a;
    public final long f5693b;
    public final boolean f5694c;
    public final Object d;

    public o9(Object obj, long j3, boolean z10, int i10) {
        this.f5692a = i10;
        this.d = obj;
        this.f5693b = j3;
        this.f5694c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5692a) {
            case 0:
                y9 y9Var = (y9) this.d;
                fa faVar = y9Var.W;
                boolean z10 = this.f5694c;
                long j3 = this.f5693b;
                if (z10) {
                    MessagesController.getInstance(fa.a0(faVar)).loadChannelParticipants(Long.valueOf(j3), new p9(y9Var, j3, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(fa.c0(faVar)).loadFullChat(j3, 0, true);
                    return;
                }
            case 1:
                fi.t0 t0Var = (fi.t0) this.d;
                t0Var.f10055i = null;
                a0.i iVar = t0Var.f10054g;
                long j10 = this.f5693b;
                iVar.l(j10);
                ArrayList arrayList = t0Var.f10056j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.f10056j.get(size)).peer) == j10) {
                            t0Var.f10056j.remove(size);
                        }
                    }
                }
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.i();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.f10052e, j10, !this.f5694c, new fi.r0(t0Var, 2));
                return;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f5694c, this.f5693b);
                return;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$5(this.f5694c, this.f5693b);
                return;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f5693b, this.f5694c);
                return;
            case 5:
                zn.z0((zn) this.d, this.f5693b, this.f5694c);
                return;
            default:
                yh.h8 h8Var = (yh.h8) this.d;
                long j11 = this.f5693b;
                h8Var.F = j11;
                h8Var.E = j11;
                if (this.f5694c) {
                    ai.m1 m1Var = h8Var.G;
                    m1Var.f1382c = j11;
                    h8Var.H.set(m1Var);
                }
                h8Var.t();
                h8Var.J.a(true, true);
                yh.g8 g8Var = h8Var.f52779y;
                if (g8Var != null) {
                    g8Var.setMyPrivacy(h8Var.E);
                    return;
                }
                return;
        }
    }

    public o9(Object obj, boolean z10, long j3, int i10) {
        this.f5692a = i10;
        this.d = obj;
        this.f5694c = z10;
        this.f5693b = j3;
    }
}
