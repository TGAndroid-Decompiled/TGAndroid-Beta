package org.telegram.messenger;

import android.location.Location;
public final class hd implements q0.a {
    public final int f15875a;
    public final nd f15876b;

    public hd(nd ndVar, int i10) {
        this.f15875a = i10;
        this.f15876b = ndVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f15875a) {
            case 0:
                this.f15876b.m((Location) obj);
                return;
            default:
                nd ndVar = this.f15876b;
                Integer num = (Integer) obj;
                ndVar.getClass();
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            Utilities.d.c(new ed(ndVar, 4));
                            return;
                        }
                        return;
                    }
                    Utilities.d.c(new id(ndVar, num, 0));
                    return;
                }
                Utilities.d.c(new c20(3, ndVar, true));
                return;
        }
    }
}
