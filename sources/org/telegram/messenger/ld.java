package org.telegram.messenger;

import android.location.Location;
public final class ld implements q0.a {
    public final int f24827a;
    public final rd f24828b;

    public ld(rd rdVar, int i7) {
        this.f24827a = i7;
        this.f24828b = rdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24827a) {
            case 0:
                this.f24828b.m((Location) obj);
                return;
            default:
                rd rdVar = this.f24828b;
                Integer num = (Integer) obj;
                rdVar.getClass();
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            Utilities.d.c(new id(rdVar, 4));
                            return;
                        }
                        return;
                    }
                    Utilities.d.c(new md(rdVar, num, 0));
                    return;
                }
                Utilities.d.c(new l10(3, rdVar, true));
                return;
        }
    }
}
