package org.telegram.messenger;

import android.location.Location;
public final class md implements q0.a {
    public final int f24009a;
    public final sd f24010b;

    public md(sd sdVar, int i7) {
        this.f24009a = i7;
        this.f24010b = sdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24009a) {
            case 0:
                this.f24010b.m((Location) obj);
                return;
            default:
                sd sdVar = this.f24010b;
                Integer num = (Integer) obj;
                sdVar.getClass();
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            Utilities.d.c(new jd(sdVar, 4));
                            return;
                        }
                        return;
                    }
                    Utilities.d.c(new nd(sdVar, num, 0));
                    return;
                }
                Utilities.d.c(new o10(3, sdVar, true));
                return;
        }
    }
}
