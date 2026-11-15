package ic;

import ab.q;
import cc.f;
import h6.m;
public final class e {
    public final gc.e f15905a;
    public final int f15906b;
    public final int f15907c;
    public final int d;
    public final m f15908e;

    public e(m mVar, gc.e eVar, int i7, int i10, int i11) {
        this.f15908e = mVar;
        this.f15905a = eVar;
        this.f15906b = i7;
        this.f15907c = i10;
        this.d = i11;
    }

    public final int a() {
        gc.e eVar = this.f15905a;
        gc.e eVar2 = gc.e.BYTE;
        int i7 = this.d;
        if (eVar == eVar2) {
            q qVar = (q) this.f15908e.d;
            int i10 = this.f15906b;
            return ((String) qVar.f989b).substring(i10, i7 + i10).getBytes(((f) qVar.f990c).f4889a[this.f15907c].charset()).length;
        }
        return i7;
    }

    public final String toString() {
        q qVar = (q) this.f15908e.d;
        StringBuilder sb2 = new StringBuilder();
        gc.e eVar = this.f15905a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == gc.e.ECI) {
            sb2.append(((f) qVar.f990c).f4889a[this.f15907c].charset().displayName());
        } else {
            int i7 = this.d;
            int i10 = this.f15906b;
            String substring = ((String) qVar.f989b).substring(i10, i7 + i10);
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
