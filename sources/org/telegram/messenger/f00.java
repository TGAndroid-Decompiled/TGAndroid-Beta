package org.telegram.messenger;

import android.icu.text.Collator;
import java.util.Comparator;
import java.util.List;
public final class f00 implements Comparator {
    public final int f22429a;
    public final Object f22430b;

    public f00(Object obj, int i3) {
        this.f22429a = i3;
        this.f22430b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f22429a) {
            case 0:
                return x00.a((Collator) this.f22430b, (q00) obj, (q00) obj2);
            default:
                yc ycVar = (yc) this.f22430b;
                yc ycVar2 = (yc) obj;
                yc ycVar3 = (yc) obj2;
                if (ycVar2 != ycVar) {
                    if (ycVar3 != ycVar) {
                        List list = x00.N;
                        int indexOf = list.indexOf(ycVar2.f26565f);
                        int indexOf2 = list.indexOf(ycVar3.f26565f);
                        if (indexOf >= 0 && indexOf2 >= 0) {
                            return indexOf - indexOf2;
                        }
                        if (indexOf < 0) {
                            if (indexOf2 < 0) {
                                int i3 = ycVar2.f26569k;
                                int i10 = ycVar3.f26569k;
                                if (i3 == i10) {
                                    return ycVar2.f26561a.compareTo(ycVar3.f26561a);
                                }
                                if (i3 <= i10) {
                                    if (i3 >= i10) {
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
