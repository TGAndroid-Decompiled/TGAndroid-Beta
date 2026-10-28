package bi;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
public final class kd implements Runnable {
    public final int f4994a;
    public final boolean f4995b;
    public final long f4996c;
    public final Object d;

    public kd(Object obj, long j10, boolean z10, int i10) {
        this.f4994a = i10;
        this.d = obj;
        this.f4996c = j10;
        this.f4995b = z10;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        switch (this.f4994a) {
            case 0:
                be beVar = (be) this.d;
                long j10 = this.f4996c;
                beVar.F = j10;
                beVar.E = j10;
                if (this.f4995b) {
                    di.v0 v0Var = beVar.G;
                    v0Var.f9239c = j10;
                    beVar.H.set(v0Var);
                }
                beVar.r();
                beVar.J.a(true, true);
                ae aeVar = beVar.f4407y;
                if (aeVar != null) {
                    aeVar.setMyPrivacy(beVar.E);
                    return;
                }
                return;
            case 1:
                fi.g9 g9Var = (fi.g9) this.d;
                fi.n9 n9Var = g9Var.W;
                boolean z10 = this.f4995b;
                long j11 = this.f4996c;
                if (z10) {
                    i11 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                    MessagesController.getInstance(i11).loadChannelParticipants(Long.valueOf(j11), new fi.y8(g9Var, j11, 0), 200);
                    return;
                }
                i10 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                MessagesController.getInstance(i10).loadFullChat(j11, 0, true);
                return;
            case 2:
                ii.r0 r0Var = (ii.r0) this.d;
                r0Var.f14417i = null;
                a0.h hVar = r0Var.f14416g;
                long j12 = this.f4996c;
                hVar.l(j12);
                ArrayList arrayList = r0Var.f14418j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) r0Var.f14418j.get(size)).peer) == j12) {
                            r0Var.f14418j.remove(size);
                        }
                    }
                }
                r0Var.a();
                ii.q0 q0Var = r0Var.h;
                if (q0Var != null) {
                    q0Var.c();
                }
                MessagesController.getInstance(r0Var.d).resolveCommunityJoinPendingRequest(r0Var.e, j12, !this.f4995b, new ii.p0(r0Var, 2));
                return;
            case 3:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f4995b, this.f4996c);
                return;
            case 4:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$5(this.f4995b, this.f4996c);
                return;
            default:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f4996c, this.f4995b);
                return;
        }
    }

    public kd(Object obj, boolean z10, long j10, int i10) {
        this.f4994a = i10;
        this.d = obj;
        this.f4995b = z10;
        this.f4996c = j10;
    }
}
