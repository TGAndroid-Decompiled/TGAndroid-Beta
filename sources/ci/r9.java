package ci;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.zn;
public final class r9 implements Runnable {
    public final int f5463a;
    public final long f5464b;
    public final boolean f5465c;
    public final Object d;

    public r9(Object obj, long j3, boolean z10, int i10) {
        this.f5463a = i10;
        this.d = obj;
        this.f5464b = j3;
        this.f5465c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5463a) {
            case 0:
                ba baVar = (ba) this.d;
                ia iaVar = baVar.W;
                boolean z10 = this.f5465c;
                long j3 = this.f5464b;
                if (z10) {
                    MessagesController.getInstance(ia.Z(iaVar)).loadChannelParticipants(Long.valueOf(j3), new s9(baVar, j3, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(ia.b0(iaVar)).loadFullChat(j3, 0, true);
                    return;
                }
            case 1:
                fi.t0 t0Var = (fi.t0) this.d;
                t0Var.f9184i = null;
                a0.i iVar = t0Var.f9183g;
                long j10 = this.f5464b;
                iVar.l(j10);
                ArrayList arrayList = t0Var.f9185j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.f9185j.get(size)).peer) == j10) {
                            t0Var.f9185j.remove(size);
                        }
                    }
                }
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.f();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.e, j10, !this.f5465c, new fi.r0(t0Var, 2));
                return;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f5465c, this.f5464b);
                return;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f5465c, this.f5464b);
                return;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f5464b, this.f5465c);
                return;
            case 5:
                zn.p0((zn) this.d, this.f5464b, this.f5465c);
                return;
            default:
                yh.o8 o8Var = (yh.o8) this.d;
                long j11 = this.f5464b;
                o8Var.F = j11;
                o8Var.E = j11;
                if (this.f5465c) {
                    ai.m1 m1Var = o8Var.G;
                    m1Var.f1229c = j11;
                    o8Var.H.set(m1Var);
                }
                o8Var.r();
                o8Var.I.a(true, true);
                yh.n8 n8Var = o8Var.f47875y;
                if (n8Var != null) {
                    n8Var.setMyPrivacy(o8Var.E);
                    return;
                }
                return;
        }
    }

    public r9(Object obj, boolean z10, long j3, int i10) {
        this.f5463a = i10;
        this.d = obj;
        this.f5465c = z10;
        this.f5464b = j3;
    }
}
