package org.telegram.messenger;

import android.location.Location;
public final class ld implements q0.a {
    public final int f23877a;
    public final sd f23878b;

    public ld(sd sdVar, int i7) {
        this.f23877a = i7;
        this.f23878b = sdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f23877a) {
            case 0:
                this.f23878b.m((Location) obj);
                return;
            default:
                sd sdVar = this.f23878b;
                Integer num = (Integer) obj;
                sdVar.getClass();
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            Utilities.d.c(new id(sdVar, 4));
                            return;
                        }
                        return;
                    }
                    Utilities.d.c(new md(sdVar, num, 0));
                    return;
                }
                Utilities.d.c(new o10(3, sdVar, true));
                return;
        }
    }
}
