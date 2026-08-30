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
    public final int f5990a;
    public final int f5991b;
    public final int f5992c;
    public final int d;
    public final int e;
    public final int f5993f;
    public final int h;
    public final int f5994n;
    public final int f5995r;
    public final int f5996s;
    public final boolean v;
    public final s8.v f5997w;
    public final int f5998x;
    public final s8.v f5999y;

    static {
        new w(new v());
        int i10 = d0.f6937a;
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
        this.f5990a = vVar.f5968a;
        this.f5991b = vVar.f5969b;
        this.f5992c = vVar.f5970c;
        this.d = vVar.d;
        this.e = vVar.e;
        this.f5993f = vVar.f5971f;
        this.h = vVar.f5972g;
        this.f5994n = vVar.h;
        this.f5995r = vVar.f5973i;
        this.f5996s = vVar.f5974j;
        this.v = vVar.f5975k;
        this.f5997w = vVar.f5976l;
        this.f5998x = vVar.f5977m;
        this.f5999y = vVar.f5978n;
        this.B = vVar.f5979o;
        this.C = vVar.f5980p;
        this.D = vVar.f5981q;
        this.E = vVar.f5982r;
        this.F = vVar.f5983s;
        this.G = vVar.f5984t;
        this.H = vVar.f5985u;
        this.I = vVar.v;
        this.J = vVar.f5986w;
        this.K = vVar.f5987x;
        this.L = s8.x.a(vVar.f5988y);
        this.M = z.u(vVar.f5989z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f5990a == wVar.f5990a && this.f5991b == wVar.f5991b && this.f5992c == wVar.f5992c && this.d == wVar.d && this.e == wVar.e && this.f5993f == wVar.f5993f && this.h == wVar.h && this.f5994n == wVar.f5994n && this.v == wVar.v && this.f5995r == wVar.f5995r && this.f5996s == wVar.f5996s && this.f5997w.equals(wVar.f5997w) && this.f5998x == wVar.f5998x && this.f5999y.equals(wVar.f5999y) && this.B == wVar.B && this.C == wVar.C && this.D == wVar.D && this.E.equals(wVar.E) && this.F.equals(wVar.F) && this.G == wVar.G && this.H == wVar.H && this.I == wVar.I && this.J == wVar.J && this.K == wVar.K) {
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
        int hashCode = this.f5997w.hashCode();
        int hashCode2 = this.f5999y.hashCode();
        int hashCode3 = this.E.hashCode();
        int hashCode4 = this.F.hashCode();
        int hashCode5 = this.L.hashCode();
        return this.M.hashCode() + ((hashCode5 + ((((((((((((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((((hashCode + ((((((((((((((((((((((this.f5990a + 31) * 31) + this.f5991b) * 31) + this.f5992c) * 31) + this.d) * 31) + this.e) * 31) + this.f5993f) * 31) + this.h) * 31) + this.f5994n) * 31) + (this.v ? 1 : 0)) * 31) + this.f5995r) * 31) + this.f5996s) * 31)) * 31) + this.f5998x) * 31)) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31)) * 31)) * 31) + this.G) * 31) + this.H) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31)) * 31);
    }
}
