package lh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.zn;
public final class pa implements Runnable {
    public final int f12926a;
    public final boolean f12927b;
    public final long f12928c;
    public final Object d;

    public pa(Object obj, long j10, boolean z4, int i10) {
        this.f12926a = i10;
        this.d = obj;
        this.f12928c = j10;
        this.f12927b = z4;
    }

    @Override
    public final void run() {
        switch (this.f12926a) {
            case 0:
                eb ebVar = (eb) this.d;
                long j10 = this.f12928c;
                ebVar.C = j10;
                ebVar.B = j10;
                if (this.f12927b) {
                    nh.t0 t0Var = ebVar.D;
                    t0Var.f15878c = j10;
                    ebVar.E.set(t0Var);
                }
                ebVar.r();
                ebVar.F.a(true, true);
                db dbVar = ebVar.f12372y;
                if (dbVar != null) {
                    dbVar.setMyPrivacy(ebVar.B);
                    return;
                }
                return;
            case 1:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f12927b, this.f12928c);
                return;
            case 2:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f12927b, this.f12928c);
                return;
            case 3:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f12928c, this.f12927b);
                return;
            case 4:
                zn.b0((zn) this.d, this.f12928c, this.f12927b);
                return;
            case 5:
                ph.y7 y7Var = (ph.y7) this.d;
                ph.e8 e8Var = y7Var.T;
                boolean z4 = this.f12927b;
                long j11 = this.f12928c;
                if (z4) {
                    MessagesController.getInstance(ph.e8.Z(e8Var)).loadChannelParticipants(Long.valueOf(j11), new org.telegram.ui.ActionBar.a4(y7Var, j11, 2), 200);
                    return;
                } else {
                    MessagesController.getInstance(ph.e8.b0(e8Var)).loadFullChat(j11, 0, true);
                    return;
                }
            default:
                sh.n0 n0Var = (sh.n0) this.d;
                n0Var.f44450i = null;
                a0.h hVar = n0Var.f44449g;
                long j12 = this.f12928c;
                hVar.l(j12);
                ArrayList arrayList = n0Var.f44451j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) n0Var.f44451j.get(size)).peer) == j12) {
                            n0Var.f44451j.remove(size);
                        }
                    }
                }
                n0Var.a();
                sh.m0 m0Var = n0Var.h;
                if (m0Var != null) {
                    m0Var.f();
                }
                MessagesController.getInstance(n0Var.d).resolveCommunityJoinPendingRequest(n0Var.e, j12, !this.f12927b, new sh.l0(n0Var, 2));
                return;
        }
    }

    public pa(Object obj, boolean z4, long j10, int i10) {
        this.f12926a = i10;
        this.d = obj;
        this.f12927b = z4;
        this.f12928c = j10;
    }
}
