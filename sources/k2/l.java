package k2;

import f7.i8;
public abstract class l extends k {
    public i0.d[] f14552a;
    public String f14553b;
    public int f14554c;

    public l() {
        this.f14552a = null;
        this.f14554c = 0;
    }

    public i0.d[] getPathData() {
        return this.f14552a;
    }

    public String getPathName() {
        return this.f14553b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!i8.a(this.f14552a, dVarArr)) {
            this.f14552a = i8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f14552a;
        for (int i9 = 0; i9 < dVarArr.length; i9++) {
            dVarArr2[i9].f10852a = dVarArr[i9].f10852a;
            int i10 = 0;
            while (true) {
                float[] fArr = dVarArr[i9].f10853b;
                if (i10 < fArr.length) {
                    dVarArr2[i9].f10853b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f14552a = null;
        this.f14554c = 0;
        this.f14553b = lVar.f14553b;
        this.f14552a = i8.e(lVar.f14552a);
    }
}
