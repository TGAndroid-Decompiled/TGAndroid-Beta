package kc;
public final class f {
    public final ic.e f15023a;
    public final int f15024b;
    public final int f15025c;
    public final int d;
    public final androidx.biometric.e e;

    public f(androidx.biometric.e eVar, ic.e eVar2, int i10, int i11, int i12) {
        this.e = eVar;
        this.f15023a = eVar2;
        this.f15024b = i10;
        this.f15025c = i11;
        this.d = i12;
    }

    public final int a() {
        ic.e eVar = this.f15023a;
        ic.e eVar2 = ic.e.BYTE;
        int i10 = this.d;
        if (eVar == eVar2) {
            c2.b bVar = (c2.b) this.e.d;
            int i11 = this.f15024b;
            return ((String) bVar.f4494b).substring(i11, i10 + i11).getBytes(((ec.d) bVar.f4495c).f8592a[this.f15025c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        c2.b bVar = (c2.b) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        ic.e eVar = this.f15023a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == ic.e.ECI) {
            sb2.append(((ec.d) bVar.f4495c).f8592a[this.f15025c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f15024b;
            String substring = ((String) bVar.f4494b).substring(i11, i10 + i11);
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
