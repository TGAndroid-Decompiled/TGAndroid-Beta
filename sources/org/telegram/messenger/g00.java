package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;
public final class g00 implements Comparator {
    public final int f24235a;
    public final Object f24236b;

    public g00(Object obj, int i7) {
        this.f24235a = i7;
        this.f24236b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f24235a) {
            case 0:
                return y00.a((Collator) this.f24236b, (r00) obj, (r00) obj2);
            default:
                cd cdVar = (cd) this.f24236b;
                cd cdVar2 = (cd) obj;
                cd cdVar3 = (cd) obj2;
                if (cdVar2 != cdVar) {
                    if (cdVar3 != cdVar) {
                        List list = y00.N;
                        int indexOf = list.indexOf(cdVar2.f23447f);
                        int indexOf2 = list.indexOf(cdVar3.f23447f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i7 = cdVar2.f23451k;
                                int i10 = cdVar3.f23451k;
                                if (i7 == i10) {
                                    return cdVar2.f23443a.compareTo(cdVar3.f23443a);
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
