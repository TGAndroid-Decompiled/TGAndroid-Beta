package kc;
public final class f {
    public final ic.e f15022a;
    public final int f15023b;
    public final int f15024c;
    public final int d;
    public final androidx.biometric.e e;

    public f(androidx.biometric.e eVar, ic.e eVar2, int i10, int i11, int i12) {
        this.e = eVar;
        this.f15022a = eVar2;
        this.f15023b = i10;
        this.f15024c = i11;
        this.d = i12;
    }

    public final int a() {
        ic.e eVar = this.f15022a;
        ic.e eVar2 = ic.e.BYTE;
        int i10 = this.d;
        if (eVar == eVar2) {
            c2.b bVar = (c2.b) this.e.d;
            int i11 = this.f15023b;
            return ((String) bVar.f4490b).substring(i11, i10 + i11).getBytes(((ec.d) bVar.f4491c).f8589a[this.f15024c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        c2.b bVar = (c2.b) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        ic.e eVar = this.f15022a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == ic.e.ECI) {
            sb2.append(((ec.d) bVar.f4491c).f8589a[this.f15024c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f15023b;
            String substring = ((String) bVar.f4490b).substring(i11, i10 + i11);
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
