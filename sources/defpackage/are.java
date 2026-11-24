package defpackage;

import java.util.ArrayList;
public abstract class are {
    public static final void a(int i, int i2, w4a w4aVar) {
        w4aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = i2 & (~i);
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(w4aVar.g(i4));
            }
            i3 >>>= 1;
        }
        throw new zd7(w4aVar.a(), arrayList);
    }
}
