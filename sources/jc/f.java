package jc;

import com.google.firebase.messaging.m;
public final class f {
    public final hc.e f12959a;
    public final int f12960b;
    public final int f12961c;
    public final int d;
    public final aa.a e;

    public f(aa.a aVar, hc.e eVar, int i10, int i11, int i12) {
        this.e = aVar;
        this.f12959a = eVar;
        this.f12960b = i10;
        this.f12961c = i11;
        this.d = i12;
    }

    public final int a() {
        hc.e eVar = this.f12959a;
        hc.e eVar2 = hc.e.BYTE;
        int i10 = this.d;
        if (eVar == eVar2) {
            m mVar = (m) this.e.d;
            int i11 = this.f12960b;
            return ((String) mVar.f7318b).substring(i11, i10 + i11).getBytes(((dc.e) mVar.f7319c).f7614a[this.f12961c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        m mVar = (m) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        hc.e eVar = this.f12959a;
        sb2.append(eVar);
        sb2.append('(');
        if (eVar == hc.e.ECI) {
            sb2.append(((dc.e) mVar.f7319c).f7614a[this.f12961c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f12960b;
            String substring = ((String) mVar.f7318b).substring(i11, i10 + i11);
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
