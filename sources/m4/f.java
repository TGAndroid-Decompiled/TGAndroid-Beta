package m4;

import e2.s0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class f {
    public final int f19649a;
    public final List f19650b;

    public f(int i7, List list) {
        this.f19649a = i7;
        this.f19650b = list;
    }

    public m4.h0 a(int r6, m6.n r7) {
        throw new UnsupportedOperationException("Method not decompiled: m4.f.a(int, m6.n):m4.h0");
    }

    public List b(m6.n nVar) {
        boolean z9;
        String str;
        int i7;
        List list;
        boolean z10;
        boolean c10 = c(32);
        List list2 = this.f19650b;
        if (c10) {
            return list2;
        }
        h2.x xVar = new h2.x((byte[]) nVar.d);
        while (xVar.a() > 0) {
            int A = xVar.A();
            int A2 = xVar.f14163b + xVar.A();
            if (A == 134) {
                ArrayList arrayList = new ArrayList();
                int A3 = xVar.A() & 31;
                for (int i10 = 0; i10 < A3; i10++) {
                    String y10 = xVar.y(3, StandardCharsets.UTF_8);
                    int A4 = xVar.A();
                    if ((A4 & 128) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i7 = A4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i7 = 1;
                    }
                    byte A5 = (byte) xVar.A();
                    xVar.O(1);
                    if (z9) {
                        if ((A5 & 64) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        byte[] bArr = h2.g.f14085a;
                        list = Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    e2.t tVar = new e2.t();
                    tVar.f10563r = s0.n(str);
                    tVar.d = y10;
                    tVar.O = i7;
                    tVar.f10566u = list;
                    arrayList.add(new e2.u(tVar));
                }
                list2 = arrayList;
            }
            xVar.N(A2);
        }
        return list2;
    }

    public boolean c(int i7) {
        if ((i7 & this.f19649a) != 0) {
            return true;
        }
        return false;
    }

    public f() {
        this.f19649a = 1;
        this.f19650b = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.f19649a = 0;
        this.f19650b = arrayList;
    }
}
