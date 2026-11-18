package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;
public final class h00 implements Comparator {
    public final int f24340a;
    public final Object f24341b;

    public h00(Object obj, int i7) {
        this.f24340a = i7;
        this.f24341b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f24340a) {
            case 0:
                return z00.a((Collator) this.f24341b, (s00) obj, (s00) obj2);
            default:
                cd cdVar = (cd) this.f24341b;
                cd cdVar2 = (cd) obj;
                cd cdVar3 = (cd) obj2;
                if (cdVar2 != cdVar) {
                    if (cdVar3 != cdVar) {
                        List list = z00.N;
                        int indexOf = list.indexOf(cdVar2.f23335f);
                        int indexOf2 = list.indexOf(cdVar3.f23335f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i7 = cdVar2.f23339k;
                                int i10 = cdVar3.f23339k;
                                if (i7 == i10) {
                                    return cdVar2.f23331a.compareTo(cdVar3.f23331a);
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
