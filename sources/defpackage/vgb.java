package defpackage;
public class vgb {
    public int a;
    public int b;
    public int c;

    public vgb() {
        c();
    }

    public int a(ehb ehbVar, xgb xgbVar, qgb qgbVar, int i, boolean z) {
        return this.a - qgbVar.a(xgbVar, i);
    }

    public void b(int i, int i2) {
        this.a = Math.max(this.a, i);
        this.b = Math.max(this.b, i2);
    }

    public void c() {
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
        this.c = 2;
    }

    public int d(boolean z) {
        if (!z) {
            int i = this.c;
            qgb qgbVar = ehb.T;
            if ((i & 2) != 0) {
                return 100000;
            }
        }
        return this.a + this.b;
    }
}
