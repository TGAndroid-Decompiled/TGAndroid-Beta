package gh;

import org.telegram.messenger.Utilities;
public final class t5 implements Utilities.Callback2 {
    public final int f8914a = 0;
    public final boolean[] f8915b;
    public final Utilities.Callback2 f8916c;
    public final Utilities.Callback d;

    public t5(Utilities.Callback callback, boolean[] zArr, Utilities.Callback2 callback2) {
        this.d = callback;
        this.f8915b = zArr;
        this.f8916c = callback2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String str;
        String str2;
        Long l10 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.f8914a) {
            case 0:
                Utilities.Callback callback = this.d;
                if (callback != null) {
                    callback.run(Boolean.TRUE);
                }
                this.f8915b[0] = true;
                Utilities.Callback2 callback2 = this.f8916c;
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
                this.f8915b[0] = true;
                Utilities.Callback2 callback22 = this.f8916c;
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

    public t5(boolean[] zArr, Utilities.Callback2 callback2, Utilities.Callback callback) {
        this.f8915b = zArr;
        this.f8916c = callback2;
        this.d = callback;
    }
}
