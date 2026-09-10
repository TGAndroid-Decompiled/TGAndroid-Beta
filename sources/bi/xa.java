package bi;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.eo;
public final class xa implements Runnable {
    public final int f3931a;
    public final long f3932b;
    public final boolean f3933c;
    public final Object d;

    public xa(Object obj, long j3, boolean z10, int i10) {
        this.f3931a = i10;
        this.d = obj;
        this.f3932b = j3;
        this.f3933c = z10;
    }

    @Override
    public final void run() {
        switch (this.f3931a) {
            case 0:
                kb kbVar = (kb) this.d;
                rb rbVar = kbVar.W;
                boolean z10 = this.f3933c;
                long j3 = this.f3932b;
                if (z10) {
                    MessagesController.getInstance(rb.Z(rbVar)).loadChannelParticipants(Long.valueOf(j3), new ab(kbVar, j3, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(rb.b0(rbVar)).loadFullChat(j3, 0, true);
                    return;
                }
            case 1:
                ei.t0 t0Var = (ei.t0) this.d;
                t0Var.f7628i = null;
                a0.i iVar = t0Var.f7627g;
                long j10 = this.f3932b;
                iVar.l(j10);
                ArrayList arrayList = t0Var.f7629j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.f7629j.get(size)).peer) == j10) {
                            t0Var.f7629j.remove(size);
                        }
                    }
                }
                t0Var.a();
                ei.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.F();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.e, j10, !this.f3933c, new ei.r0(t0Var, 2));
                return;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f3933c, this.f3932b);
                return;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f3933c, this.f3932b);
                return;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f3932b, this.f3933c);
                return;
            case 5:
                eo.b0((eo) this.d, this.f3932b, this.f3933c);
                return;
            default:
                xh.r8 r8Var = (xh.r8) this.d;
                long j11 = this.f3932b;
                r8Var.F = j11;
                r8Var.E = j11;
                if (this.f3933c) {
                    zh.k0 k0Var = r8Var.G;
                    k0Var.f48577c = j11;
                    r8Var.H.set(k0Var);
                }
                r8Var.r();
                r8Var.I.a(true, true);
                xh.q8 q8Var = r8Var.f45996y;
                if (q8Var != null) {
                    q8Var.setMyPrivacy(r8Var.E);
                    return;
                }
                return;
        }
    }

    public xa(Object obj, boolean z10, long j3, int i10) {
        this.f3931a = i10;
        this.d = obj;
        this.f3933c = z10;
        this.f3932b = j3;
    }
}
