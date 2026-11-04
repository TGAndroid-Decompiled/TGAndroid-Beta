package ai;

import ci.e9;
import ci.hb;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.x60;
public final class d6 implements n10 {
    public final int f574a;
    public final long f575b;
    public final org.telegram.ui.ActionBar.t2 f576c;
    public final Object d;

    public d6(ma maVar, Object obj, long j10, int i3) {
        this.f574a = i3;
        this.f576c = maVar;
        this.d = obj;
        this.f575b = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.f574a) {
            case 0:
                h6 h6Var = (h6) this.f576c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                ci.l5 l5Var = (ci.l5) obj;
                sf.b bVar = (sf.b) obj2;
                bVar.d();
                e9.x(h6Var.f28583a, l5Var.f5442a).h(l5Var.f5443b, tL_starGiftUnique, this.f575b, null, true, new n0(h6Var, bVar, tL_starGiftUnique, 1));
                return;
            case 1:
                hb.d1((hb) this.f576c, (r31) this.d, this.f575b, (Boolean) obj, (String) obj2);
                return;
            default:
                x60 x60Var = (x60) this.f576c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    hp.s1(x60Var.f28583a).O3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new r60(x60Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.f575b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.h3(new v60(x60Var, tL_error, updates, tL_messages_importChatInvite, 0));
                return;
        }
    }

    public d6(x60 x60Var, long j10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f574a = 2;
        this.f576c = x60Var;
        this.f575b = j10;
        this.d = tL_messages_importChatInvite;
    }
}
