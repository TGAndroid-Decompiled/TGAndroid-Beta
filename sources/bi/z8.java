package bi;

import org.telegram.messenger.Utilities;
public final class z8 implements Utilities.Callback {
    public final int f5855a = 0;
    public final ca f5856b;
    public final boolean[] f5857c;
    public final int d;
    public final Utilities.Callback e;
    public final Utilities.Callback f5858f;

    public z8(ca caVar, int i10, Utilities.Callback callback, boolean[] zArr, Utilities.Callback callback2) {
        this.f5856b = caVar;
        this.d = i10;
        this.e = callback;
        this.f5857c = zArr;
        this.f5858f = callback2;
    }

    @Override
    public final void run(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f5855a) {
            case 0:
                if (this.d > 0) {
                    this.f5856b.S();
                }
                Utilities.Callback callback = this.e;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f5857c[0] = true;
                Utilities.Callback callback2 = this.f5858f;
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
                this.f5857c[0] = true;
                if (this.d > 0) {
                    this.f5856b.S();
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
                Utilities.Callback callback4 = this.f5858f;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public z8(ca caVar, boolean[] zArr, int i10, Utilities.Callback callback, Utilities.Callback callback2) {
        this.f5856b = caVar;
        this.f5857c = zArr;
        this.d = i10;
        this.e = callback;
        this.f5858f = callback2;
    }
}
