package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;
public final class n00 implements Comparator {
    public final int f24106a;
    public final Object f24107b;

    public n00(Object obj, int i7) {
        this.f24106a = i7;
        this.f24107b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f24106a) {
            case 0:
                return f10.a((Collator) this.f24107b, (y00) obj, (y00) obj2);
            default:
                ed edVar = (ed) this.f24107b;
                ed edVar2 = (ed) obj;
                ed edVar3 = (ed) obj2;
                if (edVar2 != edVar) {
                    if (edVar3 != edVar) {
                        List list = f10.M;
                        int indexOf = list.indexOf(edVar2.f22178f);
                        int indexOf2 = list.indexOf(edVar3.f22178f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i7 = edVar2.f22182k;
                                int i10 = edVar3.f22182k;
                                if (i7 == i10) {
                                    return edVar2.f22174a.compareTo(edVar3.f22174a);
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
