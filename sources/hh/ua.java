package hh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.rn;

public final class ua implements Runnable {

    public final int f10181a;

    public final boolean f10182b;

    public final long f10183c;
    public final Object d;

    public ua(Object obj, long j10, boolean z10, int i10) {
        this.f10181a = i10;
        this.d = obj;
        this.f10183c = j10;
        this.f10182b = z10;
    }

    @Override
    public final void run() {
        switch (this.f10181a) {
            case 0:
                jb jbVar = (jb) this.d;
                long j10 = this.f10183c;
                jbVar.B = j10;
                jbVar.A = j10;
                if (this.f10182b) {
                    jh.s0 s0Var = jbVar.C;
                    s0Var.f13931c = j10;
                    jbVar.D.set(s0Var);
                }
                jbVar.s();
                jbVar.E.a(true, true);
                ib ibVar = jbVar.f9565y;
                if (ibVar != null) {
                    ibVar.setMyPrivacy(jbVar.A);
                }
                break;
            case 1:
                lh.k9 k9Var = (lh.k9) this.d;
                lh.q9 q9Var = k9Var.S;
                boolean z10 = this.f10182b;
                long j11 = this.f10183c;
                if (z10) {
                    MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).loadChannelParticipants(Long.valueOf(j11), new lh.b9(k9Var, j11, 0), 200);
                } else {
                    MessagesController.getInstance(((org.telegram.ui.ActionBar.e3) q9Var).currentAccount).loadFullChat(j11, 0, true);
                }
                break;
            case 2:
                oh.q0 q0Var = (oh.q0) this.d;
                q0Var.f19553i = null;
                a0.h hVar = q0Var.f19552g;
                long j12 = this.f10183c;
                hVar.l(j12);
                ArrayList arrayList = q0Var.f19554j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) q0Var.f19554j.get(size)).peer) == j12) {
                            q0Var.f19554j.remove(size);
                        }
                    }
                }
                q0Var.a();
                oh.p0 p0Var = q0Var.h;
                if (p0Var != null) {
                    p0Var.i();
                }
                MessagesController.getInstance(q0Var.d).resolveCommunityJoinPendingRequest(q0Var.f19550e, j12, !this.f10182b, new oh.o0(q0Var, 2));
                break;
            case 3:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f10182b, this.f10183c);
                break;
            case 4:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f10182b, this.f10183c);
                break;
            case 5:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f10183c, this.f10182b);
                break;
            default:
                rn.b0((rn) this.d, this.f10183c, this.f10182b);
                break;
        }
    }

    public ua(Object obj, boolean z10, long j10, int i10) {
        this.f10181a = i10;
        this.d = obj;
        this.f10182b = z10;
        this.f10183c = j10;
    }
}
