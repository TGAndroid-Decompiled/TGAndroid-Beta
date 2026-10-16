package di;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.fo;
public final class n9 implements Runnable {
    public final int f7474a;
    public final long f7475b;
    public final boolean f7476c;
    public final Object d;

    public n9(Object obj, long j10, boolean z10, int i10) {
        this.f7474a = i10;
        this.d = obj;
        this.f7475b = j10;
        this.f7476c = z10;
    }

    @Override
    public final void run() {
        switch (this.f7474a) {
            case 0:
                x9 x9Var = (x9) this.d;
                ea eaVar = x9Var.W;
                boolean z10 = this.f7476c;
                long j10 = this.f7475b;
                if (z10) {
                    MessagesController.getInstance(ea.a0(eaVar)).loadChannelParticipants(Long.valueOf(j10), new o9(x9Var, j10, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(ea.c0(eaVar)).loadFullChat(j10, 0, true);
                    return;
                }
            case 1:
                gi.t0 t0Var = (gi.t0) this.d;
                t0Var.f10263i = null;
                a0.h hVar = t0Var.f10262g;
                long j11 = this.f7475b;
                hVar.l(j11);
                ArrayList arrayList = t0Var.f10264j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) t0Var.f10264j.get(size)).peer) == j11) {
                            t0Var.f10264j.remove(size);
                        }
                    }
                }
                t0Var.a();
                gi.s0 s0Var = t0Var.h;
                if (s0Var != null) {
                    s0Var.p();
                }
                MessagesController.getInstance(t0Var.d).resolveCommunityJoinPendingRequest(t0Var.e, j11, !this.f7476c, new gi.r0(t0Var, 2));
                return;
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f7476c, this.f7475b);
                return;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$5(this.f7476c, this.f7475b);
                return;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f7475b, this.f7476c);
                return;
            case 5:
                fo.z0((fo) this.d, this.f7475b, this.f7476c);
                return;
            default:
                zh.h8 h8Var = (zh.h8) this.d;
                long j12 = this.f7475b;
                h8Var.F = j12;
                h8Var.E = j12;
                if (this.f7476c) {
                    bi.e1 e1Var = h8Var.G;
                    e1Var.f2976c = j12;
                    h8Var.H.set(e1Var);
                }
                h8Var.t();
                h8Var.J.a(true, true);
                zh.g8 g8Var = h8Var.f50649y;
                if (g8Var != null) {
                    g8Var.setMyPrivacy(h8Var.E);
                    return;
                }
                return;
        }
    }

    public n9(Object obj, boolean z10, long j10, int i10) {
        this.f7474a = i10;
        this.d = obj;
        this.f7476c = z10;
        this.f7475b = j10;
    }
}
