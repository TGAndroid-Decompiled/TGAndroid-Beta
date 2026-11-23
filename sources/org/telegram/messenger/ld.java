package org.telegram.messenger;

import android.location.Location;
public final class ld implements q0.a {
    public final int f25179a;
    public final rd f25180b;

    public ld(rd rdVar, int i7) {
        this.f25179a = i7;
        this.f25180b = rdVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f25179a) {
            case 0:
                this.f25180b.m((Location) obj);
                return;
            default:
                rd rdVar = this.f25180b;
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
                Utilities.d.c(new j10(3, rdVar, true));
                return;
        }
    }
}
