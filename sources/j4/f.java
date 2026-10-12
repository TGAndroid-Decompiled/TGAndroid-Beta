package j4;

import b2.w0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public final class f {
    public final int f12639a;
    public final List f12640b;

    public f(int i10, List list) {
        this.f12639a = i10;
        this.f12640b = list;
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
        List list2 = this.f12640b;
        if (c10) {
            return list2;
        }
        e2.x xVar = new e2.x((byte[]) lVar.d);
        while (xVar.a() > 0) {
            int A = xVar.A();
            int A2 = xVar.f8412b + xVar.A();
            if (A == 134) {
                ArrayList arrayList = new ArrayList();
                int A3 = xVar.A() & 31;
                for (int i11 = 0; i11 < A3; i11++) {
                    String y3 = xVar.y(3, StandardCharsets.UTF_8);
                    int A4 = xVar.A();
                    if ((A4 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = A4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte A5 = (byte) xVar.A();
                    xVar.O(1);
                    if (z10) {
                        if ((A5 & 64) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        byte[] bArr = e2.g.f8346a;
                        list = Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    b2.w wVar = new b2.w();
                    wVar.f2466r = w0.n(str);
                    wVar.d = y3;
                    wVar.O = i10;
                    wVar.f2469u = list;
                    arrayList.add(new b2.x(wVar));
                }
                list2 = arrayList;
            }
            xVar.N(A2);
        }
        return list2;
    }

    public boolean c(int i10) {
        if ((i10 & this.f12639a) != 0) {
            return true;
        }
        return false;
    }

    public f() {
        this.f12639a = 1;
        this.f12640b = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.f12639a = 0;
        this.f12640b = arrayList;
    }
}
