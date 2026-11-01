package org.telegram.messenger;

import android.location.Location;
public final class id implements q0.a {
    public final int f16268a;
    public final od f16269b;

    public id(od odVar, int i10) {
        this.f16268a = i10;
        this.f16269b = odVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f16268a) {
            case 0:
                this.f16269b.m((Location) obj);
                return;
            default:
                od odVar = this.f16269b;
                Integer num = (Integer) obj;
                odVar.getClass();
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            Utilities.d.c(new fd(odVar, 4));
                            return;
                        }
                        return;
                    }
                    Utilities.d.c(new jd(odVar, num, 0));
                    return;
                }
                Utilities.d.c(new d20(3, odVar, true));
                return;
        }
    }
}
