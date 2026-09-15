package ci;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.bo;
public final class r9 implements Runnable {
    public final int f5457a;
    public final long f5458b;
    public final boolean f5459c;
    public final Object d;

    public r9(Object obj, long j3, boolean z10, int i10) {
        this.f5457a = i10;
        this.d = obj;
        this.f5458b = j3;
        this.f5459c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5457a) {
            case 0:
                ba baVar = (ba) this.d;
                ia iaVar = baVar.W;
                boolean z10 = this.f5459c;
                long j3 = this.f5458b;
                if (z10) {
                    MessagesController.getInstance(ia.Z(iaVar)).loadChannelParticipants(Long.valueOf(j3), new s9(baVar, j3, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(ia.b0(iaVar)).loadFullChat(j3, 0, true);
                    return;
                }
            case 1:
                fi.t0 t0Var = (fi.t0) this.d;
                t0Var.f9179i = null;
                a0.i iVar = t0Var.f9178g;
                long j10 = this.f5458b;
                iVar.l(j10);
                ArrayList arrayList = t0Var.f9180j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.f9180j.get(size)).peer) == j10) {
                            t0Var.f9180j.remove(size);
                        }
                    }
                }
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.e();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.e, j10, !this.f5459c, new fi.r0(t0Var, 2));
                return;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f5459c, this.f5458b);
                return;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f5459c, this.f5458b);
                return;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f5458b, this.f5459c);
                return;
            case 5:
                bo.b0((bo) this.d, this.f5458b, this.f5459c);
                return;
            default:
                yh.q8 q8Var = (yh.q8) this.d;
                long j11 = this.f5458b;
                q8Var.F = j11;
                q8Var.E = j11;
                if (this.f5459c) {
                    ai.m1 m1Var = q8Var.G;
                    m1Var.f1224c = j11;
                    q8Var.H.set(m1Var);
                }
                q8Var.r();
                q8Var.I.a(true, true);
                yh.p8 p8Var = q8Var.f47685y;
                if (p8Var != null) {
                    p8Var.setMyPrivacy(q8Var.E);
                    return;
                }
                return;
        }
    }

    public r9(Object obj, boolean z10, long j3, int i10) {
        this.f5457a = i10;
        this.d = obj;
        this.f5459c = z10;
        this.f5458b = j3;
    }
}
