package org.telegram.messenger;

import java.util.ArrayList;
public final class l2 {
    public final ArrayList f23929a = new ArrayList();
    public int f23930b;

    public final void a() {
        this.f23929a.add(new m2[]{new o2(4, 2131753065, 0)});
    }

    public final void b(e5.u uVar) {
        if (uVar != null) {
            m2[][] m2VarArr = (m2[][]) uVar.f9634c;
            int length = m2VarArr.length;
            for (int i3 = 0; i3 < length; i3++) {
                int length2 = m2VarArr[i3].length;
                m2[] m2VarArr2 = new m2[length2];
                for (int i10 = 0; i10 < length2; i10++) {
                    m2VarArr2[i10] = m2VarArr[i3][i10];
                }
                ArrayList arrayList = this.f23929a;
                arrayList.add(m2VarArr2);
                if ((uVar.f9633b & (1 << i3)) != 0 && !arrayList.isEmpty()) {
                    this.f23930b = (1 << (arrayList.size() - 1)) | this.f23930b;
                }
            }
        }
    }

    public final e5.u c() {
        ArrayList arrayList = this.f23929a;
        return new e5.u((m2[][]) arrayList.toArray(new m2[arrayList.size()]), this.f23930b, 13);
    }
}
