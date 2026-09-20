package jc;

import com.google.firebase.messaging.m;
public final class f {
    public final hc.e f12968a;
    public final int f12969b;
    public final int f12970c;
    public final int d;
    public final aa.a e;

    public f(aa.a aVar, hc.e eVar, int i10, int i11, int i12) {
        this.e = aVar;
        this.f12968a = eVar;
        this.f12969b = i10;
        this.f12970c = i11;
        this.d = i12;
    }

    public final int a() {
        hc.e eVar = this.f12968a;
        hc.e eVar2 = hc.e.BYTE;
        int i10 = this.d;
        if (eVar == eVar2) {
            m mVar = (m) this.e.d;
            int i11 = this.f12969b;
            return ((String) mVar.f7328b).substring(i11, i10 + i11).getBytes(((dc.e) mVar.f7329c).f7630a[this.f12970c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        m mVar = (m) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        hc.e eVar = this.f12968a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == hc.e.ECI) {
            sb2.append(((dc.e) mVar.f7329c).f7630a[this.f12970c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f12969b;
            String substring = ((String) mVar.f7328b).substring(i11, i10 + i11);
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
