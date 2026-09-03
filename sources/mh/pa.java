package mh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.xn;
public final class pa implements Runnable {
    public final int f14612a;
    public final boolean f14613b;
    public final long f14614c;
    public final Object d;

    public pa(Object obj, long j10, boolean z4, int i10) {
        this.f14612a = i10;
        this.d = obj;
        this.f14614c = j10;
        this.f14613b = z4;
    }

    @Override
    public final void run() {
        switch (this.f14612a) {
            case 0:
                eb ebVar = (eb) this.d;
                long j10 = this.f14614c;
                ebVar.C = j10;
                ebVar.B = j10;
                if (this.f14613b) {
                    oh.t0 t0Var = ebVar.D;
                    t0Var.f17759c = j10;
                    ebVar.E.set(t0Var);
                }
                ebVar.r();
                ebVar.F.a(true, true);
                db dbVar = ebVar.f13999y;
                if (dbVar != null) {
                    dbVar.setMyPrivacy(ebVar.B);
                    return;
                }
                return;
            case 1:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f14613b, this.f14614c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f14613b, this.f14614c);
                return;
            case 3:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f14614c, this.f14613b);
                return;
            case 4:
                xn.b0((xn) this.d, this.f14614c, this.f14613b);
                return;
            case 5:
                qh.w7 w7Var = (qh.w7) this.d;
                qh.c8 c8Var = w7Var.T;
                boolean z4 = this.f14613b;
                long j11 = this.f14614c;
                if (z4) {
                    MessagesController.getInstance(qh.c8.Z(c8Var)).loadChannelParticipants(Long.valueOf(j11), new org.telegram.ui.ActionBar.b4(w7Var, j11, 2), 200);
                    return;
                } else {
                    MessagesController.getInstance(qh.c8.b0(c8Var)).loadFullChat(j11, 0, true);
                    return;
                }
            default:
                th.n0 n0Var = (th.n0) this.d;
                n0Var.f48205i = null;
                a0.h hVar = n0Var.f48204g;
                long j12 = this.f14614c;
                hVar.l(j12);
                ArrayList arrayList = n0Var.f48206j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) n0Var.f48206j.get(size)).peer) == j12) {
                            n0Var.f48206j.remove(size);
                        }
                    }
                }
                n0Var.a();
                th.m0 m0Var = n0Var.h;
                if (m0Var != null) {
                    m0Var.e();
                }
                MessagesController.getInstance(n0Var.d).resolveCommunityJoinPendingRequest(n0Var.f48202e, j12, !this.f14613b, new th.l0(n0Var, 2));
                return;
        }
    }

    public pa(Object obj, boolean z4, long j10, int i10) {
        this.f14612a = i10;
        this.d = obj;
        this.f14613b = z4;
        this.f14614c = j10;
    }
}
