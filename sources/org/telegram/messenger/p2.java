package org.telegram.messenger;

import java.util.ArrayList;
public final class p2 {
    public final ArrayList f17403a = new ArrayList();
    public int f17404b;

    public final void a() {
        this.f17403a.add(new q2[]{new s2(4, 2131753065, 0)});
    }

    public final void b(c5.x xVar) {
        if (xVar != null) {
            q2[][] q2VarArr = (q2[][]) xVar.f3828c;
            int length = q2VarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                int length2 = q2VarArr[i10].length;
                q2[] q2VarArr2 = new q2[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    q2VarArr2[i11] = q2VarArr[i10][i11];
                }
                ArrayList arrayList = this.f17403a;
                arrayList.add(q2VarArr2);
                if ((xVar.f3827b & (1 << i10)) != 0 && !arrayList.isEmpty()) {
                    this.f17404b = (1 << (arrayList.size() - 1)) | this.f17404b;
                }
            }
        }
    }

    public final c5.x c() {
        ArrayList arrayList = this.f17403a;
        return new c5.x((q2[][]) arrayList.toArray(new q2[arrayList.size()]), this.f17404b, 12);
    }
}
