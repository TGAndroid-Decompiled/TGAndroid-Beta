package ci;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.yn;
public final class n9 implements Runnable {
    public final int f5617a;
    public final long f5618b;
    public final boolean f5619c;
    public final Object d;

    public n9(Object obj, long j3, boolean z10, int i10) {
        this.f5617a = i10;
        this.d = obj;
        this.f5618b = j3;
        this.f5619c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5617a) {
            case 0:
                x9 x9Var = (x9) this.d;
                ea eaVar = x9Var.W;
                boolean z10 = this.f5619c;
                long j3 = this.f5618b;
                if (z10) {
                    MessagesController.getInstance(ea.Y(eaVar)).loadChannelParticipants(Long.valueOf(j3), new o9(x9Var, j3, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(ea.b0(eaVar)).loadFullChat(j3, 0, true);
                    return;
                }
            case 1:
                fi.t0 t0Var = (fi.t0) this.d;
                t0Var.f9981i = null;
                a0.i iVar = t0Var.f9980g;
                long j10 = this.f5618b;
                iVar.l(j10);
                ArrayList arrayList = t0Var.f9982j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.f9982j.get(size)).peer) == j10) {
                            t0Var.f9982j.remove(size);
                        }
                    }
                }
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.l();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.f9978e, j10, !this.f5619c, new fi.r0(t0Var, 2));
                return;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f5619c, this.f5618b);
                return;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f5619c, this.f5618b);
                return;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f5618b, this.f5619c);
                return;
            case 5:
                yn.d0((yn) this.d, this.f5618b, this.f5619c);
                return;
            default:
                yh.r8 r8Var = (yh.r8) this.d;
                long j11 = this.f5618b;
                r8Var.F = j11;
                r8Var.E = j11;
                if (this.f5619c) {
                    ai.m1 m1Var = r8Var.G;
                    m1Var.f1327c = j11;
                    r8Var.H.set(m1Var);
                }
                r8Var.r();
                r8Var.I.a(true, true);
                yh.q8 q8Var = r8Var.f51947y;
                if (q8Var != null) {
                    q8Var.setMyPrivacy(r8Var.E);
                    return;
                }
                return;
        }
    }

    public n9(Object obj, boolean z10, long j3, int i10) {
        this.f5617a = i10;
        this.d = obj;
        this.f5619c = z10;
        this.f5618b = j3;
    }
}
