package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class qsa implements RequestDelegate {
    public final byte a;
    public final wua b;
    public final TwoStepVerificationActivity c;
    public final boolean d;

    public qsa(wua wuaVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = twoStepVerificationActivity;
        this.d = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                hl.c3(new wsa(this.b, tLObject, this.c, this.d, tL_error));
                return;
            default:
                hl.c3(new wsa(this.b, tL_error, this.c, tLObject, this.d));
                return;
        }
    }
}
