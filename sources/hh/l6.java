package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class l6 implements RequestDelegate {

    public final int f9672a;

    public final u7 f9673b;

    public l6(u7 u7Var, int i10) {
        this.f9672a = i10;
        this.f9673b = u7Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9672a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s6(this.f9673b, tLObject, 0));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new s6(this.f9673b, tLObject, 1));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new s6(this.f9673b, tLObject, 2));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new s6(this.f9673b, tLObject, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new s6(this.f9673b, tLObject, 4));
                break;
        }
    }
}
