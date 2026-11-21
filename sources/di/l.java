package di;

import org.telegram.messenger.mp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.r70;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.s90;
import org.telegram.ui.yn;
public final class l implements RequestDelegate {
    public final int f9262a = 0;
    public final long f9263b;
    public final boolean f9264c;
    public final Object d;
    public final Object f9265e;

    public l(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = tVar;
        this.f9265e = twoStepVerificationActivity;
        this.f9264c = z10;
        this.f9263b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9262a) {
            case 0:
                org.telegram.messenger.g0.g3(new m((t) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f9265e, this.f9264c, this.f9263b));
                return;
            case 1:
                r70 r70Var = (r70) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f9265e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    mp.u1(r70Var.f30170a).V3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.g3(new m70(r70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.f9263b, 0));
                }
                org.telegram.messenger.g0.g3(new yn(r70Var, tL_error, this.f9264c, tL_messages_importChatInvite, 5));
                return;
            default:
                org.telegram.messenger.g0.g3(new m((s90) this.d, tLObject, this.f9263b, (String) this.f9265e, this.f9264c, tL_error));
                return;
        }
    }

    public l(r70 r70Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = r70Var;
        this.f9263b = j3;
        this.f9264c = z10;
        this.f9265e = tL_messages_importChatInvite;
    }

    public l(s90 s90Var, long j3, String str, boolean z10) {
        this.d = s90Var;
        this.f9263b = j3;
        this.f9265e = str;
        this.f9264c = z10;
    }
}
