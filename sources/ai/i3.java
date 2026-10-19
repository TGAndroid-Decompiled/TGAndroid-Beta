package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i3 implements Runnable {
    public final int f1469a = 1;
    public final k7 f1470b;
    public final TLObject f1471c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f1472f;
    public final long h;
    public final Object f1473n;

    public i3(k7 k7Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f1470b = k7Var;
        this.f1471c = tLObject;
        this.d = j10;
        this.e = j11;
        this.f1473n = callback;
        this.f1472f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f1469a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f1472f;
                k7.m1(this.f1470b, (org.telegram.ui.ActionBar.b2) this.f1473n, this.f1471c, this.d, this.e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f1472f;
                long j11 = this.h;
                k7.A0(this.f1470b, this.f1471c, this.d, this.e, (Utilities.Callback) this.f1473n, tL_error2, j11);
                return;
        }
    }

    public i3(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f1470b = k7Var;
        this.f1473n = b2Var;
        this.f1471c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f1472f = tL_error;
    }
}
