package hh;

import org.telegram.messenger.Utilities;

public final class s5 implements Utilities.Callback2 {

    public final int f10019a = 0;

    public final boolean[] f10020b;

    public final Utilities.Callback2 f10021c;
    public final Utilities.Callback d;

    public s5(Utilities.Callback callback, boolean[] zArr, Utilities.Callback2 callback2) {
        this.d = callback;
        this.f10020b = zArr;
        this.f10021c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.f10019a) {
            case 0:
                Utilities.Callback callback = this.d;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f10020b[0] = true;
                Utilities.Callback2 callback2 = this.f10021c;
                if (callback2 != null) {
                    callback2.run(bool.booleanValue() ? "paid" : "failed", l10);
                }
                break;
            default:
                this.f10020b[0] = true;
                Utilities.Callback2 callback3 = this.f10021c;
                if (callback3 != null) {
                    callback3.run(bool.booleanValue() ? "paid" : "failed", l10);
                }
                Utilities.Callback callback4 = this.d;
                if (callback4 != null) {
                    callback4.run(Boolean.TRUE);
                }
                break;
        }
    }

    public s5(boolean[] zArr, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.f10020b = zArr;
        this.f10021c = callback2;
        this.d = callback;
    }
}
