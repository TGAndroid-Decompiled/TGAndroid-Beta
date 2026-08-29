package jh;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.tn;
public final class oa implements Runnable {
    public final int f12589a;
    public final boolean f12590b;
    public final long f12591c;
    public final Object d;

    public oa(Object obj, long j10, boolean z10, int i10) {
        this.f12589a = i10;
        this.d = obj;
        this.f12591c = j10;
        this.f12590b = z10;
    }

    @Override
    public final void run() {
        switch (this.f12589a) {
            case 0:
                db dbVar = (db) this.d;
                long j10 = this.f12591c;
                dbVar.B = j10;
                dbVar.A = j10;
                if (this.f12590b) {
                    lh.s0 s0Var = dbVar.C;
                    s0Var.f16196c = j10;
                    dbVar.D.set(s0Var);
                }
                dbVar.r();
                dbVar.E.a(true, true);
                cb cbVar = dbVar.f11982y;
                if (cbVar != null) {
                    cbVar.setMyPrivacy(dbVar.A);
                    return;
                }
                return;
            case 1:
                nh.y8 y8Var = (nh.y8) this.d;
                nh.e9 e9Var = y8Var.S;
                boolean z10 = this.f12590b;
                long j11 = this.f12591c;
                if (z10) {
                    MessagesController.getInstance(nh.e9.Z(e9Var)).loadChannelParticipants(Long.valueOf(j11), new nh.q8(y8Var, j11, 0), 200);
                    return;
                } else {
                    MessagesController.getInstance(nh.e9.b0(e9Var)).loadFullChat(j11, 0, true);
                    return;
                }
            case 2:
                ((MediaDataController) this.d).lambda$markFeaturedStickersByIdAsRead$67(this.f12590b, this.f12591c);
                return;
            case 3:
                ((NotificationsController) this.d).lambda$setOpenedInBubble$4(this.f12590b, this.f12591c);
                return;
            case 4:
                ((TopicsController) this.d).lambda$reloadTopics$24(this.f12591c, this.f12590b);
                return;
            case 5:
                tn.b0((tn) this.d, this.f12591c, this.f12590b);
                return;
            default:
                qh.o0 o0Var = (qh.o0) this.d;
                o0Var.f46754i = null;
                a0.h hVar = o0Var.f46753g;
                long j12 = this.f12591c;
                hVar.l(j12);
                ArrayList arrayList = o0Var.f46755j;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) o0Var.f46755j.get(size)).peer) == j12) {
                            o0Var.f46755j.remove(size);
                        }
                    }
                }
                o0Var.a();
                qh.n0 n0Var = o0Var.h;
                if (n0Var != null) {
                    n0Var.k();
                }
                MessagesController.getInstance(o0Var.d).resolveCommunityJoinPendingRequest(o0Var.f46751e, j12, !this.f12590b, new qh.l0(o0Var, 2));
                return;
        }
    }

    public oa(Object obj, boolean z10, long j10, int i10) {
        this.f12589a = i10;
        this.d = obj;
        this.f12590b = z10;
        this.f12591c = j10;
    }
}
