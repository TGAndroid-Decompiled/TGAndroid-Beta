package jc;

import com.google.firebase.messaging.m;
public final class f {
    public final hc.e f12964a;
    public final int f12965b;
    public final int f12966c;
    public final int d;
    public final aa.a e;

    public f(aa.a aVar, hc.e eVar, int i10, int i11, int i12) {
        this.e = aVar;
        this.f12964a = eVar;
        this.f12965b = i10;
        this.f12966c = i11;
        this.d = i12;
    }

    public final int a() {
        hc.e eVar = this.f12964a;
        hc.e eVar2 = hc.e.BYTE;
        int i10 = this.d;
        if (eVar == eVar2) {
            m mVar = (m) this.e.d;
            int i11 = this.f12965b;
            return ((String) mVar.f7329b).substring(i11, i10 + i11).getBytes(((dc.e) mVar.f7330c).f7625a[this.f12966c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        m mVar = (m) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        hc.e eVar = this.f12964a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == hc.e.ECI) {
            sb2.append(((dc.e) mVar.f7330c).f7625a[this.f12966c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f12965b;
            String substring = ((String) mVar.f7329b).substring(i11, i10 + i11);
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
