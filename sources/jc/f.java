package jc;

import com.google.firebase.messaging.m;
public final class f {
    public final hc.e f12956a;
    public final int f12957b;
    public final int f12958c;
    public final int d;
    public final aa.a e;

    public f(aa.a aVar, hc.e eVar, int i10, int i11, int i12) {
        this.e = aVar;
        this.f12956a = eVar;
        this.f12957b = i10;
        this.f12958c = i11;
        this.d = i12;
    }

    public final int a() {
        hc.e eVar = this.f12956a;
        hc.e eVar2 = hc.e.BYTE;
        int i10 = this.d;
        if (eVar == eVar2) {
            m mVar = (m) this.e.d;
            int i11 = this.f12957b;
            return ((String) mVar.f7310b).substring(i11, i10 + i11).getBytes(((dc.e) mVar.f7311c).f7612a[this.f12958c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        m mVar = (m) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        hc.e eVar = this.f12956a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == hc.e.ECI) {
            sb2.append(((dc.e) mVar.f7311c).f7612a[this.f12958c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f12957b;
            String substring = ((String) mVar.f7310b).substring(i11, i10 + i11);
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
