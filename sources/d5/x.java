package d5;

import f5.d0;
import q8.b0;
import q8.c0;
import q8.z;
public class x implements j3.g {
    public final int A;
    public final int B;
    public final int C;
    public final z D;
    public final z E;
    public final int F;
    public final int G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final b0 K;
    public final c0 L;
    public final int f5406a;
    public final int f5407b;
    public final int f5408c;
    public final int d;
    public final int f5409e;
    public final int f5410f;
    public final int h;
    public final int f5411n;
    public final int f5412r;
    public final int f5413s;
    public final boolean v;
    public final z f5414w;
    public final int f5415x;
    public final z f5416y;

    static {
        new x(new w());
        int i10 = d0.f6579a;
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

    public x(w wVar) {
        this.f5406a = wVar.f5383a;
        this.f5407b = wVar.f5384b;
        this.f5408c = wVar.f5385c;
        this.d = wVar.d;
        this.f5409e = wVar.f5386e;
        this.f5410f = wVar.f5387f;
        this.h = wVar.f5388g;
        this.f5411n = wVar.h;
        this.f5412r = wVar.f5389i;
        this.f5413s = wVar.f5390j;
        this.v = wVar.f5391k;
        this.f5414w = wVar.f5392l;
        this.f5415x = wVar.f5393m;
        this.f5416y = wVar.f5394n;
        this.A = wVar.f5395o;
        this.B = wVar.f5396p;
        this.C = wVar.f5397q;
        this.D = wVar.f5398r;
        this.E = wVar.f5399s;
        this.F = wVar.f5400t;
        this.G = wVar.f5401u;
        this.H = wVar.v;
        this.I = wVar.f5402w;
        this.J = wVar.f5403x;
        this.K = b0.a(wVar.f5404y);
        this.L = c0.u(wVar.f5405z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f5406a == xVar.f5406a && this.f5407b == xVar.f5407b && this.f5408c == xVar.f5408c && this.d == xVar.d && this.f5409e == xVar.f5409e && this.f5410f == xVar.f5410f && this.h == xVar.h && this.f5411n == xVar.f5411n && this.v == xVar.v && this.f5412r == xVar.f5412r && this.f5413s == xVar.f5413s && this.f5414w.equals(xVar.f5414w) && this.f5415x == xVar.f5415x && this.f5416y.equals(xVar.f5416y) && this.A == xVar.A && this.B == xVar.B && this.C == xVar.C && this.D.equals(xVar.D) && this.E.equals(xVar.E) && this.F == xVar.F && this.G == xVar.G && this.H == xVar.H && this.I == xVar.I && this.J == xVar.J) {
                b0 b0Var = xVar.K;
                b0 b0Var2 = this.K;
                b0Var2.getClass();
                if (q8.l.c(b0Var2, b0Var) && this.L.equals(xVar.L)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f5414w.hashCode();
        int hashCode2 = this.f5416y.hashCode();
        int hashCode3 = this.D.hashCode();
        int hashCode4 = this.E.hashCode();
        int hashCode5 = this.K.hashCode();
        return this.L.hashCode() + ((hashCode5 + ((((((((((((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((((hashCode + ((((((((((((((((((((((this.f5406a + 31) * 31) + this.f5407b) * 31) + this.f5408c) * 31) + this.d) * 31) + this.f5409e) * 31) + this.f5410f) * 31) + this.h) * 31) + this.f5411n) * 31) + (this.v ? 1 : 0)) * 31) + this.f5412r) * 31) + this.f5413s) * 31)) * 31) + this.f5415x) * 31)) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31)) * 31)) * 31) + this.F) * 31) + this.G) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31)) * 31);
    }
}
