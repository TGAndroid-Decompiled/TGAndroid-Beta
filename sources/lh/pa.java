package lh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.xn;
public final class pa implements Runnable {
    public final int f12942a;
    public final boolean f12943b;
    public final long f12944c;
    public final Object d;

    public pa(Object obj, long j10, boolean z4, int i10) {
        this.f12942a = i10;
        this.d = obj;
        this.f12944c = j10;
        this.f12943b = z4;
    }

    @Override
    public final void run() {
        switch (this.f12942a) {
            case 0:
                eb ebVar = (eb) this.d;
                long j10 = this.f12944c;
                ebVar.C = j10;
                ebVar.B = j10;
                if (this.f12943b) {
                    nh.t0 t0Var = ebVar.D;
                    t0Var.f15898c = j10;
                    ebVar.E.set(t0Var);
                }
                ebVar.r();
                ebVar.F.a(true, true);
                db dbVar = ebVar.f12388y;
                if (dbVar != null) {
                    dbVar.setMyPrivacy(ebVar.B);
                    return;
                }
                return;
            case 1:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f12943b, this.f12944c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f12943b, this.f12944c);
                return;
            case 3:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f12944c, this.f12943b);
                return;
            case 4:
                xn.b0((xn) this.d, this.f12944c, this.f12943b);
                return;
            case 5:
                ph.z7 z7Var = (ph.z7) this.d;
                ph.f8 f8Var = z7Var.T;
                boolean z4 = this.f12943b;
                long j11 = this.f12944c;
                if (z4) {
                    MessagesController.getInstance(ph.f8.Z(f8Var)).loadChannelParticipants(Long.valueOf(j11), new org.telegram.ui.ActionBar.a4(z7Var, j11, 2), 200);
                    return;
                } else {
                    MessagesController.getInstance(ph.f8.b0(f8Var)).loadFullChat(j11, 0, true);
                    return;
                }
            default:
                sh.o0 o0Var = (sh.o0) this.d;
                o0Var.f44389i = null;
                a0.h hVar = o0Var.f44388g;
                long j12 = this.f12944c;
                hVar.l(j12);
                ArrayList arrayList = o0Var.f44390j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) o0Var.f44390j.get(size)).peer) == j12) {
                            o0Var.f44390j.remove(size);
                        }
                    }
                }
                o0Var.a();
                sh.n0 n0Var = o0Var.h;
                if (n0Var != null) {
                    n0Var.d();
                }
                MessagesController.getInstance(o0Var.d).resolveCommunityJoinPendingRequest(o0Var.e, j12, !this.f12943b, new sh.l0(o0Var, 2));
                return;
        }
    }

    public pa(Object obj, boolean z4, long j10, int i10) {
        this.f12942a = i10;
        this.d = obj;
        this.f12943b = z4;
        this.f12944c = j10;
    }
}
