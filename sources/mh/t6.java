package mh;

import org.telegram.messenger.Utilities;
public final class t6 implements Utilities.Callback {
    public final int f14825a = 0;
    public final t7 f14826b;
    public final boolean[] f14827c;
    public final int d;
    public final Utilities.Callback f14828e;
    public final Utilities.Callback f14829f;

    public t6(t7 t7Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f14826b = t7Var;
        this.d = i10;
        this.f14828e = callback;
        this.f14827c = zArr;
        this.f14829f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f14825a) {
            case 0:
                if (this.d > 0) {
                    this.f14826b.S();
                }
                Utilities.Callback callback = this.f14828e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f14827c[0] = true;
                Utilities.Callback callback2 = this.f14829f;
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
                this.f14827c[0] = true;
                if (this.d > 0) {
                    this.f14826b.S();
                }
                Utilities.Callback callback3 = this.f14828e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f14829f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public t6(t7 t7Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f14826b = t7Var;
        this.f14827c = zArr;
        this.d = i10;
        this.f14828e = callback;
        this.f14829f = callback2;
    }
}
