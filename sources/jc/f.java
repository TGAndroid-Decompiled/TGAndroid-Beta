package jc;

import com.google.firebase.messaging.m;
public final class f {
    public final hc.e f13610a;
    public final int f13611b;
    public final int f13612c;
    public final int d;
    public final aa.a f13613e;

    public f(aa.a aVar, hc.e eVar, int i10, int i11, int i12) {
        this.f13613e = aVar;
        this.f13610a = eVar;
        this.f13611b = i10;
        this.f13612c = i11;
        this.d = i12;
    }

    public final int a() {
        hc.e eVar = this.f13610a;
        hc.e eVar2 = hc.e.BYTE;
        int i10 = this.d;
        if (eVar == eVar2) {
            m mVar = (m) this.f13613e.d;
            int i11 = this.f13611b;
            return ((String) mVar.f6372b).substring(i11, i10 + i11).getBytes(((dc.e) mVar.f6373c).f6705a[this.f13612c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        m mVar = (m) this.f13613e.d;
        StringBuilder sb2 = new StringBuilder();
        hc.e eVar = this.f13610a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == hc.e.ECI) {
            sb2.append(((dc.e) mVar.f6373c).f6705a[this.f13612c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f13611b;
            String substring = ((String) mVar.f6372b).substring(i11, i10 + i11);
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
