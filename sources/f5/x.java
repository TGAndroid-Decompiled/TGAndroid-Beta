package f5;

import h5.d0;
import s8.z;
public class x implements j3.g {
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
    public final int f6096a;
    public final int f6097b;
    public final int f6098c;
    public final int d;
    public final int f6099e;
    public final int f6100f;
    public final int h;
    public final int f6101n;
    public final int f6102r;
    public final int f6103s;
    public final boolean v;
    public final s8.v f6104w;
    public final int f6105x;
    public final s8.v f6106y;

    static {
        new x(new w());
        int i10 = d0.f7237a;
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
        this.f6096a = wVar.f6073a;
        this.f6097b = wVar.f6074b;
        this.f6098c = wVar.f6075c;
        this.d = wVar.d;
        this.f6099e = wVar.f6076e;
        this.f6100f = wVar.f6077f;
        this.h = wVar.f6078g;
        this.f6101n = wVar.h;
        this.f6102r = wVar.f6079i;
        this.f6103s = wVar.f6080j;
        this.v = wVar.f6081k;
        this.f6104w = wVar.f6082l;
        this.f6105x = wVar.f6083m;
        this.f6106y = wVar.f6084n;
        this.B = wVar.f6085o;
        this.C = wVar.f6086p;
        this.D = wVar.f6087q;
        this.E = wVar.f6088r;
        this.F = wVar.f6089s;
        this.G = wVar.f6090t;
        this.H = wVar.f6091u;
        this.I = wVar.v;
        this.J = wVar.f6092w;
        this.K = wVar.f6093x;
        this.L = s8.x.a(wVar.f6094y);
        this.M = z.u(wVar.f6095z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            x xVar = (x) obj;
            if (this.f6096a == xVar.f6096a && this.f6097b == xVar.f6097b && this.f6098c == xVar.f6098c && this.d == xVar.d && this.f6099e == xVar.f6099e && this.f6100f == xVar.f6100f && this.h == xVar.h && this.f6101n == xVar.f6101n && this.v == xVar.v && this.f6102r == xVar.f6102r && this.f6103s == xVar.f6103s && this.f6104w.equals(xVar.f6104w) && this.f6105x == xVar.f6105x && this.f6106y.equals(xVar.f6106y) && this.B == xVar.B && this.C == xVar.C && this.D == xVar.D && this.E.equals(xVar.E) && this.F.equals(xVar.F) && this.G == xVar.G && this.H == xVar.H && this.I == xVar.I && this.J == xVar.J && this.K == xVar.K) {
                s8.x xVar2 = xVar.L;
                s8.x xVar3 = this.L;
                xVar3.getClass();
                if (s8.l.d(xVar3, xVar2) && this.M.equals(xVar.M)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f6104w.hashCode();
        int hashCode2 = this.f6106y.hashCode();
        int hashCode3 = this.E.hashCode();
        int hashCode4 = this.F.hashCode();
        int hashCode5 = this.L.hashCode();
        return this.M.hashCode() + ((hashCode5 + ((((((((((((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((((hashCode + ((((((((((((((((((((((this.f6096a + 31) * 31) + this.f6097b) * 31) + this.f6098c) * 31) + this.d) * 31) + this.f6099e) * 31) + this.f6100f) * 31) + this.h) * 31) + this.f6101n) * 31) + (this.v ? 1 : 0)) * 31) + this.f6102r) * 31) + this.f6103s) * 31)) * 31) + this.f6105x) * 31)) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31)) * 31)) * 31) + this.G) * 31) + this.H) * 31) + (this.I ? 1 : 0)) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31)) * 31);
    }
}
