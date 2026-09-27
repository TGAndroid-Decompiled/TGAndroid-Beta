package ci;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.xn;
public final class n9 implements Runnable {
    public final int f5217a;
    public final long f5218b;
    public final boolean f5219c;
    public final Object d;

    public n9(Object obj, long j3, boolean z10, int i10) {
        this.f5217a = i10;
        this.d = obj;
        this.f5218b = j3;
        this.f5219c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5217a) {
            case 0:
                x9 x9Var = (x9) this.d;
                ea eaVar = x9Var.W;
                boolean z10 = this.f5219c;
                long j3 = this.f5218b;
                if (z10) {
                    MessagesController.getInstance(ea.Z(eaVar)).loadChannelParticipants(Long.valueOf(j3), new o9(x9Var, j3, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(ea.b0(eaVar)).loadFullChat(j3, 0, true);
                    return;
                }
            case 1:
                fi.t0 t0Var = (fi.t0) this.d;
                t0Var.f9171i = null;
                a0.i iVar = t0Var.f9170g;
                long j10 = this.f5218b;
                iVar.l(j10);
                ArrayList arrayList = t0Var.f9172j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.f9172j.get(size)).peer) == j10) {
                            t0Var.f9172j.remove(size);
                        }
                    }
                }
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.f();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.e, j10, !this.f5219c, new fi.r0(t0Var, 2));
                return;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f5219c, this.f5218b);
                return;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f5219c, this.f5218b);
                return;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f5218b, this.f5219c);
                return;
            case 5:
                xn.o0((xn) this.d, this.f5218b, this.f5219c);
                return;
            default:
                yh.n8 n8Var = (yh.n8) this.d;
                long j11 = this.f5218b;
                n8Var.F = j11;
                n8Var.E = j11;
                if (this.f5219c) {
                    ai.m1 m1Var = n8Var.G;
                    m1Var.f1230c = j11;
                    n8Var.H.set(m1Var);
                }
                n8Var.r();
                n8Var.I.a(true, true);
                yh.m8 m8Var = n8Var.f47844y;
                if (m8Var != null) {
                    m8Var.setMyPrivacy(n8Var.E);
                    return;
                }
                return;
        }
    }

    public n9(Object obj, boolean z10, long j3, int i10) {
        this.f5217a = i10;
        this.d = obj;
        this.f5219c = z10;
        this.f5218b = j3;
    }
}
