package defpackage;
public abstract class n9c extends m9c {
    public ky7[] a;
    public String b;
    public int c;

    public n9c(n9c n9cVar) {
        this.a = null;
        this.c = 0;
        this.b = n9cVar.b;
        this.a = mqe.e(n9cVar.a);
    }

    public ky7[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(ky7[] ky7VarArr) {
        if (!mqe.a(this.a, ky7VarArr)) {
            this.a = mqe.e(ky7VarArr);
            return;
        }
        ky7[] ky7VarArr2 = this.a;
        for (int i = 0; i < ky7VarArr.length; i++) {
            ky7VarArr2[i].a = ky7VarArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = ky7VarArr[i].b;
                if (i2 < fArr.length) {
                    ky7VarArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public n9c() {
        this.a = null;
        this.c = 0;
    }
}
