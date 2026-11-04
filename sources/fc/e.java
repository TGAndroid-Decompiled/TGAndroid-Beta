package fc;

import android.support.v4.media.session.a0;
import b4.n;
public final class e {
    public final dc.d f11559a;
    public final int f11560b;
    public final int f11561c;
    public final int d;
    public final a0 f11562e;

    public e(a0 a0Var, dc.d dVar, int i3, int i10, int i11) {
        this.f11562e = a0Var;
        this.f11559a = dVar;
        this.f11560b = i3;
        this.f11561c = i10;
        this.d = i11;
    }

    public final int a() {
        dc.d dVar = this.f11559a;
        dc.d dVar2 = dc.d.BYTE;
        int i3 = this.d;
        if (dVar == dVar2) {
            n nVar = (n) this.f11562e.f1187c;
            int i10 = this.f11560b;
            return ((String) nVar.f2378b).substring(i10, i3 + i10).getBytes(((zb.d) nVar.f2379c).f60358a[this.f11561c].charset()).length;
        }
        return i3;
    }

    public final String toString() {
        n nVar = (n) this.f11562e.f1187c;
        StringBuilder sb2 = new StringBuilder();
        dc.d dVar = this.f11559a;
        sb2.append(dVar);
        sb2.append('(');
        if (dVar == dc.d.ECI) {
            sb2.append(((zb.d) nVar.f2379c).f60358a[this.f11561c].charset().displayName());
        } else {
            int i3 = this.d;
            int i10 = this.f11560b;
            String substring = ((String) nVar.f2378b).substring(i10, i3 + i10);
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
