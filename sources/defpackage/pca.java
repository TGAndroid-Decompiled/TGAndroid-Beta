package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class pca extends hm3 {
    public final qca n;

    public pca(qca qcaVar, Context context, int i, ylb ylbVar) {
        super(i, ylbVar, context, true, true);
        this.n = qcaVar;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        TLRPC.Chat chat;
        boolean z;
        String str;
        cg5 cg5Var = (cg5) u69Var.a;
        tca tcaVar = this.n.L;
        TLRPC.User user = null;
        if (tcaVar.c2 || tcaVar.d2) {
            int i2 = cmb.dh;
            int i3 = cmb.Vg;
            anb.X(cg5Var.b, i2, null);
            cg5Var.I = i3;
            cg5Var.w.b(cmb.A5, i3, cmb.B5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) hs6.d0(tcaVar.a).j1.get(i);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j = peer.user_id;
        if (j != 0) {
            user = oc7.r1(tcaVar.a).W1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j2 = peer.channel_id;
            if (j2 != 0) {
                j = -j2;
                chat = oc7.r1(tcaVar.a).L0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j3 = peer.chat_id;
                if (j3 != 0) {
                    j = -j3;
                    chat = oc7.r1(tcaVar.a).L0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j = 0;
                }
            }
        }
        boolean z2 = false;
        if (j == cg5Var.getDialogId()) {
            z = true;
        } else {
            z = false;
        }
        cg5Var.setTag(Long.valueOf(j));
        if (user != null) {
            str = m9c.k(user, true);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        cg5Var.a(j, true, str);
        if (tcaVar.P1.h(j) >= 0) {
            z2 = true;
        }
        if (cg5Var.x) {
            cg5Var.w.a(z2, z);
        }
    }
}
