package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class pqa implements RequestDelegate {
    public final byte a;
    public final wsa b;
    public final TwoStepVerificationActivity c;
    public final boolean d;

    public pqa(wsa wsaVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = twoStepVerificationActivity;
        this.d = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                gm.c3(new sqa(this.b, tLObject, this.c, this.d, tL_error));
                return;
            default:
                gm.c3(new sqa(this.b, tL_error, this.c, tLObject, this.d));
                return;
        }
    }
}
