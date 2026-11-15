package jg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.tj0;
public class c0 extends tj0 {
    public final Context f17028c;
    public final int d;
    public final boolean f17029e;
    public final boolean f17030f;
    public final e6 h;

    public c0(int i7, Context context, e6 e6Var, boolean z10, boolean z11) {
        this.f17029e = z10;
        this.f17028c = context;
        this.d = i7;
        this.f17030f = z11;
        this.h = e6Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        return si.b0(this.d).f26492j1.size();
    }

    @Override
    public void t(v4.e1 e1Var, int i7) {
        TLRPC.Chat chat;
        String str;
        o4 o4Var = (o4) e1Var.f58535a;
        int i10 = this.d;
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) si.b0(i10).f26492j1.get(i7);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j3 = peer.user_id;
        TLRPC.User user = null;
        if (j3 != 0) {
            user = np.s1(i10).a2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j10 = peer.channel_id;
            if (j10 != 0) {
                j3 = -j10;
                chat = np.s1(i10).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j11 = peer.chat_id;
                if (j11 != 0) {
                    j3 = -j11;
                    chat = np.s1(i10).M0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    j3 = 0;
                    chat = null;
                }
            }
        }
        o4Var.setTag(Long.valueOf(j3));
        if (user != null) {
            str = q10.j(user, true);
        } else if (chat != null) {
            if (chat.monoforum) {
                str = qg.c.i(i10, chat, false);
            } else {
                str = chat.title;
            }
        } else {
            str = "";
        }
        o4Var.a(j3, true, str);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        boolean z10 = this.f17029e;
        o4 o4Var = new o4(this.f17028c, this.h, z10);
        if (this.f17030f && !o4Var.f30808y) {
            o4Var.f30808y = true;
            ns.f(o4Var.h).h(o4Var, ns.f25514i3, new l2(o4Var, 1));
        }
        o4Var.setLayoutParams(new v4.p0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(86.0f)));
        return new v4.e1(o4Var);
    }
}
