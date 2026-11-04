package kg;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Components.sj0;
public class z extends sj0 {
    public final Context f17243c;
    public final int d;
    public final boolean f17244e;
    public final boolean f17245f;
    public final e6 h;

    public z(int i3, Context context, e6 e6Var, boolean z10, boolean z11) {
        this.f17244e = z10;
        this.f17243c = context;
        this.d = i3;
        this.f17245f = z11;
        this.h = e6Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return li.b0(this.d).f24032j1.size();
    }

    @Override
    public void t(u4.d1 d1Var, int i3) {
        TLRPC.Chat chat;
        String str;
        o4 o4Var = (o4) d1Var.f55540a;
        int i10 = this.d;
        TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) li.b0(i10).f24032j1.get(i3);
        new TLRPC.TL_dialog();
        TLRPC.Peer peer = tL_topPeer.peer;
        long j10 = peer.user_id;
        TLRPC.User user = null;
        if (j10 != 0) {
            user = hp.s1(i10).a2(Long.valueOf(tL_topPeer.peer.user_id));
            chat = null;
        } else {
            long j11 = peer.channel_id;
            if (j11 != 0) {
                j10 = -j11;
                chat = hp.s1(i10).M0(Long.valueOf(tL_topPeer.peer.channel_id));
            } else {
                long j12 = peer.chat_id;
                if (j12 != 0) {
                    j10 = -j12;
                    chat = hp.s1(i10).M0(Long.valueOf(tL_topPeer.peer.chat_id));
                } else {
                    j10 = 0;
                    chat = null;
                }
            }
        }
        o4Var.setTag(Long.valueOf(j10));
        if (user != null) {
            str = l10.j(user, true);
        } else if (chat != null) {
            if (chat.monoforum) {
                str = rg.c.i(i10, chat, false);
            } else {
                str = chat.title;
            }
        } else {
            str = "";
        }
        o4Var.a(j10, true, str);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        boolean z10 = this.f17244e;
        o4 o4Var = new o4(this.f17243c, this.h, z10);
        if (this.f17245f && !o4Var.f29747y) {
            o4Var.f29747y = true;
            hs.f(o4Var.h).h(o4Var, hs.i3, new l2(o4Var, 1));
        }
        o4Var.setLayoutParams(new u4.p0(org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(86.0f)));
        return new u4.d1(o4Var);
    }
}
