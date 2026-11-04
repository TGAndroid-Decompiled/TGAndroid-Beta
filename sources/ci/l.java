package ci;

import org.telegram.messenger.hp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.m90;
import org.telegram.ui.rn;
public final class l implements RequestDelegate {
    public final int f5423a = 0;
    public final long f5424b;
    public final boolean f5425c;
    public final Object d;
    public final Object f5426e;

    public l(v vVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, long j10) {
        this.d = vVar;
        this.f5426e = twoStepVerificationActivity;
        this.f5425c = z10;
        this.f5424b = j10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5423a) {
            case 0:
                org.telegram.messenger.g0.h3(new n((v) this.d, tL_error, tLObject, (TwoStepVerificationActivity) this.f5426e, this.f5425c, this.f5424b));
                return;
            case 1:
                x60 x60Var = (x60) this.d;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.f5426e;
                if (tLObject instanceof TLRPC.TL_chatInviteJoinResultOk) {
                    hp.s1(x60Var.f28583a).O3(((TLRPC.TL_chatInviteJoinResultOk) tLObject).updates, false);
                } else if (tLObject instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                    org.telegram.messenger.g0.h3(new r60(x60Var, (TLRPC.TL_chatInviteJoinResultWebView) tLObject, this.f5424b, 0));
                }
                org.telegram.messenger.g0.h3(new rn(x60Var, tL_error, this.f5425c, tL_messages_importChatInvite, 5));
                return;
            default:
                org.telegram.messenger.g0.h3(new n((m90) this.d, tLObject, this.f5424b, (String) this.f5426e, this.f5425c, tL_error));
                return;
        }
    }

    public l(x60 x60Var, long j10, boolean z10, TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite) {
        this.d = x60Var;
        this.f5424b = j10;
        this.f5425c = z10;
        this.f5426e = tL_messages_importChatInvite;
    }

    public l(m90 m90Var, long j10, String str, boolean z10) {
        this.d = m90Var;
        this.f5424b = j10;
        this.f5426e = str;
        this.f5425c = z10;
    }
}
