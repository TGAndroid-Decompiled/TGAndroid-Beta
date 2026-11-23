package bi;

import di.ab;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.sa;
public final class e8 implements r10 {
    public final int f3604a;
    public final long f3605b;
    public final org.telegram.ui.ActionBar.w2 f3606c;
    public final Object d;

    public e8(sa saVar, Object obj, long j3, int i7) {
        this.f3604a = i7;
        this.f3606c = saVar;
        this.d = obj;
        this.f3605b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.f3604a) {
            case 0:
                i8 i8Var = (i8) this.f3606c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                di.f5 f5Var = (di.f5) obj;
                vf.b bVar = (vf.b) obj2;
                bVar.d();
                di.y8.x(i8Var.f30173a, f5Var.f8791a).h(f5Var.f8792b, tL_starGiftUnique, this.f3605b, null, true, new h0(i8Var, bVar, tL_starGiftUnique, 2));
                return;
            case 1:
                ab.e1((ab) this.f3606c, (o41) this.d, this.f3605b, (Boolean) obj, (String) obj2);
                return;
            default:
                r70 r70Var = (r70) this.f3606c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    np.u1(r70Var.f30173a).V3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.g3(new m70(r70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.f3605b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.g3(new q20(r70Var, tL_error, updates, tL_messages_importChatInvite, 1));
                return;
        }
    }

    public e8(r70 r70Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f3604a = 2;
        this.f3606c = r70Var;
        this.f3605b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
