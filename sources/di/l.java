package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.o70;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.r90;
import org.telegram.ui.xn;
public final class l implements RequestDelegate {
    public final int f9226a = 0;
    public final long f9227b;
    public final boolean f9228c;
    public final Object d;
    public final Object f9229e;

    public l(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = tVar;
        this.f9229e = twoStepVerificationActivity;
        this.f9228c = z10;
        this.f9227b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9226a) {
            case 0:
                org.telegram.messenger.g0.g3(new m((t) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f9229e, this.f9228c, this.f9227b));
                return;
            case 1:
                o70 o70Var = (o70) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f9229e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    mp.u1(o70Var.f30223a).V3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.g3(new j70(o70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.f9227b, 0));
                }
                org.telegram.messenger.g0.g3(new xn(o70Var, tL_error, this.f9228c, tL_messages_importChatInvite, 5));
                return;
            default:
                org.telegram.messenger.g0.g3(new m((r90) this.d, tLObject, this.f9227b, (String) this.f9229e, this.f9228c, tL_error));
                return;
        }
    }

    public l(o70 o70Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = o70Var;
        this.f9227b = j3;
        this.f9228c = z10;
        this.f9229e = tL_messages_importChatInvite;
    }

    public l(r90 r90Var, long j3, String str, boolean z10) {
        this.d = r90Var;
        this.f9227b = j3;
        this.f9229e = str;
        this.f9228c = z10;
    }
}
