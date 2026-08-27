package hh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class n2 implements Runnable {

    public final int f9773a = 1;

    public final i5 f9774b;

    public final TLObject f9775c;
    public final long d;

    public final long f9776e;

    public final TLRPC.TL_error f9777f;
    public final long h;

    public final Object f9778n;

    public n2(i5 i5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f9774b = i5Var;
        this.f9775c = tLObject;
        this.d = j10;
        this.f9776e = j11;
        this.f9778n = callback;
        this.f9777f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f9773a) {
            case 0:
                i5.H0(this.f9774b, (org.telegram.ui.ActionBar.b2) this.f9778n, this.f9775c, this.d, this.f9776e, this.h, this.f9777f);
                break;
            default:
                i5.f0(this.f9774b, this.f9775c, this.d, this.f9776e, (Utilities.Callback) this.f9778n, this.f9777f, this.h);
                break;
        }
    }

    public n2(i5 i5Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f9774b = i5Var;
        this.f9778n = b2Var;
        this.f9775c = tLObject;
        this.d = j10;
        this.f9776e = j11;
        this.h = j12;
        this.f9777f = tL_error;
    }
}
