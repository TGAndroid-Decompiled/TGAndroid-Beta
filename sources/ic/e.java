package ic;

import ab.q;
import cc.f;
import h6.m;
public final class e {
    public final gc.d f15450a;
    public final int f15451b;
    public final int f15452c;
    public final int d;
    public final m f15453e;

    public e(m mVar, gc.d dVar, int i7, int i10, int i11) {
        this.f15453e = mVar;
        this.f15450a = dVar;
        this.f15451b = i7;
        this.f15452c = i10;
        this.d = i11;
    }

    public final int a() {
        gc.d dVar = this.f15450a;
        gc.d dVar2 = gc.d.BYTE;
        int i7 = this.d;
        if (dVar == dVar2) {
            q qVar = (q) this.f15453e.d;
            int i10 = this.f15451b;
            return ((String) qVar.f990b).substring(i10, i7 + i10).getBytes(((f) qVar.f991c).f6064a[this.f15452c].charset()).length;
        }
        return i7;
    }

    public final String toString() {
        q qVar = (q) this.f15453e.d;
        StringBuilder sb2 = new StringBuilder();
        gc.d dVar = this.f15450a;
        sb2.append(dVar);
        sb2.append('(');
        if (dVar == gc.d.ECI) {
            sb2.append(((f) qVar.f991c).f6064a[this.f15452c].charset().displayName());
        } else {
            int i7 = this.d;
            int i10 = this.f15451b;
            String substring = ((String) qVar.f990b).substring(i10, i7 + i10);
            StringBuilder sb3 = new StringBuilder();
            for (int i11 = 0; i11 < substring.length(); i11++) {
                if (substring.charAt(i11) >= ' ' && substring.charAt(i11) <= '~') {
                    sb3.append(substring.charAt(i11));
                } else {
                    sb3.append('.');
                }
            }
            sb2.append(sb3.toString());
        }
        sb2.append(')');
        return sb2.toString();
    }
}
