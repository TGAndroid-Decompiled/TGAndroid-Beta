package j4;

import b2.r0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class f {
    public final int f13316a;
    public final List f13317b;

    public f(int i10, List list) {
        this.f13316a = i10;
        this.f13317b = list;
    }

    public j4.g0 a(int r6, j6.l r7) {
        throw new UnsupportedOperationException("Method not decompiled: j4.f.a(int, j6.l):j4.g0");
    }

    public List b(j6.l lVar) {
        boolean z10;
        String str;
        int i10;
        List list;
        boolean z11;
        boolean c10 = c(32);
        List list2 = this.f13317b;
        if (c10) {
            return list2;
        }
        e2.v vVar = new e2.v((byte[]) lVar.d);
        while (vVar.a() > 0) {
            int x10 = vVar.x();
            int x11 = vVar.f8818b + vVar.x();
            if (x10 == 134) {
                ArrayList arrayList = new ArrayList();
                int x12 = vVar.x() & 31;
                for (int i11 = 0; i11 < x12; i11++) {
                    String v = vVar.v(3, StandardCharsets.UTF_8);
                    int x13 = vVar.x();
                    if ((x13 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = x13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte x14 = (byte) vVar.x();
                    vVar.K(1);
                    if (z10) {
                        if ((x14 & 64) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        byte[] bArr = e2.e.f8775a;
                        list = Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    b2.r rVar = new b2.r();
                    rVar.f2339q = r0.n(str);
                    rVar.d = v;
                    rVar.N = i10;
                    rVar.f2342t = list;
                    arrayList.add(new b2.s(rVar));
                }
                list2 = arrayList;
            }
            vVar.J(x11);
        }
        return list2;
    }

    public boolean c(int i10) {
        if ((i10 & this.f13316a) != 0) {
            return true;
        }
        return false;
    }

    public f() {
        this.f13316a = 1;
        this.f13317b = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.f13316a = 0;
        this.f13317b = arrayList;
    }
}
