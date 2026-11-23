package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;
public final class i00 implements Comparator {
    public final int f24530a;
    public final Object f24531b;

    public i00(Object obj, int i7) {
        this.f24530a = i7;
        this.f24531b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f24530a) {
            case 0:
                return a10.a((Collator) this.f24531b, (t00) obj, (t00) obj2);
            default:
                dd ddVar = (dd) this.f24531b;
                dd ddVar2 = (dd) obj;
                dd ddVar3 = (dd) obj2;
                if (ddVar2 != ddVar) {
                    if (ddVar3 != ddVar) {
                        List list = a10.N;
                        int indexOf = list.indexOf(ddVar2.f23497f);
                        int indexOf2 = list.indexOf(ddVar3.f23497f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i7 = ddVar2.f23501k;
                                int i10 = ddVar3.f23501k;
                                if (i7 == i10) {
                                    return ddVar2.f23493a.compareTo(ddVar3.f23493a);
                                }
                                if (i7 <= i10) {
                                    if (i7 >= i10) {
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
