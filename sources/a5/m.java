package a5;

import c8.j0;
public abstract class m extends l {
    public i0.e[] f239a;
    public String f240b;
    public int f241c;

    public m() {
        this.f239a = null;
        this.f241c = 0;
    }

    public i0.e[] getPathData() {
        return this.f239a;
    }

    public String getPathName() {
        return this.f240b;
    }

    public void setPathData(i0.e[] eVarArr) {
        if (!j0.a(this.f239a, eVarArr)) {
            this.f239a = j0.e(eVarArr);
            return;
        }
        i0.e[] eVarArr2 = this.f239a;
        for (int i7 = 0; i7 < eVarArr.length; i7++) {
            eVarArr2[i7].f15578a = eVarArr[i7].f15578a;
            int i10 = 0;
            while (true) {
                float[] fArr = eVarArr[i7].f15579b;
                if (i10 < fArr.length) {
                    eVarArr2[i7].f15579b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f239a = null;
        this.f241c = 0;
        this.f240b = mVar.f240b;
        this.f239a = j0.e(mVar.f239a);
    }
}
