package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class g3 implements RequestDelegate {

    public final int f9299a;

    public final i5 f9300b;

    public g3(i5 i5Var, int i10) {
        this.f9299a = i10;
        this.f9300b = i5Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f9299a) {
            case 0:
                final int i10 = 0;
                final i5 i5Var = this.f9300b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                i5.a0(i5Var, tLObject, tL_error);
                                break;
                            default:
                                i5.y0(i5Var, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final i5 i5Var2 = this.f9300b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                i5.a0(i5Var2, tLObject, tL_error);
                                break;
                            default:
                                i5.y0(i5Var2, tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
