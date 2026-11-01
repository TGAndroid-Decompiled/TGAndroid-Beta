package cc;

import android.support.v4.media.session.a0;
public final class e {
    public final ac.f f4112a;
    public final int f4113b;
    public final int f4114c;
    public final int d;
    public final a0 e;

    public e(a0 a0Var, ac.f fVar, int i10, int i11, int i12) {
        this.e = a0Var;
        this.f4112a = fVar;
        this.f4113b = i10;
        this.f4114c = i11;
        this.d = i12;
    }

    public final int a() {
        ac.f fVar = this.f4112a;
        ac.f fVar2 = ac.f.BYTE;
        int i10 = this.d;
        if (fVar == fVar2) {
            ac.a aVar = (ac.a) this.e.f876c;
            int i11 = this.f4113b;
            return ((String) aVar.f363b).substring(i11, i10 + i11).getBytes(((wb.d) aVar.f364c).f52800a[this.f4114c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        ac.a aVar = (ac.a) this.e.f876c;
        StringBuilder sb2 = new StringBuilder();
        ac.f fVar = this.f4112a;
        sb2.append(fVar);
        sb2.append('(');
        if (fVar == ac.f.ECI) {
            sb2.append(((wb.d) aVar.f364c).f52800a[this.f4114c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f4113b;
            String substring = ((String) aVar.f363b).substring(i11, i10 + i11);
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
