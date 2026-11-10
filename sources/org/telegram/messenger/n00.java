package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;
public final class n00 implements Comparator {
    public final int f24123a;
    public final Object f24124b;

    public n00(Object obj, int i7) {
        this.f24123a = i7;
        this.f24124b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f24123a) {
            case 0:
                return f10.a((Collator) this.f24124b, (y00) obj, (y00) obj2);
            default:
                fd fdVar = (fd) this.f24124b;
                fd fdVar2 = (fd) obj;
                fd fdVar3 = (fd) obj2;
                if (fdVar2 != fdVar) {
                    if (fdVar3 != fdVar) {
                        List list = f10.M;
                        int indexOf = list.indexOf(fdVar2.f22404f);
                        int indexOf2 = list.indexOf(fdVar3.f22404f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i7 = fdVar2.f22408k;
                                int i10 = fdVar3.f22408k;
                                if (i7 == i10) {
                                    return fdVar2.f22400a.compareTo(fdVar3.f22400a);
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
