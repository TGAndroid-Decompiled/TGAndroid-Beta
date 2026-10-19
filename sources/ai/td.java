package ai;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.qn;
public final class td implements Runnable {
    public final int f2232a;
    public final boolean f2233b;
    public final long f2234c;
    public final Object d;

    public td(Object obj, long j10, boolean z10, int i10) {
        this.f2232a = i10;
        this.d = obj;
        this.f2234c = j10;
        this.f2233b = z10;
    }

    @Override
    public final void run() {
        switch (this.f2232a) {
            case 0:
                le leVar = (le) this.d;
                long j10 = this.f2234c;
                leVar.F = j10;
                leVar.E = j10;
                if (this.f2233b) {
                    ci.v0 v0Var = leVar.G;
                    v0Var.f6066c = j10;
                    leVar.H.set(v0Var);
                }
                leVar.t();
                leVar.J.a(true, true);
                ke keVar = leVar.f1798y;
                if (keVar != null) {
                    keVar.setMyPrivacy(leVar.E);
                    return;
                }
                return;
            case 1:
                ei.k9 k9Var = (ei.k9) this.d;
                ei.r9 r9Var = k9Var.W;
                boolean z10 = this.f2233b;
                long j11 = this.f2234c;
                if (z10) {
                    MessagesController.getInstance(ei.r9.a0(r9Var)).loadChannelParticipants(Long.valueOf(j11), new ei.c9(k9Var, j11, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(ei.r9.c0(r9Var)).loadFullChat(j11, 0, true);
                    return;
                }
            case 2:
                hi.s0 s0Var = (hi.s0) this.d;
                s0Var.f12223i = null;
                a0.h hVar = s0Var.f12222g;
                long j12 = this.f2234c;
                hVar.l(j12);
                ArrayList arrayList = s0Var.f12224j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) s0Var.f12224j.get(size)).peer) == j12) {
                            s0Var.f12224j.remove(size);
                        }
                    }
                }
                s0Var.a();
                hi.r0 r0Var = s0Var.h;
                if (r0Var != null) {
                    r0Var.l();
                }
                MessagesController.getInstance(s0Var.d).resolveCommunityJoinPendingRequest(s0Var.e, j12, !this.f2233b, new hi.q0(s0Var, 2));
                return;
            case 3:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f2233b, this.f2234c);
                return;
            case 4:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$5(this.f2233b, this.f2234c);
                return;
            case 5:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f2234c, this.f2233b);
                return;
            default:
                qn.z0((qn) this.d, this.f2234c, this.f2233b);
                return;
        }
    }

    public td(Object obj, boolean z10, long j10, int i10) {
        this.f2232a = i10;
        this.d = obj;
        this.f2233b = z10;
        this.f2234c = j10;
    }
}
