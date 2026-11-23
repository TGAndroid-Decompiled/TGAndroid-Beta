package ic;

import ab.q;
import cc.f;
import h6.m;
public final class e {
    public final gc.d f16309a;
    public final int f16310b;
    public final int f16311c;
    public final int d;
    public final m f16312e;

    public e(m mVar, gc.d dVar, int i7, int i10, int i11) {
        this.f16312e = mVar;
        this.f16309a = dVar;
        this.f16310b = i7;
        this.f16311c = i10;
        this.d = i11;
    }

    public final int a() {
        gc.d dVar = this.f16309a;
        gc.d dVar2 = gc.d.BYTE;
        int i7 = this.d;
        if (dVar == dVar2) {
            q qVar = (q) this.f16312e.d;
            int i10 = this.f16310b;
            return ((String) qVar.f988b).substring(i10, i7 + i10).getBytes(((f) qVar.f989c).f5167a[this.f16311c].charset()).length;
        }
        return i7;
    }

    public final String toString() {
        q qVar = (q) this.f16312e.d;
        StringBuilder sb2 = new StringBuilder();
        gc.d dVar = this.f16309a;
        sb2.append(dVar);
        sb2.append('(');
        if (dVar == gc.d.ECI) {
            sb2.append(((f) qVar.f989c).f5167a[this.f16311c].charset().displayName());
        } else {
            int i7 = this.d;
            int i10 = this.f16310b;
            String substring = ((String) qVar.f988b).substring(i10, i7 + i10);
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
