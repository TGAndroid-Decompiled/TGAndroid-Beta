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
    public final int f5459a;
    public final long f5460b;
    public final boolean f5461c;
    public final Object d;

    public r9(Object obj, long j3, boolean z10, int i10) {
        this.f5459a = i10;
        this.d = obj;
        this.f5460b = j3;
        this.f5461c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5459a) {
            case 0:
                ba baVar = (ba) this.d;
                ia iaVar = baVar.W;
                boolean z10 = this.f5461c;
                long j3 = this.f5460b;
                if (z10) {
                    MessagesController.getInstance(ia.Z(iaVar)).loadChannelParticipants(Long.valueOf(j3), new s9(baVar, j3, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(ia.b0(iaVar)).loadFullChat(j3, 0, true);
                    return;
                }
            case 1:
                fi.t0 t0Var = (fi.t0) this.d;
                t0Var.f9181i = null;
                a0.i iVar = t0Var.f9180g;
                long j10 = this.f5460b;
                iVar.l(j10);
                ArrayList arrayList = t0Var.f9182j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.f9182j.get(size)).peer) == j10) {
                            t0Var.f9182j.remove(size);
                        }
                    }
                }
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.e();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.e, j10, !this.f5461c, new fi.r0(t0Var, 2));
                return;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f5461c, this.f5460b);
                return;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f5461c, this.f5460b);
                return;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f5460b, this.f5461c);
                return;
            case 5:
                bo.b0((bo) this.d, this.f5460b, this.f5461c);
                return;
            default:
                yh.p8 p8Var = (yh.p8) this.d;
                long j11 = this.f5460b;
                p8Var.F = j11;
                p8Var.E = j11;
                if (this.f5461c) {
                    ai.m1 m1Var = p8Var.G;
                    m1Var.f1226c = j11;
                    p8Var.H.set(m1Var);
                }
                p8Var.r();
                p8Var.I.a(true, true);
                yh.o8 o8Var = p8Var.f47588y;
                if (o8Var != null) {
                    o8Var.setMyPrivacy(p8Var.E);
                    return;
                }
                return;
        }
    }

    public r9(Object obj, boolean z10, long j3, int i10) {
        this.f5459a = i10;
        this.d = obj;
        this.f5461c = z10;
        this.f5460b = j3;
    }
}
