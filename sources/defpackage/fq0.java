package defpackage;

import java.util.ArrayList;
public final class fq0 {
    public final ArrayList a = new ArrayList();
    public int b;

    public final void a() {
        this.a.add(new gq0[]{new iq0(4, 2131753062, 0)});
    }

    public final void b(dd ddVar) {
        if (ddVar != null) {
            gq0[][] gq0VarArr = (gq0[][]) ddVar.c;
            int length = gq0VarArr.length;
            for (int i = 0; i < length; i++) {
                int length2 = gq0VarArr[i].length;
                gq0[] gq0VarArr2 = new gq0[length2];
                for (int i2 = 0; i2 < length2; i2++) {
                    gq0VarArr2[i2] = gq0VarArr[i][i2];
                }
                ArrayList arrayList = this.a;
                arrayList.add(gq0VarArr2);
                if ((ddVar.b & (1 << i)) != 0 && !arrayList.isEmpty()) {
                    this.b |= 1 << (arrayList.size() - 1);
                }
            }
        }
    }

    public final dd c() {
        ArrayList arrayList = this.a;
        return new dd((gq0[][]) arrayList.toArray(new gq0[arrayList.size()]), this.b, (byte) 2);
    }
}
