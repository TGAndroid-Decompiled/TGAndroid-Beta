package db;

import java.util.ArrayList;
public final class m extends kotlin.jvm.internal.k implements rd.l {
    public static final m f8586b = new kotlin.jvm.internal.k(1);

    @Override
    public final Object invoke(Object obj) {
        int i7;
        ArrayList arrayList = ((l) obj).f8585a;
        ArrayList arrayList2 = new ArrayList(hd.h.d(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            i iVar = (i) obj2;
            int i11 = iVar.f8581c;
            if (i11 != 0) {
                i7 = 1;
                if (i11 != 1) {
                    i7 = 2;
                    if (i11 != 2) {
                        i7 = 3;
                        if (i11 != 3) {
                            i7 = 4;
                            if (i11 != 4) {
                                throw new IllegalStateException("Unknown capability status: " + iVar.f8581c);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            } else {
                i7 = 0;
            }
            arrayList2.add(new c(iVar.f8579a, i7, iVar.f8580b));
        }
        return arrayList2;
    }
}
