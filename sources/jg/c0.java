package jg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.m2;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.dk0;
public class c0 extends dk0 {
    public final Context f17507c;
    public final int d;
    public final boolean f17508e;
    public final boolean f17509f;
    public final i6 h;

    public c0(int i7, Context context, i6 i6Var, boolean z10, boolean z11) {
        this.f17508e = z10;
        this.f17507c = context;
        this.d = i7;
        this.f17509f = z11;
        this.h = i6Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return ri.d0(this.d).f26721j1.size();
    }

    @Override
    public void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat;
        String str;
        p4 p4Var = (p4) f1Var.f59245a;
        int i10 = this.d;
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) ri.d0(i10).f26721j1.get(i7);
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
        p4Var.setTag(Long.valueOf(j3));
        if (user != null) {
            str = n10.k(user, true);
        } else if (chat != null) {
            if (chat.monoforum) {
                str = qg.c.j(i10, chat, false);
            } else {
                str = chat.title;
            }
        } else {
            str = "";
        }
        p4Var.a(j3, true, str);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        boolean z10 = this.f17508e;
        p4 p4Var = new p4(this.f17507c, this.h, z10);
        if (this.f17509f && !p4Var.f31324y) {
            p4Var.f31324y = true;
            ks.f(p4Var.h).h(p4Var, ks.f25241k3, new m2(p4Var, 1));
        }
        p4Var.setLayoutParams(new v4.q0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(86.0f)));
        return new v4.f1(p4Var);
    }
}
