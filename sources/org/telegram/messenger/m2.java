package org.telegram.messenger;

import java.util.ArrayList;
public final class m2 {
    public final ArrayList f25611a = new ArrayList();
    public int f25612b;

    public final void a() {
        this.f25611a.add(new n2[]{new p2(4, 2131753062, 0)});
    }

    public final void b(b3.j jVar) {
        if (jVar != null) {
            n2[][] n2VarArr = (n2[][]) jVar.f2874c;
            int length = n2VarArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                int length2 = n2VarArr[i7].length;
                n2[] n2VarArr2 = new n2[length2];
                for (int i10 = 0; i10 < length2; i10++) {
                    n2VarArr2[i10] = n2VarArr[i7][i10];
                }
                ArrayList arrayList = this.f25611a;
                arrayList.add(n2VarArr2);
                if ((jVar.f2873b & (1 << i7)) != 0 && !arrayList.isEmpty()) {
                    this.f25612b = (1 << (arrayList.size() - 1)) | this.f25612b;
                }
            }
        }
    }

    public final b3.j c() {
        ArrayList arrayList = this.f25611a;
        return new b3.j((n2[][]) arrayList.toArray(new n2[arrayList.size()]), this.f25612b, 7);
    }
}
