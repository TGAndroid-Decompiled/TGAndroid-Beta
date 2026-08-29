package k2;

import h7.c8;
public abstract class l extends k {
    public i0.d[] f13364a;
    public String f13365b;
    public int f13366c;

    public l() {
        this.f13364a = null;
        this.f13366c = 0;
    }

    public i0.d[] getPathData() {
        return this.f13364a;
    }

    public String getPathName() {
        return this.f13365b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!c8.a(this.f13364a, dVarArr)) {
            this.f13364a = c8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f13364a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f8190a = dVarArr[i10].f8190a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f8191b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f8191b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f13364a = null;
        this.f13366c = 0;
        this.f13365b = lVar.f13365b;
        this.f13364a = c8.e(lVar.f13364a);
    }
}
