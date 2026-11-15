package di;

import org.telegram.messenger.np;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.z60;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.q90;
import org.telegram.ui.wn;
public final class k implements RequestDelegate {
    public final int f8887a = 0;
    public final long f8888b;
    public final boolean f8889c;
    public final Object d;
    public final Object f8890e;

    public k(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = tVar;
        this.f8890e = twoStepVerificationActivity;
        this.f8889c = z10;
        this.f8888b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8887a) {
            case 0:
                org.telegram.messenger.g0.h3(new l((t) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f8890e, this.f8889c, this.f8888b));
                return;
            case 1:
                e70 e70Var = (e70) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f8890e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    np.s1(e70Var.f29679a).O3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.h3(new z60(e70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.f8888b, 0));
                }
                org.telegram.messenger.g0.h3(new wn(e70Var, tL_error, this.f8889c, tL_messages_importChatInvite, 5));
                return;
            default:
                org.telegram.messenger.g0.h3(new l((q90) this.d, tLObject, this.f8888b, (String) this.f8890e, this.f8889c, tL_error));
                return;
        }
    }

    public k(e70 e70Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = e70Var;
        this.f8888b = j3;
        this.f8889c = z10;
        this.f8890e = tL_messages_importChatInvite;
    }

    public k(q90 q90Var, long j3, String str, boolean z10) {
        this.d = q90Var;
        this.f8888b = j3;
        this.f8890e = str;
        this.f8889c = z10;
    }
}
