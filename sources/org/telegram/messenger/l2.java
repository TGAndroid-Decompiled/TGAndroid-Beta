package org.telegram.messenger;

import java.util.ArrayList;
public final class l2 {
    public final ArrayList f23833a = new ArrayList();
    public int f23834b;

    public final void a() {
        this.f23833a.add(new m2[]{new o2(4, 2131753065, 0)});
    }

    public final void b(f5.u uVar) {
        if (uVar != null) {
            m2[][] m2VarArr = (m2[][]) uVar.f11191c;
            int length = m2VarArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                int length2 = m2VarArr[i7].length;
                m2[] m2VarArr2 = new m2[length2];
                for (int i10 = 0; i10 < length2; i10++) {
                    m2VarArr2[i10] = m2VarArr[i7][i10];
                }
                ArrayList arrayList = this.f23833a;
                arrayList.add(m2VarArr2);
                if ((uVar.f11190b & (1 << i7)) != 0 && !arrayList.isEmpty()) {
                    this.f23834b = (1 << (arrayList.size() - 1)) | this.f23834b;
                }
            }
        }
    }

    public final f5.u c() {
        ArrayList arrayList = this.f23833a;
        return new f5.u((m2[][]) arrayList.toArray(new m2[arrayList.size()]), this.f23834b, 9);
    }
}
