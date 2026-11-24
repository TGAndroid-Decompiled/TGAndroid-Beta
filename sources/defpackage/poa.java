package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.TwoStepVerificationActivity;
public final class poa implements RequestDelegate {
    public final byte a;
    public final vqa b;
    public final TwoStepVerificationActivity c;
    public final boolean d;

    public poa(vqa vqaVar, TwoStepVerificationActivity twoStepVerificationActivity, boolean z, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = twoStepVerificationActivity;
        this.d = z;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                gl.c3(new soa(this.b, tLObject, this.c, this.d, tL_error));
                return;
            default:
                gl.c3(new soa(this.b, tL_error, this.c, tLObject, this.d));
                return;
        }
    }
}
