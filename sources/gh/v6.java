package gh;

import org.telegram.messenger.Utilities;
public final class v6 implements Utilities.Callback {
    public final int f9040a = 0;
    public final v7 f9041b;
    public final boolean[] f9042c;
    public final int d;
    public final Utilities.Callback f9043e;
    public final Utilities.Callback f9044f;

    public v6(v7 v7Var, int i9, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f9041b = v7Var;
        this.d = i9;
        this.f9043e = callback;
        this.f9042c = zArr;
        this.f9044f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f9040a) {
            case 0:
                if (this.d > 0) {
                    this.f9041b.S();
                }
                Utilities.Callback callback = this.f9043e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f9042c[0] = true;
                Utilities.Callback callback2 = this.f9044f;
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
                this.f9042c[0] = true;
                if (this.d > 0) {
                    this.f9041b.S();
                }
                Utilities.Callback callback3 = this.f9043e;
                if (callback3 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback3.run(str2);
                }
                Utilities.Callback callback4 = this.f9044f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public v6(v7 v7Var, boolean[] zArr, int i9, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f9041b = v7Var;
        this.f9042c = zArr;
        this.d = i9;
        this.f9043e = callback;
        this.f9044f = callback2;
    }
}
