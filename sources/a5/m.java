package a5;

import c8.i0;
public abstract class m extends l {
    public i0.d[] f239a;
    public String f240b;
    public int f241c;

    public m() {
        this.f239a = null;
        this.f241c = 0;
    }

    public i0.d[] getPathData() {
        return this.f239a;
    }

    public String getPathName() {
        return this.f240b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!i0.a(this.f239a, dVarArr)) {
            this.f239a = i0.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f239a;
        for (int i7 = 0; i7 < dVarArr.length; i7++) {
            dVarArr2[i7].f15126a = dVarArr[i7].f15126a;
            int i10 = 0;
            while (true) {
                float[] fArr = dVarArr[i7].f15127b;
                if (i10 < fArr.length) {
                    dVarArr2[i7].f15127b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f239a = null;
        this.f241c = 0;
        this.f240b = mVar.f240b;
        this.f239a = i0.e(mVar.f239a);
    }
}
