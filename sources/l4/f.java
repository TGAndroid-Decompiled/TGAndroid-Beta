package l4;

import d2.u0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class f {
    public final int f17818a;
    public final List f17819b;

    public f(int i3, List list) {
        this.f17818a = i3;
        this.f17819b = list;
    }

    public l4.g0 a(int r6, l6.n r7) {
        throw new UnsupportedOperationException("Method not decompiled: l4.f.a(int, l6.n):l4.g0");
    }

    public List b(l6.n nVar) {
        boolean z10;
        String str;
        int i3;
        List list;
        boolean z11;
        boolean c2 = c(32);
        List list2 = this.f17819b;
        if (c2) {
            return list2;
        }
        g2.y yVar = new g2.y((byte[]) nVar.d);
        while (yVar.a() > 0) {
            int A = yVar.A();
            int A2 = yVar.f11924b + yVar.A();
            if (A == 134) {
                ArrayList arrayList = new ArrayList();
                int A3 = yVar.A() & 31;
                for (int i10 = 0; i10 < A3; i10++) {
                    String y9 = yVar.y(3, StandardCharsets.UTF_8);
                    int A4 = yVar.A();
                    if ((A4 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i3 = A4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i3 = 1;
                    }
                    byte A5 = (byte) yVar.A();
                    yVar.O(1);
                    if (z10) {
                        if ((A5 & 64) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        byte[] bArr = g2.h.f11846a;
                        list = Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    d2.u uVar = new d2.u();
                    uVar.f8431r = u0.n(str);
                    uVar.d = y9;
                    uVar.O = i3;
                    uVar.f8434u = list;
                    arrayList.add(new d2.v(uVar));
                }
                list2 = arrayList;
            }
            yVar.N(A2);
        }
        return list2;
    }

    public boolean c(int i3) {
        if ((i3 & this.f17818a) != 0) {
            return true;
        }
        return false;
    }

    public f() {
        this.f17818a = 1;
        this.f17819b = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.f17818a = 0;
        this.f17819b = arrayList;
    }
}
