package mh;

import org.telegram.messenger.Utilities;
public final class q5 implements Utilities.Callback2 {
    public final int f14636a = 0;
    public final boolean[] f14637b;
    public final Utilities.Callback2 f14638c;
    public final Utilities.Callback d;

    public q5(Utilities.Callback callback, boolean[] zArr, Utilities.Callback2 callback2) {
        this.d = callback;
        this.f14637b = zArr;
        this.f14638c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.f14636a) {
            case 0:
                Utilities.Callback callback = this.d;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f14637b[0] = true;
                Utilities.Callback2 callback2 = this.f14638c;
                if (callback2 != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    callback2.run(str, l10);
                    return;
                }
                return;
            default:
                this.f14637b[0] = true;
                Utilities.Callback2 callback22 = this.f14638c;
                if (callback22 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    callback22.run(str2, l10);
                }
                Utilities.Callback callback3 = this.d;
                if (callback3 != null) {
                    callback3.run(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public q5(boolean[] zArr, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.f14637b = zArr;
        this.f14638c = callback2;
        this.d = callback;
    }
}
