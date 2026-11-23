package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.r70;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.s90;
import org.telegram.ui.yn;
public final class l implements RequestDelegate {
    public final int f9265a = 0;
    public final long f9266b;
    public final boolean f9267c;
    public final Object d;
    public final Object f9268e;

    public l(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = tVar;
        this.f9268e = twoStepVerificationActivity;
        this.f9267c = z10;
        this.f9266b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9265a) {
            case 0:
                org.telegram.messenger.g0.g3(new m((t) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f9268e, this.f9267c, this.f9266b));
                return;
            case 1:
                r70 r70Var = (r70) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f9268e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    np.u1(r70Var.f30173a).V3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.g3(new m70(r70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.f9266b, 0));
                }
                org.telegram.messenger.g0.g3(new yn(r70Var, tL_error, this.f9267c, tL_messages_importChatInvite, 5));
                return;
            default:
                org.telegram.messenger.g0.g3(new m((s90) this.d, tLObject, this.f9266b, (String) this.f9268e, this.f9267c, tL_error));
                return;
        }
    }

    public l(r70 r70Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = r70Var;
        this.f9266b = j3;
        this.f9267c = z10;
        this.f9268e = tL_messages_importChatInvite;
    }

    public l(s90 s90Var, long j3, String str, boolean z10) {
        this.d = s90Var;
        this.f9266b = j3;
        this.f9268e = str;
        this.f9267c = z10;
    }
}
