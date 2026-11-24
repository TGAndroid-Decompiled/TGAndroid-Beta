package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public class hm3 extends q59 {
    public final Context c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final ylb h;

    public hm3(int i, ylb ylbVar, Context context, boolean z, boolean z2) {
        this.e = z;
        this.c = context;
        this.d = i;
        this.f = z2;
        this.h = ylbVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override
    public final int b() {
        return hs6.d0(this.d).j1.size();
    }

    @Override
    public void t(u69 u69Var, int i) {
        TLRPC.Chat chat;
        String str;
        cg5 cg5Var = (cg5) u69Var.a;
        int i2 = this.d;
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) hs6.d0(i2).j1.get(i);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j = peer.user_id;
        TLRPC.User user = null;
        if (j != 0) {
            user = oc7.r1(i2).W1(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j2 = peer.channel_id;
            if (j2 != 0) {
                j = -j2;
                chat = oc7.r1(i2).L0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j3 = peer.chat_id;
                if (j3 != 0) {
                    j = -j3;
                    chat = oc7.r1(i2).L0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    j = 0;
                    chat = null;
                }
            }
        }
        cg5Var.setTag(Long.valueOf(j));
        if (user != null) {
            str = m9c.k(user, true);
        } else if (chat != null) {
            if (chat.monoforum) {
                str = no4.j(i2, chat, false);
            } else {
                str = chat.title;
            }
        } else {
            str = "";
        }
        cg5Var.a(j, true, str);
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        cg5 cg5Var = new cg5(this.h, this.c, this.e);
        if (this.f && !cg5Var.y) {
            cg5Var.y = true;
            nm7.f(cg5Var.h).h(cg5Var, nm7.k3, new sk3(cg5Var, (byte) 17));
        }
        cg5Var.setLayoutParams(new g69(gm.L(80.0f), gm.L(86.0f)));
        return new u69(cg5Var);
    }
}
