package lc;
public final class f {
    public final jc.e f16980a;
    public final int f16981b;
    public final int f16982c;
    public final int d;
    public final k6.c e;

    public f(k6.c cVar, jc.e eVar, int i10, int i11, int i12) {
        this.e = cVar;
        this.f16980a = eVar;
        this.f16981b = i10;
        this.f16982c = i11;
        this.d = i12;
    }

    public final int a() {
        jc.e eVar = this.f16980a;
        jc.e eVar2 = jc.e.BYTE;
        int i10 = this.d;
        if (eVar == eVar2) {
            c2.b bVar = (c2.b) this.e.d;
            int i11 = this.f16981b;
            return ((String) bVar.f5930b).substring(i11, i10 + i11).getBytes(((fc.d) bVar.f5931c).f10411a[this.f16982c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        c2.b bVar = (c2.b) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        jc.e eVar = this.f16980a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == jc.e.ECI) {
            sb2.append(((fc.d) bVar.f5931c).f10411a[this.f16982c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f16981b;
            String substring = ((String) bVar.f5930b).substring(i11, i10 + i11);
            StringBuilder sb3 = new StringBuilder();
            for (int i12 = 0; i12 < substring.length(); i12++) {
                if (substring.charAt(i12) >= ' ' && substring.charAt(i12) <= '~') {
                    sb3.append(substring.charAt(i12));
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
