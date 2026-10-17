package ai;

import org.telegram.messenger.Utilities;
public final class d9 implements Utilities.Callback {
    public final int f1170a = 0;
    public final fa f1171b;
    public final boolean[] f1172c;
    public final int d;
    public final Utilities.Callback e;
    public final Utilities.Callback f1173f;

    public d9(fa faVar, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f1171b = faVar;
        this.d = i10;
        this.e = callback;
        this.f1172c = zArr;
        this.f1173f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f1170a) {
            case 0:
                if (this.d > 0) {
                    this.f1171b.S();
                }
                Utilities.Callback callback = this.e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f1172c[0] = true;
                Utilities.Callback callback2 = this.f1173f;
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
                this.f1172c[0] = true;
                if (this.d > 0) {
                    this.f1171b.S();
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
                Utilities.Callback callback4 = this.f1173f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public d9(fa faVar, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f1171b = faVar;
        this.f1172c = zArr;
        this.d = i10;
        this.e = callback;
        this.f1173f = callback2;
    }
}
