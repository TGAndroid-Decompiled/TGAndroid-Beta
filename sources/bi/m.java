package bi;

import org.telegram.messenger.qp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.x60;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.r90;
import org.telegram.ui.xn;
public final class m implements RequestDelegate {
    public final int f4297a = 0;
    public final long f4298b;
    public final boolean f4299c;
    public final Object d;
    public final Object f4300e;

    public m(z zVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z9, long j3) {
        this.d = zVar;
        this.f4300e = twoStepVerificationActivity;
        this.f4299c = z9;
        this.f4298b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4297a) {
            case 0:
                org.telegram.messenger.g0.h3(new o((z) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f4300e, this.f4299c, this.f4298b));
                return;
            case 1:
                c70 c70Var = (c70) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f4300e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    qp.s1(c70Var.f28621a).O3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.h3(new x60(c70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.f4298b, 0));
                }
                org.telegram.messenger.g0.h3(new xn(c70Var, tL_error, this.f4299c, tL_messages_importChatInvite, 5));
                return;
            default:
                org.telegram.messenger.g0.h3(new o((r90) this.d, tLObject, this.f4298b, (String) this.f4300e, this.f4299c, tL_error));
                return;
        }
    }

    public m(c70 c70Var, long j3, boolean z9, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = c70Var;
        this.f4298b = j3;
        this.f4299c = z9;
        this.f4300e = tL_messages_importChatInvite;
    }

    public m(r90 r90Var, long j3, String str, boolean z9) {
        this.d = r90Var;
        this.f4298b = j3;
        this.f4300e = str;
        this.f4299c = z9;
    }
}
