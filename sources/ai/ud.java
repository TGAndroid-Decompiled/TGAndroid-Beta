package ai;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.sn;
public final class ud implements Runnable {
    public final int f2280a;
    public final boolean f2281b;
    public final long f2282c;
    public final Object d;

    public ud(Object obj, long j10, boolean z10, int i10) {
        this.f2280a = i10;
        this.d = obj;
        this.f2282c = j10;
        this.f2281b = z10;
    }

    @Override
    public final void run() {
        switch (this.f2280a) {
            case 0:
                me meVar = (me) this.d;
                long j10 = this.f2282c;
                meVar.F = j10;
                meVar.E = j10;
                if (this.f2281b) {
                    ci.v0 v0Var = meVar.G;
                    v0Var.f6003c = j10;
                    meVar.H.set(v0Var);
                }
                meVar.s();
                meVar.J.a(true, true);
                le leVar = meVar.f1848y;
                if (leVar != null) {
                    leVar.setMyPrivacy(meVar.E);
                    return;
                }
                return;
            case 1:
                ei.k9 k9Var = (ei.k9) this.d;
                ei.r9 r9Var = k9Var.W;
                boolean z10 = this.f2281b;
                long j11 = this.f2282c;
                if (z10) {
                    MessagesController.getInstance(ei.r9.Z(r9Var)).loadChannelParticipants(Long.valueOf(j11), new ei.c9(k9Var, j11, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(ei.r9.b0(r9Var)).loadFullChat(j11, 0, true);
                    return;
                }
            case 2:
                hi.s0 s0Var = (hi.s0) this.d;
                s0Var.f12255i = null;
                a0.h hVar = s0Var.f12254g;
                long j12 = this.f2282c;
                hVar.l(j12);
                ArrayList arrayList = s0Var.f12256j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) s0Var.f12256j.get(size)).peer) == j12) {
                            s0Var.f12256j.remove(size);
                        }
                    }
                }
                s0Var.a();
                hi.r0 r0Var = s0Var.h;
                if (r0Var != null) {
                    r0Var.q();
                }
                MessagesController.getInstance(s0Var.d).resolveCommunityJoinPendingRequest(s0Var.e, j12, !this.f2281b, new hi.q0(s0Var, 2));
                return;
            case 3:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f2281b, this.f2282c);
                return;
            case 4:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$5(this.f2281b, this.f2282c);
                return;
            case 5:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f2282c, this.f2281b);
                return;
            default:
                sn.A0((sn) this.d, this.f2282c, this.f2281b);
                return;
        }
    }

    public ud(Object obj, boolean z10, long j10, int i10) {
        this.f2280a = i10;
        this.d = obj;
        this.f2281b = z10;
        this.f2282c = j10;
    }
}
