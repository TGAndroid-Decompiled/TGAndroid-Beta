package m4;

import e2.s0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class f {
    public final int f20606a;
    public final List f20607b;

    public f(int i7, List list) {
        this.f20606a = i7;
        this.f20607b = list;
    }

    public m4.g0 a(int r6, m6.n r7) {
        throw new UnsupportedOperationException("Method not decompiled: m4.f.a(int, m6.n):m4.g0");
    }

    public List b(m6.n nVar) {
        boolean z10;
        String str;
        int i7;
        List list;
        boolean z11;
        boolean c10 = c(32);
        List list2 = this.f20607b;
        if (c10) {
            return list2;
        }
        h2.x xVar = new h2.x((byte[]) nVar.d);
        while (xVar.a() > 0) {
            int A = xVar.A();
            int A2 = xVar.f13829b + xVar.A();
            if (A == 134) {
                ArrayList arrayList = new ArrayList();
                int A3 = xVar.A() & 31;
                for (int i10 = 0; i10 < A3; i10++) {
                    String y10 = xVar.y(3, StandardCharsets.UTF_8);
                    int A4 = xVar.A();
                    if ((A4 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i7 = A4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte A5 = (byte) xVar.A();
                    xVar.O(1);
                    if (z10) {
                        if ((A5 & 64) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        byte[] bArr = h2.g.f13752a;
                        list = Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    e2.t tVar = new e2.t();
                    tVar.f10709r = s0.n(str);
                    tVar.d = y10;
                    tVar.O = i7;
                    tVar.f10712u = list;
                    arrayList.add(new e2.u(tVar));
                }
                list2 = arrayList;
            }
            xVar.N(A2);
        }
        return list2;
    }

    public boolean c(int i7) {
        if ((i7 & this.f20606a) != 0) {
            return true;
        }
        return false;
    }

    public f() {
        this.f20606a = 1;
        this.f20607b = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.f20606a = 0;
        this.f20607b = arrayList;
    }
}
