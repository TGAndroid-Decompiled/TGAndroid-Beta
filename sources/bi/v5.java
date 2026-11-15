package bi;

import di.v8;
import di.xa;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.z60;
public final class v5 implements s10 {
    public final int f3939a;
    public final long f3940b;
    public final org.telegram.ui.ActionBar.u2 f3941c;
    public final Object d;

    public v5(ja jaVar, Object obj, long j3, int i7) {
        this.f3939a = i7;
        this.f3941c = jaVar;
        this.d = obj;
        this.f3940b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        TLRPC.Updates updates;
        switch (this.f3939a) {
            case 0:
                z5 z5Var = (z5) this.f3941c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                di.c5 c5Var = (di.c5) obj;
                vf.b bVar = (vf.b) obj2;
                bVar.d();
                v8.x(z5Var.f29679a, c5Var.f8303a).h(c5Var.f8304b, tL_starGiftUnique, this.f3940b, null, true, new h0(z5Var, bVar, tL_starGiftUnique, 1));
                return;
            case 1:
                xa.d1((xa) this.f3941c, (b41) this.d, this.f3940b, (Boolean) obj, (String) obj2);
                return;
            default:
                e70 e70Var = (e70) this.f3941c;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.d;
                TLRPC.ChatInviteJoinResult chatInviteJoinResult = (TLRPC.ChatInviteJoinResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
                    np.s1(e70Var.f29679a).O3(updates2, false);
                    updates = updates2;
                } else {
                    if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                        org.telegram.messenger.g0.h3(new z60(e70Var, (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult, this.f3940b, 1));
                    }
                    updates = null;
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5(e70Var, tL_error, updates, tL_messages_importChatInvite, 27));
                return;
        }
    }

    public v5(e70 e70Var, long j3, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.f3939a = 2;
        this.f3941c = e70Var;
        this.f3940b = j3;
        this.d = tL_messages_importChatInvite;
    }
}
