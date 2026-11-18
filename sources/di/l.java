package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.p70;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.s90;
import org.telegram.ui.yn;
public final class l implements RequestDelegate {
    public final int f9231a = 0;
    public final long f9232b;
    public final boolean f9233c;
    public final Object d;
    public final Object f9234e;

    public l(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = tVar;
        this.f9234e = twoStepVerificationActivity;
        this.f9233c = z10;
        this.f9232b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9231a) {
            case 0:
                org.telegram.messenger.g0.g3(new m((t) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f9234e, this.f9233c, this.f9232b));
                return;
            case 1:
                p70 p70Var = (p70) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f9234e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    mp.u1(p70Var.f30187a).V3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.g3(new k70(p70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.f9232b, 0));
                }
                org.telegram.messenger.g0.g3(new yn(p70Var, tL_error, this.f9233c, tL_messages_importChatInvite, 5));
                return;
            default:
                org.telegram.messenger.g0.g3(new m((s90) this.d, tLObject, this.f9232b, (String) this.f9234e, this.f9233c, tL_error));
                return;
        }
    }

    public l(p70 p70Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = p70Var;
        this.f9232b = j3;
        this.f9233c = z10;
        this.f9234e = tL_messages_importChatInvite;
    }

    public l(s90 s90Var, long j3, String str, boolean z10) {
        this.d = s90Var;
        this.f9232b = j3;
        this.f9234e = str;
        this.f9233c = z10;
    }
}
