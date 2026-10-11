package jc;

import com.google.firebase.messaging.m;
public final class f {
    public final hc.e f14120a;
    public final int f14121b;
    public final int f14122c;
    public final int d;
    public final aa.a f14123e;

    public f(aa.a aVar, hc.e eVar, int i10, int i11, int i12) {
        this.f14123e = aVar;
        this.f14120a = eVar;
        this.f14121b = i10;
        this.f14122c = i11;
        this.d = i12;
    }

    public final int a() {
        hc.e eVar = this.f14120a;
        hc.e eVar2 = hc.e.BYTE;
        int i10 = this.d;
        if (eVar == eVar2) {
            m mVar = (m) this.f14123e.d;
            int i11 = this.f14121b;
            return ((String) mVar.f7951b).substring(i11, i10 + i11).getBytes(((dc.e) mVar.f7952c).f8285a[this.f14122c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        m mVar = (m) this.f14123e.d;
        StringBuilder sb2 = new StringBuilder();
        hc.e eVar = this.f14120a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == hc.e.ECI) {
            sb2.append(((dc.e) mVar.f7952c).f8285a[this.f14122c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f14121b;
            String substring = ((String) mVar.f7951b).substring(i11, i10 + i11);
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
