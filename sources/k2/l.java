package k2;

import g7.w7;

public abstract class l extends k {

    public i0.e[] f14373a;

    public String f14374b;

    public int f14375c;

    public l() {
        this.f14373a = null;
        this.f14375c = 0;
    }

    public i0.e[] getPathData() {
        return this.f14373a;
    }

    public String getPathName() {
        return this.f14374b;
    }

    public void setPathData(i0.e[] eVarArr) {
        if (!w7.a(this.f14373a, eVarArr)) {
            this.f14373a = w7.e(eVarArr);
            return;
        }
        i0.e[] eVarArr2 = this.f14373a;
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10].f10493a = eVarArr[i10].f10493a;
            int i11 = 0;
            while (true) {
                float[] fArr = eVarArr[i10].f10494b;
                if (i11 < fArr.length) {
                    eVarArr2[i10].f10494b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f14373a = null;
        this.f14375c = 0;
        this.f14374b = lVar.f14374b;
        this.f14373a = w7.e(lVar.f14373a);
    }
}
