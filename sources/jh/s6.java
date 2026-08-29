package jh;

import org.telegram.messenger.Utilities;
public final class s6 implements Utilities.Callback {
    public final int f12782a = 0;
    public final s7 f12783b;
    public final boolean[] f12784c;
    public final int d;
    public final Utilities.Callback f12785e;
    public final Utilities.Callback f12786f;

    public s6(s7 s7Var, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f12783b = s7Var;
        this.d = i10;
        this.f12785e = callback;
        this.f12784c = zArr;
        this.f12786f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f12782a) {
            case 0:
                if (this.d > 0) {
                    this.f12783b.S();
                }
                Utilities.Callback callback = this.f12785e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f12784c[0] = true;
                Utilities.Callback callback2 = this.f12786f;
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
                this.f12784c[0] = true;
                if (this.d > 0) {
                    this.f12783b.S();
                }
                Utilities.Callback callback3 = this.f12785e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f12786f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public s6(s7 s7Var, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f12783b = s7Var;
        this.f12784c = zArr;
        this.d = i10;
        this.f12785e = callback;
        this.f12786f = callback2;
    }
}
