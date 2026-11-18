package jg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.bk0;
public class c0 extends bk0 {
    public final Context f17414c;
    public final int d;
    public final boolean f17415e;
    public final boolean f17416f;
    public final i6 h;

    public c0(int i7, Context context, i6 i6Var, boolean z10, boolean z11) {
        this.f17415e = z10;
        this.f17414c = context;
        this.d = i7;
        this.f17416f = z11;
        this.h = i6Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return ri.d0(this.d).f26622j1.size();
    }

    @Override
    public void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat;
        String str;
        o4 o4Var = (o4) f1Var.f59122a;
        int i10 = this.d;
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) ri.d0(i10).f26622j1.get(i7);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        TLRPC.User user = null;
        if (j3 != 0) {
            user = mp.u1(i10).c2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = mp.u1(i10).O0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = mp.u1(i10).O0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    j3 = 0;
                    chat = null;
                }
            }
        }
        o4Var.setTag(Long.valueOf(j3));
        if (user != null) {
            str = o10.k(user, true);
        } else if (chat != null) {
            if (chat.monoforum) {
                str = qg.c.j(i10, chat, false);
            } else {
                str = chat.title;
            }
        } else {
            str = "";
        }
        o4Var.a(j3, true, str);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10 = this.f17415e;
        o4 o4Var = new o4(this.f17414c, this.h, z10);
        if (this.f17416f && !o4Var.f31169y) {
            o4Var.f31169y = true;
            ks.f(o4Var.h).h(o4Var, ks.f25144k3, new l2(o4Var, 1));
        }
        o4Var.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(86.0f)));
        return new v4.f1(o4Var);
    }
}
