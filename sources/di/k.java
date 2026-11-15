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
    public final int f8888a = 0;
    public final long f8889b;
    public final boolean f8890c;
    public final Object d;
    public final Object f8891e;

    public k(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j3) {
        this.d = tVar;
        this.f8891e = twoStepVerificationActivity;
        this.f8890c = z10;
        this.f8889b = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8888a) {
            case 0:
                org.telegram.messenger.g0.h3(new l((t) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f8891e, this.f8890c, this.f8889b));
                return;
            case 1:
                e70 e70Var = (e70) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f8891e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    np.s1(e70Var.f29679a).O3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.h3(new z60(e70Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.f8889b, 0));
                }
                org.telegram.messenger.g0.h3(new wn(e70Var, tL_error, this.f8890c, tL_messages_importChatInvite, 5));
                return;
            default:
                org.telegram.messenger.g0.h3(new l((q90) this.d, tLObject, this.f8889b, (String) this.f8891e, this.f8890c, tL_error));
                return;
        }
    }

    public k(e70 e70Var, long j3, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = e70Var;
        this.f8889b = j3;
        this.f8890c = z10;
        this.f8891e = tL_messages_importChatInvite;
    }

    public k(q90 q90Var, long j3, String str, boolean z10) {
        this.d = q90Var;
        this.f8889b = j3;
        this.f8891e = str;
        this.f8890c = z10;
    }
}
