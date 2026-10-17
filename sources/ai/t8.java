package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t8 implements RequestDelegate {
    public final int f2218a;
    public final fa f2219b;

    public t8(fa faVar, int i10) {
        this.f2218a = i10;
        this.f2219b = faVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2218a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b9(this.f2219b, tLObject, 0));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new b9(this.f2219b, tLObject, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new b9(this.f2219b, tLObject, 2));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new b9(this.f2219b, tLObject, 3));
                return;
            default:
                AndroidUtilities.runOnUIThread(new b9(this.f2219b, tLObject, 4));
                return;
        }
    }
}
