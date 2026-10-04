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
    public final int f5616a;
    public final long f5617b;
    public final boolean f5618c;
    public final Object d;

    public n9(Object obj, long j3, boolean z10, int i10) {
        this.f5616a = i10;
        this.d = obj;
        this.f5617b = j3;
        this.f5618c = z10;
    }

    @Override
    public final void run() {
        switch (this.f5616a) {
            case 0:
                x9 x9Var = (x9) this.d;
                ea eaVar = x9Var.W;
                boolean z10 = this.f5618c;
                long j3 = this.f5617b;
                if (z10) {
                    MessagesController.getInstance(ea.Y(eaVar)).loadChannelParticipants(Long.valueOf(j3), new o9(x9Var, j3, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(ea.b0(eaVar)).loadFullChat(j3, 0, true);
                    return;
                }
            case 1:
                fi.t0 t0Var = (fi.t0) this.d;
                t0Var.f9980i = null;
                a0.i iVar = t0Var.f9979g;
                long j10 = this.f5617b;
                iVar.l(j10);
                ArrayList arrayList = t0Var.f9981j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.f9981j.get(size)).peer) == j10) {
                            t0Var.f9981j.remove(size);
                        }
                    }
                }
                t0Var.a();
                fi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.l();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.f9977e, j10, !this.f5618c, new fi.r0(t0Var, 2));
                return;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f5618c, this.f5617b);
                return;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f5618c, this.f5617b);
                return;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f5617b, this.f5618c);
                return;
            case 5:
                yn.d0((yn) this.d, this.f5617b, this.f5618c);
                return;
            default:
                yh.p8 p8Var = (yh.p8) this.d;
                long j11 = this.f5617b;
                p8Var.F = j11;
                p8Var.E = j11;
                if (this.f5618c) {
                    ai.m1 m1Var = p8Var.G;
                    m1Var.f1327c = j11;
                    p8Var.H.set(m1Var);
                }
                p8Var.r();
                p8Var.I.a(true, true);
                yh.o8 o8Var = p8Var.f51839y;
                if (o8Var != null) {
                    o8Var.setMyPrivacy(p8Var.E);
                    return;
                }
                return;
        }
    }

    public n9(Object obj, boolean z10, long j3, int i10) {
        this.f5616a = i10;
        this.d = obj;
        this.f5618c = z10;
        this.f5617b = j3;
    }
}
