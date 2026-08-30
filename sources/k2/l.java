package k2;

import j7.y7;
public abstract class l extends k {
    public i0.d[] f9662a;
    public String f9663b;
    public int f9664c;

    public l() {
        this.f9662a = null;
        this.f9664c = 0;
    }

    public i0.d[] getPathData() {
        return this.f9662a;
    }

    public String getPathName() {
        return this.f9663b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!y7.a(this.f9662a, dVarArr)) {
            this.f9662a = y7.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f9662a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f7217a = dVarArr[i10].f7217a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f7218b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f7218b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f9662a = null;
        this.f9664c = 0;
        this.f9663b = lVar.f9663b;
        this.f9662a = y7.e(lVar.f9662a);
    }
}
