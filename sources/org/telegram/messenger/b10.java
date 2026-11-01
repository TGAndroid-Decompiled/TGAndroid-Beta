package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;
public final class b10 implements Comparator {
    public final int f14901a;
    public final Object f14902b;

    public b10(Object obj, int i10) {
        this.f14901a = i10;
        this.f14902b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f14901a) {
            case 0:
                return u10.a((Collator) this.f14902b, (n10) obj, (n10) obj2);
            default:
                ad adVar = (ad) this.f14902b;
                ad adVar2 = (ad) obj;
                ad adVar3 = (ad) obj2;
                if (adVar2 != adVar) {
                    if (adVar3 != adVar) {
                        List list = u10.M;
                        int indexOf = list.indexOf(adVar2.f14594f);
                        int indexOf2 = list.indexOf(adVar3.f14594f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i10 = adVar2.f14598k;
                                int i11 = adVar3.f14598k;
                                if (i10 == i11) {
                                    return adVar2.f14591a.compareTo(adVar3.f14591a);
                                }
                                if (i10 <= i11) {
                                    if (i10 >= i11) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                    return 1;
                }
                return -1;
        }
    }
}
