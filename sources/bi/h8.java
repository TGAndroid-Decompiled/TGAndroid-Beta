package bi;

import di.ab;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.xz;
public final class h8 implements p10 {
    public final int f3649a;
    public final long f3650b;
    public final org.telegram.ui.ActionBar.w2 f3651c;
    public final Object d;

    public h8(ra raVar, Object obj, long j3, int i7) {
        this.f3649a = i7;
        this.f3651c = raVar;
        this.d = obj;
        this.f3650b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.f3649a) {
            case 0:
                l8 l8Var = (l8) this.f3651c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                di.f5 f5Var = (di.f5) obj;
                vf.b bVar = (vf.b) obj2;
                bVar.d();
                di.y8.x(l8Var.f30223a, f5Var.f8752a).h(f5Var.f8753b, tL_starGiftUnique, this.f3650b, null, true, new h0(l8Var, bVar, tL_starGiftUnique, 2));
                return;
            case 1:
                ab.e1((ab) this.f3651c, (n41) this.d, this.f3650b, (Boolean) obj, (String) obj2);
                return;
            default:
                o70 o70Var = (o70) this.f3651c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    mp.u1(o70Var.f30223a).V3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.g3(new j70(o70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.f3650b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.g3(new xz(o70Var, tL_error, updates, tL_messages_importChatInvite, 2));
                return;
        }
    }

    public h8(o70 o70Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f3649a = 2;
        this.f3651c = o70Var;
        this.f3650b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
