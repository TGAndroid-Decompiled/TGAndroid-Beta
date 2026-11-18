package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;
public final class h00 implements Comparator {
    public final int f24337a;
    public final Object f24338b;

    public h00(Object obj, int i7) {
        this.f24337a = i7;
        this.f24338b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f24337a) {
            case 0:
                return z00.a((Collator) this.f24338b, (s00) obj, (s00) obj2);
            default:
                cd cdVar = (cd) this.f24338b;
                cd cdVar2 = (cd) obj;
                cd cdVar3 = (cd) obj2;
                if (cdVar2 != cdVar) {
                    if (cdVar3 != cdVar) {
                        List list = z00.N;
                        int indexOf = list.indexOf(cdVar2.f23332f);
                        int indexOf2 = list.indexOf(cdVar3.f23332f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i7 = cdVar2.f23336k;
                                int i10 = cdVar3.f23336k;
                                if (i7 == i10) {
                                    return cdVar2.f23328a.compareTo(cdVar3.f23328a);
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
