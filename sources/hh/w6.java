package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class w6 implements RequestDelegate {

    public final int f10291a;

    public final Utilities.Callback f10292b;

    public w6(int i10, Utilities.Callback callback) {
        this.f10291a = i10;
        this.f10292b = callback;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10291a) {
            case 0:
                AndroidUtilities.runOnUIThread(new d7(tLObject, this.f10292b, 0));
                break;
            default:
                AndroidUtilities.runOnUIThread(new m5(25, this.f10292b, tL_error));
                break;
        }
    }
}
