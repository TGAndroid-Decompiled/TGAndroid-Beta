package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;
public final class k00 implements Comparator {
    public final int f24620a;
    public final Object f24621b;

    public k00(Object obj, int i7) {
        this.f24620a = i7;
        this.f24621b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f24620a) {
            case 0:
                return c10.a((Collator) this.f24621b, (v00) obj, (v00) obj2);
            default:
                dd ddVar = (dd) this.f24621b;
                dd ddVar2 = (dd) obj;
                dd ddVar3 = (dd) obj2;
                if (ddVar2 != ddVar) {
                    if (ddVar3 != ddVar) {
                        List list = c10.N;
                        int indexOf = list.indexOf(ddVar2.f23062f);
                        int indexOf2 = list.indexOf(ddVar3.f23062f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i7 = ddVar2.f23066k;
                                int i10 = ddVar3.f23066k;
                                if (i7 == i10) {
                                    return ddVar2.f23058a.compareTo(ddVar3.f23058a);
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
