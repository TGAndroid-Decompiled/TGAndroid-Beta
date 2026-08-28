package b5;

import d5.f0;
import o8.b0;
import o8.c0;
public class z implements h3.g {
    public final int A;
    public final int B;
    public final int C;
    public final o8.z D;
    public final o8.z E;
    public final int F;
    public final int G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final b0 K;
    public final c0 L;
    public final int f1532a;
    public final int f1533b;
    public final int f1534c;
    public final int d;
    public final int f1535e;
    public final int f1536f;
    public final int h;
    public final int f1537n;
    public final int f1538r;
    public final int f1539s;
    public final boolean v;
    public final o8.z f1540w;
    public final int f1541x;
    public final o8.z f1542y;

    static {
        new z(new y());
        int i9 = f0.f4349a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
    }

    public z(y yVar) {
        this.f1532a = yVar.f1509a;
        this.f1533b = yVar.f1510b;
        this.f1534c = yVar.f1511c;
        this.d = yVar.d;
        this.f1535e = yVar.f1512e;
        this.f1536f = yVar.f1513f;
        this.h = yVar.f1514g;
        this.f1537n = yVar.h;
        this.f1538r = yVar.f1515i;
        this.f1539s = yVar.f1516j;
        this.v = yVar.f1517k;
        this.f1540w = yVar.f1518l;
        this.f1541x = yVar.f1519m;
        this.f1542y = yVar.f1520n;
        this.A = yVar.f1521o;
        this.B = yVar.f1522p;
        this.C = yVar.f1523q;
        this.D = yVar.f1524r;
        this.E = yVar.f1525s;
        this.F = yVar.f1526t;
        this.G = yVar.f1527u;
        this.H = yVar.v;
        this.I = yVar.f1528w;
        this.J = yVar.f1529x;
        this.K = b0.a(yVar.f1530y);
        this.L = c0.u(yVar.f1531z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f1532a == zVar.f1532a && this.f1533b == zVar.f1533b && this.f1534c == zVar.f1534c && this.d == zVar.d && this.f1535e == zVar.f1535e && this.f1536f == zVar.f1536f && this.h == zVar.h && this.f1537n == zVar.f1537n && this.v == zVar.v && this.f1538r == zVar.f1538r && this.f1539s == zVar.f1539s && this.f1540w.equals(zVar.f1540w) && this.f1541x == zVar.f1541x && this.f1542y.equals(zVar.f1542y) && this.A == zVar.A && this.B == zVar.B && this.C == zVar.C && this.D.equals(zVar.D) && this.E.equals(zVar.E) && this.F == zVar.F && this.G == zVar.G && this.H == zVar.H && this.I == zVar.I && this.J == zVar.J) {
                b0 b0Var = zVar.K;
                b0 b0Var2 = this.K;
                b0Var2.getClass();
                if (o8.l.c(b0Var2, b0Var) && this.L.equals(zVar.L)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f1540w.hashCode();
        int hashCode2 = this.f1542y.hashCode();
        int hashCode3 = this.D.hashCode();
        int hashCode4 = this.E.hashCode();
        int hashCode5 = this.K.hashCode();
        return this.L.hashCode() + ((hashCode5 + ((((((((((((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((((hashCode + ((((((((((((((((((((((this.f1532a + 31) * 31) + this.f1533b) * 31) + this.f1534c) * 31) + this.d) * 31) + this.f1535e) * 31) + this.f1536f) * 31) + this.h) * 31) + this.f1537n) * 31) + (this.v ? 1 : 0)) * 31) + this.f1538r) * 31) + this.f1539s) * 31)) * 31) + this.f1541x) * 31)) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31)) * 31)) * 31) + this.F) * 31) + this.G) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31)) * 31);
    }
}
