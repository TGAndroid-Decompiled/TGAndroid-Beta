package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;
public final class a10 implements Comparator {
    public final int f14555a;
    public final Object f14556b;

    public a10(Object obj, int i10) {
        this.f14555a = i10;
        this.f14556b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f14555a) {
            case 0:
                return t10.a((Collator) this.f14556b, (m10) obj, (m10) obj2);
            default:
                zc zcVar = (zc) this.f14556b;
                zc zcVar2 = (zc) obj;
                zc zcVar3 = (zc) obj2;
                if (zcVar2 != zcVar) {
                    if (zcVar3 != zcVar) {
                        List list = t10.M;
                        int indexOf = list.indexOf(zcVar2.f19498f);
                        int indexOf2 = list.indexOf(zcVar3.f19498f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i10 = zcVar2.f19502k;
                                int i11 = zcVar3.f19502k;
                                if (i10 == i11) {
                                    return zcVar2.f19495a.compareTo(zcVar3.f19495a);
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
