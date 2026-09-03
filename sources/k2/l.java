package k2;

import j7.z7;
public abstract class l extends k {
    public i0.d[] f9643a;
    public String f9644b;
    public int f9645c;

    public l() {
        this.f9643a = null;
        this.f9645c = 0;
    }

    public i0.d[] getPathData() {
        return this.f9643a;
    }

    public String getPathName() {
        return this.f9644b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!z7.a(this.f9643a, dVarArr)) {
            this.f9643a = z7.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f9643a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f7200a = dVarArr[i10].f7200a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f7201b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f7201b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f9643a = null;
        this.f9645c = 0;
        this.f9644b = lVar.f9644b;
        this.f9643a = z7.e(lVar.f9643a);
    }
}
