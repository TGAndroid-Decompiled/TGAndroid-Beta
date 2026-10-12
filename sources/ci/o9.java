package ci;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.eo;
public final class o9 implements Runnable {
    public final int f5691a;
    public final long f5692b;
    public final boolean f5693c;
    public final Object d;

    public o9(Object obj, long j3, boolean z10, int i10) {
        this.f5691a = i10;
        this.d = obj;
        this.f5692b = j3;
        this.f5693c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5691a) {
            case 0:
                y9 y9Var = (y9) this.d;
                fa faVar = y9Var.W;
                boolean z10 = this.f5693c;
                long j3 = this.f5692b;
                if (z10) {
                    MessagesController.getInstance(fa.a0(faVar)).loadChannelParticipants(Long.valueOf(j3), new p9(y9Var, j3, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(fa.c0(faVar)).loadFullChat(j3, 0, true);
                    return;
                }
            case 1:
                fi.t0 t0Var = (fi.t0) this.d;
                t0Var.f10054i = null;
                a0.i iVar = t0Var.f10053g;
                long j10 = this.f5692b;
                iVar.l(j10);
                ArrayList arrayList = t0Var.f10055j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.f10055j.get(size)).peer) == j10) {
                            t0Var.f10055j.remove(size);
                        }
                    }
                }
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.i();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.f10051e, j10, !this.f5693c, new fi.r0(t0Var, 2));
                return;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f5693c, this.f5692b);
                return;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$5(this.f5693c, this.f5692b);
                return;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f5692b, this.f5693c);
                return;
            case 5:
                eo.z0((eo) this.d, this.f5692b, this.f5693c);
                return;
            default:
                yh.h8 h8Var = (yh.h8) this.d;
                long j11 = this.f5692b;
                h8Var.F = j11;
                h8Var.E = j11;
                if (this.f5693c) {
                    ai.m1 m1Var = h8Var.G;
                    m1Var.f1380c = j11;
                    h8Var.H.set(m1Var);
                }
                h8Var.t();
                h8Var.J.a(true, true);
                yh.g8 g8Var = h8Var.f52882y;
                if (g8Var != null) {
                    g8Var.setMyPrivacy(h8Var.E);
                    return;
                }
                return;
        }
    }

    public o9(Object obj, boolean z10, long j3, int i10) {
        this.f5691a = i10;
        this.d = obj;
        this.f5693c = z10;
        this.f5692b = j3;
    }
}
