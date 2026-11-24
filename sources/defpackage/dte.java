package defpackage;

import java.util.ArrayList;
public abstract class dte {
    public static final void a(int i, int i2, y6a y6aVar) {
        y6aVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = i2 & (~i);
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(y6aVar.g(i4));
            }
            i3 >>>= 1;
        }
        throw new bg7(y6aVar.a(), arrayList);
    }
}
