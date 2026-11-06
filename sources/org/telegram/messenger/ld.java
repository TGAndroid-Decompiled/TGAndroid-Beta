package org.telegram.messenger;

import android.location.Location;
public final class ld implements q0.a {
    public final int f23870a;
    public final sd f23871b;

    public ld(sd sdVar, int i7) {
        this.f23870a = i7;
        this.f23871b = sdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f23870a) {
            case 0:
                this.f23871b.m((Location) obj);
                return;
            default:
                sd sdVar = this.f23871b;
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
