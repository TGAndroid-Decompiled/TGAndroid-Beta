package bi;

import di.ab;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.sa;
public final class b8 implements q10 {
    public final int f3445a;
    public final long f3446b;
    public final org.telegram.ui.ActionBar.x2 f3447c;
    public final Object d;

    public b8(sa saVar, Object obj, long j3, int i7) {
        this.f3445a = i7;
        this.f3447c = saVar;
        this.d = obj;
        this.f3446b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.f3445a) {
            case 0:
                f8 f8Var = (f8) this.f3447c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                di.f5 f5Var = (di.f5) obj;
                vf.b bVar = (vf.b) obj2;
                bVar.d();
                di.x8.x(f8Var.f30187a, f5Var.f8764a).h(f5Var.f8765b, tL_starGiftUnique, this.f3446b, null, true, new h0(f8Var, bVar, tL_starGiftUnique, 2));
                return;
            case 1:
                ab.e1((ab) this.f3447c, (l41) this.d, this.f3446b, (Boolean) obj, (String) obj2);
                return;
            default:
                p70 p70Var = (p70) this.f3447c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    mp.u1(p70Var.f30187a).V3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.g3(new k70(p70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.f3446b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.g3(new n20(p70Var, tL_error, updates, tL_messages_importChatInvite, 1));
                return;
        }
    }

    public b8(p70 p70Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f3445a = 2;
        this.f3447c = p70Var;
        this.f3446b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
