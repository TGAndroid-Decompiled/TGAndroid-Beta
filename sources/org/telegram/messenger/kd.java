package org.telegram.messenger;

import android.location.Location;
public final class kd implements q0.a {
    public final int f25120a;
    public final qd f25121b;

    public kd(qd qdVar, int i7) {
        this.f25120a = i7;
        this.f25121b = qdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f25120a) {
            case 0:
                this.f25121b.m((Location) obj);
                return;
            default:
                qd qdVar = this.f25121b;
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
                Utilities.d.c(new h10(3, qdVar, true));
                return;
        }
    }
}
