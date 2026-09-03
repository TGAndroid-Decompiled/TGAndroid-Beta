package f5;

import h5.d0;
import s8.z;
public class w implements j3.g {
    public final int B;
    public final int C;
    public final int D;
    public final s8.v E;
    public final s8.v F;
    public final int G;
    public final int H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final s8.x L;
    public final z M;
    public final int f5979a;
    public final int f5980b;
    public final int f5981c;
    public final int d;
    public final int e;
    public final int f5982f;
    public final int h;
    public final int f5983n;
    public final int f5984r;
    public final int f5985s;
    public final boolean v;
    public final s8.v f5986w;
    public final int f5987x;
    public final s8.v f5988y;

    static {
        new w(new v());
        int i10 = d0.f6924a;
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

    public w(v vVar) {
        this.f5979a = vVar.f5957a;
        this.f5980b = vVar.f5958b;
        this.f5981c = vVar.f5959c;
        this.d = vVar.d;
        this.e = vVar.e;
        this.f5982f = vVar.f5960f;
        this.h = vVar.f5961g;
        this.f5983n = vVar.h;
        this.f5984r = vVar.f5962i;
        this.f5985s = vVar.f5963j;
        this.v = vVar.f5964k;
        this.f5986w = vVar.f5965l;
        this.f5987x = vVar.f5966m;
        this.f5988y = vVar.f5967n;
        this.B = vVar.f5968o;
        this.C = vVar.f5969p;
        this.D = vVar.f5970q;
        this.E = vVar.f5971r;
        this.F = vVar.f5972s;
        this.G = vVar.f5973t;
        this.H = vVar.f5974u;
        this.I = vVar.v;
        this.J = vVar.f5975w;
        this.K = vVar.f5976x;
        this.L = s8.x.a(vVar.f5977y);
        this.M = z.u(vVar.f5978z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f5979a == wVar.f5979a && this.f5980b == wVar.f5980b && this.f5981c == wVar.f5981c && this.d == wVar.d && this.e == wVar.e && this.f5982f == wVar.f5982f && this.h == wVar.h && this.f5983n == wVar.f5983n && this.v == wVar.v && this.f5984r == wVar.f5984r && this.f5985s == wVar.f5985s && this.f5986w.equals(wVar.f5986w) && this.f5987x == wVar.f5987x && this.f5988y.equals(wVar.f5988y) && this.B == wVar.B && this.C == wVar.C && this.D == wVar.D && this.E.equals(wVar.E) && this.F.equals(wVar.F) && this.G == wVar.G && this.H == wVar.H && this.I == wVar.I && this.J == wVar.J && this.K == wVar.K) {
                s8.x xVar = wVar.L;
                s8.x xVar2 = this.L;
                xVar2.getClass();
                if (s8.l.d(xVar2, xVar) && this.M.equals(wVar.M)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f5986w.hashCode();
        int hashCode2 = this.f5988y.hashCode();
        int hashCode3 = this.E.hashCode();
        int hashCode4 = this.F.hashCode();
        int hashCode5 = this.L.hashCode();
        return this.M.hashCode() + ((hashCode5 + ((((((((((((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((((hashCode + ((((((((((((((((((((((this.f5979a + 31) * 31) + this.f5980b) * 31) + this.f5981c) * 31) + this.d) * 31) + this.e) * 31) + this.f5982f) * 31) + this.h) * 31) + this.f5983n) * 31) + (this.v ? 1 : 0)) * 31) + this.f5984r) * 31) + this.f5985s) * 31)) * 31) + this.f5987x) * 31)) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31)) * 31)) * 31) + this.G) * 31) + this.H) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31)) * 31);
    }
}
