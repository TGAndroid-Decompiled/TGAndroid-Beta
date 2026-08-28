package oa;

import java.util.BitSet;
public class w0 extends la.u {
    @Override
    public final Object read(ta.a aVar) {
        boolean z10;
        BitSet bitSet = new BitSet();
        aVar.a();
        int x10 = aVar.x();
        int i9 = 0;
        while (x10 != 2) {
            int b10 = m1.j.b(x10);
            if (b10 != 5 && b10 != 6) {
                if (b10 == 7) {
                    z10 = aVar.n();
                } else {
                    throw new RuntimeException("Invalid bitset value type: " + ta.b.k(x10) + "; at path " + aVar.h());
                }
            } else {
                int p6 = aVar.p();
                if (p6 == 0) {
                    z10 = false;
                } else if (p6 == 1) {
                    z10 = true;
                } else {
                    StringBuilder p9 = j3.r0.p(p6, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    p9.append(aVar.j());
                    throw new RuntimeException(p9.toString());
                }
            }
            if (z10) {
                bitSet.set(i9);
            }
            i9++;
            x10 = aVar.x();
        }
        aVar.e();
        return bitSet;
    }

    @Override
    public final void write(ta.c cVar, Object obj) {
        BitSet bitSet = (BitSet) obj;
        cVar.b();
        int length = bitSet.length();
        for (int i9 = 0; i9 < length; i9++) {
            cVar.o(bitSet.get(i9) ? 1L : 0L);
        }
        cVar.e();
    }
}
