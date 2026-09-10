package jc;

import com.google.firebase.messaging.m;
public final class f {
    public final hc.f f11858a;
    public final int f11859b;
    public final int f11860c;
    public final int d;
    public final aa.a e;

    public f(aa.a aVar, hc.f fVar, int i10, int i11, int i12) {
        this.e = aVar;
        this.f11858a = fVar;
        this.f11859b = i10;
        this.f11860c = i11;
        this.d = i12;
    }

    public final int a() {
        hc.f fVar = this.f11858a;
        hc.f fVar2 = hc.f.BYTE;
        int i10 = this.d;
        if (fVar == fVar2) {
            m mVar = (m) this.e.d;
            int i11 = this.f11859b;
            return ((String) mVar.f6101b).substring(i11, i10 + i11).getBytes(((dc.e) mVar.f6102c).f6401a[this.f11860c].charset()).length;
        }
        return i10;
    }

    public final String toString() {
        m mVar = (m) this.e.d;
        StringBuilder sb2 = new StringBuilder();
        hc.f fVar = this.f11858a;
        sb2.append(fVar);
        sb2.append('(');
        if (fVar == hc.f.ECI) {
            sb2.append(((dc.e) mVar.f6102c).f6401a[this.f11860c].charset().displayName());
        } else {
            int i10 = this.d;
            int i11 = this.f11859b;
            String substring = ((String) mVar.f6101b).substring(i11, i10 + i11);
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
