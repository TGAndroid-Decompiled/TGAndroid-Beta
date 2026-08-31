package k2;

import j7.z7;
public abstract class l extends k {
    public i0.d[] f10374a;
    public String f10375b;
    public int f10376c;

    public l() {
        this.f10374a = null;
        this.f10376c = 0;
    }

    public i0.d[] getPathData() {
        return this.f10374a;
    }

    public String getPathName() {
        return this.f10375b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!z7.a(this.f10374a, dVarArr)) {
            this.f10374a = z7.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f10374a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f7761a = dVarArr[i10].f7761a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f7762b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f7762b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f10374a = null;
        this.f10376c = 0;
        this.f10375b = lVar.f10375b;
        this.f10374a = z7.e(lVar.f10374a);
    }
}
