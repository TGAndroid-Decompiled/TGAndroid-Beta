package hh;

import org.telegram.messenger.Utilities;

public final class u6 implements Utilities.Callback {

    public final int f10146a = 0;

    public final u7 f10147b;

    public final boolean[] f10148c;
    public final int d;

    public final Utilities.Callback f10149e;

    public final Utilities.Callback f10150f;

    public u6(u7 u7Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f10147b = u7Var;
        this.d = i10;
        this.f10149e = callback;
        this.f10148c = zArr;
        this.f10150f = callback2;
    }

    @Override
    public final void run(Object obj) {
        Boolean bool = (Boolean) obj;
        switch (this.f10146a) {
            case 0:
                if (this.d > 0) {
                    this.f10147b.S();
                }
                Utilities.Callback callback = this.f10149e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f10148c[0] = true;
                Utilities.Callback callback2 = this.f10150f;
                if (callback2 != null) {
                    callback2.run(bool.booleanValue() ? "paid" : "failed");
                }
                break;
            default:
                this.f10148c[0] = true;
                if (this.d > 0) {
                    this.f10147b.S();
                }
                Utilities.Callback callback3 = this.f10149e;
                if (callback3 != null) {
                    callback3.run(bool.booleanValue() ? "paid" : "failed");
                }
                Utilities.Callback callback4 = this.f10150f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                }
                break;
        }
    }

    public u6(u7 u7Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f10147b = u7Var;
        this.f10148c = zArr;
        this.d = i10;
        this.f10149e = callback;
        this.f10150f = callback2;
    }
}
