package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class gea extends ol3 {
    public final hea n;

    public gea(hea heaVar, Context context, int i, vnb vnbVar) {
        super(i, vnbVar, context, true, true);
        this.n = heaVar;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        TLRPC.Chat chat;
        boolean z;
        String str;
        fg5 fg5Var = (fg5) f89Var.a;
        kea keaVar = this.n.L;
        TLRPC.User user = null;
        if (keaVar.c2 || keaVar.d2) {
            int i2 = aob.eh;
            int i3 = aob.Wg;
            yob.X(fg5Var.b, i2, null);
            fg5Var.I = i3;
            fg5Var.w.b(aob.B5, i3, aob.C5);
        }
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) ls6.d0(keaVar.a).j1.get(i);
        TLRPC.Peer peer = tL_topPeer.peer;
        long j = peer.user_id;
        if (j != 0) {
            user = uc7.s1(keaVar.a).X1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j2 = peer.channel_id;
            if (j2 != 0) {
                j = -j2;
                chat = uc7.s1(keaVar.a).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j3 = peer.chat_id;
                if (j3 != 0) {
                    j = -j3;
                    chat = uc7.s1(keaVar.a).M0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    chat = null;
                    j = 0;
                }
            }
        }
        boolean z2 = false;
        if (j == fg5Var.getDialogId()) {
            z = true;
        } else {
            z = false;
        }
        fg5Var.setTag(Long.valueOf(j));
        if (user != null) {
            str = lbc.k(user, true);
        } else if (chat != null) {
            str = chat.title;
        } else {
            str = "";
        }
        fg5Var.a(j, true, str);
        if (keaVar.P1.h(j) >= 0) {
            z2 = true;
        }
        if (fg5Var.x) {
            fg5Var.w.a(z2, z);
        }
    }
}
