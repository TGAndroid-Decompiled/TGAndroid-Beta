package lh;

import org.telegram.messenger.Utilities;
public final class t6 implements Utilities.Callback {
    public final int f13129a = 0;
    public final t7 f13130b;
    public final boolean[] f13131c;
    public final int d;
    public final Utilities.Callback e;
    public final Utilities.Callback f13132f;

    public t6(t7 t7Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f13130b = t7Var;
        this.d = i10;
        this.e = callback;
        this.f13131c = zArr;
        this.f13132f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f13129a) {
            case 0:
                if (this.d > 0) {
                    this.f13130b.S();
                }
                Utilities.Callback callback = this.e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f13131c[0] = true;
                Utilities.Callback callback2 = this.f13132f;
                if (callback2 != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    callback2.run(str);
                    return;
                }
                return;
            default:
                this.f13131c[0] = true;
                if (this.d > 0) {
                    this.f13130b.S();
                }
                Utilities.Callback callback3 = this.e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f13132f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public t6(t7 t7Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f13130b = t7Var;
        this.f13131c = zArr;
        this.d = i10;
        this.e = callback;
        this.f13132f = callback2;
    }
}
