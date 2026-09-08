package di;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.co;
public final class q9 implements Runnable {
    public final int f8043a;
    public final long f8044b;
    public final boolean f8045c;
    public final Object d;

    public q9(Object obj, long j3, boolean z10, int i10) {
        this.f8043a = i10;
        this.d = obj;
        this.f8044b = j3;
        this.f8045c = z10;
    }

    @Override
    public final void run() {
        switch (this.f8043a) {
            case 0:
                ba baVar = (ba) this.d;
                ia iaVar = baVar.W;
                boolean z10 = this.f8045c;
                long j3 = this.f8044b;
                if (z10) {
                    MessagesController.getInstance(ia.Z(iaVar)).loadChannelParticipants(Long.valueOf(j3), new r9(baVar, j3, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(ia.b0(iaVar)).loadFullChat(j3, 0, true);
                    return;
                }
            case 1:
                gi.t0 t0Var = (gi.t0) this.d;
                t0Var.f10803i = null;
                a0.i iVar = t0Var.f10802g;
                long j10 = this.f8044b;
                iVar.l(j10);
                ArrayList arrayList = t0Var.f10804j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.f10804j.get(size)).peer) == j10) {
                            t0Var.f10804j.remove(size);
                        }
                    }
                }
                t0Var.a();
                gi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.l();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.f10800e, j10, !this.f8045c, new gi.r0(t0Var, 2));
                return;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f8045c, this.f8044b);
                return;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f8045c, this.f8044b);
                return;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f8044b, this.f8045c);
                return;
            case 5:
                co.b0((co) this.d, this.f8044b, this.f8045c);
                return;
            default:
                zh.n8 n8Var = (zh.n8) this.d;
                long j11 = this.f8044b;
                n8Var.F = j11;
                n8Var.E = j11;
                if (this.f8045c) {
                    bi.e1 e1Var = n8Var.G;
                    e1Var.f2927c = j11;
                    n8Var.H.set(e1Var);
                }
                n8Var.r();
                n8Var.I.a(true, true);
                zh.m8 m8Var = n8Var.f52376y;
                if (m8Var != null) {
                    m8Var.setMyPrivacy(n8Var.E);
                    return;
                }
                return;
        }
    }

    public q9(Object obj, boolean z10, long j3, int i10) {
        this.f8043a = i10;
        this.d = obj;
        this.f8045c = z10;
        this.f8044b = j3;
    }
}
