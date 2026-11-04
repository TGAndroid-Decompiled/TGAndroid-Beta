package org.telegram.messenger;

import android.location.Location;
public final class fd implements q0.a {
    public final int f22478a;
    public final ld f22479b;

    public fd(ld ldVar, int i3) {
        this.f22478a = i3;
        this.f22479b = ldVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f22478a) {
            case 0:
                this.f22479b.m((Location) obj);
                return;
            default:
                ld ldVar = this.f22479b;
                Integer num = (Integer) obj;
                ldVar.getClass();
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            Utilities.d.c(new cd(ldVar, 4));
                            return;
                        }
                        return;
                    }
                    Utilities.d.c(new gd(ldVar, num, 0));
                    return;
                }
                Utilities.d.c(new g10(3, ldVar, true));
                return;
        }
    }
}
