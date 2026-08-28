package gh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.qn;
public final class ua implements Runnable {
    public final int f8989a;
    public final boolean f8990b;
    public final long f8991c;
    public final Object d;

    public ua(Object obj, long j10, boolean z10, int i9) {
        this.f8989a = i9;
        this.d = obj;
        this.f8991c = j10;
        this.f8990b = z10;
    }

    @Override
    public final void run() {
        switch (this.f8989a) {
            case 0:
                jb jbVar = (jb) this.d;
                long j10 = this.f8991c;
                jbVar.B = j10;
                jbVar.A = j10;
                if (this.f8990b) {
                    ih.u0 u0Var = jbVar.C;
                    u0Var.f12176c = j10;
                    jbVar.D.set(u0Var);
                }
                jbVar.r();
                jbVar.E.a(true, true);
                ib ibVar = jbVar.f8377y;
                if (ibVar != null) {
                    ibVar.setMyPrivacy(jbVar.A);
                    return;
                }
                return;
            case 1:
                kh.n9 n9Var = (kh.n9) this.d;
                kh.t9 t9Var = n9Var.S;
                boolean z10 = this.f8990b;
                long j11 = this.f8991c;
                if (z10) {
                    MessagesController.getInstance(kh.t9.Y(t9Var)).loadChannelParticipants(Long.valueOf(j11), new kh.e9(n9Var, j11, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(kh.t9.a0(t9Var)).loadFullChat(j11, 0, true);
                    return;
                }
            case 2:
                nh.q0 q0Var = (nh.q0) this.d;
                q0Var.f18704i = null;
                a0.h hVar = q0Var.f18703g;
                long j12 = this.f8991c;
                hVar.l(j12);
                ArrayList arrayList = q0Var.f18705j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) q0Var.f18705j.get(size)).peer) == j12) {
                            q0Var.f18705j.remove(size);
                        }
                    }
                }
                q0Var.a();
                nh.p0 p0Var = q0Var.h;
                if (p0Var != null) {
                    p0Var.c();
                }
                MessagesController.getInstance(q0Var.d).resolveCommunityJoinPendingRequest(q0Var.f18701e, j12, !this.f8990b, new nh.o0(q0Var, 2));
                return;
            case 3:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f8990b, this.f8991c);
                return;
            case 4:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f8990b, this.f8991c);
                return;
            case 5:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f8991c, this.f8990b);
                return;
            default:
                qn.a0((qn) this.d, this.f8991c, this.f8990b);
                return;
        }
    }

    public ua(Object obj, boolean z10, long j10, int i9) {
        this.f8989a = i9;
        this.d = obj;
        this.f8990b = z10;
        this.f8991c = j10;
    }
}
