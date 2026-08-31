package mh;

import org.telegram.messenger.Utilities;
public final class t6 implements Utilities.Callback {
    public final int f14823a = 0;
    public final t7 f14824b;
    public final boolean[] f14825c;
    public final int d;
    public final Utilities.Callback f14826e;
    public final Utilities.Callback f14827f;

    public t6(t7 t7Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f14824b = t7Var;
        this.d = i10;
        this.f14826e = callback;
        this.f14825c = zArr;
        this.f14827f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f14823a) {
            case 0:
                if (this.d > 0) {
                    this.f14824b.S();
                }
                Utilities.Callback callback = this.f14826e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f14825c[0] = true;
                Utilities.Callback callback2 = this.f14827f;
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
                this.f14825c[0] = true;
                if (this.d > 0) {
                    this.f14824b.S();
                }
                Utilities.Callback callback3 = this.f14826e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f14827f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public t6(t7 t7Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f14824b = t7Var;
        this.f14825c = zArr;
        this.d = i10;
        this.f14826e = callback;
        this.f14827f = callback2;
    }
}
