package cg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class f0 implements RequestDelegate {

    public final int f2677a;

    public final Utilities.Callback f2678b;

    public final Utilities.Callback f2679c;

    public f0(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f2677a = i10;
        this.f2678b = callback;
        this.f2679c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2677a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a(tL_error, this.f2678b, this.f2679c, 6));
                break;
            default:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tL_error, this.f2678b, tLObject, this.f2679c, 2));
                break;
        }
    }
}
