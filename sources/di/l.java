package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.r70;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.s90;
import org.telegram.ui.xn;
public final class l implements RequestDelegate {
    public final int f9230a = 0;
    public final long f9231b;
    public final boolean f9232c;
    public final Object d;
    public final Object f9233e;

    public l(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = tVar;
        this.f9233e = twoStepVerificationActivity;
        this.f9232c = z10;
        this.f9231b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9230a) {
            case 0:
                org.telegram.messenger.g0.g3(new m((t) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f9233e, this.f9232c, this.f9231b));
                return;
            case 1:
                r70 r70Var = (r70) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f9233e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    np.u1(r70Var.f30139a).V3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.g3(new m70(r70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.f9231b, 0));
                }
                org.telegram.messenger.g0.g3(new xn(r70Var, tL_error, this.f9232c, tL_messages_importChatInvite, 5));
                return;
            default:
                org.telegram.messenger.g0.g3(new m((s90) this.d, tLObject, this.f9231b, (String) this.f9233e, this.f9232c, tL_error));
                return;
        }
    }

    public l(r70 r70Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = r70Var;
        this.f9231b = j3;
        this.f9232c = z10;
        this.f9233e = tL_messages_importChatInvite;
    }

    public l(s90 s90Var, long j3, String str, boolean z10) {
        this.d = s90Var;
        this.f9231b = j3;
        this.f9233e = str;
        this.f9232c = z10;
    }
}
