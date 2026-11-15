package org.telegram.messenger;

import java.util.ArrayList;
public final class l2 {
    public final ArrayList f24803a = new ArrayList();
    public int f24804b;

    public final void a() {
        this.f24803a.add(new m2[]{new o2(4, 2131753065, 0)});
    }

    public final void b(f5.v vVar) {
        if (vVar != null) {
            m2[][] m2VarArr = (m2[][]) vVar.f11019c;
            int length = m2VarArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                int length2 = m2VarArr[i7].length;
                m2[] m2VarArr2 = new m2[length2];
                for (int i10 = 0; i10 < length2; i10++) {
                    m2VarArr2[i10] = m2VarArr[i7][i10];
                }
                ArrayList arrayList = this.f24803a;
                arrayList.add(m2VarArr2);
                if ((vVar.f11018b & (1 << i7)) != 0 && !arrayList.isEmpty()) {
                    this.f24804b = (1 << (arrayList.size() - 1)) | this.f24804b;
                }
            }
        }
    }

    public final f5.v c() {
        ArrayList arrayList = this.f24803a;
        return new f5.v((m2[][]) arrayList.toArray(new m2[arrayList.size()]), this.f24804b, 8);
    }
}
