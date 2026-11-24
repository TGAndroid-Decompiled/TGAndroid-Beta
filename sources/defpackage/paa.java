package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class paa extends wk3 {
    public final qaa n;

    public paa(qaa qaaVar, Context context, int i, wjb wjbVar) {
        super(i, wjbVar, context, true, true);
        this.n = qaaVar;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        TLRPC.Chat chat;
        boolean z;
        String str;
        ee5 ee5Var = (ee5) s49Var.a;
        taa taaVar = this.n.L;
        TLRPC.User user = null;
        if (taaVar.c2 || taaVar.d2) {
            int i2 = bkb.dh;
            int i3 = bkb.Vg;
            zkb.X(ee5Var.b, i2, null);
            ee5Var.I = i3;
            ee5Var.w.b(bkb.A5, i3, bkb.B5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) hq6.d0(taaVar.a).j1.get(i);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j = peer.user_id;
        if (j != 0) {
            user = na7.q1(taaVar.a).V1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j2 = peer.channel_id;
            if (j2 != 0) {
                j = -j2;
                chat = na7.q1(taaVar.a).K0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j3 = peer.chat_id;
                if (j3 != 0) {
                    j = -j3;
                    chat = na7.q1(taaVar.a).K0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j = 0;
                }
            }
        }
        boolean z2 = false;
        if (j == ee5Var.getDialogId()) {
            z = true;
        } else {
            z = false;
        }
        ee5Var.setTag(Long.valueOf(j));
        if (user != null) {
            str = l7c.k(user, true);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        ee5Var.a(j, true, str);
        if (taaVar.P1.h(j) >= 0) {
            z2 = true;
        }
        if (ee5Var.x) {
            ee5Var.w.a(z2, z);
        }
    }
}
