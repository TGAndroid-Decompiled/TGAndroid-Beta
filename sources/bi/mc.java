package bi;

import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.w60;
public final class mc implements v10 {
    public final int f4376a;
    public final long f4377b;
    public final org.telegram.ui.ActionBar.v2 f4378c;
    public final Object d;

    public mc(org.telegram.ui.Components.na naVar, Object obj, long j3, int i7) {
        this.f4376a = i7;
        this.f4378c = naVar;
        this.d = obj;
        this.f4377b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.f4376a) {
            case 0:
                oc.d1((oc) this.f4378c, (r31) this.d, this.f4377b, (Boolean) obj, (String) obj2);
                return;
            case 1:
                b70 b70Var = (b70) this.f4378c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    qp.s1(b70Var.f28612a).O3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new w60(b70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.f4377b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.m6(b70Var, tL_error, updates, tL_messages_importChatInvite, 24));
                return;
            default:
                zh.l3 l3Var = (zh.l3) this.f4378c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                h6 h6Var = (h6) obj;
                vf.b bVar = (vf.b) obj2;
                bVar.d();
                ea.x(l3Var.f28612a, h6Var.f3997a).h(h6Var.f3998b, tL_starGiftUnique, this.f4377b, null, true, new t0(l3Var, bVar, tL_starGiftUnique, 8));
                return;
        }
    }

    public mc(b70 b70Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f4376a = 1;
        this.f4378c = b70Var;
        this.f4377b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
