package org.telegram.messenger;

import android.location.Location;
public final class kd implements q0.a {
    public final int f25021a;
    public final qd f25022b;

    public kd(qd qdVar, int i7) {
        this.f25021a = i7;
        this.f25022b = qdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f25021a) {
            case 0:
                this.f25022b.m((Location) obj);
                return;
            default:
                qd qdVar = this.f25022b;
                Integer num = (Integer) obj;
                qdVar.getClass();
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            Utilities.d.c(new hd(qdVar, 4));
                            return;
                        }
                        return;
                    }
                    Utilities.d.c(new ld(qdVar, num, 0));
                    return;
                }
                Utilities.d.c(new i10(3, qdVar, true));
                return;
        }
    }
}
