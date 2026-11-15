package org.telegram.messenger;

import android.location.Location;
public final class ld implements q0.a {
    public final int f24821a;
    public final rd f24822b;

    public ld(rd rdVar, int i7) {
        this.f24821a = i7;
        this.f24822b = rdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f24821a) {
            case 0:
                this.f24822b.m((Location) obj);
                return;
            default:
                rd rdVar = this.f24822b;
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
