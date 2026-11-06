package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;
public final class n00 implements Comparator {
    public final int f24113a;
    public final Object f24114b;

    public n00(Object obj, int i7) {
        this.f24113a = i7;
        this.f24114b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f24113a) {
            case 0:
                return f10.a((Collator) this.f24114b, (y00) obj, (y00) obj2);
            default:
                ed edVar = (ed) this.f24114b;
                ed edVar2 = (ed) obj;
                ed edVar3 = (ed) obj2;
                if (edVar2 != edVar) {
                    if (edVar3 != edVar) {
                        List list = f10.M;
                        int indexOf = list.indexOf(edVar2.f22185f);
                        int indexOf2 = list.indexOf(edVar3.f22185f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i7 = edVar2.f22189k;
                                int i10 = edVar3.f22189k;
                                if (i7 == i10) {
                                    return edVar2.f22181a.compareTo(edVar3.f22181a);
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
